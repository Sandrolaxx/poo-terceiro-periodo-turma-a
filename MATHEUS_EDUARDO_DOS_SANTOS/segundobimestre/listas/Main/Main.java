package segundobimestre.listas.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomesColegas = new ArrayList<>();

        nomesColegas.add("Cleiton");
        nomesColegas.add("Luiz");
        nomesColegas.add("Léo");
        nomesColegas.add("Felipe");
        nomesColegas.add("Pedro");

        for (String nome : nomesColegas) {
            System.out.println("M - " + nome);
        }
        //ATV 1//

        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(5); 
        numeros.add(10);
        numeros.add(3); 

        int numeroEspecifico = 5;
        if (numeros.contains(numeroEspecifico)) {
            System.out.println("O conjunto contém o número " + numeroEspecifico);
        } else {
            System.out.println("O conjunto não contém o número " + numeroEspecifico);
        }
        //ATV 2//

        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("God of War");
        jogosZerados.add("God of War 2");
        jogosZerados.add("God of War 2");
        jogosZerados.add("Overcooked");
        jogosZerados.add("Portal 2");
        jogosZerados.add("Resident Evil 4");
        jogosZerados.add("GTA San Andreas");

        List<String> jogosUnicos = removerDuplicatas(jogosZerados);

        System.out.println("Lista de jogos zerados sem duplicatas:");
        for (String jogo : jogosUnicos) {
            System.out.println(jogo);
        }
        //ATV 3//

         ArrayList<String> animesFilmes = new ArrayList<>();
        animesFilmes.add("One Piece");
        animesFilmes.add("Nana");
        animesFilmes.add("Hunter Hunter");
        animesFilmes.add("Hajime no Ippo");
        animesFilmes.add("Diamond no Ace");

        ordenarEImprimir(animesFilmes);
        //ATV 4//

        HashMap<String, String> configuracoesHardware = new HashMap<>();

        configuracoesHardware.put("Processador i5-1135G7", "R$600,00");
        configuracoesHardware.put("SSD 256 GB PCIe NVMe", "R$389,99");
        configuracoesHardware.put("RAM 8 GB DDR4-3200 MHz", "R$144,99");
        configuracoesHardware.put("Placa de vídeo", "R$969,00");
        configuracoesHardware.put("Monitor 24 IPS Full HD", "R$544,40");

        System.out.println("Configurações de hardware da máquina:");
        for (String peca : configuracoesHardware.keySet()) {
            String valor = configuracoesHardware.get(peca);
            System.out.println(peca + ": " + valor);
        }
        //ATV 5//
    }

    public static List<String> removerDuplicatas(List<String> lista) {
        Set<String> set = new HashSet<>(lista); 
        return new ArrayList<>(set); 
    }
    // Método para remover duplicatas de uma lista de strings ATV 3//

    public static void ordenarEImprimir(ArrayList<String> lista) {
        Collections.sort(lista);

        System.out.println("Lista dos cinco melhores animes em ordem alfabética:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
    // Método para ordenar e imprimir a lista ATV 4//
}
