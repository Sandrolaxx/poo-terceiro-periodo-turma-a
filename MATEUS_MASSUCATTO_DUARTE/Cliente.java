public class Cliente 
{
    private String nomeC;
    private int idadeC;
    private String cidadeC;
    private String bairroC;
    private String ruaC;
    private int numeroC;
    private String complementoC;

    public Cliente(String nomeC, int idadeC, String cidadeC, String bairroC, String ruaC, int numeroC, String complementoC)
    {
        this.nomeC = nomeC;
        this.idadeC = idadeC;
        this.cidadeC = cidadeC;
        this.bairroC = bairroC;
        this.ruaC = ruaC;
        this.numeroC = numeroC;
        this.complementoC = complementoC;
    }

    void apresentarseC()
    {
        System.out.println("Ola, meu nome é: " + nomeC + " e tenho " + idadeC );
        System.out.println("\n");
    }

}
