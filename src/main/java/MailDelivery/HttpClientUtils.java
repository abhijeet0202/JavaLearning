package MailDelivery;

import java.net.URI;
import java.security.SecureRandom;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpHost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLInitializationException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.ssl.TrustStrategy;

public class HttpClientUtils {
    
    // define a proxy url (if needed) in environment variable as
    // proxyURL=http://proxy-wsa.esl.cisco.com:80
    private static final String PROXY_URL_PROPERTY = "proxyURL";
    
    // max number of connection
    private static final int DEFAULT_MAX_CONNECTION_PER_ROUTE = 50;
    private static final int MAX_CONNECTIONS_FOR_LOCALHOST = 80;
    private static final int MAX_PER_ROUTE_FOR_LOCALHOST = 50;
    
    private static final HttpHost HTTP_PROXY_HOST = getHttpProxy();
    
    /**
     * Ensure this is never constructed
     */
    private HttpClientUtils() {
        
    }
    
    /**
     * Create a new CloseableHttpClient with the given Configuration parameters Handles
     * setting up HTTP connections, HTTPS connections, sets up a proxy if necessary System
     * properties for PROXY_URL to define a proxy to use
     *
     * @return an instance of closeableHttpClient with either ssl enabled or disabled
     */
    public static CloseableHttpClient createHttpClient(boolean isSSLEnabled) {
        
        // creating builder to create CloseableHttpClient
        HttpClientBuilder builder = HttpClients.custom();
        
        if (null != HTTP_PROXY_HOST) {
            System.out.println("Using HTTP proxy: " + HTTP_PROXY_HOST);
            builder.setProxy(HTTP_PROXY_HOST);
        }
        
        if (isSSLEnabled) {
            
            // getting SSLContext which loads certificates from trust store
            final SSLContext sslcontext = buildSSLContext();
            
            // initializing ssl factory which validates the certificate presented by server
            final SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                    sslcontext, 
                    new String[] { "TLSv1" },      /*supported protocols*/
                    null,                          /*supported cipher suites*/
                    new AllowAllHostnameVerifier()
                    //new DefaultHostnameVerifier()  /*verifies the host(to which we are requesting)with the host provided in certificate by server */
                    );
            
            // registering factory for different schemes (http/https)
            final Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder
                    .<ConnectionSocketFactory> create()
                    .register("https", sslsf)
                    .register("http", PlainConnectionSocketFactory.INSTANCE)
                    .build();
            
            // creating a connection manager which manages connection pool, it also restricts number of connection allowed 
            PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
            
            // max total connections
            connectionManager.setMaxTotal(DEFAULT_MAX_CONNECTION_PER_ROUTE + MAX_CONNECTIONS_FOR_LOCALHOST + MAX_PER_ROUTE_FOR_LOCALHOST);
            
            // Change default max connection per route
            connectionManager.setDefaultMaxPerRoute(DEFAULT_MAX_CONNECTION_PER_ROUTE);
            
            // Increase max connections for localhost:80
            HttpHost localhost = new HttpHost("locahost", 80);
            connectionManager.setMaxPerRoute(new HttpRoute(localhost), MAX_PER_ROUTE_FOR_LOCALHOST);
            
            builder.setSSLSocketFactory(sslsf).setConnectionManager(connectionManager);
        }
        return builder.build();
    }
    
    /**
     * Creates an HttpHost from the connection configuration property for the ProxyURL
     * Parses the Proxy URL and makes an HTTP host from it that can be used to proxy
     * requests
     * 
     * @return an HttpHost object to use as a proxy, or null if none is configured
     */
    private static HttpHost getHttpProxy() {

        HttpHost httpHost = null;
        try {
            String proxy = System.getenv(PROXY_URL_PROPERTY);
            if (null != proxy) {
                URI uri = URI.create(proxy);
                httpHost = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
            }
            else{
                System.out.println("not using proxy, as \"proxyURL\" not defined in environment");
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("exception while setting proxy:" + e);
        }
        return httpHost;
    }
    
    /**
     * This method initilizes SSLContext. It loads all the certificate from the trust
     * store in jre. Certificates are used to authenticate the communication from any server.
     *
     * @return SSLContext
     */
    private static SSLContext buildSSLContext() {
        
        try {
            return SSLContexts.custom().setSecureRandom(new SecureRandom()).loadTrustMaterial(null, (TrustStrategy) null).build();
        }
        catch (Exception e) {
            // catching generic exception, the above try block may throw following exception
            // NoSuchAlgorithmException, KeyStoreException, CertificateException, IOException
            
            throw new SSLInitializationException("Exception while building SSLContext", e);
        }
    }
}
