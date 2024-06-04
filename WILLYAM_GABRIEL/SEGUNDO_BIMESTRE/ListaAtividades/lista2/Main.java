package SEGUNDO_BIMESTRE.ListaAtividades.lista2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                List<Integer> numeros = new ArrayList<>();

                System.out.print("INFORME A QUANTIDADE DE NUMOROS QUE DESEJA INSERIR: ");
                int quantNum = scanner.nextInt();

                for (int i = 1; i <= quantNum; i++) {
                        System.out.print("NUMERO (" + i + "): ");
                        int numero = scanner.nextInt();
                        numeros.add(numero);
                }

                List<Integer> numerosPares = numeros.stream()
                                .filter(n -> n % 2 == 0)
                                .collect(Collectors.toList());

                System.out.println("NUMEROS PARES: " + numerosPares);
                // ATV1


                System.out.println("=======================================");


                System.out.print("INFORME A QUANTIDADE DE NOMES QUE DESEJA INFORMAR: ");
                int quantNome = scanner.nextInt();

                List<String> nomes = new ArrayList<>();

                for (int j = 1; j <= quantNome; j++) {
                        System.out.print("NOME (" + j + "): ");
                        String nome = scanner.next();
                        nomes.add(nome);
                }

                List<String> nomesMaiusculos = nomes.stream()
                                .map(String::toUpperCase)
                                .collect(Collectors.toList());

                System.out.println(nomesMaiusculos);
                // ATV2


                System.out.println("=======================================");


                List<String> palavras = Arrays.asList("se", "talvez", "hoje", "sábado", "se",
                                "quarta", "sábado");

                Map<String, Long> contagemPalavras = palavras.stream()
                                .collect(Collectors.groupingBy(palavra -> palavra, Collectors.counting()));

                contagemPalavras.forEach((palavra, contagem) -> System.out
                                .println("A PALAVRA: '" + palavra + "' APARECEU '" + contagem +
                                                "' VEZ(ES)."));
                // ATV3


                System.out.println("=======================================");


                List<Produto> produtos = new ArrayList<>();
                produtos.add(new Produto("ABACAXI", 5.0));
                produtos.add(new Produto("ARROZ", 30.0));
                produtos.add(new Produto("SALMÃO", 99.9));
                produtos.add(new Produto("PICANHA", 150.0));

                List<Produto> produtosFiltrados = produtos.stream()
                                .filter(produto -> produto.getPreco() > 100.0)
                                .toList();

                produtosFiltrados.forEach(System.out::println);
                // ATV4


                double somaTotal = produtos.stream()
                                .mapToDouble(Produto::getPreco)
                                .sum();
                System.out.println("A SOMA TOTAL DOS PREÇOS DOS PRODUTOS É: R$ " + somaTotal);
                // ATV5


                System.out.println("=======================================");


                List<String> linguagens = Arrays.asList("JAVA", "JAVASCRIPT", "PYTHON", "C", "RUBY");

                List<String> lingProgramação = linguagens.stream()
                                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                                .collect(Collectors.toList());

                lingProgramação.forEach(System.out::println);
                // ATV6


        scanner.close();
        }
}
