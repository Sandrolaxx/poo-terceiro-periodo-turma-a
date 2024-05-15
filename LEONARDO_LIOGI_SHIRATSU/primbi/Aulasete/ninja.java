package primbi.Aulasete;

public class ninja {
    
    String nome;

    Integer idade;

    String aldeia;

    String cla;

    String equipamento;

    String nomeJutsu;

    public void apresentarse() {

        System.out.println("Olá sou ninja " + nome + "da aldeia " + aldeia);

    }


    public void realizarJutsu(){

        System.out.println("Ninja " + nome + " realizando jutsu " + nomeJutsu);
    }
}
