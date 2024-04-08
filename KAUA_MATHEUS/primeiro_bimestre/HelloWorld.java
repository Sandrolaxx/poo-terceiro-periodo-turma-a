package KAUA_MATHEUS.primeiro_bimestre;
import java.util.Scanner;

class HelloWorld {
    public static void main (String[] arg) {

        // Texto Padrão
        String texto = "Olá Mundo!";
        System.out.println("Digite Um valor: \n");

        // Scanner
        Scanner valor_ = new Scanner(System.in);
        String valor = valor_.nextLine();
        System.out.format("O valor é %s\n", valor);


        // Alterando Valor para int
        int valor_num = Integer.parseInt(valor);

        // Alterando valor para String
        String valor_str = valor_.nextLine();
        System.out.println("Valor Str: " + valor_str);

        // Loop
        for (int c=0; c<=valor_num; c++){
            System.out.format("O valor é %d\n", c);
        }

        // 
        int bb = 127;
        System.out.format("%d é o limite!\n", bb);
        System.out.println(--bb);
        System.out.println(bb--);
        System.out.println(bb);

        int val = 10;
        System.out.println((val < 2) ? "Menor":"Maior");
    }
}