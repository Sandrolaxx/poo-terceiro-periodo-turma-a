package primeirobi;

public class professor {
    
    String nome;

    String materia;

    public void apresentarse() {
        String msg = "Ola! Sou o professor(a) "
                .concat(nome)
                .concat(" e vou lecionar ")
                .concat (materia);

                System.out.println(msg);
    }

    
}
