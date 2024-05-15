package primeirobi.exexcicio5;

public class Loja {
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String cidade;
    String bairro;
    String rua;
    String [] vendedores = new String[5];
    String [] clientes = new String[10];

    public void contarClientes() {
        int contador=0;
        for (int i=0; i<clientes.length; i++){
            if (clientes [i] != null){
                contador++;
            }
        }
     System.out.println("A loja possui "+contador+" clientes");   
    }
    public void contarVendedores() {
        int contador=0;
        for (int i=0; i<vendedores.length; i++){
            if (vendedores [i] != null){
                contador++;
            }
        }
     System.out.println("A loja possui "+contador+" clientes");   
    }
}