package primeirobi.exemplos;

public class Professor 
{
    String nome;

    String materia;

    public void apresentarse()
    {
        String mensagem = "Olá! Sou o professor (a) "
            .concat(nome)
            .concat(" e vou lecionar ")
            .concat(materia);
        System.out.println(mensagem);
    }
}
