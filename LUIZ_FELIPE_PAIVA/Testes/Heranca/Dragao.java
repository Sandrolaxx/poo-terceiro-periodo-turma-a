package Testes.Heranca;

public class Dragao extends Ave{

    public Dragao(String nome) {
    super(nome);
        
    }
    
    public void soltarFogo(){
    System.out.println(getNome()+ " soltou bola de fogo");
    }
   
}
