package SegundoBi.Listas.Lista1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;


public class Main{

    public static void main(String[] args) {
        // Atv1
        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Felipe");
        colegas.add("Fornicas");
        colegas.add("Pedro");
        colegas.add("Kaito");
        colegas.add("Mairano");

        for (String colega : colegas) {
            System.out.println(colega.substring(0, 1) + " - " + colega);
        }

        // Atv2
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(11);
        numeros.add(20);
        numeros.add(10); 
        numeros.add(30);

        int numeroBusca = 20;
        System.out.println("O conjunto contém o número " + numeroBusca + "? " + numeros.contains(numeroBusca));

        // Atv3
        ArrayList<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("Final Fantasy XV");
        jogosZerados.add("The Binding of Isaac: Rebirth");
        jogosZerados.add("Hades"); 
        jogosZerados.add("The Binding of Isaac: Rebirth");

        List<String> jogosUnicos = removeDupe(jogosZerados);
        System.out.println("Jogos zerados únicos: " + jogosUnicos);

        // Atv4
        PriorityQueue<String> animesAssistidos = new PriorityQueue<>();
        animesAssistidos.add("VinlandSaga");
        animesAssistidos.add("Bleach");
        animesAssistidos.add("Dragon Ball");
        animesAssistidos.add("Heaven's Design Team");
        animesAssistidos.add("One Piece");

        System.out.println("Animes ordenados:");
        while (!animesAssistidos.isEmpty()) {
            System.out.println(animesAssistidos.poll());
        }

        // Atv5
        System.out.println("\nConfigurações de hardware:");
        imprimirHardware("Processador", "i7 7700X");
        imprimirHardware("Memória RAM", "16GB DDR4");
        imprimirHardware("Placa de Vídeo", "NVIDIA GeForce 3060");
        imprimirHardware("SSD", "SSD Kingston Fury NVME 1T");
        imprimirHardware("Monitor", "Xiaomi 24\" Full HD");
    }

    public static List<String> removeDupe(List<String> lista) {
        Set<String> conjunto = new HashSet<>(lista);
        return new ArrayList<>(conjunto);
    }

    public static void imprimirHardware(String componente, String valor) {
        System.out.println(componente + " : " + valor);
    }
}

