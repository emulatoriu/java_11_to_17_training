package logic;

import com.sun.jdi.connect.Connector;
import data.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService();
    }

    @ParameterizedTest
    //@ValueSource(strings = {"str1", "str2", "str3"})
    //@CsvSource({"str1, 4", "str2, 8"})
    @MethodSource("initialize")
    void getPersonByName(List<Person> persons, String name, Optional<Person> expected) {
        Optional<Person> result = personService.getPersonByName(persons, name);

        assertEquals(expected, result);
    }

    static Stream<Arguments> initialize() {
        Person p1 = new Person("bob", 34, List.of());
        Person p2 = new Person("anna", 34, List.of());
        Person p3 = new Person("otto", 34, List.of());

        return Stream.of(
                Arguments.of(
                        List.of(p1, p2, p3), "bob", Optional.of(p1)
                ),
                Arguments.of(
                        List.of(), "Banana Joe", Optional.empty()
                ),
                Arguments.of(
                        List.of(p1, p2), "otto", Optional.empty()
                ),
                Arguments.of(
                        List.of(p1, p2, p3), "AnNA", Optional.of(p2)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("initializeForHobbies")
    void getHobbiesUniquely(List<Person> persons, List<String> expected) {
        List<String> result = personService.getHobbiesUniquely(persons);

        assertEquals(expected, result);
    }

    static Stream<Arguments> initializeForHobbies() {
        Person p1 = new Person("bob", 34, List.of("Basketball", "Fischen"));
        Person p2 = new Person("anna", 34, List.of("Fussball", "Backen"));
        Person p3 = new Person("otto", 34, List.of("Backen", "Basketball", "Snooker"));
        return Stream.of(
                Arguments.of(
                        List.of(p1, p2, p3), List.of("Basketball", "Fischen", "Fussball", "Backen", "Snooker")
                ),
                Arguments.of(
                        List.of(), List.of()
                ),
                Arguments.of(
                        List.of(p1, p2), List.of("Basketball", "Fischen", "Fussball", "Backen")
                )
        );
    }
}