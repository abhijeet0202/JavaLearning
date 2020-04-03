package MailDelivery;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class SendVoiceMail {
	//Abhijeet (Normal User ESN:21786)
	//private static String requestUrl = "https://ucbu-aricent-vm632.cisco.com:8443/vmrest/messages?userobjectid=6cc9cc65-2150-4ce3-8310-b0f52bf104e7";
	private static String requestUrl = "https://ucbu-aricent-vm632.cisco.com:8443/vmrest/messages";
	File file1 = null;
	File file2 = null;
	File voiceMessage = null;
	ResponseEntity<String> entity = null;

	public static void main(String[] args) throws Exception {
		SendVoiceMail sendVoiceMail = new SendVoiceMail();
		sendVoiceMail.sendMail();

	}

	void sendMail() throws IOException {
		RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory(true));
		restTemplate.setErrorHandler(new ErrorResponseHandler());

		//A user who have MailBox right(Acces Token)
		String userPassword = "Aryan:Ecsbulab1";
		String basicAuth = Base64.getEncoder().encodeToString(userPassword.getBytes());

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		headers.add(HttpHeaders.AUTHORIZATION, "Basic " +basicAuth);
		
		String subject = "Voicemail from Aryan banerjee (ext - 21786)"; 
		//String message = String.format("{\"Subject\" : \"%s\", \"Sensitivity\" : \"Normal\", \"Priority\" : \"Normal\", \"ReadReceiptRequested\" : \"false\", \"DeliveryReceiptRequested\" : \"false\" }", subject);
		//String message = String.format("{\"Subject\" : \"%s\", \"Sensitivity\" : \"Normal\", \"Priority\" : \"Normal\" }", subject);
		String message = String.format("{\"Subject\" : \"%s\", \"Sensitivity\" : \"Normal\", \"Priority\" : \"%s\", \"ArrivalTime\" : \"%d\", \"CallerId\" : \"+123456\", }", subject,"Urgent",1140331262);

		// creating an HttpEntity for the message part
		HttpHeaders messageHeader = new HttpHeaders();
		messageHeader.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> messageHttpEntity = new HttpEntity<>(message, messageHeader);

		//Receiver(Surbhi)
		String calleeObjectId = "a3ad9bc3-5415-4782-8671-8b9da934ed41";
		String recipient = String.format("{\"Recipient\" : { \"Type\": \"TO\", \"Address\" : { \"Type\": \"SUBSCRIBER\", \"ObjectId\" : \"%s\"} } }", 
		calleeObjectId);

		// creating an HttpEntity for the recipient part
		HttpHeaders recipientHeader = new HttpHeaders();
		recipientHeader.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> recipientHttpEntity = new HttpEntity<>(recipient, recipientHeader);

		// creating an HttpEntity for the binary part
		HttpHeaders audioHeader = new HttpHeaders();
		audioHeader.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		InputStream audioStream = new FileInputStream("C:/Users/abhibane/Desktop/cumi/AvAfterMsgMenu001.wav");
		ByteArrayResource byteArrayResource = new ByteArrayResource(IOUtils.toByteArray(audioStream));
		HttpEntity<ByteArrayResource> audioHttpEntity = new HttpEntity<>(byteArrayResource, audioHeader);


		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("message", messageHttpEntity);
		map.add("recipient", recipientHttpEntity);
		map.add("VoiceMessage.wav", audioHttpEntity);

		HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<LinkedMultiValueMap<String, Object>>(
		map, headers);
		System.out.println(requestEntity.getBody());
		System.out.println(requestEntity.getHeaders());
		entity = restTemplate.exchange(requestUrl, HttpMethod.POST, requestEntity, String.class);
		System.out.println(entity.getStatusCode());
		System.out.println(entity.getBody());
		System.out.println(entity.getHeaders());
			}

	/**
	 * method to create http client factory
	 * 
	 * @param isSSLEnabled
	 *            indicates whether ssl should be enabled or not
	 * @throws RestClientException
	 *             in case http client could not be created
	 */
	private ClientHttpRequestFactory getClientHttpRequestFactory(final boolean isSSLEnabled) {

		try {
			return new HttpComponentsClientHttpRequestFactory(HttpClientUtils.createHttpClient(isSSLEnabled));
		} catch (

		Exception ex) {
			throw new RestClientException("ssl initialization failed", ex);
		}
	}
}
