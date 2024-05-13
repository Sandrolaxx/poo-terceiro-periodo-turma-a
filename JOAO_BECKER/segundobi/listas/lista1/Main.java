package segundobi.listas.lista1;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //ATV1

        List<String> colegas = new ArrayList<String>();

        colegas.add("Jorge");
        colegas.add("Ian");
        colegas.add("Nathan");
        colegas.add("Hebernald");
        colegas.add("Jean");

        for(String i: colegas){
            System.out.println("J - "+i);
        }

        //ATV2

        Scanner  scanner = new Scanner(System.in);
        HashSet<Integer> numeros = new HashSet<>();
 
        numeros.add(5);
        numeros.add(10);
        numeros.add(5);
        numeros.add(15);
        numeros.add(20);
        numeros.add(40);
 
        System.out.println("Numero a pesquisar:");
        int pesquisa = scanner.nextInt();
 
        if(numeros.contains(pesquisa)){
         System.out.println("O numero foi encontrado dentro o HashSet");
        }else{
         System.out.println("O numero não foi encontrado dentro o HashSet");
        }


        //ATV 3

        List<String> jogos = new ArrayList<String>();
    
            jogos.add("The Witcher");
            jogos.add("The Witcher 2");
            jogos.add("Red Dead Redemption 2");
            jogos.add("GTA V");
            jogos.add("Stardew Valley");
            jogos.add("The Witcher");

            HashSet<String> semDuplicatas = new HashSet<String>(jogos);
            System.out.println(semDuplicatas);

        //ATV 4
    }

}


