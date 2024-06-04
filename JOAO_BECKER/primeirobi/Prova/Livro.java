package primeirobi.Prova;
import java.util.Date;
import java.util.Scanner;


public class Livro {

    private String nome;
    private String autor;
    private Boolean emprestado;
    private Date dataEmprestimo;
    private Aluno aluno;
    
    public Livro(String nome, String autor, Boolean emprestado, Date dataEmprestimo, Aluno aluno) {
        this.nome = nome;
        this.autor = autor;
        this.emprestado = emprestado;
        this.dataEmprestimo = dataEmprestimo;
        this.aluno = aluno;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Boolean getEmprestado() {
        return emprestado;
    }
    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void emprestarLivro(){
        Scanner scanner = new Scanner(System.in);
        int teste;
        if (getEmprestado()==true){
            System.out.println("O livro está indisponível.");  
        }else{
            System.out.println("O livro está disponível.");
            System.out.println("[1] - Realizar emprestimo\n[2] -  cancelar"); 
            teste = scanner.nextInt();
            if (teste == 1) {
                Aluno alunoEmprestimo = new Aluno(null);
                System.out.println("Insira nome do aluno: ");
                alunoEmprestimo.setNome(scanner.next());

                setAluno(alunoEmprestimo);
                setEmprestado(true);
                System.out.println("O livro foi emprestado com sucesso!");
            }       
        }
    } 

    public void devolverLivro(){
        Scanner scanner = new Scanner(System.in);
        int teste;
        if (getEmprestado()==true){
            System.out.println("O livro foi devolvolvido com sucesso");
            setEmprestado(false);
        }else{
            System.out.println("O livro está discponível");
        }
    } 
}
