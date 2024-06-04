package primeirobi.provas.primeirachamada2;

import java.util.Date;

public class Livro {
    
    private String titulo;
    private String autor;
    private String idLivro;
    public Date dataLancamento;
    private boolean disponibilidade; //primitivo!!!!

    public Livro(String titulo, String autor, String idLivro, Date dataLancamento, Boolean disponibilidade){
        this.titulo = titulo;
        this.autor = autor;
        this.idLivro = idLivro;
        this.dataLancamento = dataLancamento;
        this.disponibilidade = true; //disponivel!!!!
    }

    //Date
    Long umDiaemMs = 86400000l;
    Date hoje = new Date();


    public boolean isDisponivel() {
        return disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setDataLancamento(java.util.Date hoje) {
        this.dataLancamento = hoje;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }



    


}
