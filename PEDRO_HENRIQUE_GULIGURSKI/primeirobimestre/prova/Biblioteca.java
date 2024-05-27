package primeirobimestre.prova;

import java.util.Date;

public class Biblioteca {
    
    private Livro[] estante = new Livro[30];
    private Aluno[] listaDeAlunos = new Aluno[30];

    public Biblioteca(Livro[] estante, Aluno[] listaDeAlunos) {
        this.estante = estante;
        this.listaDeAlunos = listaDeAlunos;
    }

    Integer estantePos = 0;
    public Livro cadastrarLivro(String titulo, String autor, Livro[] estante){
        Livro livro = new Livro(titulo, autor);
        System.out.println("Livro '"+titulo+"' cadastrado.");
        estante[estantePos] = livro; 
        estantePos++;
        return livro;
    }

    Integer alunosPos = 0;
    public Aluno cadastraAluno(String nome, String turma){
        Aluno aluno = new Aluno(nome, turma);
        System.out.println("Aluno "+nome+" cadastrado.\nMatricula "+aluno.getNumeroMatricula());
        listaDeAlunos[alunosPos] = aluno; 
        alunosPos++;
        return aluno;
    }
    Integer posEmprestimo = 0;
    public Livro emprestar(String titulo, Livro[] emprestado, Livro[] estante){
        Livro livro = buscarTitulo(titulo, estante);
        if (livro.getDisponibilidade() == true) {
            livro.setDataLocacao(new Date());
            livro.setDisponibilidade(false);
            long umDia = 86400000l;
            long dataSeteDias = livro.getDataLocacao().getTime() + (umDia*7);
            livro.setDataVencimentoLocacao(new Date(dataSeteDias));
            System.out.println("O livro '"+livro.getTitulo()+"' foi emprestado.");
            emprestado[posEmprestimo] = livro;
            return livro;
        } else {
            System.out.println("O livro '"+livro.getTitulo()+"' estava indisponível, e não foi emprestado.");
            return livro;
        }  
        
    }

    public Livro devolver(Livro livro){
        livro.setDataDevolucao(new Date());
        livro.setDisponibilidade(true);
        System.out.println("O livro '"+livro.getTitulo()+"' foi devolvido.");
        return livro;
    }
    
    public Livro buscarTitulo(String titulo, Livro[] estante){
        for (int i = 0; i < estante.length; i++){
            if (titulo.equals(estante[i].getTitulo()) ) {
                if (estante[i].getDisponibilidade() == true){
                    System.out.println("O livro '"+titulo+"' está disponível para locação.");
                } else {
                    System.out.println("O livro '"+titulo+"' não está está disponível para locação.");
                }
                return estante[i];
            }
        }
        return estante[1];
    }

    public boolean buscarAutor(String autor, Livro[] estante){
        for (int i = 0; i < estante.length; i++){
            if (autor.equals(estante[i].getAutor())) {
                if (estante[i].getDisponibilidade() == true){
                    System.out.println("O livro  do autor "+autor+", "+estante[i].getTitulo()+"está disponível para locação.");
                } else {
                    System.out.println("O livro do autor"+ ", "+estante[i].getTitulo()+" não está está disponível para locação.");
                }
                return true;
            }
        }
        return false;
    }

    public Livro[] getEstante() {
        return estante;
    }

    public void setEstante(Livro[] estante) {
        this.estante = estante;
    }

    public Aluno[] getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(Aluno[] listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }


}
