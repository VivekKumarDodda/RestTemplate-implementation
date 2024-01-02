package in.vivek;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplimentation implements ServiceInterface{
	
	@Autowired
	private PersonRepo prepo;
	@Override
	public String SavePerson(Person person) {
		
		 Person save = prepo.save(person);
		 
		 return "Person Saved";

	}

	@Override
	public List<Person> getAllPerson() {
		
		List<Person> findAll = prepo.findAll();
		
		return findAll;
	}

	@Override
	public Person getPerson(Integer id) {
		
		Optional<Person> findById = prepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
			
		}
		return null;
		
	
		}
	

}
