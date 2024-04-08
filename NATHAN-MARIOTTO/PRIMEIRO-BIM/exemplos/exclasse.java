package exemplos;

public class exclasse {

    String nome;

    String materia;

    public void apresentarse() {
        String msg = " Olá! Sou o professor(a) "
            .concat(nome)
            .concat(" e vou lecionar ")
            .concat(materia);

    System.out.println(msg);

    }
    
}
