import java.util.*;

public class Main{

    public static void main(String[] args) {
        

        // ATV1 - Separando pares (utilizei random)
        System.out.println("ATV1");
        List <Integer> lista_Inteiros = new ArrayList<>();
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            lista_Inteiros.add(gerador.nextInt(100));
        }

        System.out.println("Lista dos inteiros:");
        lista_Inteiros.forEach(numero -> System.out.print(numero + " "));
        System.out.println("\nLista pares: ");
        somente_pares(lista_Inteiros);
        
        // ATV2 - Projeto 1 - Fazendo captalize em nomes
        System.out.println("\n\nATV2");
        System.out.println("Nomes com tudo em maiúsculo:");
        List<String> lista_nomes = new ArrayList<>();
        lista_nomes.add("roberto");
        lista_nomes.add("josé");
        lista_nomes.add("caio");
        lista_nomes.add("vinicius");
        List<String> lista_nomesupper = converte_nomes(lista_nomes, true);
        lista_nomesupper.forEach(nome -> System.out.print(nome + " "));

        // ATV2 - Projeto 2 - Fazendo captalize na primeira letra dos nomes
        System.out.println("\n\nLista com apenas as primeiras em maiúscula: ");
        lista_nomesupper = converte_nomes(lista_nomes, false);
        lista_nomesupper.forEach(nome -> System.out.print(nome + " "));

        // ATV3 - Contando valores unicos presentes em um Array
        System.out.println("\n\nATV3");
        List <String> lista_palavras = new ArrayList<>();
        Map <String, Integer> listacontagem = new HashMap<>();

        lista_palavras.add("sábado");
        lista_palavras.add("quarta");
        lista_palavras.add("se");
        lista_palavras.add("sábado");
        lista_palavras.add("hoje");
        lista_palavras.add("talvez");
        lista_palavras.add("se");
        
        lista_palavras.stream()
            .forEach(palavra -> {
                if(listacontagem.containsKey(palavra)){
                    listacontagem.put(palavra, listacontagem.get(palavra) + 1);
                }
                else{
                    listacontagem.put(palavra, 1);
                }
            });
        

        System.out.println(listacontagem);

        // ATV4 - Filtrando valores maiores que 100
        System.out.println("\nATV4");
        List <Produto> lista_Produtos = new ArrayList<>();
        lista_Produtos.add(new Produto("produto0", 3000f));
        lista_Produtos.add(new Produto("produto1", 100f));
        lista_Produtos.add(new Produto("produto3", 23f));
        lista_Produtos.add(new Produto("produto4", 67f));
        lista_Produtos.add(new Produto("produto2", 1055f));

        List<Produto> produtos_Maiores100 = lista_Produtos.stream()
            .filter(produto -> produto.getPrice() >= 100)
                .toList();

        produtos_Maiores100.forEach(produto -> System.out.printf("Nome: %s\nPreço: %.2f\n\n", produto.getName(), produto.getPrice()));

        // ATV5 - Somando valores
        System.out.println("\nATV5");
        float valor_total = produtos_Maiores100.stream()
        .map(produto -> produto.getPrice())
            .reduce(0f, (valorAnterior, valorAtual) -> valorAnterior + valorAtual);
        System.out.println("O valor total dos produtos é: " + valor_total);

        // ATV6 - Ordenando por tamanho
        System.out.println("\nATV6");
        List <String> lista_linguagens = new ArrayList<>();
        lista_linguagens.add("Java");
        lista_linguagens.add("Python");
        lista_linguagens.add("C");
        lista_linguagens.add("JavaScript");
        lista_linguagens.add("Ruby");

        List <String> lista_linguagensOrdenada = lista_linguagens.stream()
             .sorted((palavra_a, palavra_b) -> Integer.compare(palavra_a.length(), palavra_b.length()))
                .toList();


        System.out.println(lista_linguagensOrdenada);

    }

    // ATV1 - Método
    public static List<Integer> somente_pares(List<Integer> lista_Inteiros){
        List<Integer> lista_Pares = lista_Inteiros.stream()
            .filter(numero -> numero % 2 == 0)
            .toList();

        lista_Pares.forEach(numero -> System.out.print(numero + " "));
        return lista_Pares;
    }

    // ATV2 - Método
    public static List<String> converte_nomes(List<String> lista_nomes, boolean todas){
        /*
         * Conversão de nomes..
         * :todas true : Retorna todas as letras em maiúscula
         * :todas false : Retorna as primeiras letras em maiúscula
         */

        if (todas) {
            List<String> lista_nomesMaiusculos = lista_nomes.stream()
            .map(nome -> nome.toUpperCase())
            .toList();
        return lista_nomesMaiusculos;
        }
        else{
            List<String> lista_nomesMaiusculos = lista_nomes.stream()
            .map(nome -> nome.substring(0, 1).toUpperCase() + nome.substring(1, nome.length()))
            .toList();
        return lista_nomesMaiusculos;
        }
    
    }
}