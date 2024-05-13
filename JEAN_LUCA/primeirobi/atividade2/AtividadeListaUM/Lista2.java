package primeirobi.atividade2.AtividadeListaUM;
import java.util.HashSet;
import java.util.Set;

public class Lista2{

    public static void main(String[] args) {
        Set<Integer> ids = new HashSet<>();
       
         ids.add(1);
        ids.add(2);
         ids.add(3);
        ids.add(4);
         ids.add(5);
        ids.add(6);
        ids.add(6);
        
        System.out.println("Números no conjunto:");
        for (int numero :ids) {
            System.out.println(numero);
        }
        
        int acharnumeros = 6;
     
       
        
        if (ids.contains(acharnumeros)) 
        {
          System.out.println("O NUMERO ESCOLHIDO:" + acharnumeros +","+ "SE REPETE NA LISTA");
        } 
       

       
    }
}