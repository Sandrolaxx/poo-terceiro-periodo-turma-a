package primeirobim.listas;

public class Vendedor {

    String nome;

    int idade;
    
    Loja loja;

    String cidade;

    String bairro;

    String rua;

    double media;

    double salarioBase; 

    double [] salarioRecebido; 

    double calcularMedia; 

    double calcularBonus;
    
    public void apresentarse () {

        String msg = "Nome do vendedor: " + nome + "\n" + "Idade: " + idade +"\n" +"Loja: " + loja.nomeFantasia;
        System.out.println(msg);
    }

    public void apresentarse2() {
        calcularBonus = salarioBase * 0.2;
        String msg = "Média do salário: " + media + "\n" + "Bônus: " + calcularBonus + "\n";
        System.out.println(msg);
    }
   
}


