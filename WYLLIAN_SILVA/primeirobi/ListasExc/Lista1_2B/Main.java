package primeirobi.ListasExc.Lista1_2B;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> colegas = new ArrayList<String>();

        System.out.println("/:=== Atividade - 1: ===:/");
        colegas.add("Jia");
        colegas.add("Mainudes");
        colegas.add("Jef");
        colegas.add("Hevernald");
        colegas.add("Nathan");
        for (String nomesColegas : colegas) {
            System.out.println("W-" + nomesColegas);
            System.out.println(" ");
        }
        
        System.out.println("/:=== Atividade - 2: ===:/");
        HashSet<Integer> alg = new HashSet<>();
        int num = 12;
        alg.add(12);
        alg.add(7);
        alg.add(387);
        alg.add(12);
        System.out.println(alg);

        for(Integer numImp : alg){

            if (numImp.equals(num)) {
                System.out.println(numImp);
                System.out.println(" ");
            }

        }

        System.out.println("/:=== Atividade - 3: ===:/");
        List<String> jogos = new ArrayList<String>();
        jogos.add("Terraria");
        jogos.add("Terraria");
        jogos.add("Terraria");
        jogos.add("DARK SOULS: REMASTERED");
        jogos.add("DARK SOULS 2");
        jogos.add("DARK SOULS 3");
        jogos.add("DARK SOULS 3");
        jogos.add("DARK SOULS 3");
        jogos.add("DARK SOULS 3");
        jogos.add("Minecraft");
        jogos.add("Watch_Dogs");
        jogos.add("Watch_Dogs 2");
        jogos.add("Watch_Dogs 2");
        jogos.add("Devil May Cry 4");
        jogos.add("Devil May Cry 5");
        jogos.add("Devil May Cry 5");
        jogos.add("Hollow Knight");
        jogos.add("Katana ZERO");
        List<String> jogoescolhido = jogoszerados (jogos);
  
        System.out.println("Jogos zerados (SEM DUPLICATAS):");
        for( String jogo: jogoescolhido){
          System.out.println(jogo);
          System.out.println(" ");
        }

        System.out.println("/:=== Atividade - 4: ===:/");

         Queue<String> filme= new PriorityQueue<>();

            filme.add("Jurassic Park");
            filme.add("Jujutsu Kaisen");
            filme.add("Django Livre");
            filme.add("Vingadores: Guerra Infinita");
            filme.add("Avatar");
        
          System.out.println(" ");
          System.out.println("Top 5 filmes/animes:");
            filme.forEach(nomefilme ->System.out.println(nomefilme));
            System.out.println(" ");

        System.out.println("/:=== Atividade - 5: ===:/");

        Map<String, String> parte = new HashMap<>();
        parte.put("GPU","GeForce 1050 TI");
        parte.put("CPU","Core i5 6600");
        parte.put("RAM","16 GB");
        parte.put("SSD","1 TB HDD, 256 NVMe");
        parte.put("SO","Windows 10 Pro");
        parte.entrySet().forEach(ks->{
                System.out.println(ks.getKey()+": "+ ks.getValue());
                System.out.println(" ");
              });

      }

      public static List<String>jogoszerados(List<String>jogos) {
  
          List<String> jogoescolhido = new ArrayList<String>();
  
          for (String jogo : jogos) {

              if (!jogoescolhido.contains(jogo)) {
                  jogoescolhido.add(jogo);

              }
          }
          return jogoescolhido;
      }
 

}
    

