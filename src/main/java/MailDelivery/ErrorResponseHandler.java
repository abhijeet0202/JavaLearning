package MailDelivery;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

public  class ErrorResponseHandler implements ResponseErrorHandler {
    
    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
    
    }
    
    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
    
        return isError(response.getStatusCode());
        
    }
    
    private boolean isError(HttpStatus status) {
    
        HttpStatus.Series series = status.series();
        return (HttpStatus.Series.CLIENT_ERROR.equals(series) || HttpStatus.Series.SERVER_ERROR.equals(series));
    }
}