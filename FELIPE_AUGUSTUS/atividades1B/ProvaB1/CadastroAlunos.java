package ProvaB1;

import java.util.HashMap;
import java.util.Map;

public class CadastroAlunos {
    private Map<Integer, Aluno> alunos;

    public CadastroAlunos() {
        alunos = new HashMap<>();
        inserirAluno(new Aluno(1001, "João da Silva"));
        inserirAluno(new Aluno(1002, "Maria Oliveira"));
        inserirAluno(new Aluno(1003, "Pedro Santos"));
    }

    public void inserirAluno(Aluno aluno) {
        alunos.put(aluno.getMatricula(), aluno);
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        return alunos.get(matricula);
    }

    public boolean alunoExiste(int matricula) {
        return alunos.containsKey(matricula);
    }
}
