import java.util.Date;
import java.util.Scanner;

public class GerenciadorDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Loja loja = new Loja("Arbor", "My Plant", 123456789, "Salto do Lontra", "Fraron", "Morumbi", 5612, "Atras de Majula");
        Vendedor[] vendedores = new Vendedor[2];
        Cliente[] clientes = new Cliente[2];
        Gerente[] gerentes = new Gerente[1];

        //associando os arrays de vendedores e clientes para a loja
        loja.vendedores = vendedores;
        loja.clientes = clientes;
        loja.gerentes = gerentes;

        System.out.println("Quantidade de vendedores na loja: " + loja.contarVendedores());
        System.out.println("Quantidade de clientes na loja: " + loja.contarClientes());
        System.out.println("Quantidade de gerentes na loja: " + loja.contarGerentes());
        loja.apresentarseL();
        System.out.println("---------------------------------------------------");
     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Vendedor vendedorUm = new Vendedor("Carlinhos", 23, "Arbor", "Salto do Lontra", "Limoeiro", "Sao Pualo", 1363, "Shrine of Amana", 2500, (2500 + 3000 + 2650));  
        vendedorUm.apresentarseV();
        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();
        System.out.println("\n");

        Vendedor vendedorDois = new Vendedor("Clebusglóides", 25, "Arbor", "Dois vizinhos", "Anor Londo", "Juriquaquara", 2862, "Ao lado da Cripta dos Mortos-Vivos", 2600, (2600 + 3100 + 2750));
        vendedorDois.apresentarseV();
        vendedorDois.calcularMedia();
        vendedorDois.calcularBonus();
        System.out.println("\n");

        Cliente clienteUm = new Cliente("Soclovaldirno", 43, "Majula", "Ambarino", "São Denis", 2862, "Perto de Iron Keep");
        clienteUm.apresentarseC();
        System.out.println("\n");

        Cliente clienteDois = new Cliente("Jin Sakai", 32, "Nova Austin", "Izuhara", "Ocha no Mizu", 9746, "2 quadras a direita de Things Betwixt");
        clienteDois.apresentarseC();
        System.out.println("\n");

        Gerente gerenteUm = new Gerente("Nashandra", 824, "Arbor", "Doors of Pharos", "Kyoto", "Lost Sinner", 7636, "Ap 2 do condomínio Brighstone Cove Tseldora", 5200, (5200 + 5100 + 4950));
        gerenteUm.apresentarseG();
        gerenteUm.calcularMediaG();
        gerenteUm.calcularBonusG();
        System.out.println("\n");

        int opcao;
        Pedido pedido;
        Item[] itens = new Item[0];
        
        do {
            System.out.println("Digite 1 para continuar criando pedidos, 2 para cancelar");
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                //criando uma instancia de Pedido
                pedido = new Pedido();
                System.out.println("Digite o id do produto: ");
                pedido.id = scanner.nextInt();
                pedido.dataCriacao = new Date();
                pedido.dataVencimentoReserva = new Date(pedido.dataCriacao.getTime() + 3 * 24 * 60 * 60 * 1000);// 3 dias apos a criacao
                pedido.cliente = clientes[0]; // atribuindo um cliente de exemplo
                pedido.vendedor = vendedores[0]; //"""
                pedido.loja = loja; // atrbuindo a loja
                System.out.println("Digite a quantidade de itens: ");
                int quantidadeItens = scanner.nextInt();
                itens = new Item[quantidadeItens]; // mover a inicialização para aqui

                for(int i = 0; i < quantidadeItens; i++) {
                    
                    System.out.println("Item " + (i + 1) + ":");
                    System.out.println("Digite o id do item: ");
                    int id = scanner.nextInt();

                    System.out.println("Digite o nome do item: ");
                    String nome = scanner.next();

                    System.out.println("Digite o tipo do produto: ");
                    String tipo = scanner.next();

                    System.out.println("Digite o valor do produto");
                    double valor = scanner.nextInt();

                    Item item = new Item(id, nome, tipo, valor);
                    itens[i] = item;
                }
                //associar o array de itens ao pedido
                pedido.itens = itens;

                //processar o pedido
                ProcessaPedido processador = new ProcessaPedido();
                processador.processar(pedido);
            }
        } while(opcao != 2);

        // Listar os últimos dois itens cadastrados
        if (itens.length >= 2) {
            System.out.println("Últimos dois itens cadastrados:");
            for (int i = itens.length - 2; i < itens.length; i++) {
                System.out.println("Item " + (i + 1) + ":");
                System.out.println("Nome: " + itens[i].getNome());
                System.out.println("Tipo: " + itens[i].getTipo());
                System.out.println("Valor: " + itens[i].getValor());
            }
        } else if (itens.length == 1) {
            System.out.println("Último item cadastrado:");
            System.out.println("Nome: " + itens[0].getNome());
            System.out.println("Tipo: " + itens[0].getTipo());
            System.out.println("Valor: " + itens[0].getValor());
        } else {
            System.out.println("Nenhum item cadastrado ainda.");
        }

        scanner.close(); // Fechar o scanner quando não for mais necessário
    }    
}
