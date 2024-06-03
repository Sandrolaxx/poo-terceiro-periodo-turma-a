package primeirobi.donaGabrielinha;

public class Item 
{
    public String id;
    
    public String nome;
    
    public String tipo;

    public String valor;

    public void gerarDescrição()
    {
        String mensagem = "ID: "
            .concat(id)
            .concat(" Nome: " + nome)
            .concat(" Tipo: " + tipo)
            .concat(" Valor: " + valor);
            System.out.println(mensagem);
    }
}
