package Lista2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
       
        List<String> palavras = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");

        List<String> palavrasOrdenadas = palavras.stream()
                .sorted((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                .collect(Collectors.toList());

        System.out.println("Palavras ordenadas por tamanho:");
        palavrasOrdenadas.forEach(System.out::println);
    }
}
