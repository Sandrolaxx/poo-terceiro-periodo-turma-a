package Testes.HerancaToString;

public class App {
    public static void main(String[] args) {
        //Serie serieQualquer = new Serie("The Last of Us", 1, 2023);
        //System.out.println(serieQualquer);
        //Serie serieQualquer2 = new Serie("Prison Break", 5, 2008);
        //System.out.println(serieQualquer2);

        Personagem personagem = new Personagem("Joao");
        System.out.println(personagem);
        personagem.atacar();
        Arqueiro arqueiro = new Arqueiro("Botina");
        System.out.println(arqueiro);
        arqueiro.atacar();

    }
}
