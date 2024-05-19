package primeirobi.exemplos.aulasete;

import java.util.Date;

public class AulaSete {
    
    public static void main(String[] args) {

        Date date = new Date();
        long umDia = 86400000l;
        long msDaquiCincoDias = date.getTime() + (5 * umDia);
        Date dataDaquiCincoDias = new Date(msDaquiCincoDias);

        System.out.println(dataDaquiCincoDias);
        //Ninja ninjaUm = new Ninja();
        //Ninja ninjaDois = new Ninja();

        //ninjaUm.nome = "Felix";
        //ninjaUm.aldeia = "Aura";
        //ninjaUm.cla = "Tikani";
        //ninjaUm.idade = 21;
        //ninjaUm.equipamento = "Excalibur";
        //ninjaUm.nomeJutsu = "Wonderland";

        //ninjaDois.nome = "Hyu";
        //ninjaDois.aldeia = "Soul";
        //ninjaDois.cla = "Misuri";
        //ninjaDois.idade = 19;
        //ninjaDois.equipamento = "Chicote";
        //ninjaDois.nomeJutsu = "Psycho";

        //ninjaUm.apresentarSe;
        //ninjaUm.realiazarJutsu;

        //ninjaDois.apresentarSe;
        //ninjaDois.realizarJutsu;

        //Andorinha andorinha = new Andorinha();

        //andorinha.nome = "Karina";

        //andorinha.bicar();
        //andorinha.voar();
    }
}
