package exemplos;
import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Informe sua idade");
            int idade = scanner.nextInt();

            System.out.println("Minha idade é: " + idade);
    }

}
