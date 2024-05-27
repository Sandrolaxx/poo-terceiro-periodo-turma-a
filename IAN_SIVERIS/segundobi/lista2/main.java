package segundobi.lista2;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.Map;

class Produto {
    private String Nome;
    private double Preco;

    public Produto(String Nome, double Preco) {
        this.Nome = Nome;
        this.Preco = Preco;
    }

    public String getNome() {
        return Nome;
    }
    public double getPreco() {
        return Preco;
    }
}

public class main {

    //ATV1

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> pares = numeros.stream()

    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());

    System.out.println("Numeros pares: " + pares);
    
    //ATV2

    List<String> nomes = Arrays.asList("roberto", "jose", "caio", "vinicius");
    List<String> maiusculas = nomes.stream()

   .map(String::toUpperCase)
   .collect(Collectors.toList());

   System.out.println("Nomes com letra maiuscula" + maiusculas);
 
   //ATV3

   List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sabado", "se", "quarta", "sabado");
   palavras.stream()

   .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()))
   .forEach((palavra, frequencia) -> System.out.println(palavra + ": " + frequencia));

   //ATV4

   List<Produto> produtos = Arrays.asList(
                new Produto("Camiseta", 150.0),
                new Produto("Cueca", 80.0),
                new Produto("Shorts", 120.0),
                new Produto("Bone", 90.0)
        );

        List<Produto> produtosCaros = produtos.stream()
        .filter(produto -> produto.getPreco() > 100.0)
        .collect(Collectors.toList());
System.out.println("Produtos com preço maior que R$ 100,00: " + produtosCaros);

 // ATV5

 double total = produtos.stream()
 .mapToDouble(Produto::getPreco)
 .sum();
System.out.println("Valor total dos produtos: R$" + total);

// ATV6

List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
List<String> ordenadas = linguagens.stream()
    .sorted((s1, s2) -> s1.length() - s2.length())
     .collect(Collectors.toList());
System.out.println("Lista ordenada por tamanho das palavras: " + ordenadas);

    }
}

