package Muve;

public class Musicista extends Login {
    private String cpf;

    public Musicista(String nome, int idade, String email, String cpf) {
        super(nome, idade, email);
        this.cpf = cpf;
    }

    public void dadosPF() {
        System.out.println("CPF: " + cpf);
        registroPessoa();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}