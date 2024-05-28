package primeirobi.exemplos.aulaseis;

public class Professor{

    String nome;

    String materia;

    public  void apresentarse() {
        
        String msg = "Olá,sou o Professor(a) "
        .concat(nome)
        .concat(" vou  ministrar a disciplina ")
        .concat(materia);

        System.out.println(msg);
    }
    }
  