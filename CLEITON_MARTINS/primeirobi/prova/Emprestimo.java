package CLEITON_MARTINS.primeirobi.prova;

import java.util.Date;

public class Emprestimo extends Livros
{    
    Date dataAtual = new Date();
    Long dataEmprestimo = dataAtual.getTime();
    
    private Double valorEmprestimo = 5.0;

    public Double getValorEmprestimo()
    {
        return valorEmprestimo;
    }
    
    public String[] arrayEmprestimo = new String[3];
}
