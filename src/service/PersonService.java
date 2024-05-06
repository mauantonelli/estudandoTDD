package service;

import dominio.Person;
import java.util.Objects;

public class PersonService {

    public boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person can't be null!");
        return person.getAge() >= 18; // Modificado para verificar se a pessoa é adulta
    }

    public boolean nomeValido(Person person) {
        Objects.requireNonNull(person, "Person can't be null!");
        String nome = person.getNome();
        return nome != null && nome.length() >= 2; // Verificando se o nome tem pelo menos 2 caracteres
    }

    public boolean cpfValido(Person person){
        Objects.requireNonNull(person, "Person can't be null!");
        String cpf = person.getcpf();

        if (cpf.length() != 11) {
            return false;
        }
    }
}
