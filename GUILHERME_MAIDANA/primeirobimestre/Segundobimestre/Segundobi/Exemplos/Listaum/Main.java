package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Listaum;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {

    /*ATT 1
    public static void main(String[] args) {
        String inicial = "G";
        List<String> nomes = new ArrayList<>();

        nomes.add("Jean");
        nomes.add("Jeferson");
        nomes.add("Wyllian");
        nomes.add("Hebernald");
        nomes.add("Sandrolaxx");

        for (String nome : nomes) {
            System.out.println(inicial+ "-" +nome );
        }
    }*/


    /*ATT 2

    public static void main(String[] args) {
        
        HashSet<Integer> numeros = new HashSet<>();

        
        numeros.add(5);
        numeros.add(8);
        numeros.add(12);
        numeros.add(5); 
        numeros.add(8); 
        
        int numeroEspecifico = 12;
        if (numeros.contains(numeroEspecifico)) {
            System.out.println("O conjunto contém o número " + numeroEspecifico);
        } else {
            System.out.println("O conjunto não contém o número " + numeroEspecifico);
        }
    }*/

    /*ATT 3

    public static void main(String[] args) {
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("Resident Evil 4");
        jogosZerados.add("Resident Evil 4");
        jogosZerados.add("Resident Evil 4 Remake"); 
        jogosZerados.add("The Last Of US");
        jogosZerados.add("The Last Of US");
        jogosZerados.add("The Last Of US Part 2"); 
        jogosZerados.add("Read Dead Redemption 2");

        List<String> jogosUnicosZerados = removerDuplicatas(jogosZerados);
        System.out.println("Lista de jogos zerados únicos: " + jogosUnicosZerados);
    }

    public static List<String> removerDuplicatas(List<String> listaOriginal) {
        
        HashSet<String> conjuntoUnico = new HashSet<>(listaOriginal);
        
        return new ArrayList<>(conjuntoUnico);
    }*/


    /*ATT 4
    
    public static void main(String[] args) {
        
            Queue<String>  nomes = new PriorityQueue<>((nome1, nome2) -> nome1.compareTo(nome2));
            
                nomes.add("Saga Harry Potter");
                nomes.add("Parasita");
                nomes.add("O Milagre da Sela 7");
                nomes.add("A Espera de Um Milagre");
                nomes.add("The Last Of Us - Série");
                while(!nomes.isEmpty()){
                    System.out.println(nomes.poll());
                }   
    }*/

    /*ATT 5

    public static void main(String[] args) {
        
        Map<String, Integer> hardware = new HashMap<>();

        
        hardware.put("Processador - i5 7500U", 700);
        hardware.put("Memória RAM - 16GB DDR4", 1000);
        hardware.put("Placa de Vídeo - RTX 3050TI", 2000);
        hardware.put("Armazenamento - SSD 512GB",  500 );
        hardware.put("Monitor - 144hz", 1000);

        
        for (Map.Entry<String, Integer> entry : hardware.entrySet()) {
            System.out.println("Peça: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }*/

}
