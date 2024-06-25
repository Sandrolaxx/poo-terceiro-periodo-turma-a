package Lista2;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");

        Map<String, Long> contagemPalavras = palavras.stream()
                                                     .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

        contagemPalavras.forEach((palavra, contagem) -> 
            System.out.println("Palavra: " + palavra + ", Contagem: " + contagem));
    }
}
