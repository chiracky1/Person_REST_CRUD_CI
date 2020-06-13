package numeryx.fr.service;

import java.util.List;

import numeryx.fr.model.Person;
import numeryx.fr.model.PersonDto;

public interface PersonService {
	
	List<Person> getAllPersons();
	Person getPersonById(Long id);
	Person getByTel(String tel);
	Person createPerson(PersonDto p);
//	Person updatePerson(PersonDto p);
	void deletePerson(Long id);

}
