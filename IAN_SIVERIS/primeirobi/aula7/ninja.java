package primeirobi.aula7;

public class ninja {

    String nome;
    Integer idade;
    String Aldeia;
    String cla;
    String equipamento;
    String nomeJutso;

    void apresentarse(){
        System.out.println("Sou o ninja ".concat(nome).concat("do cla ").concat(cla));
    }

    void realizarJutso(){
        System.out.println(nome.concat("Realizando jutso").concat(nomeJutso));
    }

}
