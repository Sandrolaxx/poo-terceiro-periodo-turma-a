package primeirobim.listaseis;

public class Cliente extends Pessoa{

    private int [] salarioBase;

    private double [] salarioRecebido;

    public void apresentaCliente() {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Romeu");
        cliente1.setIdade(25);
        cliente1.setSexo("Masculino");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Ana");
        cliente2.setIdade(20);
        cliente2.setSexo("Feminino");

        Loja loja = new Loja();
        loja.adicionarCliente();


        String client = "Olá, sou o cliente " + cliente1.getNome() + ", tenho " + cliente1.getIdade() + " anos e sou do sexo " + cliente1.getSexo()
        + "\n" + "E eu sou a cliente "  + cliente2.getNome() + ", tenho " + cliente2.getIdade() + " anos e sou do sexo " + cliente2.getSexo() + "\n";
        System.out.println(client); 
    }

    public int[] getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int[] salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(double[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }
}
