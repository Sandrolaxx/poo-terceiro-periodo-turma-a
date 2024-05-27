package SEGUNDO_BI.listas.lista1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


public class Main {

    //Atividade 3
    public static void jogosZerados(){

        List<String> jogos = new ArrayList<>();


        jogos.add("God of War");
        jogos.add("South Park");
        jogos.add("South Park");
        jogos.add("Minecraft");
        jogos.add("Minecraft");
        jogos.add("Terraria");
        jogos.add("Hollow Knight");


        Set<String> jogosUnicos = new LinkedHashSet<>(jogos);


        for(String jogo : jogosUnicos){

            System.out.println(jogo);


        }
}
   
    //Atividade 4
    public static void topFilmes(){
        List<String> listaFilmes = new ArrayList<>();


        listaFilmes.add("Serviço de entregas da Kiki");
        listaFilmes.add("Viagem de Chihiro");
        listaFilmes.add("Castelo Animado");
        listaFilmes.add("Ponyo");
        listaFilmes.add("Meu amigo Totoro");


        Queue<String> filmes = new PriorityQueue<>(listaFilmes);


        System.out.println("\nFilmes:");
        while (!filmes.isEmpty()) {
            System.out.println(filmes.poll());
        }
    }

    //Atividade 5
    public static void configPc(){
        try (Scanner scanner = new Scanner(System.in)){
            Map<String, String> pecas = new HashMap<>();

            System.out.println("Digite seu processador");
            String processador = scanner.next();

            System.out.println("Digite seu gabinete");
            String gabinete = scanner.next();

            System.out.println("Digite sua Memoria RAM");
            String memoriaRAM = scanner.next();

            System.out.println("Digite seu monitor");
            String monitor = scanner.next();

            System.out.println("Digite sua placa de video");
            String placaVideo = scanner.next();

            
            pecas.put("Processador", processador);
            pecas.put("Gabinete", gabinete);
            pecas.put("Memoria RAM", memoriaRAM);
            pecas.put("Monitor", monitor);
            pecas.put("Placa de Video", placaVideo);

            for (Map.Entry<String, String> entry : pecas.entrySet()) {
                System.out.println("Peça: " + entry.getKey() + " - Configuração: " + entry.getValue()+"\n");
            }
        }
    }
   
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){


            //Atividade 1
            List<String> nomes = new ArrayList<>();
            String inicial;


            nomes.add("Raul");
            nomes.add("Rafael");
            nomes.add("Pedro");
            nomes.add("Heitor");
            nomes.add("Leonardo");


            for(String nome:nomes){

                inicial = nome.substring(0,1);
                System.out.println(inicial+" - "+nome);

            }
           


            //Atividade 2
            Set<Integer> numeros = new HashSet<>();


            numeros.add(1);
            numeros.add(3);
            numeros.add(9);
            numeros.add(5);
            numeros.add(8);
            numeros.add(1);
            numeros.add(5);


            System.out.println("\nEscolha um numero: ");
            Integer numeroEspecifico = scanner.nextInt();


            if(numeros.contains(numeroEspecifico)){

                System.out.println("\nO conjunto contem o numero "+numeroEspecifico+"\n");

            }
            else{

                System.out.println("\nO conjunto não contem o numero "+numeroEspecifico+"\n");

            }

            //Atividade 3
            jogosZerados();

            //Atividade 4
            topFilmes();

            //Atividade 5
            configPc();
        }
    }    
}

