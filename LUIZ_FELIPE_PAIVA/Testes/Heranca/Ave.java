package Testes.Heranca;

public class Ave extends Animal {

    public Ave(String nome) {
        super(nome);
        
    }

    public void voar(){
        System.out.println(getNome()+ " voou");
    }
    
}
