package ToSpark;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class BotSpark {
	void doVM2Spark() throws IOException {
		String htmlSubject = "On behalf Of <b>[Abhijeet Banerjee]</b>: \nHello Kiran";
		
		String BotAccessToken = "ZTQwZjk4NDEtZjJkYy00YjZmLTlkNjEtYWU4OGYzYThmMzI2Zjg1ZmNjMjktZjFl";
		//String toPersonId = "dda16775-c8e2-455b-ada2-bea3d2ff3750";
		
		//String fileName = "VM_Prashant_1432675469.wav";
		String fileName = "VM_Abhijeet_21786.jpg";
		
		//InputStream audioStream = new FileInputStream("C:\\Users\\abhibane\\Downloads\\VM_Prashant_1432675469.wav");
		InputStream audioStream = new FileInputStream("D:\\index.png");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + BotAccessToken);

		// creating an HttpEntity for the binary part
		HttpHeaders audioHeader = new HttpHeaders();
		//audioHeader.set("Content-Type", "audio/wav");
		audioHeader.set("Content-Type", "image/gif");
		audioHeader.set("Content-Disposition", String.format("form-data; name=files; filename=%s", fileName));
		ByteArrayResource byteArrayResource = new ByteArrayResource(IOUtils.toByteArray(audioStream));
		HttpEntity<ByteArrayResource> audioHttpEntity = new HttpEntity<>(byteArrayResource, audioHeader);
		audioStream.close();

		LinkedMultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
		parts.add("files", audioHttpEntity);
		parts.add("html", htmlSubject);
		// parts.add("text", htmlSubject);
		// only works is the bot is part of the room already
		//Avril-Radical
		//parts.add("roomId", "0b8c52c0-6748-11e5-b89b-d1899e57723e");
		//Avril
		//parts.add("roomId", "9bb44e30-481b-11e5-b95d-11e69f10463f");
		parts.add("toPersonEmail", "kiransin@cisco.com");

		HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<LinkedMultiValueMap<String, Object>>(
				parts, headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> entity = null;
		try {
			entity = restTemplate.exchange("https://api.ciscospark.com/v1/messages", HttpMethod.POST, requestEntity,
					String.class);
			System.out.println(entity.getBody());
		} catch (HttpClientErrorException he) {
			System.out.println(he.getResponseBodyAsString());
		}
	}

	public static void main(String[] args) throws IOException {
		BotSpark botSpark = new BotSpark();

		try {
			botSpark.doVM2Spark();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
