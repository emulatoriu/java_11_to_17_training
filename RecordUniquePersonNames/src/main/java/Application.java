import java.util.List;

import data.Person;
import logic.PersonService;

public class Application {
	public static void main(String[] args) {
		Person max = new Person("Max", "Musterman");
		Person maxima = new Person("Maxima", "Musterfrau");
		List<Person> persons = List.of(max, maxima, max);
		PersonService personService = new PersonService();
		long uniqueNamesCount = personService.getUniquePersonNameCount(persons);
		System.out.println(uniqueNamesCount);
		System.out.println(max);
	}
}
