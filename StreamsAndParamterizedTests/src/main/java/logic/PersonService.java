package logic;

import data.Person;

import java.util.List;
import java.util.Optional;

public class PersonService {
    public Optional<Person> getPersonByName(List<Person> persons, String name) {
        return persons.stream()
                .filter(person -> person.name().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<String> getHobbiesUniquely(List<Person> persons) {
        return persons.stream()
                .map(Person::hobbies)
                .flatMap(hobbies -> hobbies.stream())
                .distinct()
                .toList();
    }
}
