package atividades1B;

import java.util.ArrayList;
import java.util.List;

public class Loja {
     String nomeFantasia;
    String razaoSocial;
     String cnpj;
     String cidade;
     String bairro;
     String rua;
     List<Vendedor> vendedores = new ArrayList<>();

    public Loja(String nomeFantasia, String razaoSocial, String cnpj, String cidade, String bairro, String rua) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public void apresentarSe() {
        System.out.println("Nome fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + rua + ", " + bairro + ", " + cidade);
    }

    public int contarVendedores() {
        return vendedores.size();
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
}
