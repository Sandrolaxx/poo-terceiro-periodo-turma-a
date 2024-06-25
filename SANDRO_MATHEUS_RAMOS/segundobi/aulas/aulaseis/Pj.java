package segundobi.aulas.aulaseis;

public class Pj implements IProcessaFolha {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void processarFolha() {
        System.out.println("Calculando folha do pj...Salário");
        System.out.println(getSalario());
    }

}
