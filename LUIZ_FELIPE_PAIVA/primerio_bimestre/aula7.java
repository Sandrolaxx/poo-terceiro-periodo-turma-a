package primerio_bimestre;

public class aula7 {
    public static void main(String[] args) {
        
        Ninja ninjaUm = new Ninja();
        Ninja ninjaDois = new Ninja();

        ninjaUm.nome = "Naruto";
        ninjaUm.aldeia = "Folha";
        ninjaUm.cla = "Uzumaki";
        ninjaUm.idade = 15;
        ninjaUm.equipamento = "Shuriken";
        ninjaUm.nomeJutso = "Resengan";

        ninjaDois.nome = "Sasuke";
        ninjaDois.aldeia = "Folha";
        ninjaDois.cla = "Uchiha";
        ninjaDois.idade = 16;
        ninjaDois.equipamento = "Shuriken";
        ninjaDois.nomeJutso = "Chidori";

        ninjaUm.apresentarSe();
        ninjaUm.realizarJutso();

        ninjaDois.apresentarSe();
        ninjaDois.realizarJutso();
    }
}
