package primeirobi.ListasExc.Lista6Nova;

import java.util.ArrayList;

public class Vendedor {
    private String nome;
    private int idade;
    private Loja loja;
    private String cidade;
    private String bairro;
    private String rua;
    private double salarioBase;
    private ArrayList<Double> salarioRecebido = new ArrayList<>();

    public Vendedor(String nome, int idade, Loja loja, String cidade, String bairro, String rua, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salarioRecebido.add(2000.0);
        this.salarioRecebido.add(2100.0);
        this.salarioRecebido.add(2200.0);
    }

    public String getNome() {
        return nome;
    }

    public void apresentarse() {
        System.out.println("/:===Informações dos vendedores===:/");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println("Salário Base: R$" + salarioBase);
        System.out.println("Loja: " + loja.getnomeLoja());
        System.out.println(" ");
    }
}
