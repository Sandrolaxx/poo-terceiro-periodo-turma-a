package primeirobim.listaseis;

public class Gerente extends Pessoa{

    private Loja loja;

    private int salarioBase;
    

    public void apresentaGerente () {
        
        setNome("Bartolomeu");
        setIdade(98);
        setSexo("Masculino");

        
        Loja loja = new Loja();
        loja.nomeFantasia = "My Plantt";
        loja.cnpj = "12345678901234";
        setLoja(loja);

        
        String manager = "Olá, sou o gerente " + getNome() + ", tenho " + getIdade()
         + " anos e sou do sexo " + getSexo() + " e da loja " + getLoja().getNomeFantasia();
        System.out.println(manager); 
    }
    
    public void calcularMedia () {
        double [] salarioRecebido = new double[] {2000, 2500, 3000};  
        double media = (salarioRecebido [0] + salarioRecebido [1] + salarioRecebido [2]) /3;
        String showMedia = "A média de salário do gerente é de " + media + " R$";
        System.out.println(showMedia);
    }


    public void calcularBonus () {
         salarioBase = 1200;
         double bonus = salarioBase * 0.35;
         String showBonus = "O bônus do gerente é de " + bonus + " R$"+ "\n";
         System.out.println(showBonus);
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }


    
}
