package primeirobimestre.atividade7;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class Pedido {
    private Integer id;
    private Date dataCriacao = new Date();
    private Date dataPagamento;
    private Date dataVencimentoReserva;
    private Cliente clientePedido;
    private Vendedor vendedorPedido;
    private Loja lojaPedido;
    private List<Item> itensPedido = new ArrayList<>();

    public Pedido(Integer id, Cliente clientePedido, Vendedor vendedorPedido, Loja lojaPedido, List<Item> sacola){
        long umDia = 86400000l;
        long dataTresDias = dataCriacao.getTime() + (umDia*3);
        this.id = id;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = new Date(dataTresDias);
        this.lojaPedido = lojaPedido;
        this.clientePedido = clientePedido;
        this.vendedorPedido = vendedorPedido;
        this.itensPedido = sacola;
    }

    public float calcularValorTotal(){
        float valorTotalPedido = 0.0f;
        for(Item item : itensPedido){
            valorTotalPedido += item.getValor();
        }
        return valorTotalPedido;
    }

    public String gerarDescricaoVenda(){
        String formCriacao = new SimpleDateFormat("dd/MM/yyyy").format(dataCriacao);
        String desc = "Descrição do Pedido: \n"
            .concat("Data de criação do pedido: "+formCriacao+".\n")
            .concat("Valor do pedido: R$"+ calcularValorTotal() +".\n")
            .concat("Em parceria com BioTechnica, Arasaka e Militech");
        System.out.println(desc);
        return desc;
    }

    public Date getDataPagamento(){
        return dataPagamento;
    }

    public Date setDataPagamento(){
        dataPagamento = new Date();
        return dataPagamento;
    }

    public Date getDataVencimentoReserva(){
        return dataVencimentoReserva;
    }

    public Integer getId(){
        return id;
    }

    public String getCliente(){
        return clientePedido.getNome();
    }

    public String getVendedor(){
        return vendedorPedido.getNome();
    }

    public String getLoja(){
        return lojaPedido.getNomeFantasia();
    }
}