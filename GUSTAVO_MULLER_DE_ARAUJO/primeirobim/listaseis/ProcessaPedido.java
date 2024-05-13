package primeirobim.listaseis;

import java.util.Scanner;


public class ProcessaPedido extends Item{

    public Cliente cliente;

    public Vendedor vendedor;

    public Item item;

    public Loja loja;


    public void processar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Descrição do pedido.");
        Pedido pedido = new Pedido();

        System.out.println("Insira o nome do cliente");
        String clientNome = scanner.next();
        pedido.cliente = clientNome;

        System.out.println("Insira o nome do vendedor");
        String vendNome = scanner.next();
        pedido.cliente = vendNome; 
    
        System.out.println("Insira o nome do item");
        String itemPedido = scanner.next();
        pedido.nome = itemPedido;

        System.out.println("Insira o ID do item");
        int itemId = scanner.nextInt();
        pedido.id = itemId;
        
        System.out.println("Insira o valor do item");
        double valorItem = scanner.nextDouble();
        pedido.valor = valorItem;

        System.out.println("Insira a quantidade do item");
        int qntdItem = scanner.nextInt();
        pedido.qntd = qntdItem;

        System.out.println("\nCliente: " +clientNome + "\n" + "Vendedor: " + vendNome+ "\n"
        + "Item: " + itemPedido + "\n" + "ID do pedido: " + itemId + "\n" + "Valor do pedido: " + qntdItem * valorItem);
        }
}

