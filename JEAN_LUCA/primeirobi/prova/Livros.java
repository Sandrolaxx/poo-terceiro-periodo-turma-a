package JEAN_LUCA.primeirobi.prova;

public class Livros {
    private String titulo;
    private String autor;
    
    
    
   public void titulos(){
    System.out.println("\n nome do titulos na bliblioteca:"+this.titulo); 
   }
   public void autores(){
       System.out.println("Nome do Autores na biblioteca:\n "+ this.autor);
   }

    
    
    
    public String getTitulo() {
        return titulo;
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
}
