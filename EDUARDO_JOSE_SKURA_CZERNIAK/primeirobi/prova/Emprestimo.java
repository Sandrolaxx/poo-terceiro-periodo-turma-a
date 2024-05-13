package EDUARDO_JOSE_SKURA_CZERNIAK.primeirobi.prova;

import java.util.Date;

public class Emprestimo extends Aluno{


    String numeroEmprestimo;
    String empNome;
    String empId;
    String empCurso;

    Long diaDate = 86400000l;
    Date horarioAgora = new Date();
    Long seteDias = diaDate * 7;

    public Emprestimo(String tituloLivro, String autorLivro, String disponibilidadeLivro, String numeroEmprestimo,
            String empNome, String empId, String empCurso, Long diaDate, Date horarioAgora, Long seteDias) {
        super(tituloLivro, autorLivro, disponibilidadeLivro, empCurso, empCurso, empCurso, empCurso, seteDias, null, seteDias);
        this.numeroEmprestimo = numeroEmprestimo;
        this.empNome = empNome;
        this.empId = empId;
        this.empCurso = empCurso;
        this.diaDate = diaDate;
        this.horarioAgora = horarioAgora;
        this.seteDias = seteDias;
    }

    





    public String getNumeroEmprestimo() {
        return numeroEmprestimo;
    }







    public void setNumeroEmprestimo(String numeroEmprestimo) {
        this.numeroEmprestimo = numeroEmprestimo;
    }







    public String getEmpNome() {
        return empNome;
    }







    public void setEmpNome(String empNome) {
        this.empNome = empNome;
    }







    public String getEmpId() {
        return empId;
    }







    public void setEmpId(String empId) {
        this.empId = empId;
    }







    public String getEmpCurso() {
        return empCurso;
    }







    public void setEmpCurso(String empCurso) {
        this.empCurso = empCurso;
    }







    public Long getDiaDate() {
        return diaDate;
    }







    public void setDiaDate(Long diaDate) {
        this.diaDate = diaDate;
    }

    public void setHorarioAgora(Date horarioAgora) {
        this.horarioAgora = horarioAgora;
    }







    public Long getSeteDias() {
        return seteDias;
    }







    public void setSeteDias(Long seteDias) {
        this.seteDias = seteDias;
    }







    public void processoEmprestimo (){
            System.out.print("O número do processo é de ");
            System.out.print(numeroEmprestimo);
            System.out.print(", realizado no horário ");
            System.out.print(new Date());
            System.out.print(", pelo aluno ");
            System.out.print(empNome);
            System.out.print(", do id ");
            System.out.print(empId);
            System.out.print(", do curso de ");
            System.out.print(empCurso);
            System.out.println("");

        }



}
