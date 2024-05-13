import java.util.List;

public class Aluno {
    
    private int idade, id;
    private String nome;
    private List<Livro> livros_alugados;

    public Aluno( int id,
        String nome,
        int idade){

        this.nome = nome;
        this.idade = idade;

    }

    public void setAluno(
        String nome,
        int idade){

        this.nome = nome;
        this.idade = idade;

    }

    public String getNome(){

        return this.nome;

    }

    public int getIdade(){

        return this.idade;

    }

    public void alugarLivro(Livro livro){
        livros_alugados.add(livro);
    }

}
