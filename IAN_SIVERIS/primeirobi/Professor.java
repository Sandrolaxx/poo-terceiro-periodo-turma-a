package primeirobi;

public class Professor {
    
    String nome;

    String materia;

    public void apresentarse() {
        String msg = "Ola, sou o professor(a) "
        .concat(nome)
        .concat(" e vou lecionar ")
        .concat(materia);

        System.out.println(msg);
        
    }
}
