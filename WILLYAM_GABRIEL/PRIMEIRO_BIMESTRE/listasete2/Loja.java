package ListaSete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Loja extends Objeto {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private List<Gerente> gerentes = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Endereco> enderecos = new ArrayList<>();
    private List<Item> itens = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    protected Loja(int id, String nomeFantasia, String razaoSocial, String cnpj) {
        super(id);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    protected ArrayList<Item> getItens() {
        return (ArrayList<Item>) itens;
    }

    protected List<Cliente> getClientes() {
        return clientes;
    }

    protected void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    protected void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    protected void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    protected void adicionarGerente(Gerente gerente) {
        gerentes.add(gerente);
    }

    protected void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    protected void adicionarItem(Item item) {
        itens.add(item);
    }

    protected int contarClientes() {
        return clientes.size();
    }

    protected String getNomeFantasia() {
        return nomeFantasia;
    }

    protected void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    protected String getRazaoSocial() {
        return razaoSocial;
    }

    protected void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    protected String getCnpj() {
        return cnpj;
    }

    protected void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    protected List<Vendedor> getVendedores() {
        return vendedores;
    }

    protected int contarVendedores() {
        return vendedores.size();
    }

    @Override
    protected void apresentarSe() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.print("NOME DA LOJA: ");
        this.nomeFantasia = scanner.nextLine();

        System.out.print("RAZÃO SOCIAL: ");
        this.razaoSocial = scanner.nextLine();

        System.out.print("CNPJ: ");
        this.cnpj = scanner.next();
        System.out.println("-------------------------------------------------------------------------------------");

    }

    protected Cliente selecionarCliente() {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = this.getClientes();
        if (clientes.isEmpty()) {
            System.out.println("NÃO CLIENTES PARA A COMPRA");
            return null;
        }

        System.out.println("\n====================================================================================");

        System.out.println("INFORMAÇÕES DOS PEDIDOS");

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.print("CLIENTES DISPONÍVEIS: ");
        for (int i = 0; i < this.getClientes().size(); i++) {
            System.out.println((i + 1) + ". " + this.getClientes().get(i).getNome());
        }

        System.out.print("SELECIONE O CLIENTE QUE ESTÁ REALIZANDO A COMPRA: ");
        int numeroClienteSelecionado = scanner.nextInt();

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("NUMERO DO CLIENTE: " + numeroClienteSelecionado);
        System.out.println("QUANTIDADE DE CLIENTES: " + this.getClientes().size());


        if (numeroClienteSelecionado < 1 || numeroClienteSelecionado > this.getClientes().size()) {
            System.out.println("NUMERO DE CLIENTE INVALIDO");
            return null;
        }

        Cliente clienteSelecionado = this.getClientes().get(numeroClienteSelecionado - 1);
        System.out.println("CLIENTE SELECIONADO: " + clienteSelecionado.getNome());
        System.out.println("-------------------------------------------------------------------------------------");


        return clienteSelecionado;
    }

    protected List<ItemVenda> fazerVenda(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal = 0;
        List<ItemVenda> itemVendas = new ArrayList<>();

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.print("INFORME A QUANTIDADE DE ITENS PARA A COMPRA: ");
        int quantidadeItens = scanner.nextInt();

        for (int i = 0; i < quantidadeItens; i++) {
            System.out.print("INFORME O ID DO ITEM QUE DESEJA COMPRAR: ");
            int idItem = scanner.nextInt();

            Item itemSelecionado = null;
            for (Item item : this.getItens()) {
                if (item.getId() == idItem) {
                    itemSelecionado = item;
                    break;
                }
            }

            if (itemSelecionado != null) {
                if (this.getItens().contains(itemSelecionado)) {
                    
                    this.itens.remove(itemSelecionado);

                    System.out.print("INFORME A QUANTIDADE QUE DESEJA COMPRAR DO ITEM: ");
                    int quantidadeItensSelecionado = scanner.nextInt();

                    valorTotal += itemSelecionado.getValor() * quantidadeItensSelecionado;
                    itemVendas.add(new ItemVenda(i, itemSelecionado, quantidadeItensSelecionado));
                    
                    System.out.println("\n-------------------------------------------------------------------------------------");
                    System.out.println("PRODUTO ADICIONADO: " + itemSelecionado.getNomeItem());
                    System.out.println("-------------------------------------------------------------------------------------");


                } else {
                    System.out.println("\n-------------------------------------------------------------------------------------");
                    System.out.println("PRODUTO ESGOTADO");
                    System.out.println("-------------------------------------------------------------------------------------");


                }
            } else {
                System.out.println("\n-------------------------------------------------------------------------------------");
                System.out.println("ITEM NÃO ENCONTRADO: ID FOI INFORMADO INCORRETAMENTE");
                System.out.println("-------------------------------------------------------------------------------------");


            }
        }
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("VALOR DA COMPRA: R$ " + valorTotal);
        System.out.println("-------------------------------------------------------------------------------------");


        return itemVendas;
    }
}
