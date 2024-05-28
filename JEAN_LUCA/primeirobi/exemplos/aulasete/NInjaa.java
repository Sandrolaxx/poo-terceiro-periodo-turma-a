package primeirobi.exemplos.aulasete;

import java.util.Date;

public class NInjaa {
    public static void main(String[] args) {
        
        Date date = new Date();
        long umDia = 86400000l; // milisegundos em um dia
        long msDaquiCincoDias = date.getTime() + (5 * umDia);
        Date dataDaquiCincoDias = new Date(msDaquiCincoDias);
        System.out.println(dataDaquiCincoDias);
        



        // Ninja ninjaprimeiro = new Ninja();

        // ninjaprimeiro.nome ="narutinho";
        // ninjaprimeiro.idade = 16;
        // ninjaprimeiro.aldeia ="folha";
        // ninjaprimeiro.cla ="uzumaki";
        // ninjaprimeiro.equipamento ="odama";
        // ninjaprimeiro.justo ="rasengan";
        
        // Ninja ninjasegundo = new Ninja();
        // ninjasegundo.nome ="sasuke";
        // ninjasegundo.idade = 15;
        // ninjasegundo.aldeia ="som";
        // ninjasegundo.cla ="uchira";
        // ninjasegundo.equipamento ="kirin";
        // ninjasegundo.justo ="chidori ";

        // ninjaprimeiro.apresentarSe();
        // ninjaprimeiro.realizajutso();
        // System.out.println("------------------------------");
        // ninjasegundo.apresentarSe();
        // ninjasegundo.realizajutso();

        Andorinha andorinhaum = new Andorinha();
        

       andorinhaum.bicar();
         andorinhaum.voar();
    }
    
}
