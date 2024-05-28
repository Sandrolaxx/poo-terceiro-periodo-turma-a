package primeirobi.listas.Lista6;

import java.util.Scanner;

public class ProcessaPedido extends Pedido {
    
    Scanner scan = new Scanner(System.in);
    int
        escolha;

    public void processar() {

        for (int i = 0; i < nome.length; i++) {
            
            System.out.println("Qual é o nome do item desejado?");
            nome[i] = scan.next();

            System.out.println("Qual é a quantidade do item desejado?");
            quantidade[i] = scan.nextInt();

            System.out.println("Qual é o valor unitario do item desejado?");
            valor[i] = scan.nextInt();

            contador++;
            
            System.out.println("Deseja adicionar mais algum item ao pedido?\n1 - sim\n0 - não");
            escolha = scan.nextInt();

            if (escolha == 0) {
                break;
            }
        }
    }

    public void confirmarPagamento() {

        if (dataCriacao.before(dataVencimentoReserva)) {

            System.out.println("Pagamento Confirmado");
        }
        else {

            System.out.println("Reserva vencida. Pagamento não confirmado");
        }     
    }
}
