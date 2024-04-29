package exercises.sistemadonagabriela6;

import java.util.Scanner;
import java.util.Arrays;

public class Menu {
    
    public static void main(String[] args) {

            // Cadastrando um endereço base.
        Endereco enderecoBase = new Endereco();
        
        enderecoBase.setEstado("PR");
        enderecoBase.setCidade("Cascavel");
        enderecoBase.setBairro("Centro");
        enderecoBase.setRua("Avenida das Torres");
        enderecoBase.setNumero(2442);
        enderecoBase.setComplemento("Próximo a FAG");


            // Cadastrando um cliente
        Cliente primeiroCliente = new Cliente();

        primeiroCliente.setNome("Marquinhos Leopoldo");
        primeiroCliente.setIdade(25);
        primeiroCliente.setEndereco(enderecoBase);


            // Cadastrando um vendedor.
        Vendedor primeiroVendedor = new Vendedor();

        primeiroVendedor.setNome("Marcelo de Souza");
        primeiroVendedor.setIdade(45);
        primeiroVendedor.setEndereco(enderecoBase);
        primeiroVendedor.setSalarioBase(2500);
        double[] salariosBaseVendedor = {5000, 2500, 1500};
        primeiroVendedor.setSalarioRecebido(salariosBaseVendedor);


            // Cadastrando uma loja.
        Loja primeiraLoja = new Loja();

        primeiraLoja.setNomeFantasia("Lojinha Dona Gabriela");
        primeiraLoja.setCnpj("48.193.830/0001-09");
        primeiraLoja.setRazaoSocial("Dona Gabriela LTDA");
        primeiraLoja.setEndereco(enderecoBase);
        Cliente[] clientes = {primeiroCliente};
        primeiraLoja.setClientes(clientes);
        Vendedor[] vendedores = {primeiroVendedor};
        primeiraLoja.setVendedores(vendedores);
    
            // Designando primeira loja para o primeiro vendedor
        primeiroVendedor.setLoja(primeiraLoja);


            // Cadastrando um Gerente
        Gerente primeiroGerente = new Gerente();

        primeiroGerente.setNome("Jorge Henrique Patrão");
        primeiroGerente.setIdade(60);
        primeiroGerente.setEndereco(enderecoBase);
        primeiroGerente.setLoja(primeiraLoja);
        primeiroGerente.setSalarioBase(9500);
        double[] salariosBaseGerente = {5000, 10000, 9500};
        primeiroGerente.setSalarioRecebido(salariosBaseGerente);


            // Cadastrando itens
        Item primeiroItem = new Item();

        primeiroItem.setId(0);
        primeiroItem.setNome("Rosa Vermelha");
        primeiroItem.setTipo("Flor");
        primeiroItem.setValor(30.0);


            // Exibindo em tela todas as apresentações de dados

        // enderecoBase.apresentarLogradouro();

        // primeiraLoja.apresentarse();
        // primeiraLoja.contarClientes();
        // primeiraLoja.contarVendedores();

        // primeiroCliente.apresentarse();

        // primeiroVendedor.apresentarse();
        // primeiroVendedor.calcularBonus();
        // primeiroVendedor.calcularMedia();

        // primeiroGerente.apresentarse();
        // primeiroGerente.calcularBonus();
        // primeiroGerente.calcularMedia();

        // primeiroItem.gerarDescricao();


            // Criando de fato o Menu principal
        Scanner scanner = new Scanner(System.in);

        Item[] ListaItens = {primeiroItem};
        Item[] ListaItensSelecionados = {};
        Item[] listaVazia = {};

        int contIdItem = 1;

        while (true) {
            System.out.println("\n\t[------------------MENU-----------------]");
            System.out.println("\t[\t(1) -> Listar Itens\t\t]");
            System.out.println("\t[\t(2) -> Criar Pedido\t\t]");
            System.out.println("\t[\t(3) -> Cadastrar novo Item\t]");
            System.out.println("\t[\t(4) -> Sair do sistema\t\t]");
            System.out.println("\t[---------------------------------------]\n");

            int option = scanner.nextInt();

            switch (option) {
            
                case 1:
                    System.out.println("*Listando todos os itens*");

                    for (int i = 0; i < ListaItens.length; i++) {
                        ListaItens[i].gerarDescricao();
                    }

                    continue;


                case 2:
                    System.out.println("*Criando pedido*");

                    while (true) {
                        System.out.println("\n\tInforme o item deseja adicionar pelo (id)");
                        System.out.println("\tDigite '-1' para finalizar.");
                        int idItem = scanner.nextInt();

                        if (idItem == -1) {
                            break;
                        }
                        
                            // Processo para estar adicionar mais um Item ao vetor.
                        ListaItensSelecionados = Arrays.copyOf(ListaItensSelecionados, ListaItensSelecionados.length + 1);
                        ListaItensSelecionados[ListaItensSelecionados.length - 1] = ListaItens[idItem];
                    }

                    ProcessaPedido novoPedidoProcessando = new ProcessaPedido();

                    Pedido pedidoProcessado = novoPedidoProcessando.processar(ListaItensSelecionados);

                    pedidoProcessado = novoPedidoProcessando.confirmarPagamento(pedidoProcessado);

                    pedidoProcessado.calcularValorTotal();
                    pedidoProcessado.gerarDescricao();

                    ListaItensSelecionados = listaVazia;

                    continue;


                case 3:
                    System.out.println("\n\t *Cadastro de novo item*");

                    Item novoItem = new Item();

                    novoItem.setId(contIdItem);
                    contIdItem += 1;

                    System.out.println("Informe o nome do item: ");
                    String nome = scanner.next();
                    novoItem.setNome(nome);

                    System.out.println("Informe o tipo do item: ");
                    String tipo = scanner.next();
                    novoItem.setTipo(tipo);

                    System.out.println("Informe o valor do item: ");
                    double valor = scanner.nextDouble();
                    novoItem.setValor(valor);

                    ListaItens = Arrays.copyOf(ListaItens, ListaItens.length + 1);

                    ListaItens[ListaItens.length - 1] = novoItem;
                    
                    continue;


                case 4:
                    break;


                default:
                    System.out.println("\n Digite uma opção valida. ");
                    continue;
                
            }

            scanner.close();
            break;

        }
    }
}