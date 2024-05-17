package primeirobi.testes.tentativaListaSete;

import java.util.Scanner;

public class Item {
    
    Scanner scan = new Scanner(System.in);

    private String nome;

    private float valor;

    private int i, valorTotal;

    private Item[] itens = new Item[100];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    public Item(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Item() {

    }

    public void cadastrarItem() {

        System.out.println("Digite o nome do item:");
        nome = scan.next();
        System.out.println("Digite o valor do item:");
        valor = scan.nextInt();

        for (int i = 0; i < itens.length; i++) {
            
            if (itens[i] == null) {
                itens[i] = new Item(nome, valor);
                break;
            }
        }
    }

    public void listarItem() {

        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                break;
            }
            System.out.println(i+1 + itens[i].getNome() + "- R$: " + itens[i].getValor());
        }
    }
}
