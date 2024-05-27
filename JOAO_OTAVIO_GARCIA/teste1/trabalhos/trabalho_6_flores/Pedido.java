import java.util.Scanner;

public class Pedido {
    
    private Integer id;

    private Date dataCriacao;

    private Date dataPagamento;

    private Date dataVencimentoReserva;

    private Item[] items;

    public Pedido(Interger id,Item[] items){
        Long msDia = 86400000l;
        Long tresDias = new Date().getTime() +(3 * msDia);

        this.dataCriacao = new Date();
        This.dataVencimentoReserva = new Date(tresDias);
    }

}
