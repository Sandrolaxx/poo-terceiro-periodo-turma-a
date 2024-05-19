package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Listadois;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        /*ATT1
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);

        List<Integer> listaPares = listaNumeros.stream()
        .filter(numero -> numero % 2 == 0)
        .toList();

        System.out.println("Lista de Números Pares: " +listaPares);*/
    


         /*ATT2

         List<String> listaMinuscula = new ArrayList<>();

         listaMinuscula.add("roberto");
         listaMinuscula.add("josé");
         listaMinuscula.add("caio");
         listaMinuscula.add("vinicius");
 
         List<String> listaMaiuscula = listaMinuscula.stream()
         .map(String ::toUpperCase)
        .toList();
    
        System.out.println("Lista Maiuscula : " + listaMaiuscula + "  ");*/



            /*ATT3 

            List<String> listaRepetida = new ArrayList<>();

            listaRepetida.add("se");
            listaRepetida.add("talvez");
            listaRepetida.add("hoje");
            listaRepetida.add("sabado");
            listaRepetida.add("se");
            listaRepetida.add("quarta");
            listaRepetida.add("sabado");

            Map<String , Long> listasemRepeticao = listaRepetida.stream()
            .collect(Collectors.groupingBy(
                palavra -> palavra,
                Collectors.counting()
            ));   

            listasemRepeticao.forEach((palavra , contagem) ->
                System.out.println(palavra + " : " + contagem )
            );*/
        

            /*ATT4 
            List<Produto> listaProdutos = new ArrayList<>();
            listaProdutos.add(new Produto("Mouse Gamer ", 150));
            listaProdutos.add(new Produto("Teclado Gamer ", 500));
            listaProdutos.add(new Produto("Adaptador USB ", 30));
            listaProdutos.add(new Produto("Fone de Procedencia duvidosa ", 50));

            // Usando a Stream API para filtrar os produtos com preço > R$ 100,00
            List<Produto> produtosFiltrados = listaProdutos.stream()
            .filter(produto -> produto.getPreco() > 100)
            .collect(Collectors.toList());

            // Imprimindo os produtos filtrados
            System.out.println("Produtos com preço maior que R$ 100 pila:");
            produtosFiltrados.forEach(System.out::println);*/



            /*ATT5
            List<Produto> listaProdutos = new ArrayList<>();
            listaProdutos.add(new Produto("Mouse Gamer ", 150));
            listaProdutos.add(new Produto("Teclado Gamer ", 500));
            listaProdutos.add(new Produto("Adaptador USB ", 30));
            listaProdutos.add(new Produto("Fone de Procedencia duvidosa ", 50));

            
            List<Produto> produtosFiltrados = listaProdutos.stream()
            .filter(produto -> produto.getPreco() > 100)
            .collect(Collectors.toList());

            
            System.out.println("Produtos com preço maior que R$ 100 pila:");
            produtosFiltrados.forEach(System.out::println);

            double somaTotal = listaProdutos.stream()
            .mapToDouble(Produto::getPreco)
            .sum();

            System.out.println("Soma total do valor dos produtos: R$ " + somaTotal);*/

            /*ATT6
            List<String> listaPalavras = new ArrayList<>();
            listaPalavras.add("Java");
            listaPalavras.add("Python");
            listaPalavras.add("C");
            listaPalavras.add("JavaScript");
            listaPalavras.add("Ruby");
    
            
            List<String> palavrasOrdenadas = listaPalavras.stream()
                .sorted((palavra1, palavra2) -> Integer.compare(palavra1.length(), palavra2.length()))
                .collect(Collectors.toList());
    
            System.out.println("Palavras ordenadas pelo tamanho:");
            palavrasOrdenadas.forEach(System.out::println);*/

    }

}
