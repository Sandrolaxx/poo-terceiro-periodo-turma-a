package primeirobim.listaseis;

import java.util.Date;
import java.util.Scanner;


public class Pedido extends Item {

    public int id;

    public Date dataCriacao;

    public Date dataPagamento;

    public Date dataVencimentoReserva;

    public String cliente;

    public Vendedor vendedor;

    public Loja loja;

    private double valorTotal;


    public void calcularValorTotal () {

        Scanner scanner = new Scanner(System.in);

        Pedido pedido = new Pedido();

        System.out.println("Insira o nome do item");
        String itemPedido = scanner.next();
        pedido.nome = itemPedido;

        System.out.println("Insira o ID do pedido");
        int itemId = scanner.nextInt();
        pedido.id = itemId;
        
        System.out.println("Insira o valor do item");
        double valorItem = scanner.nextDouble();
        pedido.valor = valorItem;

        System.out.println("Insira a quantidade do item");
        int qntdItem = scanner.nextInt();
        pedido.qntd = qntdItem;

        valorTotal = pedido.valor * pedido.qntd;

        System.out.println("Valor total do pedido: " + valorTotal + "\n");

        String pedidoFeito = "Pedido n°: " + itemId + "\n" +"Nome do Item:  " + pedido.nome + "\n" +"Quantidade: " + pedido.qntd + "\n" +
        "Valor unitário: " + pedido.valor + "\nValor total: " + valorTotal + "\n" ;
        System.out.println(pedidoFeito);
    }

    public void gerarDescricaoVenda () {

        Date date = new Date();
        System.out.println("Data de criação do pedido: " + date);
        Date dataVencida = new Date();
        dataVencida.setDate(dataVencida.getDate() + 3);
        System.out.println("Data de vencimento do pedido: " + dataVencida);

        System.out.println("Valor do pedido: " + valorTotal);
        }
    }

    

