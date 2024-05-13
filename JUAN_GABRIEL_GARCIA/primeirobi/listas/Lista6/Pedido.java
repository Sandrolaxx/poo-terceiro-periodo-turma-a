package primeirobi.listas.Lista6;

import java.util.Date;

public class Pedido extends Item {
    
    String
        id,
        dataPagamento, // reserva vence depois de 3 dias da criação do pedido
        cliente,
        vendedor;

    Loja 
        loja;

    int
        contador = 0;

    Date dataCriacao = new Date();
    long umDia = 86400000l;
    long daquiTresDias = dataCriacao.getTime() + (3 * umDia);
    Date dataVencimentoReserva = new Date(daquiTresDias);

    public void calcularValorTotal() {

        for (int i = 0; i < contador; i++) {
            
            valorTotal = valor[i] * quantidade[i];
            soma += valorTotal;

            String msg = "Valor total do pedido: R$: " + soma;
            System.out.println(msg);
        }   
    }
    public void gerarDescricaoVenda() {

        for (int i = 0; i < contador; i++) {
            
            String msg = "Data de registro do pedido:\n" + dataCriacao + "\nValor total do pedido: R$: " + soma + "\n";

        System.out.println(msg);
        }       
    }
}
