package primeirobi.Exercicio5;

public class Teste {
    public static void main(String[] args) {
        //TESTE LOJA
        Loja lojaUm = new Loja();

        lojaUm.nomeFantasia="roupa e cia";
        lojaUm.rua="1";
        lojaUm.bairro="centro";
        lojaUm.cidade="cascavel";
        lojaUm.cnpj="548.762.565/6666-60";
        lojaUm.apresentarse();
        lojaUm.clientes[2]="jose";
        lojaUm.clientes[9]="Carlos";
        lojaUm.vendedores[15]="marcos";
        lojaUm.contarClientes();
        lojaUm.contarVendedores();

        //TESTE CLIENTE

        Cliente clienteUM = new Cliente();

        clienteUM.idade=25;
        clienteUM.nome="Marcelo";
        clienteUM.apresentarse();

        //TESTE VENDEDOR
        
        Vendedor vendedorUm = new Vendedor();

        vendedorUm.nome="Roberto";
        vendedorUm.loja="roupa & CIA";
        vendedorUm.idade=35;
        vendedorUm.salarioBase=1000.00;
        vendedorUm.salarioRecebido[0]=1000.00;
        vendedorUm.salarioRecebido[1]=1200.00;
        vendedorUm.salarioRecebido[2]=1100.00;
        double bonus=vendedorUm.calcularBonus();
        double media=vendedorUm.calcularMedia();
        System.out.println("O bonus de salário é R$"+bonus+", e a media dos salarios é R$"+media);
        vendedorUm.apresentarse();


    }
    
}
