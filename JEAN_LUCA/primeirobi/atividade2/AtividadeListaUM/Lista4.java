package primeirobi.atividade2.AtividadeListaUM;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class Lista4{
        public static void main(String[] args) {
            Queue<String> filmes= new PriorityQueue<>();

            filmes.add("ate a sorte no separe");
            filmes.add("panico");
            filmes.add("gente grande");
            filmes.add("beber nao case");
            filmes.add("pica pau");
           
          System.out.println("nome dos filmes em ordem alfabética");
            filmes.forEach(nome ->System.out.println(nome));
          
        }
    }




 