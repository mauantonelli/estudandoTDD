package dominio;

public class Person {
    private int age;
    private String nome;

    public Person(String nome, int age) {
        this.nome = nome;
        this.age = age;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
