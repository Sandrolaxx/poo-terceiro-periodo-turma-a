package primeirobi.exexcicio5;

public class Vendedor {
    String nome;
    Integer idade;
    String loja;
    String cidade;
    String bairro;
    String rua;
    double salarioBase;
    double [] salarioRecebido = new double[3];

    public void apresentarSe(){
        System.out.println("Nome: "+ nome + "Idade: "+ idade + "Loja: "+ loja);
    }
    public void calcularBonus(){
        System.out.println("O bônus recebido é: "+salarioBase*0.2); 
    }
    public void calcularMedia(){
        double soma = 0;;
        for(int i=0;i<salarioRecebido.length;i++){
            soma=soma+salarioRecebido[i];
        }
        System.out.println("A média é: "+soma/3);
    }

}
