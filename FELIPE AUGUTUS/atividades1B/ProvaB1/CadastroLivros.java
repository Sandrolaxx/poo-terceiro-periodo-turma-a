package ProvaB1;

import java.util.HashMap;
import java.util.Map;

public class CadastroLivros {
    private Map<String, Livro> livros;

    public CadastroLivros() {
        livros = new HashMap<>();
        inserirLivro(new Livro("Java: Como Programar", "Deitel & Deitel"));
        inserirLivro(new Livro("Clean Code", "Robert C. Martin"));
        inserirLivro(new Livro("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"));
    }

    public void inserirLivro(Livro livro) {
        livros.put(livro.getTitulo(), livro);
    }

    public Livro getLivroPorTitulo(String titulo) {
        for (Livro livro : livros.values()) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro getLivroPorAutor(String autor) {
        for (Livro livro : livros.values()) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                return livro;
            }
        }
        return null;
    }

    public Livro getLivroDisponivelPorTitulo(String titulo) {
        for (Livro livro : livros.values()) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                return livro;
            }
        }
        return null;
    }


    }

