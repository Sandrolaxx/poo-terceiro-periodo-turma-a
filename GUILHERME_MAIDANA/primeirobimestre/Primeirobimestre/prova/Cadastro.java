package primeirobimestre.Primeirobimestre.prova;

import java.util.Scanner;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    private String nome, senha;

    public String criarCadastro() {
        
        System.out.println("Digite o seu Nome:");
        nome = scanner.next();

        System.out.println("Digite Sua Senha:");
        senha = scanner.next();

        return nome;
    }
}
