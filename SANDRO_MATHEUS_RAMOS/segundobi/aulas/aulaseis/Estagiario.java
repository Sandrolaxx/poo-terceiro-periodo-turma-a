package segundobi.aulas.aulaseis;

public class Estagiario implements IProcessaFolha {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void processarFolha() {
        System.out.println("Calculando folha do estágiario...Salário");
        System.out.println((getSalario() + (getSalario() * 0.01)) - 100d);
    }

}
