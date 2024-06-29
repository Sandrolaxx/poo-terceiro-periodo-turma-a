package exemplos.aulasete;

import java.util.Date;

public class AulaSete {

    public static void main(String[] args) {
        
        Date date = new Date();
        long umDia = 86400000l;
        long msDaquiCincoDias = date.getTime() + (5 * umDia);
        Date dataDaquiCincoDias = new Date(msDaquiCincoDias);

        System.out.println();

    }
    






    // public static void main(String[] args) {

    //     Ninja ninjaUm = new Ninja();
    //     Ninja ninjaDois = new Ninja();
        
    //     ninjaUm.nome = "Naruto";
    //     ninjaUm.aldeia = "Folha";
    //     ninjaUm.cla = "Uzumaki";
    //     ninjaUm.idade = 16;
    //     ninjaUm.equipamento = "Shuriken";
    //     ninjaUm.nomeJutso = "Resengan";

    //     ninjaDois.nome = "Sasuke";
    //     ninjaDois.aldeia = "Folha";
    //     ninjaDois.cla = "Uchiha";
    //     ninjaDois.idade = 16;
    //     ninjaDois.equipamento = "Shuriken";
    //     ninjaDois.nomeJutso = "Chidori";

    //     // ninjaUm.apresentarse();
    //     // ninjaUm.realizarJutso();
    //     // System.out.println();
    //     // ninjaDois.apresentarse();
    //     // ninjaDois.realizarJutso();

    //     // Andorinha andorinha = new Andorinha();
    //     // AndorinhaAzul azul = new AndorinhaAzul();

    //     // andorinha.nome = "Cleber";

    //     // andorinha.bicar();
    //     // andorinha.voar();

    //     // azul.bicar();

    //     Aluno aluno = new Aluno();
    //     Professor profe = new Professor();
    //     Laboratorista lab = new Laboratorista();

    //     verificar(aluno);
    //     verificar(profe);
    //     verificar(lab);
    // }
    
    // public static void verificar(PessoaAbstrata pessoa) {
    //     pessoa.apresentarse();
    // }

}
