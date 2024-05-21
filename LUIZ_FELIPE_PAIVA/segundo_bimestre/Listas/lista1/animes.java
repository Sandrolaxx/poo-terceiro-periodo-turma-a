package segundo_bimestre.Listas.lista1;

import java.util.PriorityQueue;

public class animes {
    public static void main(String[] args) {
        PriorityQueue<String> listaAnimesFilmes = new PriorityQueue<>();
        listaAnimesFilmes.add("Pokemon");
        listaAnimesFilmes.add("Death Note");
        listaAnimesFilmes.add("Yu-gi-oh");
        listaAnimesFilmes.add("Super Onze");
        listaAnimesFilmes.add("Digimon");

        imprimirListaOrdenada(listaAnimesFilmes);
    }

    public static void imprimirListaOrdenada(PriorityQueue<String> lista) {
        System.out.println("Lista ordenada de animes/filmes:");
        while (!lista.isEmpty()) {
            System.out.println(lista.poll());
        }
    }
}

