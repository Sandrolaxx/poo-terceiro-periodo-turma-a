package primeirobim.listaseis;

public class Vendedor extends Pessoa{

    private int salarioBase;

    public void apresentaVendedor() {

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Artur");
        vendedor1.setIdade(29);
        vendedor1.setSexo("Masculino");

        Vendedor vendedor2 = new Vendedor();
        vendedor2.setNome("Vacermina");
        vendedor2.setIdade(80);
        vendedor2.setSexo("Feminino");

        Loja loja = new Loja();
        loja.adicionarVendedor();


        String seller = "Olá, sou o vendedor " + vendedor1.getNome() + ", tenho " + vendedor1.getIdade() + " anos e sou do sexo " + vendedor1.getSexo()
        + "\n" + "E eu sou a vendedora "  + vendedor2.getNome() + ", tenho " + vendedor2.getIdade() + " anos e sou do sexo " + vendedor2.getSexo();
        System.out.println(seller); 

    }

    public void calcularMedia () {
        double [] salarioRecebido = new double[] {1200, 1300, 1400};  
        double media = (salarioRecebido [0] + salarioRecebido [1] + salarioRecebido [2]) /3;
        String showMedia = "A média de salário dos vendedores é de " + media + " R$";
        System.out.println(showMedia);
    }

    public void calcularBonus () {
        salarioBase = 1000;
        double bonus = salarioBase * 0.2;
        String showBonus = "E o bônus é de " + bonus + " R$"+ "\n";
        System.out.println(showBonus);
   }


    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
    
}
