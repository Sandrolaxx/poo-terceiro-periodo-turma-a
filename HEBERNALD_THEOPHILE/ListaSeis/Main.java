package ListaSeis;

import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessaPedido processador = new ProcessaPedido();

        boolean running = true;
        while (running) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar novo gerente");
            System.out.println("2. Criar novo endereço");
            System.out.println("3. Criar novo item");
            System.out.println("4. Criar novo cliente");
            System.out.println("5. Criar novo vendedor");
            System.out.println("6. Criar novo pedido");
            System.out.println("7. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    criarNovoGerente(scanner);
                    break;
                case 2:
                    criarNovoEndereco(scanner);
                    break;
                case 3:
                    criarNovoItem(scanner);
                    break;
                case 4:
                    criarNovoCliente(scanner);
                    break;
                case 5:
                    criarNovoVendedor(scanner);
                    break;
                case 6:
                    criarNovoPedido(scanner, processador);
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }

        scanner.close();
    }

    private static void criarNovoGerente(Scanner scanner) {
        System.out.println("Digite o nome do gerente:");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do gerente:");
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a loja do gerente:");
        String loja = scanner.nextLine();
        System.out.println("Digite a cidade do gerente:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o bairro do gerente:");
        String bairro = scanner.nextLine();
        System.out.println("Digite a rua do gerente:");
        String rua = scanner.nextLine();
        System.out.println("Digite o salário base do gerente:");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Digite os salários recebidos do gerente (separados por vírgula):");
        String[] salarioRecebidoStr = scanner.nextLine().split(",");
        double[] salarioRecebido = new double[salarioRecebidoStr.length];
        for (int i = 0; i < salarioRecebidoStr.length; i++) {
            salarioRecebido[i] = Double.parseDouble(salarioRecebidoStr[i].trim());
        }

        Gerente gerente = new Gerente(nome, idade, loja, cidade, bairro, rua, salarioBase, salarioRecebido);
        System.out.println("Gerente criado com sucesso: " + gerente);
    }

    private static void criarNovoEndereco(Scanner scanner) {
        System.out.println("Digite o estado:");
        String estado = scanner.nextLine();
        System.out.println("Digite a cidade:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o bairro:");
        String bairro = scanner.nextLine();
        System.out.println("Digite o número:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o complemento:");
        String complemento = scanner.nextLine();

        Endereco endereco = new Endereco(estado, cidade, bairro, numero, complemento);
        System.out.println("Endereço criado com sucesso: " + endereco);
    }

    private static void criarNovoItem(Scanner scanner) {
        System.out.println("Digite o ID do item:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o nome do item:");
        String nome = scanner.nextLine();
        System.out.println("Digite o tipo do item:");
        String tipo = scanner.nextLine();
        System.out.println("Digite o valor do item:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); 
        Item item = new Item(id, nome, tipo, valor);
        System.out.println("Item criado com sucesso: " + item);
    }

    private static void criarNovoCliente(Scanner scanner) {
        System.out.println("Digite o ID do cliente:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o email do cliente:");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(id, nome, email);
        System.out.println("Cliente criado com sucesso: " + cliente);
    }

    private static void criarNovoVendedor(Scanner scanner) {
        System.out.println("Digite o ID do vendedor:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o nome do vendedor:");
        String nome = scanner.nextLine();
        System.out.println("Digite a loja do vendedor:");
        String loja = scanner.nextLine();

        Vendedor vendedor = new Vendedor(id, nome, loja);
        System.out.println("Vendedor criado com sucesso: " + vendedor);
    }

    private static void criarNovoPedido(Scanner scanner, ProcessaPedido processador) {
        System.out.println("Digite o ID do pedido:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite a data de criação do pedido (formato dd/MM/yyyy HH:mm:ss):");
        String dataCriacaoStr = scanner.nextLine();
        System.out.println("Digite o ID do cliente:");
        int idCliente = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o email do cliente:");
        String emailCliente = scanner.nextLine();
        Cliente cliente = new Cliente(idCliente, nomeCliente, emailCliente);
        System.out.println("Digite o ID do vendedor:");
        int idVendedor = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Digite o nome do vendedor:");
        String nomeVendedor = scanner.nextLine();
        System.out.println("Digite a loja do vendedor:");
        String lojaVendedor = scanner.nextLine();
        Vendedor vendedor = new Vendedor(idVendedor, nomeVendedor, lojaVendedor);
        System.out.println("Digite o nome da loja:");
        String loja = scanner.nextLine();
        System.out.println("Digite o número de itens no pedido:");
        int numItens = scanner.nextInt();
        scanner.nextLine(); 
        Item[] itens = new Item[numItens];
        for (int i = 0; i < numItens; i++) {
            System.out.println("Digite os detalhes do item " + (i + 1) + ":");
            System.out.println("ID:");
            int idItem = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Nome:");
            String nomeItem = scanner.nextLine();
            System.out.println("Tipo:");
            String tipoItem = scanner.nextLine();
            System.out.println("Valor:");
            double valorItem = scanner.nextDouble();
            scanner.nextLine(); 
            itens[i] = new Item(idItem, nomeItem, tipoItem, valorItem);
        }

        
    }
    private static void criarPedidoFicticio(ProcessaPedido processador) {
        
        Cliente cliente = new Cliente(1, "Maria", "maria@example.com");
        Vendedor vendedor = new Vendedor(1, "Pedro", "Loja B");
        Item item1 = new Item(1, "Camiseta", "Vestuário", 29.99);
        Item item2 = new Item(2, "Calça", "Vestuário", 49.99);
        Item[] itens = {item1, item2};
    
        
    }
    
}