package in.vivek;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ServiceInterface {
	
	public String SavePerson(Person person);
	
	public List<Person> getAllPerson();
	
	public Person getPerson(Integer id);
}
