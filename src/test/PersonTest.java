package service;

import dominio.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    @Test
    public void testIsAdult() {
        PersonService personService = new PersonService();

        Person person1 = new Person(15);
        Person person2 = new Person(18);
        Person person3 = new Person(25);

        // Act
        boolean isAdult1 = personService.isAdult(person1);
        boolean isAdult2 = personService.isAdult(person2);
        boolean isAdult3 = personService.isAdult(person3);

        // Assert
        assertFalse(isAdult1, "Nao eh adulto!");
        assertTrue(isAdult2, "Eh adulto!");
        assertTrue(isAdult3, "Eh adulto!");
    }
}
