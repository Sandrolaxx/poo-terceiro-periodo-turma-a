package primeirobi.atividades.lista5;

public class Main {
    public static void main(String[] args) {
        
        Vendedor primeiroVendedor = new Vendedor("Roberto", "Myy Plant", "Cascavel", "Neva", "Salgado Filho", 1500, 28, new double[]{1550, 1500, 2000});
            primeiroVendedor.apresentarSe();
            primeiroVendedor.calcularBonus();
            primeiroVendedor.calcularMedia();

        System.out.println("\n");

        Vendedor segundoVendedor = new Vendedor ("Alberto", "Myy Plant", "Cascavel", "Centro", "São Paulo", 3000, 40, new double[]{4000, 4500, 3000});
            segundoVendedor.apresentarSe();
            segundoVendedor.calcularBonus();
            segundoVendedor.calcularMedia();


        System.out.println("\n--------------------------------\n");


        Cliente primeiroCliente = new Cliente ("João", "Tupãssi", "Jardim São Paulo", "Primeiro de Janeiro", 19);
            primeiroCliente.apresentarSe();

        System.out.println("\n");

        Cliente segundoCliente = new Cliente ("Felipe", "Cascavel", "Pacaembu", "Olindo Periolo", 20);
            segundoCliente.apresentarSe();
        

        System.out.println("\n--------------------------------\n");


        Loja primeiraLoja = new Loja("Myy Plant", "Myy Plant INC", "Cascavel", "Parque São Paulo", "Curitiba", new String[]{"João", "Alberto", "Rafael"}, new String[]{"Flávio", "Roberto", "Pedro"}, 47553909000130L);
        
            primeiraLoja.apresentarSe();
            primeiraLoja.contarClientes();
            primeiraLoja.contarVendedores();
    }
}
