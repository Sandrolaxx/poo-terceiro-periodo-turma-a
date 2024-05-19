// 3. Crie uma classe Loja com:
// Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes.
// contarClientes, mosta a quantidade de clientes
// contarVendedores, mosta a quantidade de vendedores.
// Método apresentarse, printa nomeFantasia, cnpj e endereco.


package sistemaDonaGabriela4;

import java.util.ArrayList;

public class classLoja {

    String nomeFantasia;
    String razaoSocial;
    float cnpj;
    String cidade;
    String bairro;
    String rua;
    ArrayList<String> clientes = new ArrayList<>();
    ArrayList<String> vendedores = new ArrayList<>();

    void contarClientes(){
        System.out.println("Total clientes: " +clientes.size());
        System.out.println(clientes);
    
    }

    void contarVendedores(){
        System.out.println("Total vendedores: " +vendedores.size());
        System.out.println(vendedores);
    }

    void apresentarse(){
        System.out.println("Nome fantasia: " +nomeFantasia+ ", CNPJ " +cnpj+ ", endereço: " +rua + bairro + cidade);
    }
}
