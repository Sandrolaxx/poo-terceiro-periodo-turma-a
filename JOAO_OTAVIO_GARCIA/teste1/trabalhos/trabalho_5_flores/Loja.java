package trabalho_5_flores;

public class Loja {

    //Atributos
    String Name_Fant, Name, Street, Neighborhood,City,CNPJ; 
    Vendendor[] Vendedores;
    Cliente[] Clientes;

    //montando o negocio
    public Loja(String Name_Fant,String Name,String Street, String Neighborhood, String CNPJ, String City) {

        this.CNPJ=CNPJ;
        this.City=City;
        this.Name=Name;
        this.Name_Fant=Name_Fant;
        this.Neighborhood=Neighborhood;
        this.Street=Street;
        
        
    }
    //função de apresentar
    void apresentarSe(){
        
        System.out.println("Nome Fantasia: "+Name_Fant+"\nCNPJ: "+CNPJ+"\nCidade: "+City+"\nBairro: "+Neighborhood+"\nRua:"+Street+"\nQuantidade de vendedores: "+contarVendedores()+"\nQuantidade de Clientes: "+contarClientes());
    }
    int contarVendedores(){
        return this.Vendedores.length;
    }
    int contarClientes(){
        return this.Clientes.length;
    }
    
}
    

