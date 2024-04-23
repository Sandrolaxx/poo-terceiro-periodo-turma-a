package ProvaPB;

public class Aluno 
{
    protected String nomeAluno;
    protected String turmaAluno;
    protected int idadeAluno;

    public Aluno(String nomeAluno, String turmaAluno, int idadeAluno)
    {
        this.nomeAluno = nomeAluno;
        this.turmaAluno = turmaAluno;
        this.idadeAluno = idadeAluno;
    }

    void apresentarAluno()
    {
        System.out.println("Sou o aluno " + nomeAluno + " da turma " + turmaAluno + " e tenho " + idadeAluno + " anos");
    }
    
    public String getNomeA()
    {
        return nomeAluno;
    }

    public void setNomeA()
    {
        this.nomeAluno = nomeAluno;
    }

    public String getTurmaA()
    {
        return turmaAluno;
    }

    public void setTurmaA()
    {
        this.turmaAluno = turmaAluno;
    }

    public int getIdadeA()
    {
        return idadeAluno;
    }

    public void setIdadeA()
    {
        this.idadeAluno = idadeAluno;
    }
}
