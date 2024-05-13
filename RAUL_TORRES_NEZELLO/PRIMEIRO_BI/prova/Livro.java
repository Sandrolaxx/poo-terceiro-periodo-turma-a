package RAUL_TORRES_NEZELLO.PRIMEIRO_BI.prova;

import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private int id;
    private Date dataEmprestimo;
   public Livro(int id, String titulo, String autor, Date dataEmprestimo){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.dataEmprestimo = dataEmprestimo;
   }
   public Date calcularDataVencimentoReserva() {
    long msDia = 86400000L;
    long seteDias = dataEmprestimo.getTime() + (7 * msDia);
    return new Date(seteDias);
}
public String getTitulo() {
    return titulo;
}

public String getAutor() {
    return autor;
}
public int getId() {
    return id;
}
public Date getDataEmprestimo() {
    return dataEmprestimo;
}

   public void emprestimoLivro(){
    System.out.println("Livro "+titulo+" de autoria por "+autor+" foi emprestado com sucesso!");
   }
   public void devolucaoLivro(){
    System.out.println("Livro "+titulo+" de autoria por "+autor+" foi devolvido com sucesso!");
   }
   public void apresentarLivro(){
    System.out.println("Id "+id+" Livro "+titulo+" de autoria por "+autor);
   }
}
