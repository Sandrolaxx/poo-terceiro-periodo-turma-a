package MyyPlant;



public class Main {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Myy Plant", "Myy Plant Ltda", "12345678901234", "Minha Cidade", "Meu Bairro", "Minha Rua");

        Vendedor vendedor1 = new Vendedor("João", 30, "Myy Plant", "Minha Cidade", "Meu Bairro", "Rua dos Vendedores", 2000);
        Vendedor vendedor2 = new Vendedor("Maria", 25, "Myy Plant", "Minha Cidade", "Meu Bairro", "Rua dos Vendedores", 1800);

        minhaLoja.getVendedores().add(vendedor1);
        minhaLoja.getVendedores().add(vendedor2);

        Cliente cliente1 = new Cliente("Carlos", 40, "Minha Cidade", "Meu Bairro", "Rua do Cliente");
        Cliente cliente2 = new Cliente("Ana", 35, "Minha Cidade", "Meu Bairro", "Rua do Cliente");

        minhaLoja.getClientes().add(cliente1);
        minhaLoja.getClientes().add(cliente2);

        System.out.println("Informações da Loja:");
        minhaLoja.apresentarSe();

        System.out.println("\nQuantidade de Vendedores: " + minhaLoja.contarVendedores());
        System.out.println("Quantidade de Clientes: " + minhaLoja.contarClientes());

        System.out.println("\nInformações dos Vendedores:");
        for (Vendedor vendedor : minhaLoja.getVendedores()) {
            vendedor.apresentarSe();
            System.out.println("Média dos Salários Recebidos: " + vendedor.calcularMedia());
            System.out.println("Bônus do Vendedor: " + vendedor.calcularBonus());
            System.out.println();
        }

        System.out.println("\nInformações dos Clientes:");
        for (Cliente cliente : minhaLoja.getClientes()) {
            cliente.apresentarSe();
            System.out.println();
        }
    }
}
