package primeirobi.listas.myyplant;

public class MyyPlant {
    public static void main(String[] args) {

        Vendedor vendedorUm = new Vendedor();
        Vendedor vendedorDois = new Vendedor();

        vendedorUm.nome = "Paola";
        vendedorUm.idade = 33;
        vendedorUm.cidade = "Suntown";
        vendedorUm.bairro = "Lalaland";
        vendedorUm.rua = "Saint";

        vendedorDois.nome = "Alec";
        vendedorDois.idade = 40;
        vendedorDois.cidade = "Mountaine";
        vendedorDois.bairro = "Rivertown";
        vendedorDois.rua = "Pier";

        String[] quantidadeVendedores = new String[2];
        quantidadeVendedores[0] = vendedorUm.nome;
        quantidadeVendedores[1] = vendedorDois.nome;

        vendedorUm.calcularMedia();
        vendedorUm.calcularBonus();


        Cliente clienteUm = new Cliente();
        Cliente clienteDois = new Cliente();

        clienteUm.nome = "Charles";
        clienteUm.idade = 22;
        clienteUm.cidade = "Copacabana";
        clienteUm.bairro = "Tropicale";
        clienteUm.rua = "Josué";

        clienteDois.nome = "Jennie";
        clienteDois.idade = 24;
        clienteDois.cidade = "Southent";
        clienteDois.bairro = "Hennit";
        clienteDois.rua = "LLamour";

        String[] quantidadeClientes = new String[2];
        quantidadeClientes[0] =  clienteUm.nome;
        quantidadeClientes[1] = clienteDois.nome;

        clienteUm.apresentarCliente();
        clienteDois.apresentarCliente();

        Loja lojaUm = new Loja();

        lojaUm.nomeFantasia = "MyyPlant";
        lojaUm.razaoSocial = "Estabelecimentos de Venda de Plantas Exóticas Gabriela";
        lojaUm.cnpj = 777777777777l;
        lojaUm.cidade = "Java Ville";
        lojaUm.bairro = "Coffeel";
        lojaUm.rua = "Bean1";

        lojaUm.quantidadeClientesInt = 2;
        lojaUm.quantidadeVendedoresInt = 2;


        lojaUm.apresentarLoja();
        lojaUm.contarClientes();
        lojaUm.contarVendedores();



        
    }
}
