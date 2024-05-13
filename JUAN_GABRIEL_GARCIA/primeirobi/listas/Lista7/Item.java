package primeirobi.listas.Lista7;

import java.util.Scanner;

public class Item {
    
    Scanner scan = new Scanner(System.in);

    private String nome, id, tipo;

    private float valor, soma = 0, valorTotal = 0;

    Item[] itens = new Item[100];

    float[] pedido = new float[100];

    int escolha = 1, i = 0, qnt = 0;

    public Item(String nome, String id, String tipo, float valor) {
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public float[] getPedido() {
        return pedido;
    }

    public void setPedido(float[] pedido) {
        this.pedido = pedido;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    public Item() {
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item itens, int i) {
        this.itens[i] = itens;
    }

    public void gerarDescricao() {

        String msg =  nome + "\n id: " + id + "\n tipo: "
        + tipo + "\n valor: " + valor;
        System.out.println(msg);
    }

    public void cadastrarItem() {
        
        System.out.println("Digite o nome do produto:");
        nome = scan.next();
        // System.out.println("Digite o id do produto:");
        // id = scan.next();
        // System.out.println("Digite o tipo do produto:");
        // tipo = scan.next();
        System.out.println("Digite o valor do produto:");
        valor = scan.nextFloat();

        for (i = 0; i < itens.length; i++) {
            
            if (itens[i] == null) {
                itens[i] = new Item(nome, id, tipo, valor);
                break;
            }
        }
    }
    public void listarItens() {

        for (i = 0; i < itens.length; i++) {

            if (itens[i] == null) {
                break;
            } 
            System.out.println(i+1 + ". " + itens[i].getNome() + " - R$: " + itens[i].getValor());
        }
    }

    public void criarPedido() {
        int escolha = 1;
        valorTotal = 0;
        while (escolha != 0) {
            for (i = 0; i < itens.length; i++) {

                if (itens[i] != null) {
                    System.out.println((i + 1) + ". " + itens[i].getNome() + " - R$: " + itens[i].getValor());
                }
            }

            System.out.println("Selecione um item da lista, conforme sua numeração");
            int opcao = scan.nextInt();
            
            System.out.println("Qual a quantidade do item desejado:");
            int quantidade = scan.nextInt();
    
            valorTotal += itens[opcao - 1].getValor() * quantidade;
            // pedido[opcao - 1] += valorTotal;
    
            System.out.println("Deseja adicionar mais algum item ao seu pedido?\nDigite qualquer número - Sim\n0 - Não");
            escolha = scan.nextInt();

            if (escolha == 0) {
                System.out.println("Valor total do seu pedido - R$: " + valorTotal);
            }
        }
    }
}
