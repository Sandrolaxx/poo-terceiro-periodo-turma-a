package primeirobi.listas.Lista7;

public class Gerente extends Funcionario{
    
    public void apresentarse() {

        String msg = ("\n Me chamo "
        .concat(getNome())
        .concat(", tenho ")
        .concat(getIdade())
        .concat(" anos e sou gerente da: ")
        .concat((getLoja().getNomeFantasia()) + "\n"));
         
        System.out.println(msg);
    }

    public void calcularBonus() {
        int i;
        for (i = 0; i < getSalarioBase().length; i++) {

            if (getSalarioBase()[i] == 0.0) {
                break;
            }
            else {
                System.out.println("O salario de " + getNome() + " recebera um bonus de R$: " + (getSalarioBase()[i] * 0.35));
                System.out.println();
            }
        }  
    }
}
