package primeirobi.ListasExc.Lista7;

import java.util.ArrayList;
import java.util.List;
// usar classes sem referenciar pacotes
import java.util.Scanner;

public class MyPlantApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Dom Pedro II");
        endereco.setBairro("Centro");
        endereco.setCidade("Cascavel");
        endereco.setComplemento("Apartamento 03");
        endereco.setEstado("Paraná");

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Pablo Afonso");
        endereco1.setBairro("Bairro MyPlant");
        endereco1.setCidade("Cascavel");
        endereco1.setComplemento("Prédio");
        endereco1.setEstado("São Paulo");

        System.out.println("Gerente:");
        System.out.println(" ");
        Gerente gerente1 = new Gerente();
        gerente1.setNome("will");
        gerente1.setIdade(18);
        gerente1.setEndereco(endereco1);
        gerente1.calcularSalarioGerente();
        System.out.println();

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("HEBERNALD");
        vendedor1.setIdade(19);
        vendedor1.setLoja("Loja do hebernald");
        vendedor1.setSalarioBase(2000);
        vendedor1.setSalarioRecebido(new double[]{2100, 2200, 2300});

        System.out.println("Vendedor:");
        System.out.println(" ");
        vendedor1.apresentar();
        System.out.println();

        System.out.println("Cliente:");
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jef bala");
        cliente1.setIdade(18);
        cliente1.setEndereco(endereco);
        cliente1.apresentar();
        System.out.println();

        Loja loja1 = new Loja();
        loja1.setNomeFantasia("MyPlant");
        loja1.setRazaoSocial("MyPlant LTDA");
        loja1.setCnpj("71.245.317/0001-47");
        loja1.setCidade("Cascavel");
        loja1.setBairro("Centro");
        loja1.setRua("Dom Pedro IV");
        loja1.setVendedores(new Vendedor[]{vendedor1});
        loja1.setClientes(new Cliente[]{cliente1});

        int menu;

        do {
            System.out.println("/:=== Menu ===:/");
            System.out.println("1 - Registrar umavenda");
            System.out.println("2 - Calcular total de vendas");
            System.out.println("3 - Calcular salário vendedor");
            System.out.println("4 - Informações da loja");
            System.out.println("5 - Mostrar a média e salário do gerente");
            System.out.println("6 - Criar Pedido (fake)");
            System.out.println("7 - Listar Itens");
            System.out.println("8 - Criar Pedido");
            System.out.println("9 - Cadastrar produto");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Digite o dia (1-30), o mês e o valor da venda:");
                    int diaVenda = scanner.nextInt();
                    int mesVenda = scanner.nextInt();
                    int valorVenda = scanner.nextInt();
                    loja1.registrarVenda(diaVenda, mesVenda, valorVenda);
                    System.out.println("Venda registrada no sistema");
                    break;
                case 2:
                    System.out.println("Digite o dia (1-30) e mês para calcular o total das vendas:");
                    int diaBusca = scanner.nextInt();
                    int mesBusca = scanner.nextInt();
                    System.out.println("Total de vendas dia " + diaBusca + " mês " + mesBusca + ": " + loja1.calcularTotalVendas(diaBusca, mesBusca));
                    break;
                case 3:
                    double salarioVendedor = loja1.calcularSalarioVendedor(vendedor1);
                    System.out.println("Salário vendedor: R$ " + salarioVendedor);
                    break;
                case 4:
                    loja1.apresentar();
                    System.out.println("Quantidade clientes: " + loja1.contarClientes());
                    System.out.println("Quantidade vendedores: " + loja1.contarVendedores());
                    System.out.println(" ");
                    break;
                case 5:
                    gerente1.calcularSalarioGerente();
                    break;
                case 6:
                    Item item1 = new Item();
                    item1.exibirDadosFakes();
                    break;
                case 7:
                    Item item2 = new Item();
                    item2.listarItens();
                    break;
                case 8:
                    System.out.println("Digite o número : ");
                    int idPedido1 = scanner.nextInt();
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto1 = scanner.next();
                    System.out.println("Digite qual o topo do produto: ");
                    String tipoProduto1 = scanner.next();
                    System.out.println("Digite o preço deste produto: ");
                    double precoProduto1 = scanner.nextDouble();
                    Item novoItem1 = new Item();
                    novoItem1.setId(idPedido1);
                    novoItem1.setNome(nomeProduto1);
                    novoItem1.setTipo(tipoProduto1);
                    novoItem1.setValor(precoProduto1);
                    Pedido pedidoCriado = new ProcessaPedido().processa(new Item[]{novoItem1}, "valor random");
                    pedidoCriado = new ProcessaPedido().confirmarPagamento(pedidoCriado);
                    System.out.println(pedidoCriado.getDataPagamento());
                    System.out.println(pedidoCriado.getDataVencimentoReserva());
                    break;
                case 9:
                    System.out.println("Digite o número : ");
                    int id = scanner.nextInt();
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = scanner.next();
                    System.out.println("Digite qual o tipo do produto: ");
                    String tipo = scanner.next();
                    System.out.println("Digite o preço desse produto: ");
                    double precoProduto = scanner.nextDouble();
                    Item novoItem = new Item();
                    novoItem.setId(id);
                    novoItem.setNome(nomeProduto);
                    novoItem.setTipo(tipo);
                    novoItem.setValor(precoProduto);
                    System.out.println("Produto cadastrado no sistema");
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção não aceita, tente novamente");
                    break;
            }
        } while (menu != 0);

        scanner.close();
    }
}