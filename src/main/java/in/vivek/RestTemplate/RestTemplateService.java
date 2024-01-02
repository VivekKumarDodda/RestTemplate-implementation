package in.vivek.RestTemplate;



import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.vivek.Person;

@Service
public class RestTemplateService {
	
	RestTemplate template = new RestTemplate();
	
	public ResponseEntity<String> savePerson(Person person){
		
		String save_person_url = "http://localhost:8080/person";
		
//		HttpHeaders header = new HttpHeaders();
//		//header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		
//		header.setContentType(MediaType.APPLICATION_JSON);
//		
//		String requestBody = "{\"key\":\"value\"}";
//		
//		HttpEntity<String> entity = new HttpEntity<>(requestBody,header);
		
		return template.postForEntity(save_person_url, person, String.class);
		
		
	}
	
	public ResponseEntity<String> getAllPersons(){
		
		String GetAll_person_url = "http://localhost:8080/persons";
		
		HttpHeaders hearder = new HttpHeaders();
		hearder.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		//HttpEntity<List<Person>> entity = new HttpEntity<List<Person>>(hearder);
		
		HttpEntity<String> entity1 = new HttpEntity<>(hearder);
		//return null;
		
		 ResponseEntity<String> exchange = template.exchange(GetAll_person_url,HttpMethod.GET, entity1 , String.class);
		 
		 return exchange;
	}

}
