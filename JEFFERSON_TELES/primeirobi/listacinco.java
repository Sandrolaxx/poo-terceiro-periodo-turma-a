package primeirobi;

public class listacinco {
    public static void main(String[] args) {
           
        Vendedor vendedor1 = new Vendedor("Jeff", 18, "Loja 1", "Cidade 1", "Bairro 1", "Rua 1", 2000);
        
         
        vendedor1.adicionarSalarioRecebido(1700.0);
        vendedor1.adicionarSalarioRecebido(1800.0);

         
        vendedor1.apresentarse();
        System.out.println("Média de salários recebidos: " + vendedor1.calcularMedia());
        System.out.println("Bônus do vendedor: " + vendedor1.calcularBonus());

        Cliente cliente1 = new Cliente("altair", 48, "Cidade 2", "Bairro 2", "Rua 2");
        Loja loja1 = new Loja("Loja Myy plant", "Myy plant LTDA", "111111111", "Cidade 3", "Bairro 3", "Rua 3");

        cliente1.apresentarse();

        loja1.contarClientes();
        loja1.contarVendedores();
        loja1.apresentarse();
    }
}
