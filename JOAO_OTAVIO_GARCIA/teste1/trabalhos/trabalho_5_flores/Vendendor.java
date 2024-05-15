package trabalho_5_flores;

public class Vendendor {

    String Name,City , Street, Neighborhood,Loja;
    int Age;
    Float Salario_bas,Bonus,Media,Salario_rec;
    Float Hist_Pag[]; 
    

    public Vendendor(String Name, int Age, String City,
    String Neighborhood, String Street, Float Salario_bas, String Loja,float Salario_rec,Float Hist_Pag[]) {

        this.Age=Age;
        this.City=City;
        this.Loja=Loja;
        this.Name=Name;
        this.Neighborhood=Neighborhood;
        this.Salario_bas=Salario_bas;
        this.Salario_rec= Salario_bas*0.2f;
        this.Street=Street;
        this.Hist_Pag=Hist_Pag;
    }

    void apresentarSe(){

        System.out.println("Nome: "+Name+"\nIdade: "+Age+"\nLoja:"+Loja+"\nSalario: "+Salario_bas+"\nBonus salarial: "+calcularBonus()+"\nSalario medio de acordo com os ultimos 3 salarios:"+calcularMedia()+"\n\n\n");

    }

    float calcularBonus(){
        return (Salario_bas*0.2f);
        
    }
    float calcularMedia(){
        float Total=0;
        for(int i=0;i<3;i++){
            Total= Total + Hist_Pag[i];
        }
        return(Total/3);
    }


    
}
