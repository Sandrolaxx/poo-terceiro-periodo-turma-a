package primeirobi.listas.Lista6;

public class Gerente extends Vendedor{
    
    public void apresentarse() {

        String msg = ("\n Me chamo "
        .concat(nome)
        .concat(", tenho ")
        .concat(idade)
        .concat(" anos e sou gerente da: ")
        .concat((loja.nomeFantasia) + "\n"));
         
        System.out.println(msg);
    }

    public void calcularBonus() {
        int i;
        for (i = 0; i < salarioBase.length; i++) {

            if (salarioBase[i] == 0.0) {
                break;
            }
            else {
                System.out.println("O salario de " + nome + " recebera um bonus de R$: " + (salarioBase[i] * 0.35));
                System.out.println();
            }
        }  
    }
}
