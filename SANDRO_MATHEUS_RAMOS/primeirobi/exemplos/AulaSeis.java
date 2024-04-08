package primeirobi.exemplos;

public class AulaSeis {
    
    public static void main(String[] args) {
        
        Professor professorUm = new Professor();
        Professor oMelhorProfe = new Professor();

        // professorUm.nome = "Alex";
        // professorUm.materia = "A.I";

        professorUm.nome.toString();

        oMelhorProfe.nome = "Sandrolaxx";
        oMelhorProfe.materia = "POO";

        professorUm.apresentarse();    
        oMelhorProfe.apresentarse();

        Arma awp = new Arma();

        System.out.println(awp.toString());

        oMelhorProfe.arma = awp;
    }

}
