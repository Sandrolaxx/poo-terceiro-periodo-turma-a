package Testes.Lista5;

import java.util.ArrayList;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private int cnpj;
 

    public Loja(String nomeFantasia, int cnpj, String razaoSocial) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public void apresentarSe() {
        System.out.println("Nome: " + nomeFantasia + "\nCNPJ: " + cnpj);
    }

    private ArrayList<Integer> vendedores = new ArrayList<Integer>();
    private ArrayList<Integer> clientes = new ArrayList<Integer>();

    public void adicionarCliente() {
        clientes.add(1);  // Adiciona um cliente, representado pelo número 1
    }

    public void adicionarVendedor() {
        vendedores.add(1);  // Adiciona um vendedor, representado pelo número 1
    }


    public void contarClientes() {
        int somaClientes = 0;
        for (int cliente : clientes) {
            somaClientes += cliente;
        }
        System.out.println("A quantidade de clientes: " + somaClientes);
    }

    public void contarVendedores() {
        int somaVendedores = 0;
        for (int vendedor : vendedores) {
            somaVendedores += vendedor;
        }
        System.out.println("A quantidade de vendedores: " + somaVendedores);
    }
}