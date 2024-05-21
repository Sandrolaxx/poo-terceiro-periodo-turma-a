import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        // Atividade 1
        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("João");
        colegas.add("Maria");
        colegas.add("Pedro");
        colegas.add("Ana");
        colegas.add("Carlos");

        for (String colega : colegas) {
            System.out.println(colega.charAt(0) + " - " + colega);
        }

        // Atividade 2
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);

        System.out.println(numeros.contains(2));

        // Atividade 3
        List<String> jogos = new ArrayList<>();
        jogos.add("Minecraft");
        jogos.add("Minecraft");
        jogos.add("Fortnite");
        jogos.add("Among Us");
        jogos.add("Among Us");

        List<String> zerados = zerados(jogos);

        for (String jogo : zerados) {
            System.out.println(jogo);
        }

        // Atividade 4
        List<String> animes = new ArrayList<>();
        animes.add("Naruto");
        animes.add("One Piece");
        animes.add("Attack on Titan");
        animes.add("Dragon Ball");
        animes.add("Fullmetal Alchemist");

        List<String> ordenados = ordenados(animes);

        for (String anime : ordenados) {
            System.out.println(anime);
        }

        // Atividade 5
        Map<String, String> configuracoes = new HashMap<>();
        configuracoes.put("Processador", "i5 7500U");
        configuracoes.put("Memória", "8GB");
        configuracoes.put("Placa de Vídeo", "NVIDIA GTX 1050");
        configuracoes.put("Placa Mãe", "ASUS H110M-K");
        configuracoes.put("Armazenamento", "SSD 500GB");

        for (Map.Entry<String, String> config : configuracoes.entrySet()) {
            System.out.println(config.getKey() + ": " + config.getValue());
        }
    }

    public static List<String> zerados(List<String> jogos) {
        Set<String> zeradosSet = new HashSet<>();

        for (String jogo : jogos) {
            zeradosSet.add(jogo);
        }

        return new ArrayList<>(zeradosSet);
    }

    public static List<String> ordenados(List<String> animes) {
        PriorityQueue<String> fila = new PriorityQueue<>();

        for (String anime : animes) {
            fila.add(anime);
        }

        List<String> ordenados = new ArrayList<>();

        while (!fila.isEmpty()) {
            ordenados.add(fila.poll());
        }

        return ordenados;
    }
}