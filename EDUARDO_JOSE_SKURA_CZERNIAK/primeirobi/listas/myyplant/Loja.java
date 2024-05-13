package primeirobi.listas.myyplant;

public class Loja {
    
    String nomeFantasia;
    String razaoSocial;
    Long cnpj;
    String cidade;
    String bairro;
    String rua;
    
    Integer quantidadeClientesInt;
    Integer quantidadeVendedoresInt;

    public void contarClientes( ){
        System.out.println("A quantidade de clientes da empresa " + nomeFantasia + " é de " + quantidadeClientesInt);
    }

    public void contarVendedores( ){
        System.out.println("A quantidade de vendedores da empresa " + nomeFantasia + " é de " + quantidadeVendedoresInt);
    } 

    public void apresentarLoja( ){
        System.out.println("O nome da empresa é " + nomeFantasia + ", do cnpj " + cnpj + ", da cidade ");
        System.out.print(cidade + ", do bairro " + bairro + " e rua " + rua);
    } 

}
