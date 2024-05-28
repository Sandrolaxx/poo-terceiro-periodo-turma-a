package primeirobi.testes.tentativaListaSete;

import java.util.Date;
import java.util.Scanner;

public class Pedido extends Item{

    Scanner scan = new Scanner(System.in);
    
    String
        id,
        dataPagamento, // reserva vence depois de 3 dias da criação do pedido
        cliente,
        vendedor;

    Loja 
        loja;

    int i = 0, escolha = 1, qnt = 0;

    float soma;

    Item item;

    float[] pedido = new float[100];

    Date dataCriacao = new Date();
    long umDia = 86400000l;
    long daquiTresDias = dataCriacao.getTime() + (3 * umDia);
    Date dataVencimentoReserva = new Date(daquiTresDias);

  
    // public void gerarDescricaoVenda() {

    //     for (int i = 0; i < contador; i++) {
            
    //         String msg = "Data de registro do pedido:\n" + dataCriacao + "\nValor total do pedido: R$: " + item.soma + "\n";

    //     System.out.println(msg);
    //     }       
    // }
}
