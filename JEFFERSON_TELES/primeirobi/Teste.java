package primeirobi;

public class Teste {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("jeff", 18, "Loja 1", "Cidade 1", "Bairro 1", "Rua 1", 2000);
        Cliente cliente1 = new Cliente("altair", 48, "Cidade 2", "Bairro 2", "Rua 2");
        Loja loja1 = new Loja("Loja Myy plant", "Myy plant LTDA", "123456789", "Cidade 3", "Bairro 3", "Rua 3");

        vendedor1.apresentarse();
        System.out.println("Média de salários recebidos: " + vendedor1.calcularMedia());
        System.out.println("Bônus do vendedor: " + vendedor1.calcularBonus());

        cliente1.apresentarse();

        loja1.contarClientes();
        loja1.contarVendedores();
        loja1.apresentarse();
    }
}

