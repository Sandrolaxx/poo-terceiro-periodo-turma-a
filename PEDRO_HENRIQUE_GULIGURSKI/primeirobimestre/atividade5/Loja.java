package primeirobimestre.atividade5;

import primeirobimestre.atividade6.Endereco;

public class Loja {
    
    private String nomeFantasia;
    @SuppressWarnings("unused")
    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;
    Vendedor[] vendedores = new Vendedor[30];
    Cliente[] clientes = new Cliente[30];

    public Loja(String nomeFantasia, String razaoSocial, String cnpj,Endereco endereco, Vendedor[] vendedores, Cliente[] clientes) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.vendedores = vendedores;
        this.clientes = clientes;
        
    }

    public void apresentarse() {
        String msg = "Bem-vindo a "
                .concat(nomeFantasia + "\n")
                .concat("CNPJ: ")
                .concat(cnpj +".\n")
                .concat("Me localizo em ")
                .concat(endereco.apresentarLogradouro())
                .concat(".");
        System.out.println(msg);
    }

    public int contarClientes() {
        int contador = 0;
        for (Cliente cliente : clientes) {
            if (cliente != null) {
                contador++;
            }
        }
        System.out.println("Número de clientes: " + contador);
        return contador;
    }

    public int contarVendedores() {
        int contador = 0;
        for (Vendedor vendedor : vendedores) {
            if (vendedor != null) {
                contador++; 
            }
        }
        System.out.println("Número de clientes: " + contador);
        return contador;
    }

}
