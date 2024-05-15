package primbi.Lista5;

public class testeclasse {

    public static void main(String[] args) {

        vendedor vendedorUm = new vendedor("PR", "Cascavel", "Centro", 180, "Meio da quadra", "Garrosh", 35, 
        "Trabuco", 150);
       
        
        vendedorUm.apresentarse();
        vendedorUm.calcularBonus();
        vendedorUm.calcularMedia();
        vendedorUm.apresentarLogradouro();

        cliente clienteUm = new cliente("PR", "Cascavel", "Centro", 120, "Esquina");

        clienteUm.nome = "Carla";
        clienteUm.idade = 54;
        clienteUm.apresentarseCliente();
        clienteUm.apresentarLogradouro();

        loja lojaUm = new loja("PR", "Cascavel", "Centro", 22, "Meio da quadra");

        lojaUm.nome = "TrabucoStore";
        lojaUm.razaosocial = "Compania de Trabucos S.A";
        lojaUm.cnpj = "50.316.130/0001-06";
        lojaUm.rua = "Av. Brasil";



        lojaUm.apresentarSe();
        lojaUm.contarVendedores();
        lojaUm.contarClientes();

        
    }
    
}
