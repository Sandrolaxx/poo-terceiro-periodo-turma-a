package segundobim.listas.list1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Computador {

    // ATV 5 Crie um método que crie uma estrutura que
    // permita salvar as configurações de hardware da sua máquina,
    // exemplo: "Processador" : "i5 7500U".
    // Faça isso para no mínimo 5 peças e
    // imprima a peça e seu respectivo valor.

    public void computadorEspecific() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome da peça:");

        Map<String, Double> componentes = new HashMap<>();

        while (true) {
            System.out.println("Nome da peça: ");
            String nome = scanner.nextLine();

            if (nome.equals("sair")) // se nome.equals(nome igual) sair, encerra o programa.
                break;

            System.out.println("Valor da peça: ");
            Double valor = scanner.nextDouble();
            scanner.nextLine();

            componentes.put(nome, valor);
        }

        for (String chave : componentes.keySet()) {
            System.out.println("Item: " + chave + " Valor: " + componentes.get(chave)); // componentes.get(chave) pega o valor atribuído à chave através do get;

        }
        scanner.close();

    }

}
