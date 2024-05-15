import java.util.Date;

public class Pedido 
{
    int id;
    Date dataCriacao;
    Date dataPagamento;
    Date dataVencimentoReserva;
    Cliente cliente; // um pedido tem um cliente nele chamado cliente
    Vendedor vendedor; 
    Loja loja; 
    Item[] itens; 

    //Metodo para calcular o valor total do pedido
    // : faz com que seja passado por todos os itens do array
    public double calcularValorTotal()
    {
        double total = 0;
        for (Item item : itens)
        {
            total += item.valor;
        }
        return total;
    }

    //Metodo para gerar descricao pedido
    public String gerarDescricaoVenda()
    {
        return "Pedido criado em: " + dataCriacao + " com valor total de: " + calcularValorTotal();
    }
}
