package segundobi.listas.lista2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //ATV 1

        System.out.println("Atividade 1:");
        List<Integer> numerosInteiros = new ArrayList<>();
        Collections.addAll(numerosInteiros,1,2,3,4,5,6,7,8,9,10);
        System.out.println(retornarPares(numerosInteiros));

        //ATV 2

        System.out.println("\nAtividade 2:");
        List<String> nomes = new ArrayList<>();
        Collections.addAll(nomes,"roberto", "josé", "caio", "vinicius");
        System.out.println(retornarMaiusculo(nomes));

        //ATV 3

        System.out.println("\nAtividade 3:");
        List<String> palavras =  new ArrayList<>();
        Collections.addAll(palavras,"se", "talvez", "hoje","sábado", "se", "quarta", "sábado");
        verificarRepeticao(palavras);
    }

    public static List<Integer> retornarPares(List<Integer> lista){
        List<Integer> numerosPares = lista.stream()
            .filter(numero -> numero % 2 == 0)
            .toList();
        return numerosPares;
    }

    public static List<String> retornarMaiusculo(List<String> lista){
        List<String> listaMaiuscula = lista.stream()
            .map(palavras -> palavras.toUpperCase())
            .toList();
        return listaMaiuscula;
    }

    public static void verificarRepeticao(List<String> lista){
        Map<String, Long> listaContar = lista.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); 
        listaContar.forEach((palavra,quantidade) -> 
        System.out.println("'" + palavra + "' aparece " + quantidade + " vez(es)"));
        
    }
}
//Crie um programa que conte quantas vezes cada palavra única aparece em uma lista de strings.
//Utilize a Stream API para processar os dados. Lista de palavras("se", "talvez", "hoje" "sábado", "se", "quarta", "sábado")
