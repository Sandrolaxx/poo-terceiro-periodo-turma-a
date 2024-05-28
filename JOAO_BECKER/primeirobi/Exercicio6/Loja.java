package primeirobi.Exercicio6;

public class Loja{
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    String [] vendedores = new String[20];
    String [] clientes = new String[20];
    Endereco endereco;
 
    public void contarClientes(){
        int contador=0;
        for(int i=0;i<clientes.length;i++){
            if(clientes[i]!=null){
                contador++;
            }
        }
        System.out.println("A loja possui "+contador+" clientes.");
    }
    public void contarVendedores(){
        int contador=0;
        for(int i=0;i<vendedores.length;i++){
            if(vendedores[i]!=null){
                contador++;
            }
        }
        System.out.println("A loja possui "+contador+" vendedores.");
    }

    public void apresentarse(){
        System.out.println("Loja "+nomeFantasia);
        endereco.apresentarLogradouro();
    }
}
