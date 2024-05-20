package segundo_bimestre.Listas.lista1;
import java.util.HashSet;

public class numeros {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
      
        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(5);  
        numeros.add(30);
        numeros.add(10); 
       
        int numeroProcurado = 20;
        if (numeros.contains(numeroProcurado)) {
            System.out.println("O conjunto contém o número " + numeroProcurado);
        } else {
            System.out.println("O conjunto não contém o número " + numeroProcurado);
        }
    }
}

