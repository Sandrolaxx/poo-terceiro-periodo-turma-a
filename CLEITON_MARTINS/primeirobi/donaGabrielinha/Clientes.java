package primeirobi.donaGabrielinha;

public class Clientes extends Pessoa
{
    public Endereço endereço;

    public void apresentarse()
    {
        String mensagem = "Olá! Meu nome é "
            .concat(nome)
            .concat(" e minha idade é ")
            .concat(idade);
        System.out.println(mensagem);
    }
}