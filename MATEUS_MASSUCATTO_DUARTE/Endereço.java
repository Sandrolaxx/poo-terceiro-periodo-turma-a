public class Endereço 
{
    String estado;
    String cidade;
    String bairro;
    int numero;
    String complemento;

    void apresentarLogradouro()
    {
        System.out.println("Estado: " + estado + "\nCidade: " + cidade + "\nBairro: " + bairro + "\nNumero: " + numero + "\nComplemento: " + complemento);
    }

}
