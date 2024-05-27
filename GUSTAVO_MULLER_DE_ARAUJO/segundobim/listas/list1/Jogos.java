package segundobim.listas.list1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Jogos {

    // ATV 3 Escreva um método que receba uma lista de strings
    // contendo os jogos que você já zerou. Caso tenha zerado mais de uma vez,
    // adicione o nome do jogo para cada vez.
    // Após criar a lista de jogos zerados,
    // retorne uma nova lista contendo apenas as strings únicas
    // (sem duplicatas).

    public void jogosZerados() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome dos jogos que você já zerou: (Digite sair para encerrar o programa)");

        Set<String> nomeJogo = new HashSet<>();

        String nome = scanner.nextLine();

        while (!nome.equals("sair")) {
            nomeJogo.add(nome);
            nome = scanner.nextLine();
        }
        System.out.println("Os jogos que você já zerou são: " + nomeJogo);
        scanner.close();
    }

}