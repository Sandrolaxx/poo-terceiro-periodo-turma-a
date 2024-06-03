package primeirobi.donaGabrielinha;

public class Endereço 
{
    public String rua;

    public String numero;

    public String complemento;

    public String bairro;

    public String cidade;

    public String estado;

    public void apresentarLogradouro()
    {
        String mensagem = "Rua: "
            .concat(rua)
            .concat(" N°: " + numero)
            .concat(" Complemento: " + complemento)
            .concat(" Bairro: " + bairro)
            .concat(" Cidade: " + cidade)
            .concat(" Estado: " + estado);
            System.out.println(mensagem);
    }
}