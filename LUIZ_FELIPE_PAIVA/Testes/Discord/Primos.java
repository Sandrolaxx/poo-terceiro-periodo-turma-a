package Testes.Discord;
import java.util.Scanner;

public class Primos {
    

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de um numero inteiro, para definir se o número é primo ou não");
        int numero = scanner.nextInt();
     

       if (numero <= 1) {
        System.out.println("Digite um numero válido");
       }
       else {
        boolean primo = true;
        
        for(int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0){
                System.out.println(numero + " não é primo");
                primo = false;
                break;
            }
        }
        if(primo){
            System.out.println(numero + " é primo");
        }
        }
       scanner.close();
    }
}
