package SegundoBimestre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {
    // atividade 1
    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("cassandra");
        alunos.add("marcus");
        alunos.add("sam");
        alunos.add("chloe");
        alunos.add("sophia");

        String minhaInicial = "L";
        for (String aluno : alunos) {
            System.out.println(minhaInicial + " -> " + aluno);
        }
        System.out.println();

        // atividade 2
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        Scanner scanner = new Scanner(System.in);
        System.out.print("numero a ser procurado: ");
        int numeroProcurado = scanner.nextInt();

        boolean temNumero = numeros.contains(numeroProcurado);

        if (temNumero) {
            System.out.println("o conjunto tem o número " + numeroProcurado);
        } else {
            System.out.println("o conjunto não tem o número " + numeroProcurado);
        }
        System.out.println();

        // atividade 3
        List<String> jogos = new ArrayList<>();
        jogos.add("Minecraft");
        jogos.add("Minecraft");
        jogos.add("Stardew Valley"); // Repetido
        jogos.add("The Last Of Us");
        jogos.add("Skyrim"); // Repetido

        System.out.println("jogos zerados: " + jogos);
        List<String> jogosUnicos = duplicados(jogos);
        System.out.println("jogos zerados uma vez: " + jogosUnicos);
        System.out.println();

        // atividade 4
        PriorityQueue<String> tv = new PriorityQueue<>();

        tv.add("naruto");
        tv.add("house md.");
        tv.add("howls castle");
        tv.add("fallout");
        tv.add("jujutsu kaisen");

        System.out.println("cinco melhores animes/filmes em ordem alfabética:");
        while (!tv.isEmpty()) {
            System.out.println(tv.poll());
        }

        System.out.println();
        // atividade 5

        HashMap<String, String> configuracoesHardware = new HashMap<>();
        configuracoesHardware.put("Processador", "i5 7500U");
        configuracoesHardware.put("Memória RAM", "16GB DDR4");
        configuracoesHardware.put("Armazenamento", "512GB SSD");
        configuracoesHardware.put("Placa de Vídeo", "NVIDIA GTX 1050");
        configuracoesHardware.put("Placa Mãe", "Asus Prime B250M");

        System.out.println("Configurações de hardware:");
        for (Map.Entry<String, String> entry : configuracoesHardware.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    public static List<String> duplicados(List<String> lista) {
        Set<String> set = new HashSet<>(lista);

        return new ArrayList<>(set);
    }

}
