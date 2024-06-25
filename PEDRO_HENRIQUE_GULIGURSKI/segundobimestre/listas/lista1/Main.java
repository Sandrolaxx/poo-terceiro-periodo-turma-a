package listas.lista1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void listaIniciais() {
        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Pedro");
        listaNomes.add("Raul Torres");
        listaNomes.add("Rafael Kaito");
        listaNomes.add("Leonardo Liogi");
        listaNomes.add("Mariano");

        System.out.println("Atividade 1 - ArrayList:");


        List<String> iniciais = new ArrayList<>();
        for(String nome : listaNomes) {
            String inicialNome = nome.substring(0, 1);
            iniciais.add(inicialNome);
            System.out.println(inicialNome+" - "+nome);
        }
        System.out.println();
    }

    public static void hashNumeros() {
        Scanner input = new Scanner(System.in);
        Set<Integer> numerosInt = new HashSet<>();

        numerosInt.add(3);
        numerosInt.add(2);
        numerosInt.add(2);
        numerosInt.add(15);
        numerosInt.add(1);
        numerosInt.add(7);
        numerosInt.add(2);
        numerosInt.add(7);
        numerosInt.add(8);

        System.out.println("Atividade 2 - HashSet:");
        System.out.println("Insira um número:");
        Integer numUser = input.nextInt();

        
        if (numerosInt.contains(numUser)) {
            System.out.println("O número digitado foi: "+numUser);
            System.out.println("O número "+numUser+" está na lista!");
        } else {
            System.out.println("O número "+numUser+" não está na lista!");
        }
        

        numerosInt.forEach(item -> System.out.println(item));
        System.out.println();
        input.close();
    }

    public static void listaJogosZerados() {
        List<String> jogosZerados = new ArrayList<>();

        jogosZerados.add("Minecraft");
        jogosZerados.add("Minecraft");
        jogosZerados.add("Mortal Kombat 3");
        jogosZerados.add("FarCry 3");
        
        Set<String> jogosSemRepetir = new HashSet<>();
        for (String jogo : jogosZerados){
            jogosSemRepetir.add(jogo);
        }
        System.out.println("Atividade 3 - Lista sem duplicatas:");

        jogosSemRepetir.forEach(item -> System.out.println(item));
        System.out.println();
    }

    public static void queueMelhores() {
        List<String> obrasFavoritas = new ArrayList<>();

        obrasFavoritas.add("One Piece");
        obrasFavoritas.add("Hunter x Hunter");
        obrasFavoritas.add("Fullmetal Alchemist");
        obrasFavoritas.add("Berserk");
        obrasFavoritas.add("Vinland Saga");

        Queue<String> obrasFavoritasOrdenadas = new PriorityQueue<>(obrasFavoritas);
        System.out.println("Atividade 4 - Obras Favoritas:");
        while(!obrasFavoritasOrdenadas.isEmpty()){
            System.out.println(obrasFavoritasOrdenadas.poll());
        }

        System.out.println();
    }

    public static void configPc() {
        Scanner input = new Scanner(System.in);
        Map<String, Float> pecasComputador = new HashMap<>();
        
        String separador = "------------------------------";
        System.out.println("Atividade 5 - Peças Máquina:");

        Float valorProcessador = 0.0f;
        String configProcessador;
        System.out.println("Qual é o seu processador? ");
        configProcessador = input.next(); input.nextLine();
        System.out.println("E qual é o valor?");
        valorProcessador = input.nextFloat();
        System.out.println(separador);

        Float valorSsd = 0.0f;
        String configSsd;
        System.out.println("Qual é o seu SSD? ");
        configSsd = input.next(); input.nextLine();
        System.out.println("E qual é o valor?");
        valorSsd = input.nextFloat();
        System.out.println(separador);

        Float valorMonitor = 0.0f;
        String configMonitor;
        System.out.println("Qual é o seu Monitor? ");
        configMonitor = input.next(); input.nextLine();
        System.out.println("E qual é o valor?");
        valorMonitor = input.nextFloat();
        System.out.println(separador);
        
        Float valorMotherBoard = 0.0f;
        String configMotherBoard;
        System.out.println("Qual é a sua Placa-mãe? ");
        configMotherBoard = input.next(); input.nextLine();
        System.out.println("E qual é o valor?");
        valorMotherBoard = input.nextFloat();
        System.out.println(separador);

        Float valorPlacaVideo = 0.0f;
        String configPlacaVideo;
        System.out.println("Qual é a sua Placa de vídeo? ");
        configPlacaVideo = input.next(); input.nextLine();
        System.out.println("E qual é o valor?");
        valorPlacaVideo = input.nextFloat();
        System.out.println(separador);

        input.close();

        pecasComputador.put(configProcessador, valorProcessador);
        pecasComputador.put(configSsd, valorSsd);
        pecasComputador.put(configMonitor, valorMonitor);
        pecasComputador.put(configMotherBoard, valorMotherBoard);
        pecasComputador.put(configPlacaVideo, valorPlacaVideo);

        pecasComputador.entrySet()
            .forEach(ks -> {
                System.out.println("Peça: " + ks.getKey());
                System.out.println("Valor: " + ks.getValue());
            });
            System.out.println();

        System.out.println();
    }

    public static void main(String[] args) {
        listaIniciais();
        hashNumeros();
        listaJogosZerados();
        queueMelhores();
        configPc();
    }
      
}
