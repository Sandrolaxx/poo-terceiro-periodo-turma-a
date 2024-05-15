package primeirobi.exexcicio5;

public class Teste {
    public static void main(String[] args) {
        /*Cliente */
        Cliente clienteUm = new Cliente();

        clienteUm.idade = 18;
        clienteUm.nome = "Claudio";
        clienteUm.apresentarSe();

        /*LOJA*/
        Loja lojaUm = new Loja();

        lojaUm.nomeFantasia="C7A";
        lojaUm.rua="185";
        lojaUm.bairro="FAG";
        lojaUm.cidade="Cascavel";
        lojaUm.cnpj="574.369.123/5896-12";
        lojaUm.clientes[2]="Mauro";
        lojaUm.clientes[9]="Luiz";
        lojaUm.vendedores[4]="Lucas";
        lojaUm.contarClientes();
        lojaUm.contarVendedores();

        /*Vendedor*/
        Vendedor vendedorUm = new Vendedor();
        
        vendedorUm.nome="Augusto";
        vendedorUm.loja="C&A";
        vendedorUm.idade=26;
        vendedorUm.salarioBase=1500.00;
        vendedorUm.salarioRecebido[0]=1100.00;
        vendedorUm.salarioRecebido[1]=1300.00;
        vendedorUm.salarioRecebido[2]=1500.00;
        vendedorUm.calcularBonus();
        vendedorUm.calcularMedia();
        vendedorUm.apresentarSe();
    }
}
