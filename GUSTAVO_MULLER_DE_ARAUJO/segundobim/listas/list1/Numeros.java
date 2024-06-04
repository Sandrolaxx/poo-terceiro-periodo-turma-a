package segundobim.listas.list1;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Numeros {

    // ATV 2 Crie um HashSet de números inteiros e adicione alguns números
    // repetidos.
    // Verifique se o conjunto contém um número específico
    // e imprima o resultado.

    public void numerosRepetidos() {
        Scanner scanner = new Scanner(System.in);

        Set<Double> numero = new HashSet<>();

        System.out.println("Insira numeros e digite sair para encerrar.");

        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equals("sair")) {
                break;
            } else {
                Double num = Double.parseDouble(entrada); // parseDouble transforma uma string em double;
                numero.add(num);
            }

        }
        System.out.println("Numeros repetidos: " + numero.size());
        scanner.close();

    }

}
