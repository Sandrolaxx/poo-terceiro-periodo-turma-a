package SEGUNDO_BIMESTRE.listas.lista1;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Ex4 {
    public static void main(String[] args) {

        Queue<String> movies = new LinkedList<>();

        movies.add("Ponto Cego");
        movies.add("Interestelar");
        movies.add("Breaking Bad");
        movies.add("Peaky Blinders");
        movies.add("La Casa de Papel");

        Queue<String> orderedMovies = orderMovies(movies);

        System.out.println(orderedMovies);
    }

    public static Queue<String> orderMovies(Queue<String> movies) {

        PriorityQueue<String> moviesInOrder = new PriorityQueue<>(movies);

        return moviesInOrder;
    }
}
