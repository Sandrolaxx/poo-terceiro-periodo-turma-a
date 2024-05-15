package primeirobi.testes.tentativaListaSete;

import java.util.Scanner;

public class DesesperoMain {

   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha = 1;

        Item item = new Item();
        Pedido pedido = new Pedido();
        

        while (escolha != 0) {

            System.out.println("\nEscolha uma das opções abaixo\n 1 - Cadastar item\n 2 - Listar itens\n 3 - Criar pedido");
            escolha = scan.nextInt();

            switch (escolha) {
                case 1:

                    item.cadastrarItem();
                    break;
                case 2:
                    
                    item.listarItem();
                    break;
    
                case 3:
                    
                    pedido.criarPedido();
                    break;
            
                default:
                    break;
            }
        }
    }
}
