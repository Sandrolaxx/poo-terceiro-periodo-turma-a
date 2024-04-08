package primeirobi.Floricultura1;
import java.util.Scanner;

public class Floricultura {

    public static void main(String[] args){
        try (Scanner leitor = new Scanner(System.in)) {
            boolean loja=false;
            while (loja==false) {
                System.out.println("[1] - Calcular Preço Total \n[2] - Calcular Troco\n[3] - Sair ");
                short y;
                y = leitor.nextShort();
                switch (y) {
                    case 1:
                        float vu=0;
                        float un=0;
                        float vt=0;
                        System.out.println("Insira quantidade de plantas: \n");
                        un = leitor.nextFloat();
                        System.out.println("Insira valor da unidade da planta: \n");
                        vu = leitor.nextFloat();
                        vt=un*vu;
                        System.out.println("Preço total: R$"+vt);
                        break;
                
                    case 2:
                        float vp=0;
                        float vtc=0;
                        float tro=0;
                        System.out.println("Insira valor recebido pelo cliente \n");
                        vp = leitor.nextFloat();
                        System.out.println("Insira valor total da compra: \n");
                        vtc = leitor.nextFloat();
                        tro=vp-vtc;
                        if(tro>=0){
                            System.out.println("Valor do troco: R$"+tro);
                        }else{
                            System.out.println("O cliente necessita de mais R$"+tro*-1+" para realizar a compra.");
                        }
                        break;

                    case 3:
                        loja = true;
                        break;

                    default:
                        System.out.println("Opção invalida tente novamente.");
                        break;
                }
            }
        }
    }
}