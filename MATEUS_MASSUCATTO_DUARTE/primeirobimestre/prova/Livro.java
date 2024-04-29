package MATEUS_MASSUCATTO_DUARTE.primeirobimestre.prova;

public class Livro 
{
    protected String tituloLivro;
    protected String autorLivro;
    protected int dataLivro;

    public Livro(String tituloLivro, String autorLivro, int dataLivro)
    {
        this.tituloLivro = tituloLivro;
        this.autorLivro = autorLivro;
        this.dataLivro = dataLivro;
    }

    void apresentarLivro()
    {
       System.out.println("Título: " + tituloLivro + " Autor: " + autorLivro + " Data de lançamento: " + dataLivro);
    }

    public String getTituloL()
    {
        return tituloLivro;
    }

    public void setTituloL()
    {
        this.tituloLivro = tituloLivro;
    }

    public String getAutorL()
    {
        return autorLivro;
    }

    public void setAutorL()
    {
        this.autorLivro = autorLivro;
    }

    public int getDataL()
    {
        return dataLivro;
    }

    public void setDataL()
    {
        this.dataLivro = dataLivro;
    }
    
}
