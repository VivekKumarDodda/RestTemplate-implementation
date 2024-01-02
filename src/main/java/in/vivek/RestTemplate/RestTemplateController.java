package in.vivek.RestTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vivek.Person;

@RestController
@RequestMapping("/RestTemplate")
public class RestTemplateController {
	
	@Autowired
	private RestTemplateService restservice;
	
	@PostMapping("/SavePerson")
	public ResponseEntity<String> SavePerson(@RequestBody Person person){
		ResponseEntity<String> saveEmployee = restservice.savePerson(person);
		

		
		
		return saveEmployee;
	}
	
	@GetMapping("/getAllPersons")
	public ResponseEntity<String> getAllPersons(){
		
		return restservice.getAllPersons();
	}

}
