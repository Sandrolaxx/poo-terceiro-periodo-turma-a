package Testes.Heranca;

public class Animal {
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.printf(nome+ " comeu\n");
    }
    
    public void beber(){
        System.out.printf(nome+ " bebeu\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
