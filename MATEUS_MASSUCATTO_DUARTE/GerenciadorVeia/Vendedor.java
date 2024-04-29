package GerenciadorVeia;
public class Vendedor 
{
    private String nomeV;
    private int idadeV;
    private String loja;
    private String cidadeV;
    private String bairroV;
    private String ruaV; 
    private int numeroV;
    private String complementoV;
    private double SalarioBase;
    private double SalarioRecebido;

    public Vendedor(String nomeV, int idadeV, String loja, String cidadeV, String bairroV, String ruaV, int numeroV, String complementoV, double SalarioBase, double SalarioRecebido)
    {
        this.nomeV = nomeV;
        this.idadeV = idadeV;
        this.loja = loja;
        this.cidadeV = cidadeV;
        this.bairroV = bairroV;
        this.ruaV = ruaV;
        this.numeroV = numeroV;
        this.complementoV = complementoV;
        this.SalarioBase = SalarioBase;
        this.SalarioRecebido = SalarioRecebido;
    }

        //public String getNomeV()
        //{
        //  return nomeV;
        //}
        //
        //      public void setNomeV()
        //    {
      //      this.nomeV = nomeV;
        //}

    void apresentarseV()
    {
        System.out.println("Ola, meu nome é " + nomeV + " tenho " + idadeV + " anos " + "e trabalho na loja " + loja);
    }

    void calcularMedia()
    {
        System.out.println("Média dos salários: " + (SalarioRecebido / 3));
    }

    void calcularBonus()
    {
        System.out.println("O bonus é: " + (SalarioBase * 0.2));
    }
}
