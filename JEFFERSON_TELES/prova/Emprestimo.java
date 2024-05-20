package prova;

import java.util.HashMap;
import java.util.Map;

public class Emprestimo {
    Map<Livros, Alunos> emprestimos = new HashMap<>();
    Map<Livros, Integer> diasAtraso = new HashMap<>();

    public boolean emprestar(Livros livro, Alunos aluno) {
        if (emprestimos.containsKey(livro)) {
            return false; 
        }

        emprestimos.put(livro, aluno);
        return true; 
    }

    public boolean devolver(Livros livro) {
        if (!emprestimos.containsKey(livro)) {
            return false; 
        }

        emprestimos.remove(livro);
        return true; 
    }

    public boolean verificarDisponibilidade(Livros livro) {
        return !emprestimos.containsKey(livro);
    }

    public double calcularMulta(String tituloLivro, int diasAtraso) {
        return diasAtraso * 3.50; 
    
    }
}
