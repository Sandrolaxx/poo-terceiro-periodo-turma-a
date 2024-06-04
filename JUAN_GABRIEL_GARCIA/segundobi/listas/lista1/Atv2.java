package segundobi.listas.lista1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atv2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Set<Integer> num = new HashSet<>();

        num.add(1);
        num.add(4);
        num.add(2);
        num.add(7);
        num.add(2);
        num.add(6);
        num.add(9);
        num.add(6);
        num.add(12);

        for (Integer lista : num) {
            
        }

        System.out.println("Digite um número e verifique se ele esta na lista:");
        int x = scan.nextInt();

        if (num.contains(x)) {
            
            System.out.println(x + " esta na lista");
        }

        else {
            System.out.println(x + " não esta na lista");
        }
    }
}
