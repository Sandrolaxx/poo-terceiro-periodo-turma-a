package MUVE;

public class UsuarioNormal extends Login {
    public UsuarioNormal(String nome, int idade, String email) {
        super(nome, idade, email);
    }

    public void dados() {
        System.out.println("Usuário normal registrado");
        registroPessoa();
    }
}