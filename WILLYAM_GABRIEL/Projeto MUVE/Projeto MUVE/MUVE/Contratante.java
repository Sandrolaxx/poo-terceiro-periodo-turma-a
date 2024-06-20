package MUVE;

public class Contratante extends Login {
    private String cnpj;

    public Contratante(String nome, int idade, String email, String cnpj) {
        super(nome, idade, email);
        this.cnpj = cnpj;
    }

    public void dadosPJ() {
        System.out.println("CNPJ: " + cnpj);
        registroPessoa();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}