package Testes.Heranca;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    public void miar(){
        System.out.printf(getNome()+ " miou\n");
    }

}
