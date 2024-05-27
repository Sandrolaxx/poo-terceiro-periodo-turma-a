package EDUARDO_JOSE_SKURA_CZERNIAK.primeirobi.prova;

public class Aluno extends Data{
    


    public Aluno(String tituloLivro, String autorLivro, String disponibilidadeLivro, String numeroEmprestimo,
            String empNome, String empId, String empCurso, Long diaDate, Date horarioAgora, Long seteDias) {
        super(tituloLivro, autorLivro, disponibilidadeLivro, numeroEmprestimo, empNome, empId, empCurso, diaDate, horarioAgora,
                seteDias);
    }

    private String nomeAluno;
    private String idAluno;
    private String cursoAluno;
    

    public void apresentarAluno() {
        System.out.println("Olá me chamo " + nomeAluno + " meu ID é " + idAluno + " e estou cursando " + cursoAluno);
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    



}
