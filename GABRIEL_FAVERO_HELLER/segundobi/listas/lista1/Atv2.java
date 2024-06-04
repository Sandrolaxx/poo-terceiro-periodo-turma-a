package segundobi.listas.lista1;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Atv2 {
    /*
     * Atv2 -Crie um HashSet de números inteiros e adicione alguns números
     * repetidos.
     * Verifique se o conjunto contém um número específico e imprima o resultado.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        System.out.println("Qual numero quer pesquisar?");
        Integer verificarNumero = scanner.nextInt();

        if (numeros.contains(verificarNumero)) {
            System.out.println("O numero " + verificarNumero + " esta na lista");
        } else {
            System.out.println("O numero " + verificarNumero + " não esta na lista");
        }
    }
}