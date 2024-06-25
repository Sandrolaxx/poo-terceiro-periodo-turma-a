import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int valorPago = 0;

        System.out.println(" Do total de plantas vendidas para esse cliente, quantas espécies diferentes foram vendidas?");
        int especies = scanner.nextInt();     
        System.out.println("--------------------------------------------");
                    
        double precoTotal = 0;

            for(int i = 0; i < especies; i++){
                int precoEspecie = 0;
                System.out.println("\nQuantas plantas da "+ (i+1) + "º espécie foram vendidas?");
                int plantasVendidas = scanner.nextInt();
                    while(plantasVendidas <= 0){
                        System.out.println("\nINSIRA UM VALOR POSITIVO!");
                        plantasVendidas = scanner.nextInt();
                    }
                    

                System.out.println("\nQual é o preço de uma planta dessa espécie?");
                int precoPlanta = scanner.nextInt();
                    while(precoPlanta <= 0){
                        System.out.println("\nINSIRA UM VALOR POSITIVO!");
                        precoPlanta = scanner.nextInt();
                    }

                precoEspecie = plantasVendidas * precoPlanta;

                precoTotal += precoEspecie;
                System.out.println("--------------------------------------------");
            }

            System.out.println("\nQual foi o valor pago pelo cliente?");
            valorPago = scanner.nextInt();
                while(valorPago <= 0){
                    System.out.println("\nINSIRA UM VALOR POSITIVO!");
                    valorPago = scanner.nextInt();
                    System.out.println("--------------------------------------------");
                }

            while(true){

            System.out.println("\n|MENU:\n|[1] Preço total\n|[2] Valor do troco devido\n|[3] Sair");
            int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("\nO preço total da compra é de R$: " + precoTotal);
                        break;

                    case 2:
                        if(valorPago < precoTotal){
                            System.out.println("\nÉ calote");
                        }
                        else{
                            System.out.println("\nO troco devido é de R$: " + (valorPago - precoTotal));
                        }
                        break;
                    
                    case 3:
                        System.out.println("\nSAINDO DO PROGRAMA");
                        scanner.close();
                        return;
                
                    default:
                        System.out.println("\nOPÇÃO INVÁLIDA!");
                        break;
                }
                
                System.out.println("--------------------------------------------");
            }  
             
    }
    
}
