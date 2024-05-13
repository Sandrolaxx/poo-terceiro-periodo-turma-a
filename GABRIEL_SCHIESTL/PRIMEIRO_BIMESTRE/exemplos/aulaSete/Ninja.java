package PRIMEIRO_BIMESTRE.exemplos.aulaSete;

public class Ninja {
    String nome;
    int idade;
    String cla;
    String aldeia;
    String equipamento;
    String nomeJutso;

    public void apresentarse(){
        System.out.println("Sou o " + nome + " tenho " + idade + " anos e sou do cla "
        + cla);
    }
    void realizarJutso(){
        System.out.println(nome + " realizando " + nomeJutso);
    }
}
