package primeirobi.exemplos.aulasete;

import java.util.Date;

public class tentivadata {
    
    public static void main(String[] args) {

        
        Date date = new Date();
        long umDia = 86400000l;

        long msDaquiCincoDias = date.getTime() + (5 * umDia);
        Date dataDaquiCincoDias = new Date(msDaquiCincoDias);

        System.out.println(dataDaquiCincoDias);

       //System.out.println(date);
    }
    
}
