package primeirobi.Exercicio6;

public class Gerente extends Vendedor {
    @Override
    public double calcularBonus() {
        return salarioBase*0.35;
    } 
    @Override
    public void apresentarse() {
        System.out.println("O gerente "+nome+" da loja "+loja+" tem "+idade+" de idade");
    }
    
}
