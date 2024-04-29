package primeirobi.atividades.lista6;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Gerente primeiroGerente = new Gerente("Alberto", "Cascavel", "Neva", "Asfaltada", "Myy Plant", 45, 5000, new double[]{1550, 1500, 2000});
            primeiroGerente.apresentarSe();
            primeiroGerente.calcularMedia();
            primeiroGerente.calcularBonus();

            
        System.out.println("\n--------------------------------\n");


        Endereco primeiroEndereco = new Endereco("Paraná", "Cascavel", "Neva", "Curitiba", 132, "apto. 123");
            primeiroEndereco.apresentarLogadouro();
        

        System.out.println("\n--------------------------------\n");


        Item primeiroItem = new Item(215, "Banana", "Fruta", 2.50);
            primeiroItem.gerarDescricao();


        System.out.println("\n--------------------------------\n");


        Cliente primeiroCliente = new Cliente ("João", "Tupãssi", "Jardim São Paulo", "Primeiro de Janeiro", 19);
            primeiroCliente.apresentarSe();


        System.out.println("\n--------------------------------\n");


        Vendedor primeiroVendedor = new Vendedor ("Alberto", "Myy Plant", "Cascavel", "Centro", "São Paulo", 3000, 40, new double[]{4000, 4500, 3000});
            primeiroVendedor.apresentarSe();
            primeiroVendedor.calcularBonus();
            primeiroVendedor.calcularMedia();

        
        System.out.println("\n--------------------------------\n");



        Loja primeiraLoja = new Loja("Myy Plant", "Myy Plant INC", "Cascavel", "Parque São Paulo", "Curitiba", new String[]{"João", "Alberto", "Rafael"}, new String[]{"Flávio", "Roberto", "Pedro"}, 47553909000130L);
        
            primeiraLoja.apresentarSe();
            primeiraLoja.contarClientes();
            primeiraLoja.contarVendedores();


        System.out.println("\n--------------------------------\n");


        Item[] itensPedido = {new Item(520, "Pé de Jaca", "Planta", 800), new Item(310, "Pé de Manga", "Planta", 300), new Item(240, "Pé de Couve", "Planta", 20)};

        Cliente cliente = new Cliente("João", "Tupãssi", "Jardim São Paulo", "Primeiro de Janeiro", 19);

        Vendedor vendedor = new Vendedor("Alberto", "Myy Plant", "Cascavel", "Centro", "São Paulo", 3000, 40, new double[]{4000, 4500, 3000});

        Loja loja = new Loja("Myy Plant", "Myy Plant INC", "Cascavel", "Parque São Paulo", "Curitiba", new String[]{"João", "Alberto", "Rafael"}, new String[]{"Flávio", "Roberto", "Pedro"}, 47553909000130L);

        Pedido primeiroPedido = new Pedido(520, new Date(), new Date(), cliente, vendedor, loja, itensPedido);

        ProcessaPedido processador = new ProcessaPedido();
        processador.processar(primeiroPedido);

        System.out.println(primeiroPedido.gerarDescricaoVenda());

   }
}