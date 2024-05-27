package segundobi.Atividade1;
import java.util.HashSet;
import java.util.Set;

public class ativ2 {
    public static void main(String[] args) {
        Set<Integer> ids = new HashSet<>();
       
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        ids.add(6);
        ids.add(6);
        ids.add(7);
        ids.add(8);
        ids.add(9);
        ids.add(10);
        
        System.out.println("Números");
        for (int num :ids) {
            System.out.println(num);
        }
        
        int buscadenum = 3;
     
        if (ids.contains(buscadenum)) 
        {
          System.out.println("O número é: " + buscadenum);
        } 

    }
}
