package primeirobi.atividade2.AtividadeListaUM;
import java.util.List;
import java.util.ArrayList;

public class Lista3 {
    public static void main(String[] args) {
      List<String> jogos = new ArrayList<String>();

      jogos.add("Naruto");
      jogos.add("Naruto");
      jogos.add("FAY CRY 3");
      jogos.add("DAYS GONE");
      jogos.add("DAYS GONE");
      jogos.add("Dragon ball");
      List<String> escolhaojogo = jogoszerados (jogos);
      
      System.out.println("zerados");
      for( String jogo: escolhaojogo){
        System.out.println(jogo);
      }
    }
    public static List<String>jogoszerados(List<String>jogos) {

        List<String> escolhaojogo = new ArrayList<String>();

        for (String jogo : jogos) {
            if (!escolhaojogo.contains(jogo)) {
                escolhaojogo.add(jogo);
            }
        }

        return escolhaojogo;
    }
    
}