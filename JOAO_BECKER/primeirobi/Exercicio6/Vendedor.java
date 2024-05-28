package primeirobi.Exercicio6;

public class Vendedor{
    String nome;
    Integer idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    Double salarioBase;
    Double [] salarioRecebido = new Double[3];
    Endereco endereco;

    public double calcularMedia(){
        double media=0;
        for(int i=0;i<salarioRecebido.length;i++){
            media=media+salarioRecebido[i];
        }
        return media/3;
    }

    public double calcularBonus(){
        return salarioBase*0.2;

    }

    public void apresentarse(){
        System.out.println("O vendedor "+nome+" da loja "+loja+" tem "+idade+" de idade");
    }
}

