package primeirobi.listas.Lista6;

public class Loja extends Endereco{
    

    String nomeFantasia;

    String razaoSocial;

    String CPNJ;

    String[] vetorVendedores = new String[100];

    String[] vetorClientes = new String[100];

    int i = 0;

    int contadorClientes = 0;
    int contadorVendedores = 0;
    public void apresentarse() {

        String msg = "\nEndereço da loja: " + nomeFantasia + " - CNPJ: " + CPNJ;

        System.out.println(msg);
        apresentarLogradouro();  
    }

    public void contarClientes() {

        while (i < vetorClientes.length) {
            
            if (vetorClientes[i] == null) {
                break;
            }
            contadorClientes++;
            i++;

        }
        System.out.println("A quantidade de clientes que a empresa possui é: " + contadorClientes);
    }

    public void contarVendedores() {
        int i = 0;
        while (i < vetorVendedores.length) {
            
            if (vetorVendedores[i] == null) {
                break;
            }
            contadorVendedores++;
            i++;

        }
        System.out.println("A quantidade de vendedores que a empresa possui é: " + contadorVendedores + "\n");
    }
}

/* 
Crie uma classe Loja com:
Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes. ##
contarClientes, mosta a quantidade de clientes ##
contarVendedores, mosta a quantidade de vendedores. ##
Método apresentarse, printa nomeFantasia, cnpj e endereco. ##
*/