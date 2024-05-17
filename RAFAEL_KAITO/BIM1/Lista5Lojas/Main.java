package BIM1.Lista5Lojas;

    import java.util.ArrayList;
    import java.util.Date;
    import java.util.Scanner;
    
public class Main {
    public static void main(String[] args) {


        float[] salarioRecebidoVendedor1 = new float[]{2500f,2550f,2700f};
        float[] salarioRecebidoVendedor2 = new float[]{3000f,3200f,3300f};
        float[] salarioRecebidoGerente = new float[]{6000f,6200f,6300f};

        Endereco enderecoLoja = new Endereco("PR", "Cascavel", "Centro",
         "Av.Brasil", "222", "Loja");
        Endereco enderecoVendedor1 = new Endereco("PR", "Cascavel", "Neva",
         "Maranhao", "777", "Casa");
        Endereco enderecoVendedor2 = new Endereco("PR", "Cascavel", "Pq. Verde",
         "Marechal Rondon", "333", "Casa");
        Endereco enderecoCliente1 = new Endereco("PR", "Cascavel", "Pq.Sao Paulo", 
        "Rio de Janeiro", "555", "Casa");
        Endereco enderecoCliente2 = new Endereco("PR", "Cascavel", "Canada",
         "Curitiba", "888", "Casa");
         Endereco enderecoGerente = new Endereco("PR", "Cascavel", "Tropical",
         "Palmas", "666", "Casa");

         ArrayList<Integer> listaClientes = new ArrayList<>();
         ArrayList<Integer> listaVendedores = new ArrayList<>();
         ArrayList<Item> listaItens = new ArrayList<>();
         ArrayList<Item> listaItensPedido = new ArrayList<>();
        
        Loja Loja1 = new Loja("MyyPlant", "MyyPlant S.A", "25.725.571/0001-14"
        ,enderecoLoja,listaClientes,listaVendedores);

        Gerente Gerente = new Gerente("Marcos Assunção", 60, "MyyPlant", enderecoGerente, 6000f, salarioRecebidoGerente);

        Vendedor Vendedor1 = new Vendedor("Sr.Sandrolaxx", 40, "MyyPlant", enderecoVendedor1, 2500f, salarioRecebidoVendedor1);
        listaVendedores.add(1);
        Vendedor Vendedor2 = new Vendedor("Sra.Rita", 64, "MyyPlant", enderecoVendedor2, 3000f, salarioRecebidoVendedor2);
        listaVendedores.add(2);
       
        Cliente Cliente1 = new Cliente("MauroCezar", 27, enderecoCliente1);
        listaClientes.add(1);
        Cliente Cliente2 =new Cliente("MaestroJunior", 59, enderecoCliente2);
        listaClientes.add(2);
        
        System.out.println("\n-------------------");
        System.out.println("\n--- Gerente ---\n");
        Gerente.apresentarse();
        Gerente.calcularBonus();
        Gerente.calcularMedia();

        System.out.println("\n-------------------");
        System.out.println("\n--- Vendedor 1 ---\n");
        Vendedor1.apresentarse();
        Vendedor1.calcularBonus();
        Vendedor1.calcularMedia();

        System.out.println("\n------------------");
        System.out.println("\n--- Vendedor 2 ---\n");
        Vendedor2.apresentarse();
        Vendedor2.calcularBonus();
        Vendedor2.calcularMedia();

        System.out.println("\n-----------------");
        System.out.println("\n--- Cliente 1 ---\n");
        Cliente1.apresentarse();

        System.out.println("\n-----------------");
        System.out.println("\n--- Cliente 2 ---\n");
        Cliente2.apresentarse();
       
        System.out.println("\n------------------");
        System.out.println("\n--- Loja 1 ---\n");
        Loja1.apresentarse();
        int quantClientes = Loja1.contarClientes();
        int quantVendedores = Loja1.contarVendedores();
        
        System.out.println("Quantidade de clientes: " + quantClientes);
        System.out.println("Quantidade de vendedores: " + quantVendedores);

        //itens já cadastrados
        Item item1 = new Item("1", "yogurt", "bebidas", 12.90f);
        listaItens.add(item1);
        Item item2 = new Item("2", "sabão", "limpeza", 1.90f);
        listaItens.add(item2);

        String idPedido = "001";
        Date dataCriacao = new Date(); 
        Date dataPagamento = null; 
        long tresDias = 3 * 86400000L; 
        Date dataVencimento = new Date(dataCriacao.getTime() + tresDias);

        Pedido pedido1 = new Pedido(idPedido, dataCriacao, dataPagamento, Cliente1, Vendedor1, Loja1, listaItensPedido);
        ProcessaPedido processadorPedido1 = new ProcessaPedido(pedido1);
        processadorPedido1.processar(); 

        Scanner scanner = new Scanner(System.in);
        int opc;
        
        do{
        System.out.println("-------- Menu --------\n [1]Cadastrar item\n [2]Fazer pedido\n [3]Listar itens\n [4]Sair\n [5]Ver pedido");
        opc = scanner.nextInt();

        switch(opc) {

        case 1:
        System.out.println("Cadastro de novo item:");
        int proximoid = listaItens.size()+1;
        String id = String.format("%d",proximoid);
        System.out.println("Informe o nome do item:");
        String nome = scanner.next();
        System.out.println("Informe o tipo do item:");
        String tipo = scanner.next();
        System.out.println("Informe o valor do item:");
        while (!scanner.hasNextFloat()) {
            System.out.println("Entrada inválida. Digite um número válido.");
            scanner.next(); 
        }
        float valor = scanner.nextFloat();

        Item novoItem = new Item(id, nome, tipo, valor);

        listaItens.add(novoItem);

        System.out.println("Novo item cadastrado.");
        break;

        case 2:
            System.out.println("Adicionar itens ao pedido?\n [1]Adicionar\n [2]Finalizar pedido\n");

            int continuar = scanner.nextInt();

            while (continuar == 1) {
                System.out.println("Itens disponíveis para adicionar ao pedido:");
                for (int i = 0; i < listaItens.size(); i++) {
                    Item item = listaItens.get(i);
                    System.out.println("[" + (i + 1) + "] " + item.getNome() + ", " + item.getTipo() + ", R$ " + item.getValor());
                }
                System.out.println("Digite o número correspondente ao item que deseja adicionar ao pedido:");
                int selecaoItem = scanner.nextInt();

                if (selecaoItem > 0 && selecaoItem <= listaItens.size()) {
                    Item itemEscolhido = listaItens.get(selecaoItem - 1);
                    pedido1.getListaItensPedido().add(itemEscolhido);
            
                    System.out.println(itemEscolhido.getNome() + " foi adicionado ao pedido com sucesso!");
                } else {
                    System.out.println("Número de item inválido. Tente novamente.");
                }

                System.out.println("Deseja continuar adicionando itens?\n [1]Sim\n [2]Finalizar pedido\n");
                continuar = scanner.nextInt();
            }

            System.out.println("Pedido finalizado");
        break;

        case 3:
        System.out.println("Lista de itens cadastrados:");
        for (int i = 0; i < listaItens.size(); i++) {
            Item item = listaItens.get(i);
            System.out.println("[" + (i + 1) + "] " + item.getNome() + ", " + item.getTipo() + ", R$ " + item.getValor());
        }
        break;
        case 4:
        System.out.print("Operação encerrada");
        scanner.close();
        break;
        case 5:
        System.out.println("--- Detalhes do Pedido ---");
            pedido1.imprimirPedido();
        break;
        default:
        System.out.println("Opção inválida");
        break;
        }
        }while(opc!=4);

        scanner.close();
    }
}
