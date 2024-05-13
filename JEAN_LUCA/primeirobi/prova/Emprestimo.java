package JEAN_LUCA.primeirobi.prova;

import java.util.Date;
public class Emprestimo extends Livros{
   private Date emprestimos;
   private String devolucao;
   private Date multa;
   private Livros livro;
   private double multas;


public  Emprestimo() {
    Long msDia = 86400000l;
    Long setedias = new Date().getTime() + (7 * msDia);


    System.out.println( this.emprestimos = new Date()  );
    this.multa= new Date(setedias);
   
}
 public void multa(){ 
System.out.println("data de empretimo: "+new Date());
Long msDia = 86400000l;
Long oitodias = new Date().getTime() + (8 * msDia);
System.out.println("Data da multa: "+new Date(oitodias));

 }

 public void devolucao(){
    Long msDia = 86400000l;
    Long setedias = new Date().getTime() + (7 * msDia);
    System.out.println(this.multa= new Date(setedias));
     }

     public void multas(){
        System.out.println("sua multa e de "+ this.multas);
     }


public Livros getLivro() {
    return livro;
}
public double getMultas() {
    return multas;
}
public void setMultas(double multas) {
    this.multas = multas;}









public void setLivro(Livros livro) {
    this.livro = livro;
}




public Date getEmprestimos() {
    return emprestimos;
}
public void setEmprestimos(Date emprestimos) {
    this.emprestimos = emprestimos;
}
public String getDevolucao() {
    return devolucao;
}
public void setDevolucao(String devolucao) {
    this.devolucao = devolucao;
}
public Date getMulta() {
    return multa;
}
public void setMulta(Date multa) {
    this.multa = multa;
}
}
