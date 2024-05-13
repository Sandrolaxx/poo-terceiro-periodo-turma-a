package ListaSete;

import java.util.List;
import java.util.Scanner;

public class MyyPlant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("=====================================================================================");
        System.out.println("INFORMAÇÕES DA LOJA");
        Loja loja = new Loja(0, null, null, null);
        Endereco endereco = new Endereco(0, null, null, null, null, 0, null);
        loja.apresentarSe();
        loja.adicionarEndereco(endereco);

        System.out.println("\n=====================================================================================");
        System.out.println("INFORMAÇÕES DO GERENTE DA LOJA");
        Gerente gerente = new Gerente(0, null, 0, null);
        loja.adicionarGerente(gerente);
        gerente.apresentarSe();

        System.out.println("\n=====================================================================================");
        System.out.println("INFORMAÇÕES DO VENDEDOR");
        Vendedor vendedor = new Vendedor(0, null, 0, null);
        loja.adicionarVendedor(vendedor);
        vendedor.apresentarSe();

        System.out.println("\n=====================================================================================");
        System.out.println("INFORMAÇÕES DO CLIENTE");
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.print("INFORME A QUANTIDADE DE CLIENTES NA LOJA: ");
        int quantCliente = scanner.nextInt();
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < quantCliente; i++) {
            Cliente cliente = new Cliente(i, "", 0);
            cliente.apresentarSe();
            loja.adicionarCliente(cliente);
        }

        System.out.println("\n=====================================================================================");
        System.out.println("INFORMAÇÕES DOS ITENS");
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.print("INFORME A QUANTIDADE DE ITENS QUE DESEJA CRIAR: ");
        int quantItens = scanner.nextInt();

        for (int i = 0; i < quantItens; i++) {
            Item item = new Item(i, null, null, 0);
            item.gerarDescricao();
            item.apresentarSe();
            loja.adicionarItem(item);            
        }

        Cliente clienteSelecionado = loja.selecionarCliente();
        List<ItemVenda> itensComprados = loja.fazerVenda(clienteSelecionado);  


        System.out.println("\n=====================================================================================");
        System.out.println("INFORMAÇÕES DOS PEDIDOS");
        
        Pedido pedido = new Pedido(123, clienteSelecionado);
        pedido.adicionarItens(itensComprados);
        pedido.gerarDescricaoVenda();
        ProcessaPedido processador = new ProcessaPedido(loja);
        processador.processar(clienteSelecionado, pedido);
        System.out.println("=====================================================================================");


    }
}
