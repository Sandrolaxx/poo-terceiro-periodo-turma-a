package primeirobi.lists.Lista7;

public class Loja extends Endereco {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String[] vendedores = new String[100];
    private String[] clientes = new String[100];

    public Loja(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(String[] vendedores) {
        this.vendedores = vendedores;
    }

    public String[] getClientes() {
        return clientes;
    }

    public void setClientes(String[] clientes) {
        this.clientes = clientes;
    }

    public void contarClientes() {
        int x = 0;
        int quantidadeClientes = 0;
        while (x < clientes.length) {
            if (clientes[x] == null) {
                break;
            }
            quantidadeClientes++;
            x++;
        }
        System.out.println("Quantidade de clientes da loja: " + quantidadeClientes);
    }

    public void contarVendedores() {
        int x = 0;
        int quantidadeVendedores = 0;
        while (x < vendedores.length) {
            if (vendedores[x] == null) {
                break;
            }
            quantidadeVendedores++;
            x++;
        }
        System.out.println("Quantidade de vendedores da loja: " + quantidadeVendedores);
    }

    public void apresentarSe() {
        System.out.println("Nome fantasia: " + nomeFantasia);
        System.out.println("Cnpj: " + cnpj);
        System.out.println("Rua " + getRua() + ", bairro: " + getBairro() + ", " + getCidade());
    }
}