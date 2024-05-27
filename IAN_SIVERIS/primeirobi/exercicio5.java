package primeirobi;

import java.lang.reflect.Array;

public class exercicio5 {
    
    
    class Vendedor {
        String nome;
        Integer idade;
        String loja;
        String cidade;
        String bairro;
        String rua;
        Double salarioBase;
        Double salarioRecebido;

    
        public Vendedor(String nome, Integer idade, String loja, String cidade, String bairro, String rua, Double salarioBase, Double salarioRecebido) {
            this.nome = nome;
            this.idade = idade;
            this.loja = loja;
            this.cidade = cidade;
            this.bairro = bairro;
            this.rua = rua;
            this.salarioBase = salarioBase;
            this.salarioRecebido = salarioRecebido;
        }


        public void apresentarSe() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Loja: " + loja);
        }

        
        public Double calcularBonus() {
            return salarioBase * 0.2;
        }

    }
    

    class Cliente {
        String nome;
        Integer idade;
        String rua;
        String cidade;
        String bairro;


        public Cliente(String nome, Integer idade, String cidade, String bairro, String rua) {
            this.nome = nome;
            this.idade = idade;
            this.rua = rua;
            this.bairro = bairro;
            this.cidade = cidade;
        }
    
        
        public void apresentarSe() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }
    

    class Loja {
        String nomeFantasia;
        String razaoSocial;
        String cidade;
        String bairro;
        String rua;
        Array vendedores;
        Array clientes;
        String cnpj;
        String endereco;

    
        public Loja(String nomeFantasia, String cnpj, String endereco, String bairro, String cidade, String razaoSocial, String rua, Array vendedores, Array clientes) {
            this.nomeFantasia = nomeFantasia;
            this.razaoSocial = razaoSocial;
            this.cidade = cidade;
            this.bairro = bairro;
            this.rua = rua;
            this.vendedores = vendedores;
            this.clientes = clientes;
            this.cnpj = cnpj;
            this.endereco = endereco;
            
        }
    
        
        public void apresentarSe() {
            System.out.println("Nome Fantasia: " + nomeFantasia);
            System.out.println("CNPJ: " + cnpj);
            System.out.println("Endereço: " + endereco);
        }    

    }

}