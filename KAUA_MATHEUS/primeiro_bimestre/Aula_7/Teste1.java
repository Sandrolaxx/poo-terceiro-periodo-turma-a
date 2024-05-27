package primeiro_bimestre.Aula_7;

import java.text.DateFormat;
import java.util.Date;

public class Teste1 {
    
    public static void main(String[] args) {


        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));

        Date hoje = new Date();
        
    }

}
