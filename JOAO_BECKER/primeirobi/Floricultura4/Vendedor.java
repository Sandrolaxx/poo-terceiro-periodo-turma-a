package primeirobi.Floricultura4;

public class Vendedor {
    String nome;
    Integer idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    Double salarioBase;
    Double [] salarioRecebido = new Double[3];

    public double calcularMedia(){
        return 0;

    }

    public double calcularBonus(){
        return salarioBase+(salarioBase*0.2);

    }

    public void apresentarse(){
        
    }
}

/*Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
Métodos apresentarse calcularMedia e calcularBonus.
Método apresentarse deve printar o nome, idade e Loja.
calcularMedia deve trazer a média dos salários.
calcularBonus onde a formulá é [salarioBase * 0.2]*/
