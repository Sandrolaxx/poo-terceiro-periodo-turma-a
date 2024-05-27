package KIURY_MARIANO.firsttwomonths.prova;

import java.util.Date;

public class Livro {
    
    private String titulo;
    private String autor;
    private int id;
    private String tipo;
    private String editora;
    private Date lancamento;
    private boolean disponibilidade;
    private Date dataVencimentoEmprestimo;
    private Date dataAtual;

    // Métodos

    void realizarEmprestimo(){

        if(isDisponibilidade()){
            disponibilidade = false;

            Long umDia = 86400000l;
            Long seteDias = new Date().getTime() + (7*umDia);

            this.dataAtual = new Date();
            this.dataVencimentoEmprestimo = new Date(seteDias);

            System.out.println("\n\tVocê reservou o livro: " +getTitulo());
            System.out.println("Sua reserva foi realizada dia " +getDataAtual());
            System.out.println("Sua reserva acaba dia " +getDataVencimentoEmprestimo());

            if (dataVencimentoEmprestimo.before(dataAtual)) {
                System.out.println("Você esta sendo multado.");
            }
        
        } else{
            System.out.println("O livro já esta emprestado.");
            
        }
    }

    void realizarDevolucao(){

        if(isDisponibilidade()){
                        
            System.out.println("O livro não havia sido emprestado.");
            

        } else{
            disponibilidade = true;
            dataVencimentoEmprestimo = null;

            System.out.println("Livro devolvido!");
        }
        
    }


    // Geters e Seters
    
    public String getTitulo() {
        return titulo;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public Date getDataVencimentoEmprestimo() {
        return dataVencimentoEmprestimo;
    }

    public void setDataVencimentoEmprestimo(Date dataVencimentoEmprestimo) {
        this.dataVencimentoEmprestimo = dataVencimentoEmprestimo;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getlancamento() {
        return lancamento;
    }

    public void setlancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponibilidade = disponivel;
    }

    

}
