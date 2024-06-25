package primeirobi.provas.primeirachamada2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    public List<Livro> livros = new ArrayList<>();
    public List<Aluno> alunos = new ArrayList<>();

    public void cadastrarLivro (Livro livro){
        livros.add(livro);
    }

    public void cadastrarAluno (Aluno aluno){
        alunos.add(aluno);
    }

    public Livro buscarPorId(String idlivro) {
        for (Livro livro : livros) {
            if (livro.getIdLivro().equalsIgnoreCase(idlivro)){
                return livro;
            }
        }
        return null;
    }

    // Realizar Empréstimo

    public boolean realizarEmprestimo(String idLivro) {
        Livro livro =  buscarPorId(idLivro);
        // Se livro EXISTE e está disponivel poderá ser emprestado
                if (livro != null && livro.isDisponivel()) {
                    System.out.println("[Aguarde...]");
            livro.setDisponibilidade(false); // MARCAR COMO INDISPONIVEL!!!
            return true;
        }
        return false;
    }

    // Realizar Devolução

    public boolean RealizarDevolucao(String idlivro){
        Livro livroDevolucao = buscarPorId(idlivro);
        //Se livro oossui id e está disponível
        if (livroDevolucao != null && !livroDevolucao.isDisponivel()) {
            System.out.println("[Aguarde...]");
            livroDevolucao.setDisponibilidade(true);  // MARCAR COMO DISPONIVEL!!!
            return true;
        }
        return false;
    }

    //Verificar Disponibilidade o return é true

    public boolean verificarDisp(String idLivro) {
        Livro livroDisponibilidade = buscarPorId(idLivro);
        return livroDisponibilidade != null & !livroDisponibilidade.isDisponivel();
    }
}
