package primeirobi.exemplos.aulasete;

public class Ninja {
    
    String nome;

    int idade;

    String aldeia;

    String cla;

    String equipamento;

    String nomejutso;

    public void apresentarse() {

        System.out.println("Ola me chamo " + nome + ", tenho " + idade + " anos, moro na aldeia " + aldeia + ", sou do clã " + cla + " e utilizo um(a) " + equipamento);
    }

    public void realizarJutso() {

        System.out.println("realizado o jutso: " + nomejutso);
    }
}
