package primeirobimestre.Primeirobimestre.SetimaLista;

public class Gerente extends Pessoa {

   private double salarioRecebido;
   private double salarioBonus;
   private double[] salarioBase = new double[] {2000, 2100, 2200};
   private double salarioMedia;

   public void salarioGerente() {
       calcularMedia();
       retSalarioBonus();
       calcularMedia();
   }

   public void calcularMedia() {
       for (int i = 0; i < 3; i++) {
           salarioMedia += salarioBase[i];
           salarioRecebido = salarioBase[i];
       }
       salarioMedia /= 3;
   }

   public void retSalarioBonus() {
       salarioBonus = salarioRecebido * 0.35;
       salarioBonus += salarioRecebido;
       System.out.println("A Média do Salário do Gerente é : " +salarioMedia+ ", O Salário do Gerente é: " + salarioRecebido + ", com o bônus fica: " + salarioBonus);
   }

   public double retSalarioMedia() {
       return salarioMedia;
   }

   public static void main(String[] args) {
       Gerente gerente = new Gerente();
       System.out.println("A média do salário do Gerente é: " + gerente.retSalarioMedia());
   }
}
