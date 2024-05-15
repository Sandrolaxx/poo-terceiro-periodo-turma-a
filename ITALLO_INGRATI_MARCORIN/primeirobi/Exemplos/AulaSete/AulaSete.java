package primeirobi.Exemplos.AulaSete;

public class AulaSete {
    public static void main(String[] args) {
        Ninja ninjaum = new Ninja();
        Ninja ninjadois = new Ninja();

        ninjaum.nome = "Naruto";
        ninjaum.idade = 16;
        ninjaum.aldeia = "Folha";
        ninjaum.cla = "Uzumaki";
        ninjaum.equipamento = "Shuriken";
        ninjaum.nomeJutsu = "Rasengan";

        ninjadois.nome = "Sasuke";
        ninjadois.idade = 16;
        ninjadois.aldeia = "Folha";
        ninjadois.cla = "Uchiha";
        ninjadois.equipamento = "Shuriken";
        ninjadois.nomeJutsu = "Chidori";

        ninjaum.apresentarse();
        ninjaum.realizarJutso();
        System.out.println();  
        ninjadois.apresentarse();
        ninjadois.realizarJutso();
    }
}
