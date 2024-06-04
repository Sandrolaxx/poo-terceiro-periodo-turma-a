package primeirobi.atividades.lista7;

public class Loja {
    
    String nomeFantasia, razaoSocial, cidade, bairro, rua;
    String[] vendedores;
    String[] clientes;
    long cnpj;

    public Loja(String nomeFantasia, String razaoSocial, String cidade, String bairro, String rua, String[] clientes, String[] vendedores, long cnpj){
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.clientes = clientes;
        this.vendedores = vendedores;
        this.cnpj = cnpj;
    }


    void apresentarSe(){
        System.out.println("Nome fantasia: " + this.nomeFantasia + "\nCNPJ: " + this.cnpj +  "\nEndereço: Rua " + this.rua + ", " + this.bairro + " - " + this.cidade);
    }

    public int contarClientes() {
        int contadorClientes = 0;
        for (int i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i] != null) {
                contadorClientes++;
            }
        }
        System.out.println("Quantidade de clientes: " + contadorClientes);
        return contadorClientes;
    }
    

    public void contarVendedores(){
        int contadorVendedores = 0;
        for (int i = 0; i < this.clientes.length; i++) {
            if (this.clientes[i] != null) {
                contadorVendedores++;
            }
        }
        System.out.println("Quantidade de vendedores: " + contadorVendedores);
    }

}
