import data.Person;
import logic.PersonService;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Bob", 30, List.of()));
        PersonService personService = new PersonService();
        Optional<Person> optionalPerson = personService.getPersonByName(persons, "Bob");
        Consumer<String> outputFunction = name -> System.out.println(name);
        if(optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            outputFunction.accept(person.name());
//            System.out.println(person);
        }



    }
}
