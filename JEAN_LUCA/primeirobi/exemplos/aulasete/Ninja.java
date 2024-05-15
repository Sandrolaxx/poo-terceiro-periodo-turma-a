package primeirobi.exemplos.aulasete;

public class Ninja {

    String  nome;

    int idade;

    String aldeia;

    String cla;

    String equipamento;
     
    String justo;

    public void apresentarSe(){
        System.out.println("Eu sou o ninja :" + this.nome + " da aldeia:" +this.aldeia);
    }

    public void realizajutso(){
        System.out.println("nome ninja :"+this.nome + " nome do jutso: " + this.justo+"!");
    }

    
}
