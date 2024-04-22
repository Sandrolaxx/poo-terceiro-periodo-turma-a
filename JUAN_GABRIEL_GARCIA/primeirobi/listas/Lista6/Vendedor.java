package primeirobi.listas.Lista6;

public class Vendedor {
    
    String nome;

    String idade;

    Loja loja;

    String cidade;

    String bairro;

    String rua;

    float[] salarioBase = new float[100];

    float[] salarioRecebido = new float [100];

    public void apresentarse() {

        String msg = ("\n Me chamo "
        .concat(nome)
        .concat(", tenho ")
        .concat(idade)
        .concat(" anos e trabalho na ")
        .concat((loja.nomeFantasia) + "\n"));
         
        System.out.println(msg);
    }

    public void calcularMedia() {
        int soma = 0;
        int i;
        for (i = 0; i < salarioRecebido.length; i++) {
            
            if (salarioRecebido[i] == 0.0) {
                break;
            }
            else {
                soma += salarioRecebido[i];
            }
            
        }

        int media = (soma/i);

        System.out.println("A media é: dos salarios de " + nome + " é: " + media);
    }

    public void calcularBonus() {
        int i;
        for (i = 0; i < salarioBase.length; i++) {

            if (salarioBase[i] == 0.0) {
                break;
            }
            else {
                System.out.println("O salario de " + nome + " recebera um bonus de R$: " + (salarioBase[i] * 0.2));
                System.out.println();
            }
        }  
    }
}

/* 
Crie uma classe Vendedor com:
Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido. ##
Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*) ##
Métodos apresentarse calcularMedia e calcularBonus. ##
Método apresentarse deve printar o nome, idade e Loja. ##
calcularMedia deve trazer a média dos salários. ##
calcularBonus onde a formulá é [salarioBase * 0.2] ## 
*/ 