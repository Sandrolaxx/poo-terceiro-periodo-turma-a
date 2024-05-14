package primeirobi.ListasExc.Lista7;

public class Gerente extends Pessoa {
    private double salarioRecebido;
    private double salarioBonus;
    private double[] salarioBase = new double[] {2100, 2200, 2300};
    private double salarioMedia;

    public void calcularSalarioGerente() {
        calcularMedia();
        calcularSalarioBonus();
        calcularMedia();
    }

    public void calcularMedia() {
        for (int i = 0; i < 3; i++) {
            salarioMedia += salarioBase[i];
            salarioRecebido = salarioBase[i];
        }
        salarioMedia /= 3;
    }

    public void calcularSalarioBonus() {
        salarioBonus = salarioRecebido * 0.35;
        salarioBonus += salarioRecebido;
        System.out.println("A Média do Salário do Gerente é : " + salarioMedia + ", O Salário do Gerente é: " + salarioRecebido + ", com o bônus fica: " + salarioBonus);
    }

    public double getSalarioMedia() {
        return salarioMedia;
    }

    //Não executar daqui ou da bo
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        System.out.println("A média do salário do Gerente é: " + gerente.getSalarioMedia());
    }
}