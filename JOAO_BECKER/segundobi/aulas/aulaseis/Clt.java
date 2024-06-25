package segundobi.aulas.aulaseis;

public class Clt implements IProcessaFolha {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void processarFolha() {
        System.out.println("Calculando folha do clt...Salário");
        System.out.println(getSalario() / 2);
    }

}
