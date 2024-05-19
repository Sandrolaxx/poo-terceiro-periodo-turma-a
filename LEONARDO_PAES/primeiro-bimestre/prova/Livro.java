package LEONARDO_PAES.primeiro_bimestre.prova;

import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;
    private Date dataEmprestimo;
    private Aluno alunoEmprestado;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setAlunoEmprestado(Aluno alunoEmprestado) {
        this.alunoEmprestado = alunoEmprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Aluno getAlunoEmprestado() {
        return alunoEmprestado;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
        this.dataEmprestimo = null;
        this.alunoEmprestado = null;
    }

    public void emprestar(Aluno aluno) {
        this.emprestado = true;
        this.dataEmprestimo = new Date();
        this.alunoEmprestado = aluno;
    }

    public void devolver() {
        this.emprestado = false;
        this.dataEmprestimo = null;
        this.alunoEmprestado = null;
    }
}