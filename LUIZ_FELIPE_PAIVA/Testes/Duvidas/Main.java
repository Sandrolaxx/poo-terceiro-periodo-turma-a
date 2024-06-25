package Testes.Duvidas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira a altura: ");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Informações atuais");
        Construtor pessoa1 = new Construtor(nome, idade, altura);
        pessoa1.imprimeInfo();

        System.out.println("Informações atualizadas: ");
        pessoa1.setNome("Arroz");
        pessoa1.setIdade(32);
        pessoa1.setAltura(1.60);
        pessoa1.imprimeInfo();
    }
}
