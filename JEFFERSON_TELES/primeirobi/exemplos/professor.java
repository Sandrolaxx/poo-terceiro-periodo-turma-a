package primeirobi.exemplos;

public class professor {

    String nome;

    String materia;

    public void apresentarse(String str) {

        String msg = "ola, sou o professor"
        .concat(nome)
        .concat("e vou lecionar")
        .concat(materia);

        System.out.println(msg);

    }
    
}
