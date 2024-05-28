package segundobi.listas.lista1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // ATV1 - ArrayList com nomes e impressão de iniciais
        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Capitão Mariano");
        colegas.add("Nathan de Assiz");
        colegas.add("Hebernald 3 pernas");
        colegas.add("Will ribinski");
        colegas.add("Jorgi do whey");

        for (String colega : colegas) {
            System.out.println(colega.charAt(0) + " - " + colega);
        }

        // ATV2 - HashSet com números e verificação de existência
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(20); // Adicionando número repetido

        int numeroProcurado = 30;
        System.out.println("Contém o número " + numeroProcurado + ": " + numeros.contains(numeroProcurado));

        // ATV3 - Método para obter jogos zerados únicos
        List<String> jogosZerados = criaListaJogosZerados();
        List<String> jogosUnicos = getJogosUnicos(jogosZerados);
        System.out.println(jogosUnicos);

        // ATV4 - PriorityQueue para ordenar animes/filmes
        PriorityQueue<String> animesFilmes = new PriorityQueue<>();
        animesFilmes.add("Akame Ga Kill");
        animesFilmes.add("Death Note");
        animesFilmes.add("Naruto");
        animesFilmes.add("Dragon Ball");
        animesFilmes.add("One Piece");

        while (!animesFilmes.isEmpty()) {
            System.out.println(animesFilmes.poll());
        }

        // ATV5 - HashMap para salvar configurações de hardware
        HashMap<String, String> hardware = new HashMap<>();
        hardware.put("Processador", "i5 7500U");
        hardware.put("Memória RAM", "16GB");
        hardware.put("Placa de Vídeo", "NVIDIA GTX 1050");
        hardware.put("Disco Rígido", "1TB SSD");
        hardware.put("Monitor", "24 polegadas 144Hz");

        for (String chave : hardware.keySet()) {
            System.out.println(chave + ": " + hardware.get(chave));
        }
    }

    // Método para criação da lista de jogos zerados
    public static List<String> criaListaJogosZerados() {
        List<String> jogos = new ArrayList<>();
        jogos.add("Assassins Creed: Odyssey");
        jogos.add("Assassins Creed: Valhalla");
        jogos.add("GOW 1");
        jogos.add("GOW 2");
        jogos.add("Jedi Fallen Order");
        jogos.add("Jedi Fallen Order");
        return jogos;
    }

    // Método para obter jogos únicos
    public static List<String> getJogosUnicos(List<String> jogos) {
        HashSet<String> setJogos = new HashSet<>(jogos);
        return new ArrayList<>(setJogos);
    }
}
