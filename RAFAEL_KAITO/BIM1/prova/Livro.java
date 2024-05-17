package RAFAEL_KAITO.BIM1.prova;

public class Livro {
    private String titulo;
    private String autor;
    private boolean posse;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.posse = posse;
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

    public boolean isPosse() {
        return posse;
    }

    public void setPosse(boolean posse) {
        this.posse = posse;
    }
    
   

}
