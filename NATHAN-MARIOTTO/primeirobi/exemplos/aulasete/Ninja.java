package exemplos.aulasete;

public class Ninja {

    String nome;

    Integer idade;

    String aldeia;

    String cla;

    String equipamento;

    String nomeJutso;

    public void apresentarse() {
        System.out.println("Olá sou o ninja " + nome + " da aldeia " + aldeia);
    }

    public void realizarJutso() {
        System.out.println("Ninja " + nome + " realizando jutso " + nomeJutso);
    }

}
