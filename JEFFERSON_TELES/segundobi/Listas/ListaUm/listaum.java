package segundobi.Listas.ListaUm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class listaum {
    public static void main(String[] args) {
        // Atividade 1
        List<String> colegasFavoritos = new ArrayList<>();
        colegasFavoritos.add("MAIDANA");
        colegasFavoritos.add("JEAN");
        colegasFavoritos.add("WYLLIAN");
        colegasFavoritos.add("JEFFERSON");
        colegasFavoritos.add("NATHAN");

        System.out.println("ATV1:");
        for (String nome : colegasFavoritos) {
            System.out.println(nome.substring(0, 1) + " - " + nome);
        }

        // Atividade 2
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(3);
        numeros.add(7);
        numeros.add(3); 

        int numeroBuscado = 7;
        System.out.println("\nAtividade 2:");
        System.out.println("O Conjunto Contem o Numero " + numeroBuscado + "? " + numeros.contains(numeroBuscado));

        // Atividade 3
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("SAN ANDREAS");
        jogosZerados.add("NEED FOR SPEED");
        jogosZerados.add("RAFT"); 

        List<String> jogosUnicos = removeDuplicatas(jogosZerados);
        System.out.println("\nAtividade 3:");
        System.out.println("Jogos Zerados Unicos:");
        for (String jogo : jogosUnicos) {
            System.out.println(jogo);
        }

        // Atividade 4
        PriorityQueue<String> melhoresAnimesFilmes = new PriorityQueue<>();
        melhoresAnimesFilmes.add("Velozes e Furiosos");
        melhoresAnimesFilmes.add("Carros");
        melhoresAnimesFilmes.add("Um Lugar Silencioso");
        melhoresAnimesFilmes.add("The Bird");
        melhoresAnimesFilmes.add("Naruto");

        System.out.println("\nAtividade 4:");
        System.out.println("Melhores Filmes e Anime em Ordem:");
        while (!melhoresAnimesFilmes.isEmpty()) {
            System.out.println(melhoresAnimesFilmes.poll());
        }

        // Atividade 5
        System.out.println("\nAtividade 5:");
        System.out.println("Configurações de Hardware:");
        imprimirConfiguracoesHardware();
    }

    // Atividade 3
    public static List<String> removeDuplicatas(List<String> lista) {
        return new ArrayList<>(new HashSet<>(lista));
    }

    // Atividade 5
    public static void imprimirConfiguracoesHardware() {
        
        var configuracoes = new ArrayList<String>();
        configuracoes.add("Processador: i7-11800H - Valor: R$2.242,73");
        configuracoes.add("Placa de vídeo: NVIDIA RTX 3050 Ti - Valor: R$1.699.00");
        configuracoes.add("Memória RAM: 24GB DDR4 - Valor: R$558,39");
        configuracoes.add("Armazenamento: Nvme 480GB - Valor: R$219,99");
        configuracoes.add("Monitor: 144Hz - Nao tem valor, ja vem no not");

        for (String item : configuracoes) {
            System.out.println(item);
        }
    }
}
