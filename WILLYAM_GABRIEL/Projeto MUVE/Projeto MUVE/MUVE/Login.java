package MUVE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
    private String nome;
    private int idade;
    private String email;

    public Login(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        if (validarEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public void registroPessoa() {
        System.out.println("Nome: " + nome + " Idade: " + idade + " E-mail: " + email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validarEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    private boolean validarEmail(String email) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
