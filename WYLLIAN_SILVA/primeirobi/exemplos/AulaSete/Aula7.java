package primeirobi.exemplos.AulaSete;

public class Aula7 {

    public static void main(String[] args) {
        
        Ninja ninjaUm = new Ninja();
        Ninja ninjaDois = new Ninja();

        ninjaUm.nome = "Naruto";
        ninjaUm.aldeia = "Folha";
        ninjaUm.cla = "Uzumaki";
        ninjaUm.idade = 16;
        ninjaUm.equipamento = "Shuriken";
        ninjaUm.nomeJutso = "Rasengan";

        ninjaDois.nome = "Sasuke";
        ninjaDois.aldeia = "Folha";
        ninjaDois.cla = "Uchiha";
        ninjaDois.idade = 16;
        ninjaDois.equipamento = "Shuriken";
        ninjaDois.nomeJutso = "Chidori";

        ninjaUm.apresentarse();
        ninjaUm.realizarJutsu();

        ninjaDois.apresentarse();
        ninjaDois.apresentarse();

        Andorinha andorinha = new Andorinha();
        andorinha.nome = "Bartholomew";
        andorinha.voar();
        andorinha.bicar();

    }
    
}
