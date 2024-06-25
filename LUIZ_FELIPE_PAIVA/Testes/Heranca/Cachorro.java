package Testes.Heranca;

public class Cachorro extends Animal {
   
    public Cachorro(String nome) {
    super(nome);
    
    }

    public void latir(){
    System.out.printf(getNome()+ " latiu\n");
    }

    public void lamber(){
    System.out.printf(getNome()+ " lambeu\n");
        
    }
}
