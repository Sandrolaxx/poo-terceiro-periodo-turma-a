package segundobi.Atividade1;
import java.util.ArrayList;
import java.util.Collections;

public class ativ4 {
    public static void main(String[] args) {
        ArrayList<String> films= new ArrayList<>();

        films.add("Lobo de Wall Street");
        films.add("Gente grande");
        films.add("Nu");
        films.add("Segurança de Shopping");
        films.add("Mistério em Paris");

        Collections.sort(films);
       
      System.out.println("Ordem alfabética dos filmes: ");
      films.forEach(filme ->System.out.println(filme));
      
    }
}
