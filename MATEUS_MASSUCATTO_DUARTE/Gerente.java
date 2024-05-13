public class Gerente 
{
    private String nomeG;
    private int idadeG;
    private String loja;
    private String cidadeG;
    private String bairroG;
    private String ruaG;
    private int numeroG;
    private String complementoG;
    private double SalarioBase;
    private double SalarioRecebido;

    public Gerente(String nomeG, int idadeG, String loja, String cidadeG, String bairroG, String ruaG, int numeroG, String complementoG, double SalarioBase, double SalarioRecebido)
    {
        this.nomeG = nomeG;
        this.idadeG = idadeG;
        this.loja = loja;
        this.cidadeG = cidadeG;
        this.bairroG = bairroG;
        this.ruaG = ruaG;
        this.numeroG = numeroG;
        this.complementoG = complementoG;
        this.SalarioBase = SalarioBase;
        this.SalarioRecebido = SalarioRecebido;
    }

    void apresentarseG()
    {
        System.out.println("Olá, meu nome é: " + nomeG + " tenho " + idadeG + " anos e trabalho na loja " + loja);
    }

    void calcularMediaG()
    {
        System.out.println("Média dos salários: " + (SalarioRecebido / 3));
    }

    void calcularBonusG()
    {
        System.out.println("O bonus é: " + (SalarioBase * 0.35));
    }
}
