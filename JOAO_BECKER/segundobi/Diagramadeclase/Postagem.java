package segundobi.Diagramadeclase;

public class Postagem {

    String titulo;
    String descricao;
    String pessoa;
    
    public Postagem(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
