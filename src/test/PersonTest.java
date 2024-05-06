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
        assertFalse(isAdult1, "Não é adulto!");
        assertTrue(isAdult2, "É adulto!");
        assertTrue(isAdult3, "É adulto!");
    }

    @Test
    public void testNomeValido() {
        PersonService personService = new PersonService();

        Person person1 = new Person("Mauricio", 40);
        Person person2 = new Person("Luciana", 28);
        Person person3 = new Person("A", 30); // Nao sao validos nomes com menos de 2 caracteres!

        boolean nomeValido1 = personService.nomeValido(person1);
        boolean nomeValido2 = personService.nomeValido(person2);
        boolean nomeValido3 = personService.nomeValido(person3);

        assertTrue(nomeValido1, "Nome válido!");
        assertTrue(nomeValido2, "Nome válido!");
        assertFalse(nomeValido3, "Nome inválido!"); // Por ter 1 caracter!
    }

    public void testCpfValido(){
        PersonService personService = new PersonService();

        Person person1 = new Person("Mauricio", 20, "43587260803");
        Person person2 = new Person("Lucas", 38, "12341"); // Invalidando o cpf

        boolean cpfValido1 = personService.cpfValido(person1);
        boolean cpfValido2 = personService.cpfValido(person2);

        assertTrue(cpfValido1, "CPF valido!");
        assertTrue(cpfValido2, "CPF invalido!");
    }
}
