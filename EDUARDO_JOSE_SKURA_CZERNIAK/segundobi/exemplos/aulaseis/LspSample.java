package segundobi.exemplos.aulaseis;

public class LspSample {
    
    public static void main(String[] args) {

        //A classe pai e classe filha devem ser substítuiveis 
        //Não afetando o comportamento do programa
        //EX: Penguim náo substitui o Bem-Te-Vi quando for para voar
        Penguim aveUm = new Penguim();

        aveUm.voar();

        BemTeVi aveDois = new BemTeVi();

        aveDois.voar();
    }
}
