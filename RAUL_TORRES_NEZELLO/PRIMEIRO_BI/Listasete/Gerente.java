package PRIMEIRO_BI.Listasete;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Pessoa{
    private String loja;
    private double salarioBase;
    private List<Double> salariosRecebidos;

    public Gerente(String nome, int idade, String loja, Endereco endereco, int salarioBase) {
        super(nome, idade, endereco);
        this.loja = loja;
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
        System.out.println("Bonus: " + salarioBase * 0.35);
    }

    public void apresentarSe() {
        System.out.println("Olá, meu nome é " + getNome() + ", tenho " + getIdade()+ " anos e trabalho na loja " + loja);
        System.out.println("Endereço");
        getEndereco().apresentarLogradouro();
    }
}
