package Lista2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
       
        List<String> nomes = new ArrayList<>();
        nomes.add("roberto");
        nomes.add("josé");
        nomes.add("caio");
        nomes.add("vinicius");

        List<String> nomesMaiusculos = nomes.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());

        
        System.out.println("Nomes em letras maiúsculas: " + nomesMaiusculos);
    }
}


