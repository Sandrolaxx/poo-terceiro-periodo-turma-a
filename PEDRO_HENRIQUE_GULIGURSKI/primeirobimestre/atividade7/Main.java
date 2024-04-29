package primeirobimestre.atividade7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Boolean verificaSacola(Item[] sacola) {
        if (sacola.length == 0){
            return false;
        } else {
            return true;
        }
    }

    public static String listarItens(Item estoque[]) {
        String msg = "";
        for (int i = 0; i < estoque.length; i++){
            msg = msg + "\n----------------------------------\n"
            .concat("   ID do item: "+estoque[i].getId()+"\n")
            .concat("   Nome do item: "+estoque[i].getNome()+"\n")
            .concat("   Tipo do item: "+estoque[i].getTipo()+"\n")
            .concat("   Preço do itme: R$"+estoque[i].getValor()+"\n");
        }

        return msg;
    }

    private static void exibirSacolaDeCompras() {
        System.out.println("\nSacola de Compras:");
        if (sacola.isEmpty()) {
            System.out.println("A sacola de compras está vazia.");
        } else {
            for (Item item : sacola) {
                System.out.println(item.getNome() + " - Tipo: " + item.getTipo() + " - Valor: R$" + item.getValor());
            }
        }
    }

    private static Item getItemPorId(Integer id) {
        for (Item item : estoque) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    private static boolean verificarExistenciaIdItem(int id) {
        for (Item item : estoque) {
            if (item.getId() == id) {
                return true; // O ID do item foi encontrado
            }
        }
        return false; // O ID do item não foi encontrado
    }

    public static Item adicionaItemNaSacola(Integer idItem, Item[] estoque,List<Item> sacola) {
        if (verificarExistenciaIdItem(idItem)){
            sacola.add(getItemPorId(idItem));
            System.out.println("Item adicionado a sacola!");
        } else {
            System.out.println("Item não encontrado.");
        }
        return null;
    }

    private static Item[] adicionarNovoItem(Item novoItem, Item[] estoque) {
        Item[] novoEstoque = Arrays.copyOf(estoque, estoque.length + 1);
        novoEstoque[novoEstoque.length - 1] = novoItem;
        return estoque = novoEstoque;
    }

    public static Item[] adicionarItemNoEstoque(Item[] estoque){
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastro de Item");
        System.out.print("Informe o ID do item: ");
        int id = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha
        System.out.print("Informe o nome do item: ");
        String nome = input.nextLine();
        System.out.print("Informe o tipo do item: ");
        String tipo = input.nextLine();
        System.out.print("Informe o valor do item: (Float)");
        float valor = input.nextFloat();
        Item novoItem = new Item(id, nome, tipo, valor);
        System.out.println("Item adicionado.");
        return adicionarNovoItem(novoItem, estoque);
    }

    private static Item[] estoque = {
        new Item(1, "Samambaia Americana", "Samambaia", 25.99f),
        new Item(2, "Cacto Espinho-de-cobra", "Cacto", 12.50f),
        new Item(3, "Suculenta Rosa do Deserto", "Suculenta", 18.75f),
        new Item(4, "Orquídea Phalaenopsis", "Orquídea", 30.00f),
        new Item(5, "Bonsai de Ficus Ginseng", "Bonsai", 45.99f)
    };

    private static List<Item> sacola = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ProcessaPedido processador = new ProcessaPedido();

        Endereco enderecoCliente1 = new Endereco("Paraná", "Cascavel", "Santa Felicidade", "715", "Casa de esquina");
        Cliente cliente1 = new Cliente("Raul Kaito", 43, enderecoCliente1);

        Endereco enderecoVendedor1 = new Endereco("Paraná", "Cascavel", "Neva", "1231", "Casa azul");
        Float[] salarioRecebidoVend1 = {2400.00f, 1800.00f, 1904.99f};
        Vendedor vendedor1 = new Vendedor("Pedro Henrique", 19, "MyyPlant",enderecoVendedor1, 1550.00f, salarioRecebidoVend1);

        // Criando loja
        Endereco enderecoLoja = new Endereco("Paraná", "Cascavel", "Neva", "44", "Casa azul");
        Cliente[] clientes = {cliente1};
        Vendedor[] vendedores = {vendedor1};
        Loja loja = new Loja("MyyPlant", "Plantas Gabriela ltda", "94.027.944/0001-04", enderecoLoja, vendedores, clientes);


        String menuInicial = "[1] - Adicionar Itens à Sacola\n" // Deve abrir o "menuItens"
            .concat("[2] - Verificar Sacola\n") // Deve mostrar o preço total
            .concat("[3] - Finalizar Compra\n") // Deve solicitar o pagamento e mostrar o preço do troco (se houver)
            .concat("[4] - Sair"); // Deve encerrar a aplicação

        String menuItens = "[1] - Listar Itens\n" // Dá a opção de digitar o ID para adicionar a sacola, ou 0 para voltar
            .concat("[2] - Cadastrar Itens\n") // Ao cadastrar, da a opção: Adicionar a sacola? [1] - sim [0] - não
            .concat("[3] - Voltar");

        String divisoria = "----------------------------------";

        while (true) {
            System.out.println(divisoria+"\n"+menuInicial+"\n"+divisoria);
            switch (input.nextInt()) {
                case 1:
                    limparTerminal();
                    System.out.println(divisoria+"\n"+menuItens+"\n"+divisoria); // exibe menuItens
                    int resposta = input.nextInt();// Dá a opção de digitar o ID para adicionar a sacola, ou 0 para voltar
                    if (resposta == 1){
                        System.out.println(listarItens(estoque)); 
                        System.out.println("Digite o ID do item que deseja adicionar: ([0] Sair)");
                        Integer idItem = input.nextInt();
                        adicionaItemNaSacola(idItem, estoque, sacola);
                    } else if (resposta == 2) {
                        estoque = adicionarItemNoEstoque(estoque);
                    } else if (resposta == 3) {
                        break;
                    } else {
                        limparTerminal();
                        System.out.println("Opção inválida!");
                        break;
                    }
                    break;
                case 2:
                    limparTerminal();
                    exibirSacolaDeCompras();
                    break;
                case 3:
                    Pedido pedido = processador.processar(cliente1, vendedor1, loja, sacola);
                    Float valorPedido = pedido.calcularValorTotal();
                    boolean pagamentoFinalizado = false;
                    while (!pagamentoFinalizado) {
                        System.out.println("Realize o pagamento no valor de: R$"+valorPedido);
                        input.nextLine();
                        Float valorPago = input.nextFloat();
                        if (valorPago < valorPedido){
                            System.out.println("Faltam R$"+(valorPedido - valorPago));
                        } else if (Math.abs(valorPago - valorPedido) <= 0.01) {
                            System.out.println("Pagamento realizado!");
                            pagamentoFinalizado = true;
                        } else if (valorPago > valorPedido) {
                            System.out.println("O valor do troco é R$"+(valorPago - valorPedido));
                            pagamentoFinalizado = true;
                        }
                    }
                    break;
                case 4:
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

    }

}
