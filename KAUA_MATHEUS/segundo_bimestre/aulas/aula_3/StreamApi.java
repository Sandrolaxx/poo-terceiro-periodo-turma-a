import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

    // Filter - Filtrar os valores específicos de um Array
        
    List<String> lista = new ArrayList<>();

    lista.add("valor1");
    lista.add("valor3");
    lista.add("valor2");
    lista.add("valor3");
    lista.add("valor4");
    lista.add("valor4");
    lista.add("valor4");

    List <String> lista_filtrada = lista.stream()
        .filter(valores -> valores.equals("valor3")).toList(); 
    
    // Aplicação anterior, abaixo de Java 11

    List <String> lista_filtrada2 = lista.stream()
        .filter(valores -> valores.equals("valor4"))
            .collect(Collectors.toList()); 

    
    lista_filtrada.forEach(valor -> System.out.println(valor));
    System.out.println();
    lista_filtrada2.forEach(valor -> System.out.println(valor));

    System.out.println();


    // Map - Transformando todos os valores do Array

    List <String> lista_mapeada = lista.stream()
        .map(valor -> "valor22")
        .toList();

    lista_mapeada.forEach(valor -> System.out.println(valor));

    }
}