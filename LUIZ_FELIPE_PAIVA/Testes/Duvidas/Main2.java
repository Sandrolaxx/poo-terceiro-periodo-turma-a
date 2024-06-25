package Testes.Duvidas;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira a idade: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Insira a altura: ");
        double altura = Double.parseDouble(scanner.nextLine());
        System.out.println("Informações atuais");
        Construtor2 pessoa1 = new Construtor2();
        pessoa1.setNome(nome);
        pessoa1.setIdade(idade);
        pessoa1.setAltura(altura);
        pessoa1.imprimeInfo();

        scanner.close();
    }

}