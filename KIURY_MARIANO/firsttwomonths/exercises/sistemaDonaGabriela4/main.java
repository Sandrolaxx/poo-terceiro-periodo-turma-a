package sistemaDonaGabriela4;

import java.util.ArrayList;

public class main {
    
    public static void main(String[] args) {

        // Cadastrando cliente 1 e apresentando.
        classCliente cliente1 = new classCliente();
        
        cliente1.nome = "Mariano";
        cliente1.idade = 21;
        cliente1.bairro = "Centro";
        cliente1.rua = "Sete Setembro";
        cliente1.cidade = "Cascavel";
        cliente1.apresentarse();
        
        // Cadastrando cliente 2 e apresentando.
        classCliente cliente2 = new classCliente();
        
        cliente2.nome = "Aleatório";
        cliente2.idade = 25;
        cliente2.bairro = "Centro";
        cliente2.rua = "Algodão";
        cliente2.cidade = "Cascavel";
        cliente2.apresentarse();
    
        System.out.println();

        // Cadastrando loja 1 e apresentando.
        classLoja loja1 = new classLoja();

        loja1.nomeFantasia = "Primeira Loja";
        loja1.razaoSocial = "Primeira loja LTDA";
        loja1.cnpj = 121209129;
        loja1.cidade = "Cascavel";
        loja1.bairro = "Centro";
        loja1.rua = "Fagundes";
        loja1.apresentarse();

        System.out.println();

        // Cadastrando vendedores da loja1 e apresentando.
        loja1.vendedores.add("Pedro");
        loja1.vendedores.add("João");
        loja1.vendedores.add("Fernando");
        loja1.contarVendedores();

        System.out.println();

        // Cadastrando clientes da loja1 e apresentando.
        loja1.clientes.add("Maria");
        loja1.clientes.add("Fernanda");
        loja1.clientes.add("Jurema");
        loja1.contarClientes();
        
        System.out.println();

        // Cadastrando vendedor e relacionando a loja1.
        classVendedor vendedor1 = new classVendedor();
        vendedor1.nome = "José";
        vendedor1.idade = 35;
        vendedor1.Loja = loja1;
        vendedor1.cidade = "Cascavel";
        vendedor1.bairro = "Centro";
        vendedor1.rua = "Leopoldo";
        vendedor1.salarioBase = 1500;

        vendedor1.salarioRecebido.add(2000.0f);
        vendedor1.salarioRecebido.add(2500.0f);
        vendedor1.salarioRecebido.add(3000.0f);

        // Apresentando todas as informações do vendedor.
        vendedor1.apresentarse();
        vendedor1.calcularBonus();
        vendedor1.calcularMedia();

    }    
}