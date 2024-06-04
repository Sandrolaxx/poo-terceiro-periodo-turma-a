package BIM1.prova;

import java.util.Date;
import java.util.ArrayList;

public class Emprestimo {
    private Livro livro;
    private Aluno aluno;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Date dataAtrasoBase;
    private ArrayList <Integer> listaLivros;
    private ArrayList <Integer> listaEmprestimos;
    private double multaAtraso;
    
    public Emprestimo(Livro livro, Aluno aluno, Date dataEmprestimo) {
        this.livro = livro;
        this.aluno = aluno;
        this.dataEmprestimo = dataEmprestimo;
        this.listaLivros = listaLivros;
        this.listaEmprestimos = listaEmprestimos;
        this.dataDevolucao = dataDevolucao;
        this.multaAtraso = multaAtraso;

        long seteDias = 7 * 86400000l; 
        this.dataAtrasoBase = new Date(dataEmprestimo.getTime() + seteDias);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataAtrasoBase() {
        return dataAtrasoBase;
    }

    public void setDataAtrasoBase(Date dataAtrasoBase) {
        this.dataAtrasoBase = dataAtrasoBase;
    }

    public ArrayList<Integer> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(ArrayList<Integer> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public ArrayList<Integer> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(ArrayList<Integer> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    private boolean confirmarDevolucao(){
        if (dataAtrasoBase == null) {
           
            return false;

        }
        return dataEmprestimo.after(dataAtrasoBase);
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getMultaAtraso() {

        

        return multaAtraso;
    }

    
}
