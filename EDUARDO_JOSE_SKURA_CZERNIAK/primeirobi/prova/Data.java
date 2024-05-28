package EDUARDO_JOSE_SKURA_CZERNIAK.primeirobi.prova;

public abstract class Data extends DadosLivro{

    public Data(String tituloLivro, String autorLivro, String disponibilidadeLivro, String numeroEmprestimo,
            String empNome, String empId, String empCurso, Long diaDate,
            EDUARDO_JOSE_SKURA_CZERNIAK.primeirobi.prova.Date horarioAgora, Long seteDias) {
        super(tituloLivro, autorLivro, disponibilidadeLivro, numeroEmprestimo, empNome, empId, empCurso, diaDate, horarioAgora,
                seteDias);
            }

    public static void main(String[] args) {
        Long diaDate = 86400000l;
        Date horarioAgora = new Date();
        Long seteDias = diaDate * 7;
        System.out.println(diaDate);
        System.out.println(horarioAgora);
        System.out.println(seteDias);
        
    }





}
