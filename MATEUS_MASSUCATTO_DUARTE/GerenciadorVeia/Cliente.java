package GerenciadorVeia;
public class Cliente 
{
    private String nomeC;
    private int idadeC;
    @SuppressWarnings("unused")
    private String cidadeC;
    @SuppressWarnings("unused")
    private String bairroC;
    @SuppressWarnings("unused")
    private String ruaC;
    @SuppressWarnings("unused")
    private int numeroC;
    public Cliente(String nomeC, int idadeC, String cidadeC, String bairroC, String ruaC, int numeroC, String complementoC)
    {
        this.nomeC = nomeC;
        this.idadeC = idadeC;
        this.cidadeC = cidadeC;
        this.bairroC = bairroC;
        this.ruaC = ruaC;
        this.numeroC = numeroC;
    }

    void apresentarseC()
    {
        System.out.println("Ola, meu nome é: " + nomeC + " e tenho " + idadeC );
        System.out.println("\n");
    }

}
