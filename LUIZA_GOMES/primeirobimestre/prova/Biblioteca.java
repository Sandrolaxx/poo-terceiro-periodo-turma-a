package LUIZA_GOMES.primeirobimestre.prova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Biblioteca {
    private List<Livro> livros;
    private List<Aluno> alunos;
    private List<Emprestimo> emprestimos;
    private Map<Livro, Integer> multas;

    public Biblioteca() {
        livros = new ArrayList<>();
        alunos = new ArrayList<>();
        emprestimos = new ArrayList<>();
        multas = new HashMap<>();
    }

    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
    }

    public void cadastrarAluno(String nome, int matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);
    }

    public void emprestarLivro(String titulo, Aluno aluno) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null && livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, aluno);
            emprestimos.add(emprestimo);
            livro.setDisponivel(false);
        }
    }

    public void devolverLivro(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        if (livro != null) {
            for (Emprestimo emprestimo : emprestimos) {
                if (emprestimo.getLivro().equals(livro) && !emprestimo.isDevolvido()) {
                    emprestimo.setDevolvido(true);
                    livro.setDisponivel(true);
                    int diasAtraso = calcularDiasAtraso(emprestimo);
                    if (diasAtraso > 0) {
                        aplicarMulta(livro, diasAtraso);
                    }
                    return;
                }
            }
        }
    }

    private int calcularDiasAtraso(Emprestimo emprestimo) {
        // Implemente o cálculo de dias de atraso aqui
        // Por simplicidade, vamos retornar um número aleatório neste exemplo
        return 5;
    }

    private void aplicarMulta(Livro livro, int diasAtraso) {
        double multa = 3.50 * diasAtraso;
        multas.put(livro, (int) multa);
    }

    public boolean verificarDisponibilidade(String titulo) {
        Livro livro = buscarLivroPorTitulo(titulo);
        return livro != null && livro.isDisponivel();
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public Livro buscarLivroPorAutor(String autor) {
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                return livro;
            }
        }
        return null;
    }

    public Aluno[] getAlunos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlunos'");
    }
}
