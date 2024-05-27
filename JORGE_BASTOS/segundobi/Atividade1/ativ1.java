package segundobi.Atividade1;
import java.util.ArrayList;
import java.util.List;

public class ativ1 {
    public static void main(String[] args) {
        List<String> user = new ArrayList<String>();

        user.add("Joao");
        user.add("Nathan");
        user.add("Ian");
        user.add("Maidana");
        user.add("Hebernout");

        for (String colegas : user) {
            System.out.println("J - " + colegas);
        }
        
      }

}
