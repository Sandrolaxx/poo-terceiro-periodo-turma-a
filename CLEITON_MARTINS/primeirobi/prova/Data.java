package CLEITON_MARTINS.primeirobi.prova;
import java.util.Date;

public class Data 
{
    Date dataAtual = new Date();

    Long epochData = dataAtual.getTime();

    public static boolean dataMaior(Date dataUm, Date dataDois)
    {
        return dataUm.getTime() > dataDois.getTime();
    }
}