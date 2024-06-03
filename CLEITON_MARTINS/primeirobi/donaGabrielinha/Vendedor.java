package primeirobi.donaGabrielinha;

public class Vendedor extends Pessoa
{
    public Endereço endereço;

    public Funcionario funcionario;

    private Double mediaSalarioRecebido = 2066.66; // 1200+1200+3800/3
    
    private Double bonusSalarioRecebido = 240.0; // 1200*0,20
    
    public Double getMediaSalarioRecebido() 
    {
        return mediaSalarioRecebido;
    }

    public Double getBonusSalarioRecebido() 
    {
        return bonusSalarioRecebido;
    }

    public void apresentarse()
    {    
        Loja loja = new Loja();
        String mensagem = "nome: "
            .concat(nome)
            .concat("idade: " + idade)
            .concat("loja: " + loja);
        System.out.println(mensagem);
    }
}