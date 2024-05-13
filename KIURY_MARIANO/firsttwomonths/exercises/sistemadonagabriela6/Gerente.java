// Crie um classe Gerente:
// - Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
// - Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
// - Métodos apresentarse calcularMedia e calcularBonus.
// - Método apresentarse deve printar o nome, idade e Loja.
// - calcularMedia deve trazer a média dos salários.
// - calcularBonus onde a fórmula é [salarioBase * 0.35].

package exercises.sistemadonagabriela6;

public class Gerente extends Pessoa{
    
    private Loja Loja;
    private double salarioBase;
    private double[] salarioRecebido;

    // Métodos

    void apresentarse(){
        System.out.println("\nGerente: " +getNome()+ ". Idade: " +getIdade()+ ". Loja: " +Loja.getNomeFantasia());
    }

    void calcularMedia(){
        
        float media = 0;

        for (int i = 0; i < salarioRecebido.length; i++) {
            media += salarioRecebido[i];
        }

        media = media/salarioRecebido.length;
        System.out.println("\n\tMedia: " + media);
    }

    void calcularBonus(){

        System.out.println("\n\tBonus: " +salarioBase*0.35); 
    }

    // Getters e Seters

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setLoja(Loja loja) {
        Loja = loja;
    }

    public void setSalarioRecebido(double[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

}