package segundobi.Atividade1;
import java.util.List;
import java.util.ArrayList;

public class ativ3 {
    public static void main(String[] args) {
        List<String> jogo = new ArrayList<String>();
  
        jogo.add("Grand Theft Auto 5");
        jogo.add("Grand Theft Auto 5");
        jogo.add("God of War 3");
        jogo.add("Crash");
        jogo.add("Crash");

        List<String> escolha = zerados (jogo);
        
        System.out.println("Esses são os jogos que eu ja zerei:");
        for( String game: escolha){
          System.out.println(game);
        }
      }
      public static List<String>zerados(List<String>jogo) {
  
          List<String> escolha = new ArrayList<String>();
  
          for (String game : jogo) {
              if (!escolha.contains(game)) {
                escolha.add(game);
              }
          }
  
          return escolha;
      }
}
