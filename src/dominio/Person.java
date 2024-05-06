package dominio;

public class Person {
    private int age;
    private String nome;
    private String cpf;

    public Person(String nome, int age, Strinf cpf) {
        this.nome = nome;
        this.age = age;
        this.cpf = cpf;
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

    public String getcpf(){
        return cpf;
    }

    public void setCpf(String cpf){
         this.cpf = cpf;
    }
}
