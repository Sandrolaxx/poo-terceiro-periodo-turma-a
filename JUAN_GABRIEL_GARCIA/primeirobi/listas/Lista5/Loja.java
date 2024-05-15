package primeirobi.listas.Lista5;

public class Loja {
    

    String nomeFantasia;

    String razaoSocial;

    String CPNJ;

    String cidade;

    String bairro;

    String rua;

    String[] vetorVendedores = new String[100];

    String[] vetorClientes = new String[100];

    int i = 0;

    int contadorClientes = 0;
    int contadorVendedores = 0;
    public void apresentarse() {

        String msg = "A loja "
                .concat(nomeFantasia)
                .concat(", CPNJ = ")
                .concat(CPNJ)
                .concat(" se localiza em ")
                .concat(cidade)
                .concat(" no bairro ")
                .concat(bairro)
                .concat(", na rua ")
                .concat(rua);

        System.out.println(msg + "\n");
    }

    public void contarClientes() {

        while (i < vetorClientes.length) {
            
            if (vetorClientes[i] == null) {
                break;
            }
            contadorClientes++;
            i++;

        }
        System.out.println("A quantidade de clientes que a empresa possui é:" + contadorClientes + "\n");
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