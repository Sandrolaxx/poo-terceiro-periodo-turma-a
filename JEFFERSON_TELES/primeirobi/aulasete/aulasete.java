package primeirobi.aulasete;

public class aulasete {
    
    public static void main(String[] args) {
        nija nijaUm = new nija();
        nija nijaDois = new nija();

        nijaUm.nome = "goku";
        nijaUm.aldeia = "vileagok";
        nijaUm.cla = "uzumaki";
        nijaUm.idade = "16";
        nijaUm.equipamento = "shuriken";
        nijaUm.nomeJusto = "resengam"; 

        nijaDois.nome = "goku";
        nijaDois.aldeia = "vileagok";
        nijaDois.cla = "kakaroto";
        nijaDois.idade = "18";
        nijaDois.equipamento = "shurikonn";
        nijaDois.nomeJusto = "shidori"; 

        nijaUm.apresentarse();
        nijaUm.realizarJusto();


        nijaDois.apresentarse();
        nijaDois.realizarJusto();
   
    }

}
