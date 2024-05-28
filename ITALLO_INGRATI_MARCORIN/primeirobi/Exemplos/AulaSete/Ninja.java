package primeirobi.Exemplos.AulaSete;

public class Ninja {
    String nome; 
    int idade;
    String aldeia;
    String cla;
    String equipamento;
    String nomeJutsu;

    void apresentarse(){
        System.out.println("Sou o Ninja ".concat(nome).concat(" do clã ").concat(cla));
    }
    void realizarJutso(){
        System.out.println(nome.concat(" realizando jutso ").concat(nomeJutsu));
    }
}
