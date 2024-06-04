import java.util.*;

public class ListaUm {
    public static void main(String[] args) {

        // ATIVIDADE 1 

        ArrayList<String> colegas = new ArrayList<>();
        colegas.add("Nathan");
        colegas.add("Matheus");
        colegas.add("Hebernald");
        colegas.add("Trump");
        colegas.add("Putin");

        System.out.println("ATIV1 - Nomes colegas:");
        for (String nome : colegas) {
            System.out.println(nome.charAt(0) + " - " + nome);
        }

        // ATIVIDADE 2 

        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(5); // Aqui o numero repetido 

        int numeroVerificar = 10;
        System.out.println("\nATIV2 - Verifica se o conjunto contém o número " + numeroVerificar + ":");
        System.out.println("Contém o número " + numeroVerificar + "? " + numeros.contains(numeroVerificar));

        // ATIVIDADE 3

        ArrayList<String> jogos = new ArrayList<>();
        jogos.add("The Witcher 3");
        jogos.add("The Witcher 3");
        jogos.add("Dark Souls");
        jogos.add("Dark Souls");
        jogos.add("Dark Souls");
        jogos.add("Skyrim");

        System.out.println("\nATIV3 - Lista de jogos zerados:");
        System.out.println("Lista original: " + jogos);
        ArrayList<String> jogosUnicos = removerDuplicatas(jogos);
        System.out.println("Lista de jogos únicos: " + jogosUnicos);

        // ATIVIDADE 4

        PriorityQueue<String> melhoresAnimes = new PriorityQueue<>();
        melhoresAnimes.add("Naruto");
        melhoresAnimes.add("Death Note");
        melhoresAnimes.add("Attack on Titan");
        melhoresAnimes.add("One Piece");
        melhoresAnimes.add("Dragon Ball Z");

        System.out.println("\nATIV4 - Lista dos melhores animes em ordem alfabética:");
        while (!melhoresAnimes.isEmpty()) {
            System.out.println(melhoresAnimes.poll());
        }

        // ATIVIDADE 5 

        HashMap<String, String> configuracoesHardware = new HashMap<>();
        configuracoesHardware.put("Processador", "i5 7500U");
        configuracoesHardware.put("Placa de vídeo", "Nvidia GTX 1060");
        configuracoesHardware.put("MemóriaRAM", "16GB DDR4");
        configuracoesHardware.put("Armazenamento", "SSD 500GB");
        configuracoesHardware.put("Monitor", "Dell 24'' IPS");

        System.out.println("\nATV5 - Configurações de hardware da máquina:");
        for (Map.Entry<String, String> entry : configuracoesHardware.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static ArrayList<String> removerDuplicatas(ArrayList<String> lista) {
        HashSet<String> conjunto = new HashSet<>(lista);
        return new ArrayList<>(conjunto);
    }
}
