package primeirobi.exemplos.aula6;

public class Aula6 {
    
    public static void main(String[] args) {
        
        Professor professorUm = new Professor();
        Professor oMelhorProfessor = new Professor();

        professorUm.nome = "Roberto";
        professorUm.materia = "Matemática";

        oMelhorProfessor.nome = "Resferatus";
        oMelhorProfessor.materia = "Citologia";

        professorUm.apresentarse();
        oMelhorProfessor.apresentarse();

        Arma AWP = new Arma();

        AWP.nome = "AWP";
        AWP.skin = "Fever Dream";
        AWP.dano = 110;

        System.out.println(AWP.toString());

    }

}
