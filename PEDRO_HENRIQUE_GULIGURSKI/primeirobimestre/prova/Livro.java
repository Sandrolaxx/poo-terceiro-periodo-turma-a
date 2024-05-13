package PEDRO_HENRIQUE_GULIGURSKI.primeirobimestre.prova;

import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private Boolean disponibilidade;
    private Date dataLocacao;
    private Date dataDevolucao;
    private Date dataVencimentoLocacao;
    
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Date getDataVencimentoLocacao() {
        return dataVencimentoLocacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setDataVencimentoLocacao(Date dataVencimentoLocacao) {
        this.dataVencimentoLocacao = dataVencimentoLocacao;
    }

}
