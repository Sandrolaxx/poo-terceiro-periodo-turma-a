package PRIMEIRO_BIMESTRE.exemplos.aulaSete;

public class AulaSete {
    public static void main(String[] args) {
        Ninja ninjaUm = new Ninja();

        ninjaUm.nome = "Naruto";
        ninjaUm.idade = 20;
        ninjaUm.aldeia = "sim";
        ninjaUm.cla = "ok";
        ninjaUm.equipamento = "adaga";
        ninjaUm.nomeJutso = "sim";

        ninjaUm.apresentarse();
        ninjaUm.realizarJutso();
    }
}
