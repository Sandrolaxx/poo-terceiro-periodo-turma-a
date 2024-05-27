package primeirobi.exemplos;

public class aulaseis {
    
    public static void main(String[] args) {
        
        professor profeUm = new professor();
        professor OmelhorProf = new professor();

        profeUm.nome = "\n Jefferson " ;
        profeUm.materia = "\n Engenharia de software";

        OmelhorProf.nome = "\n Jefferson Teles ";
        OmelhorProf.materia = "\n Engenharia de software";

        profeUm.apresentarse(null);
        OmelhorProf.apresentarse(null);

    }
}
