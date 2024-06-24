import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_API {

    public static void main(String[] args) {
        // ATIVIDADE 1
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> numerosPares = numeros.stream()
            .filter(num -> num % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Atividade 1");                 
        System.out.println("Numeros pares: " + numerosPares);

        //ATIVIDADE 2
        
        List<String> nomes = Arrays.asList("roberto", "josé", "caio", "vinicius");
       
        List<String> nomesMaiusculos = nomes.stream()
             .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("\nAtividade 2");
        System.out.println("Nomes em maiusculas: " + nomesMaiusculos);

        //ATIVIDADE 3
       
        List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado");
        
        Map<String, Long> frequenciaPalavras = palavras.stream()
            .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));
        
        System.out.println("\nAtividade 3");
        System.out.println("Quantas vezes apareceu na lista cada palavra: " + frequenciaPalavras);

        //ATIVIDADE 4
       
        List<Produto> produtos = Arrays.asList(
            new Produto("Produto1", 50.00),
            new Produto("Produto2", 150.00),
            new Produto("Produto3", 200.00),
            new Produto("Produto4", 90.00)
        );
      
        List<Produto> produtosFiltrados = produtos.stream()
                                                  .filter(produto -> produto.getPreco() > 100.00)
                                                  .collect(Collectors.toList());

        System.out.println("\nAtividade 4");
        System.out.println("Produtos com o valor acima de R$ 100,00:");
        produtosFiltrados.forEach(produto -> System.out.println(produto.getNome() + " - R$" + produto.getPreco()));

        //ATIVIDADE 5
        double somaPrecos = produtos.stream()
                                    .mapToDouble(Produto::getPreco)
                                    .sum();
        System.out.println("\nAtividade 5");
        System.out.println("Soma de todos os produtos: " + somaPrecos);

        //ATIVIDADE 6
        
        List<String> linguagens = Arrays.asList("Java", "Python", "C", "JavaScript", "Ruby");
       
        List<String> linguagensOrdenadas = linguagens.stream()
                                                     .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                                                     .collect(Collectors.toList());
        System.out.println("\nAtividade 6");                                             
        System.out.println("Linguagem ordenada pelo tamanho da escrita: " + linguagensOrdenadas);
    }


    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }
}
