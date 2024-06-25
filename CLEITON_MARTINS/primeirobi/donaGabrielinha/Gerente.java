package primeirobi.donaGabrielinha;

public class Gerente extends Pessoa
{
    public Endereço endereço;

    public Funcionario funcionario;

    public Double ultimosSalarios;

    private Double mediaSalarioRecebido = 3066.66; // 1200+1200+6800/3
    
    private Double bonusSalarioRecebido = 420.0; // 1200*0,35

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
        String mensagem = "Olá! Meu nome é "
            .concat(nome)
            .concat(" e minha idade é " + idade)
            .concat(" pertenço à loja" + loja);
        System.out.println(mensagem);
    }
}