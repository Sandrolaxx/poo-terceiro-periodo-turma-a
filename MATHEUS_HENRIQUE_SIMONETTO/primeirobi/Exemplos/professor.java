package primeirobi.exemplos;

public class professor {

    String nome;

    String materia;

    public void apresentarse () {
        String msg = "Ola, eu sou o professor "
            .concat(nome)
            .concat(" e eu ensino ")
            .concat(materia);

        System.out.println(msg);
    }
}