package primeirobi.atividade07;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Myyplant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Endereco do cliente
        Endereco endereco = new Endereco();
        endereco.setRua("PRIMEIRO DE MAIO");
        endereco.setBairro("NEVA");
        endereco.setCidade("Cascavel");
        endereco.setComplemento("APT");
        endereco.setEstado("Paraná");

        // Endereco do Gerente
        Endereco endereco1 = new Endereco();
        endereco1.setRua("AVENIDA DAS POMBAS");
        endereco1.setBairro("Floresta");
        endereco1.setCidade("Cascavel");
        endereco1.setComplemento("CASA");
        endereco1.setEstado("Paraná");

        System.out.println("Gerente:");
        Gerente gerente1 = new Gerente();
        gerente1.setNome("LUCAS");
        gerente1.setIdade(20);
        gerente1.setEndereco(endereco1);
        gerente1.Apresentarse();

        System.out.println("");

        Vendedor vendedor1 = new Vendedor();
        vendedor1.nome = "Sandrola";
        vendedor1.idade = 24;
        vendedor1.loja = "Myy Plant";
        vendedor1.salarioBase = 2000;
        vendedor1.salarioRecebido = new double[]{2100, 2200, 2300}; // salário

        // Apresenta o vendedor
        System.out.println("Vendedor:");
        vendedor1.apresentarse();
        System.out.println();


        // Printa informações do Cliente
        System.out.println("Cliente:");
        Cliente cliente1 = new Cliente();
        cliente1.setNome("EDUARDA");
        cliente1.setIdade(25);
        cliente1.setEndereco(endereco);
        cliente1.Apresentarse();


        Loja loja1 = new Loja();
        loja1.nomeFantasia = "Myy Plant";
        loja1.razaoSocial = "Myy Plant LTDA";
        loja1.cnpj = "40623584/0001-35";
        loja1.cidade = "Cascavel";
        loja1.bairro = "Centro";
        loja1.rua = "ERECHIM";
        loja1.vendedores = new Vendedor[]{vendedor1};
        loja1.clientes = new Cliente[]{cliente1};



        Item item1 = new Item();
        Item item2 = new Item();
        Item novoItem = new Item();
        Item novoItem1 = new Item();
          // Adicionando a declaração do novo item
        List<Item> itensCadastrados = new ArrayList<>(); // Adicionando a lista de itens cadastrados
        ProcessaPedido processaPedido = new ProcessaPedido();
        Item[] items = new Item[]{};
        Pedido pedidoCriado = processaPedido.processa(items, "valor random");
        pedidoCriado = processaPedido.confirmarPagamento(pedidoCriado);



        // Interação com o usuário
        int menu;

        do {
            System.out.println("Entre com uma opção:");
            System.out.println("1 - Registre sua venda");
            System.out.println("2 - Calcular total de vendas para um dia e mês específicos");
            System.out.println("3 - Calcular salário do vendedor");
            System.out.println("4 - Mostrar informações da loja");
            System.out.println("5 - Mostrar a média, salário do Gerente e o Salário com Bônus");
            System.out.println("6 - Criar Pedido Fake ");
            System.out.println("7 - Listar Itens ");
            System.out.println("8 - Criar Pedido ");
            System.out.println("9 - Cadastrar produto ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Digite o dia do mês (1 a 30), o mês (1 a 12) e o valor da venda:");
                    int diaVenda = scanner.nextInt();
                    int mesVenda = scanner.nextInt();
                    int valorVenda = scanner.nextInt();
                    loja1.registrarVenda(diaVenda, mesVenda, valorVenda);
                    System.out.println("Venda registrada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o dia do mês (1 a 30) e o mês (1 a 12) para calcular o total de vendas:");
                    int diaBusca = scanner.nextInt();
                    int mesBusca = scanner.nextInt();
                    System.out.println("Total de vendas para o dia " + diaBusca + " do mês " + mesBusca + ": " +
                            loja1.calcularTotalVendas(diaBusca, mesBusca));
                    break;
                case 3:
                    double salarioVendedor = loja1.calcularSalarioVendedor(vendedor1);
                    System.out.println("Salário do vendedor: R$" + salarioVendedor);
                    break;
                case 4:
                    loja1.apresentarse();
                    System.out.println("Quantidade de clientes: " + loja1.contarClientes());
                    System.out.println("Quantidade de vendedores: " + loja1.contarVendedores());
                    break;
                case 5:
                    gerente1.salarioGerente();
                    break;
                case 6:
                    item1.dadosFakes();
                    break;
                case 7:
                    System.out.println("Itens cadastrados:");
                    item2.listarItens();
                    break;
                case 8:
                    System.out.println("Digite o ID : ");
                    int idPedido1 = scanner.nextInt();
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto1 = scanner.next();
                    System.out.println("Digite o Tipo do produto: ");
                    String tipoProduto1 = scanner.next();
                    System.out.println("Digite o preço do produto: ");
                    double precoProduto1 = scanner.nextDouble();
                    novoItem1.setNome(nomeProduto1);
                    novoItem1.setValor(precoProduto1);
                    novoItem1.setId(idPedido1);
                    novoItem1.setTipo(tipoProduto1);
                    itensCadastrados.add(novoItem1);

                    System.out.println(pedidoCriado.getDataPagamento());
                    System.out.println(pedidoCriado.getDataVencimentoReserva());
                    break;
                case 9:
                    System.out.println("Digite o ID : ");
                    int id = scanner.nextInt();    

                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = scanner.next();

                    System.out.println("Digite o Tipo do produto: ");
                    String tipo = scanner.next();

                    System.out.println("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();

                    novoItem.setNome(nomeProduto);
                    novoItem.setValor(precoProduto);
                    novoItem.setId(id);
                    novoItem.setTipo(tipo);
                    itensCadastrados.add(novoItem);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;  
                case 0:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (menu != 0);

        scanner.close();
    }
}