package PRIMEIRO_BI.PRIMEIRO_BI;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nome;
    private int idade;
    private String loja;
    private String cidade;
    private String bairro;
    private String rua;
    private int salarioBase;
    private List<Double> salariosRecebidos;

    public Vendedor(String nome, int idade, String loja, String cidade, String bairro, String rua, int salarioBase, int i) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.salarioBase = salarioBase;
        this.salariosRecebidos = new ArrayList<>();
    }

    public void adicionarSalario(double salario) {
        salariosRecebidos.add(salario);
    }

    public void calcularMedia() {
        double somaSalarios = 0;
        int quantidadeSalarios = salariosRecebidos.size();
        
        for (int quantSalario = 0; quantSalario < quantidadeSalarios; quantSalario++) {
            double salario = salariosRecebidos.get(quantSalario);
            somaSalarios += salario;
        }
        
        double media;
        if (quantidadeSalarios != 0) {
            media = somaSalarios / quantidadeSalarios;
        } else {
            media = 0;
        }
        
        System.out.println("Média: " + media);
    }
    public void calcularBonus() {
        System.out.println("Bonus: " + salarioBase * 0.2);
    }

    public void apresentarSe() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e trabalho na loja " + loja);
    }
}