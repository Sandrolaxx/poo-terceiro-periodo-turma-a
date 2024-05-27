package SEGUNDO_BIMESTRE.ListaAtividades.lista1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listaNome = new ArrayList<>();

        System.out.print("INFORME A QUANTIDADE DE NOMES PARA A LISTA: ");
        int quantNomes = scanner.nextInt();

        for (int i = 1; i <= quantNomes; i++) {
            System.out.print("NOME (" + i + "): ");
            String nome = scanner.next();
            listaNome.add(nome);
        }

        for (String nome : listaNome) {
            char letraInicial = nome.charAt(0);
            System.out.println(letraInicial + " - " + nome);
        }
        // ATV1

        System.out.println("=======================================");
        System.out.println("=======================================");



        Set<Integer> numerosInteiros = new HashSet<>();

        System.out.print("INFORME A QUANTIDADE DE NUMEROS DESEJADAS: ");
        int quantNumeros = scanner.nextInt();

        for (int i = 1; i <= quantNumeros; i++) {
            System.out.print("NUMERO (" + i + "): ");
            int numeros = scanner.nextInt();
            numerosInteiros.add(numeros);
        }

        System.out.println("NUMEROS INFORMADOS: " + numerosInteiros);
        System.out.print("INFORME UM NUMERO PARA VERIFICAR SE FOI INFORMADO: ");

        int verificador = scanner.nextInt();

        if (numerosInteiros.contains(verificador)) {
            System.out.println("O NUMERO " + verificador + " FOI INFORMADO "
                    + Collections.frequency(numerosInteiros, verificador) + "X");
        } else {
            System.out.println("O NUMERO " + verificador + " NÃO FOI INFORMADO");
        }
        // ATV2

        System.out.println("=======================================");
        System.out.println("=======================================");



        List<String> listaJogos = new ArrayList<>();

        System.out.print("INFORME QUANTOS JOGOS VOCÊ JÁ ZEROU: ");
        int quantJogos = scanner.nextInt();

        for (int i = 1; i <= quantJogos; i++) {
            System.out.print("JOGO (" + i + "): ");
            String jogo = scanner.next();
            listaJogos.add(jogo);
        }

        System.out.println("JOGOS INFORMADOS: " + listaJogos);

        Set<String> jogosUnicos = new HashSet<>(listaJogos);
        List<String> listaJogosUnicos = new ArrayList<>(jogosUnicos);

        System.out.println("JOGOS ZERADOS: " + listaJogosUnicos);
        // ATV3

        System.out.println("=======================================");
        System.out.println("=======================================");



        List<String> melhoresFilmes = new ArrayList<>();

        System.out.print("INFORME A QUANTIDADE DE ANIMES/FILMES QUE VOCÊ ASSISTIU NESSE ANO: ");
        int quantFilmes = scanner.nextInt();

        System.out.println("INFORME O NOME DOS MELHORES ANIMES/FILMES");

        for (int i = 1; i <= quantFilmes; i++) {
            System.out.print("NOME DO ANIME/FILME (" + i + "): ");
            String nomeFilmes = scanner.next();
            melhoresFilmes.add(nomeFilmes);

        }

        PriorityQueue<String> queue = new PriorityQueue<>(melhoresFilmes);

        List<String> listaOrdenada = new ArrayList<>();
        while (!queue.isEmpty()) {
            listaOrdenada.add(queue.poll());
        }

        System.out.println("\nSUA LISTA");
        for (String animeFilme : listaOrdenada) {
            System.out.println(animeFilme + "\n");
        }
        // ATV4

        System.out.println("=======================================");
        System.out.println("=======================================");



        Map<String, Map<String, String>> hardwareConfig = new HashMap<>();

        System.out.print("INFORME QUANTOS HARDWARES VOCÊ DESEJA INFORMAR: ");
        int quantHard = scanner.nextInt();

        for (int i = 1; i <= quantHard; i++) {
            System.out.println("=======================================");

            System.out.print("INFORME O NOME DO HARDWARE: ");
            String nomeHard = scanner.next();

            System.out.print("INFORME O MODELO DO " + nomeHard + ": ");
            String modeloHard = scanner.next();

            System.out.println("=======================================");

            Map<String, String> hardDetalhe = new HashMap<>();
            hardDetalhe.put("MODELO", modeloHard);

            hardwareConfig.put(nomeHard, hardDetalhe);
        }

        System.out.println("CONFIGURAÇÕES DOS HARDWARES:");

        for (Map.Entry<String, Map<String, String>> entry : hardwareConfig.entrySet()) {
            String hardNome = entry.getKey();

            Map<String, String> detaHard = entry.getValue();
            String hardModelo = detaHard.get("MODELO");

            System.out.println("NOME: " + hardNome + "\nMODELO: " + hardModelo);
            System.out.println("=======================================");

        }
        // ATV5

        scanner.close();
    }

}