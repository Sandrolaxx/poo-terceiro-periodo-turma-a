package primeirobi.lists.Lista6;

public class Loja extends Endereco {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String[] vendedores = new String[100];
    String[] clientes = new String[1000];

    public Loja(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
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
        System.out.println("A loja tem " + quantidadeClientes + " clientes");
    }

    public void contarVendedores() {
        int x = 0;
        int quantidadeVendedores = 0;
        while (x < vendedores.length) {
            if (vendedores[x] == null) {
                break;
            }
            quantidadeVendedores++;
        }
        System.out.println("A loja tem " + quantidadeVendedores + " vendedores");
    }

    public void apresentarSe() {
        System.out.println("Nome fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Rua " + rua + ", bairro: " + bairro + ", " + cidade);
    }
}