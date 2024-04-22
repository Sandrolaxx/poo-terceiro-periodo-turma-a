package primeirobi.exemplos;

public class AulaSeis {
    

    public static void main(String[] args) {

        Professor professorUm = new Professor();
        Professor oMelhorProfe = new Professor();
        Arma armaUm  = new Arma();
        
        professorUm.nome = "Carlos ";
        professorUm.materia = "Programação";
          
        oMelhorProfe.nome = "Sandrolaxx";
        oMelhorProfe.materia = "POO";
        
        armaUm.Nome = "AWP";
        armaUm.Tipo = "Foguete";
        armaUm.Dano = "200";

        professorUm.apresentarse();
        oMelhorProfe.apresentarse();
        System.out.println(armaUm.toString());
        

        
}
}