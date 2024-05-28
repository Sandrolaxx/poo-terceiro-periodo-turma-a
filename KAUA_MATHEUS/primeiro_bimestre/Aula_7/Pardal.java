package primeiro_bimestre.Aula_7;

public class Pardal extends Ave{
    
    String nome;

    public void nome(){
        System.out.printf("Meu nome é %s", this.nome);
    }


    public static void main(String[] args) {
        
        Pardal pardal1 = new Pardal();

        pardal1.cor = "amarelo";
        pardal1.nome = "Pardal_Arroz";

        pardal1.nome();

        Ave passaro = new Ave();
        passaro.voar();

    }


}
