package segundobi.listas.lista1;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Atv4 {
    /*
     * Atv4 -Crie um método que utilize PriorityQueue para ordenar uma lista com o
     * nome dos cinco melhores animes/filmes que você já viu em ordem alfabética. Em
     * seguida, imprima a lista ordenada.
     */
    public static void main(String[] args) {

        Queue<String> filmes = new LinkedList<>();

        filmes.add("One Piece");
        filmes.add("Hunter x Hunter");
        filmes.add("Fullmetal Alchemist: Brotherhood");
        filmes.add("Sousou no Frieren");
        filmes.add("Shingeki no Kyojin");

        Queue<String> listaFilmes = listarFilmes(filmes);

        System.out.println(listaFilmes);
    }

    public static Queue<String> listarFilmes(Queue<String> filmes) {

        PriorityQueue<String> filmesEmOrdem = new PriorityQueue<>(filmes);

        return filmesEmOrdem;
    }
}
