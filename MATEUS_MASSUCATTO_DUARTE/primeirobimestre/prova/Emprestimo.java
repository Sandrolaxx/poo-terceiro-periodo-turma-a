package MATEUS_MASSUCATTO_DUARTE.primeirobimestre.prova;

import java.util.Date;

public class Emprestimo 
{
    Date dataEmprestimo;
    Date multaEmprestimo;
    
    public void confirmarMulta(Emprestimo emprestimo)
    {
        Date dataAtual = new Date();
        if (emprestimo.multaEmprestimo.after(dataAtual))
        {
            System.out.println("Emprestimo confirmado");
        }
        else
        {
            System.out.println("Emprestimo vencido, multa sendo aplicada");
        }
    }
}
