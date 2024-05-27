package primeirobi.exemplos.aulaseis;

public class AulaSeis {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Professor professorDois = new Professor();

        professor.nome = "Eduardo";
        professor.materia = "Projeto de Software";

        professorDois.nome = "Sandro";
        professorDois.materia = "POO";
        
        professor.apresentarse();
    }
}
