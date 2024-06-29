package exemplos;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Minha idade é: " + idade);
        System.out.println(idade < 18 ? "É menor" : "Não é menor");
    }

}
