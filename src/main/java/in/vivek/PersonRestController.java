package in.vivek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {
	
	@Autowired
	private ServiceInterface sinterface;
	
	@PostMapping("/person")
	public String saveProduct(@RequestBody Person p) {
		
		String string = sinterface.SavePerson(p);
		
		return string;
	}
	
	@GetMapping("/getPerson/{id}")
	public Person getPerson(@PathVariable Integer id) {
		if(id!= null)
		return sinterface.getPerson(id);
		return null;
		
	}
	
	@GetMapping("/persons")
	public List<Person> getAllPersons(){
		
		return sinterface.getAllPerson();
	}
	

}
