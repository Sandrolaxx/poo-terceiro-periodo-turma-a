package primeirobi.Exemplos.ArrayList;
import java.util.ArrayList;

public class ArraysTeste {
    public static void main(String[] args) {
        ArrayList<Cliente> teste = new ArrayList<Cliente>();
        Cliente clienteUm = new Cliente("Marcos",22);
        Cliente clienteDois = new Cliente("Jorge",20);
        teste.add(clienteUm);
        teste.add(clienteDois);
        System.out.println(teste.get(0).idade+teste.get(0).nome);
        System.out.println(teste.get(1).idade+teste.get(1).nome);

    }
    
}
