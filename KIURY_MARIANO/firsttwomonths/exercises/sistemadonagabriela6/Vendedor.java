// Crie uma classe Vendedor com:
// Com os atributos nome, idade, Loja, cidade, bairro, rua, salarioBase e salarioRecebido.
// Atributo salarioRecebido DEVE armazenar no mínimo três valores de lançamentos de salário.(Pode colocar no código os valores*)
// Métodos apresentarse calcularMedia e calcularBonus.
// Método apresentarse deve printar o nome, idade e Loja.
// calcularMedia deve trazer a média dos salários.
// calcularBonus onde a formulá é [salarioBase * 0.2]

package exercises.sistemadonagabriela6;

public class Vendedor extends Pessoa{
    
    private Loja Loja;
    private double salarioBase;
    private double[] salarioRecebido;

    // Métodos

    void apresentarse(){
        System.out.println("\nVendedor: " +getNome()+ ". Idade: " +getIdade()+ ". Loja: " + Loja.getNomeFantasia());
    }

    void calcularMedia(){
        
        float media = 0;

        for (int i = 0; i < salarioRecebido.length; i++) {
            media += salarioRecebido[i];
        }

        media = media/salarioRecebido.length;
        System.out.println("\n\tMedia dos Salários: " + media);
    }

    void calcularBonus(){

        System.out.println("\n\tBonus: R$" +salarioBase*0.35); 
    }

    // Geters e Seters

    public Loja getLoja() {
        return Loja;
    }

    public void setLoja(Loja loja) {
        Loja = loja;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(double[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

    
}