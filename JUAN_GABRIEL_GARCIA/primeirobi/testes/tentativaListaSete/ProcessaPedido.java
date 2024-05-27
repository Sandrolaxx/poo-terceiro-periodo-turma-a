package primeirobi.testes.tentativaListaSete;

import java.util.Scanner;

public class ProcessaPedido extends Pedido {
    
    Scanner scan = new Scanner(System.in);
    int
        escolha;

    public void confirmarPagamento() {

        if (dataCriacao.before(dataVencimentoReserva)) {

            System.out.println("Pagamento Confirmado");
        }
        else {

            System.out.println("Reserva vencida. Pagamento não confirmado");
        }     
    }
}

// System.out.println("Qual é a quantidade do item desejado?");
// item.quantidade[i] = scan.nextInt();
