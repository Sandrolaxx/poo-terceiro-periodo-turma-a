package MyyPlant;

public class Main {
    public static void main(String[] args) {
        Loja myyPlant = new Loja("Myy Plant", "Myy Plant LTDA", "00.000.000/0001-00", "Cidade Centro", "Bairro Central", "Rua das Flores 100");
        myyPlant.adicionarVendedor(new Vendedor("João", 30, "Myy Plant", "Cidade Centro", "Bairro Central", "Rua 2", 2000, new double[]{2000, 2200, 2100}));
        myyPlant.adicionarCliente(new Cliente("Maria", 25, "Cidade Centro", "Bairro Central", "Rua 3"));

        myyPlant.apresentarse();
        myyPlant.contarVendedores();
        myyPlant.contarClientes();
    }
}
