package primeirobi.lists.Lista6;

import java.util.Date;

public class Pedido {

    String id, nome;
    Cliente cliente;
    Vendedor vendedor;
    Loja loja;
    Date dataCriacao;
    int diaPagamento;
    int mesPagamento;
    Date dataPagamento;
    Date dataVencimentoReserva;
    double[] valores = new double[100];
    String[] items = new String[100];
    double valorTotal = calcularValorTotal();

    double calcularValorTotal() {

        double total = 0;
        for (int i = 0; i < items.length; i++) {
            if (valores[i] != 0.0) {
                total += valores[i];
            } else {
                return 0.0;
            }
        }
        return total;
    }

    void gerarDescricaoVenda() {
        System.out.println(dataCriacao + ", Valor total: " + valorTotal);
    }
}