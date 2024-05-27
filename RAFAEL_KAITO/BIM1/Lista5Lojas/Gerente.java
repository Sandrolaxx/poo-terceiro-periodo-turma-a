package BIM1.Lista5Lojas;

public class Gerente extends Pessoa{
    private String loja;
    private float salarioBase;
    private float[] salarioRecebido;
    private float bonus;
    private float media;

     
    public Gerente(String nome, int idade, String loja, Endereco endereco, float salarioBase, float[] salarioRecebido) {
        super(nome, idade, endereco);
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    
    public void apresentarse()
        {
            System.out.println("Me chamo " + nome + " tenho " + idade + "anos," + " sou da loja "+ loja + "\n");

            return;
        }
        public void calcularMedia()
        {
            this.media=0;
            for (int i=0; i<this.salarioRecebido.length; i++){
                this.media += this.salarioRecebido[i];
            }
            this.media = ( this.media / this.salarioRecebido.length );
            System.out.printf("A média de salários é R$ %.2f", this.media , "\n" );
        }


        public float calcularBonus()
        {
            this.bonus = ( this.salarioBase * 0.35f );
            System.out.printf("O bônus é R$ %.2f ", this.bonus , "\n");
            return this.bonus;
        }
}
