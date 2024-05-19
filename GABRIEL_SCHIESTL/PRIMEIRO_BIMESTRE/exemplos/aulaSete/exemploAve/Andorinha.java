package PRIMEIRO_BIMESTRE.exemplos.aulaSete.exemploAve;

public class Andorinha extends Ave {
    int idade;

    public void apresentarse() {
        System.out.println("Sou " + nome + " tenho " + idade + " anos");
    }

    @Override
    public void bicar() {
        System.out.println("Nao estou bicando");
    }
}
