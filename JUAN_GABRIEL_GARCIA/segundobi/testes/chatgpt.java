package segundobi.testes;
import java.util.PriorityQueue;

public class chatgpt {
    public static void main(String[] args) {
        // Criar a lista de animes/filmes
        String[] animesFilmes = {"Naruto", "Your Name", "Avatar: The Last Airbender", "Spirited Away", "Interstellar"};

        // Chamar o método para ordenar e imprimir a lista
        ordenarEImprimir(animesFilmes);
    }

    public static void ordenarEImprimir(String[] lista) {
        // Criar uma PriorityQueue para ordenar a lista em ordem alfabética
        PriorityQueue<String> filaPrioridade = new PriorityQueue<>();
        for (String item : lista) {
            filaPrioridade.offer(item);
        }

        // Imprimir a lista ordenada
        System.out.println("Lista ordenada em ordem alfabética:");
        while (!filaPrioridade.isEmpty()) {
            System.out.println(filaPrioridade.poll());
        }
    }
}
