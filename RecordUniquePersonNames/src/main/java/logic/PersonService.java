package logic;

import java.util.List;
import data.Person;

public class PersonService {
	public long getUniquePersonNameCount(List<Person> persons) {
		return persons.stream()
				.map(Person::firstName)
				.distinct()
				.count();
	}
}
