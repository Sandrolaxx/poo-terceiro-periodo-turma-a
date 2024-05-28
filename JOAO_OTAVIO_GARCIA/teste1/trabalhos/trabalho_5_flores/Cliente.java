package trabalho_5_flores;

public class Cliente {

    //Atributos
   private int Age;
   private String Name, City, Street, Neighborhood;
    
    // Crianção
    public Cliente(int Age, String Name, String City,
    String Neighborhood, String Street) {

        this.Age=Age;
        this.Name=Name;
        this.City=City;
        this.Neighborhood=Neighborhood;
        this.Street=Street;
        
    }
    //apresentar função
    void apresentarSe(){
        
        System.out.println("Nome: "+Name+"\nIdade: "+Age+"\nCidade: "+City+"\n \n");
    }
}
