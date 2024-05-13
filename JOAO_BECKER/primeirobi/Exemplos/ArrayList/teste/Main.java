package primeirobi.Exemplos.ArrayList.teste;import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teste;
        String teste2;
        ArrayList<Livro> listaLivros = new ArrayList<>();
        Livro livroTemp =  new Livro(null, null,false ,null, null);
        System.out.println("Insira nome do livro: ");
        livroTemp.setNome(scanner.next());
        System.out.println("Insira autor do livro: ");
        livroTemp.setAutor(scanner.next());
        listaLivros.add(livroTemp);
        teste2 = listaLivros.get(0).getNome();
        scanner.nextLine();
        teste=scanner.next();
        if(teste.equals(teste2)){
            System.out.println("deu");
        }
        
    }
}