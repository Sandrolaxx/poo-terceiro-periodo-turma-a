package lista1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {

        String individual;
        Scanner scanner = new Scanner(System.in);

        HashSet<String> favoritos = new HashSet<String>();

        System.out.println("\nQuais são os seus 5 filmes/animes favoritos?");
        for (int i = 0; i < 5; i++){
            individual = scanner.nextLine();
            String primeiraLetra = individual.substring(0, 1).toUpperCase();//Tive que colocar os nomes em uppercase ou lowercase pra poder imprimir em ordem alfabética, mas eu queria deixar bonitnho, então eu fiz o bgl pra deixar a primeira letra em uppercase e o resto em lowercase. 👍
            String restoDaPalavra = individual.substring(1).toLowerCase();//---------------^
            favoritos.add(primeiraLetra + restoDaPalavra);//------------------------------------------^
        }

        PriorityQueue<String> favoritosOrdem = new PriorityQueue<>(favoritos.size(), Comparator.naturalOrder());

        favoritosOrdem.addAll(favoritos);

        System.out.println("\nSeus filmes/animes favoritos em ordem alfabética:");
        while (!favoritosOrdem.isEmpty()){
            System.out.println(favoritosOrdem.poll());
        }
        System.out.println("\n");
    }
}
