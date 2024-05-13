import java.util.*;
public class ex001{
    public static void main(String[] args) {
        // Note que todas as implementações de java.util possuem os métodos padrões da interface (add, get, size, isEmpty, contains)
        /*
         * Exemplos de implementação de Map, LinkedList, Arraylist, Queue
         */
        

        // Implementação de Set
        Set<String> nomes = new HashSet<>();

        nomes.add("Matheus");
        nomes.add("Luana");
        nomes.add("Opp");
        nomes.add("Cris");
        nomes.add("Matheus");
        System.out.println(nomes);

        // Mostrando todos os valores de uma Set
        System.out.println();
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println();

        // Mostrando todos os valores de uma Set com implementação da função lambda
        nomes.forEach(item -> System.out.println(item));

        System.out.println();

        // Implementação de Mapa com valores e classes
        Map<String, Aluno> mapaTeste = new HashMap<>();
        mapaTeste.put("Matheus", new Aluno());

        System.out.println(mapaTeste);
        System.out.println(mapaTeste.get("Matheus"));
        System.out.println(mapaTeste.get("Matheus").idade);

        System.out.println();

        // Implementação de ArrayList
        List<String> nomes2 = new ArrayList<>();

        nomes2.add("Matheus");
        nomes2.add("Luana");
        nomes2.add("Opp");
        nomes2.add("Cris");
        nomes2.add("Matheus");
        System.out.println(nomes2);

        // Remove Cris
        nomes2.removeIf(item -> item.contains("i"));
        System.out.println(nomes2);

        // Remove Matheus
        nomes2.remove(0);
        System.out.println(nomes2);

        System.out.println();


        // Implemetação de LinkedList
        LinkedList<String> nomes3 = new LinkedList<>();

        nomes3.add("Matheus");
        nomes3.add("Luana");
        nomes3.add("Opp");
        nomes3.add("Cris");
        nomes3.add("Pedro");
        System.out.println(nomes3);

        // Printa o Primeiro
        System.out.println(nomes3.getFirst());

        // Printa o Ultimo
        System.out.println(nomes3.getLast());

        System.out.println();

        // Implementação de Filas prioritárias (Priority Queue)
        Queue<String> fila = new PriorityQueue<>();

        fila.add("Henrique");
        fila.add("João");
        fila.add("Vinicius");
        System.out.println(fila);

        // Retorna e retira o Primeiro elemento
        System.out.printf("Tirando o %s!\n", fila.poll());

        fila.add("Matheus");
        fila.add("Pedro");

        if(fila.contains("Pedro")){
            System.out.println("Tem o Pedrola!\n");
        }

        System.out.println("Mostrando valores de uma fila");

        fila.forEach(item -> System.out.println(item));

        System.out.println();
        System.out.println(fila);

        // Retorna o primeiro valor da fila, mas não o remove
        System.out.printf("\nPrimeiro valor: %s!\n", fila.peek());

        System.out.println();

        // Implementação de Queue
        Queue<String> fila_prioritaria = new LinkedList<>();

        fila_prioritaria.add("nome1");
        fila_prioritaria.add("nome3");
        fila_prioritaria.add("nome2");

        System.out.println(fila_prioritaria);


    }
}