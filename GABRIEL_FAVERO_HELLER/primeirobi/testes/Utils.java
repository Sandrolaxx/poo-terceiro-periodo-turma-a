package primeirobi.testes;

import java.util.Date;

public class Utils {
    
    public static void main(String[] args) {

        Long umDiaEmMs = 86400000l;
        Date agora = new Date();
        Date dataSemHora = new Date(agora.getYear(), agora.getMonth(), agora.getDate());
        // Year começa em 1900 (Sempre diminuir do ano atual (2024 - 1900))
        Date vinteTresAbril = new Date(124, 03, 24);
        Long vinteTresAbrilEpoch = vinteTresAbril.getTime();

        System.out.println(agora.toString());

        System.out.println(dataSemHora.toString());

        System.out.println(vinteTresAbril.toString());

        System.out.println(vinteTresAbrilEpoch.toString());

        System.out.println(dataSemHora.getTime());

        System.out.println(vinteTresAbrilEpoch - dataSemHora.getTime());

        System.out.println((vinteTresAbril.getTime() - dataSemHora.getTime()) / umDiaEmMs);
    
    }
}
