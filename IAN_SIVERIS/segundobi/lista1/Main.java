package segundobi.lista1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // ATV1
        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Joao");
        colegas.add("Jorge");
        colegas.add("Itallo");
        colegas.add("Barbara");
        colegas.add("Ian");

        for (String nome: colegas) {
            System.out.println(nome.charAt(0) + " - " + nome);
        }

        // ATV2
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);

        int numeroProcurado = 1;
        if (numeros.contains(numeroProcurado)) {
            System.out.println("O conjunto contém o número " + numeroProcurado);
        } else {
            System.out.println("O conjunto não contém o número " + numeroProcurado);
        }

        // ATV3
        ArrayList<String> jogos = new ArrayList<>();
        jogos.add("GTA5");
        jogos.add("GTA5");
        jogos.add("RDR2");
        jogos.add("The Witcher 3");

        List<String> jogosUnicos = removerDuplicatas(jogos);
        System.out.println("Jogos únicos: " + jogosUnicos);

        // ATV4
        PriorityQueue<String> filmes = new PriorityQueue<>();
        filmes.add("Ratatouille");
        filmes.add("Vingadores Ultimato");
        filmes.add("Interstellar");
        filmes.add("Velozes e furiosos 1");
        filmes.add("Velozes e furiosos 2");

        while (!filmes.isEmpty()) {
            System.out.println(filmes.poll());
        }

        // ATV5
        HashMap<String, String> hardware = new HashMap<>();
        hardware.put("Processador", "i5 12400 - R$1500");
        hardware.put("Placa de vídeo", "RTX 3050 - R$1200");
        hardware.put("Memória RAM", "16GB DDR4 - R$300");
        hardware.put("Armazenamento", "SSD 500GB - R$ 300");
        hardware.put("Monitor", "Samsung 144hz - R$ 1500");

        for (Map.Entry<String, String> entry : hardware.entrySet()) {
            String componente = entry.getKey();
            String descricaoValor = entry.getValue();
            System.out.println(componente + ": " + descricaoValor);
        }
    }

    public static List<String> removerDuplicatas(List<String> lista) {
        return new ArrayList<>(new HashSet<>(lista));}
}
