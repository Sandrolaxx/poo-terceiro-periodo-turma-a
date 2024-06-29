import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.HashMap;

public class listaum {
    public static void main(String[] args) {
        // Atividade 1
        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Alice");
        colegas.add("Bob");
        colegas.add("Carol");
        colegas.add("Dave");
        colegas.add("Eve");

        System.out.println("Atividade 1 - Lista de Colegas:");
        for (String nome : colegas) {
            System.out.println(nome.charAt(0) + " - " + nome);
        }

        // Atividade 2
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        System.out.println("\nAtividade 2 - Verifica se o conjunto contém o número 20:");
        System.out.println("Contém o número 20? " + numeros.contains(20));

        // Atividade 3
        List<String> jogos = new ArrayList<>();
        jogos.add("Dark Souls");
        jogos.add("Valorant");
        jogos.add("Zelda");
        jogos.add("Mario Kart");
        jogos.add("GTAV");

        List<String> jogosUnicos = obterJogosUnicos(jogos);
        System.out.println("\nAtividade 3 - Lista de jogos únicos:");
        for (String jogo : jogosUnicos) {
            System.out.println(jogo);
        }

        // Atividade 4
        List<String> animes = new ArrayList<>();
        animes.add("Naruto");
        animes.add("Bleach");
        animes.add("One Piece");
        animes.add("Attack on Titan");
        animes.add("Death Note");

        System.out.println("\nAtividade 4 - Animes ordenados:");
        PriorityQueue<String> queue = new PriorityQueue<>(animes);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // Atividade 5
        HashMap<String, String> hardwareConfig = new HashMap<>();
        hardwareConfig.put("Processador", "i5 12500H");
        hardwareConfig.put("Memória RAM", "16GB");
        hardwareConfig.put("Disco Rígido", "2TB");
        hardwareConfig.put("Placa de Vídeo", "NVIDIA RTX3050TI");
        hardwareConfig.put("Sistema Operacional", "Windows 11");

        System.out.println("\nAtividade 5 - Configurações de hardware:");
        for (String key : hardwareConfig.keySet()) {
            System.out.println(key + " : " + hardwareConfig.get(key));
        }
    }

    private static List<String> obterJogosUnicos(List<String> jogos) {
        HashSet<String> set = new HashSet<>(jogos);
        return new ArrayList<>(set);
    }
}
