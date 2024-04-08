package primeirobi.exemplos;

public class Professor {

    public String nome;

    public String materia;

    public Arma arma;

    public void apresentarse() {
        String msg = "Olá! Sou o professor(a)"
                .concat(nome)
                .concat(" e vou lecionar ")
                .concat(materia);

        System.out.println(msg);
    }

}
