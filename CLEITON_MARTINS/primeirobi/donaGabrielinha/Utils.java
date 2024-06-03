package primeirobi.donaGabrielinha;

import java.util.Date;

public class Utils 
{
    Date dataAtual = new Date();
    Long epochDataAtual = dataAtual.getTime();

    public static boolean isDataMaior(Date dataUm, Date dataDois)
    {
        return dataUm.getTime() > dataDois.getTime();
    }    
}
