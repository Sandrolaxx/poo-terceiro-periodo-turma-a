package primeirobim.listas;

public class Loja {

    String nomeFantasia; 

    String razaoSocial;

    String cnpj; 

    String cidade;

    String bairro;

    String rua; 

    Vendedor [] vendedores = new Vendedor[10];
    
    Cliente [] clientes = new Cliente[10]; 

    int contarClientes = 0; 

    int contarVendedores = 0; 

    public void apresentarse() {

        String msg = "Nome da loja: " + nomeFantasia + "\n" + "CNPJ: " + cnpj + "\n" + "Endereço: " + cidade + "Bairro " + bairro + "Rua "+ rua + "\n";

        System.out.println(msg);
}

    public void addCliente(Cliente cliente) {
        if (contarClientes < clientes.length) {
            clientes[contarClientes] = cliente;
            contarClientes++;
        }
    }


        public void addVendedor(Vendedor vendedor) {
            if (contarVendedores < vendedores.length) {
                vendedores[contarVendedores] = vendedor;
                contarVendedores++;
            }
        }

        public int contarClientes() {
            return contarClientes;
        }
        public int contarVendedores() {
            return contarVendedores;
        }
    }

