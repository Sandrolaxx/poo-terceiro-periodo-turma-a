package primeirobi.donaGabrielinha;

import java.util.Date;

public class Pedido extends Item
{
    public Date dataCriacao;
    
    private String dataPagamento;
    
    private String dataVencimentoReserva;
    
    private Clientes clientes;

    private Vendedor vendedor;

    private Loja loja;
    
    private Double[] arrayItens = new Double[3];

    public Double calcularValorTotal() // registra o valor total do pedido
    {
        Double soma = 0.0;

        for (int i = 0; i < arrayItens.length; i++)
        {
            soma += arrayItens[i];
        }
        return soma;
    }

    public void gerarDescricaoVenda()
    {
        String mensagem = "Criado em: "
            .concat(nome);
        System.out.println(mensagem);
    }

    public String getDataPagamento() 
    {
        return dataPagamento;
    }

    public String getDataVencimentoReserva() 
    {
        return dataVencimentoReserva;
    }

    public Clientes getClientes() 
    {
        return clientes;
    }

    public Vendedor getVendedor() 
    {
        return vendedor;
    }

    public Loja getLoja() 
    {
        return loja;
    }

    public Double[] getArrayItens() 
    {
        return arrayItens;
    }
}