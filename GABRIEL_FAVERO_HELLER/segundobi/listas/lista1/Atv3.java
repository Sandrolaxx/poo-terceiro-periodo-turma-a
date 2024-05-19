package segundobi.listas.lista1;

import java.util.List;
import java.util.ArrayList;

public class Atv3 {
    /*
     * Atv3 -Escreva um método que receba uma lista de strings contendo os jogos que
     * você já zerou. Caso tenha zerado mais de uma vez, adicione o nome do jogo
     * para cada vez. Após criar a lista de jogos zerados, retorne uma nova lista
     * contendo apenas as strings únicas (sem duplicatas).
     */

    public static void main(String[] args) {

        List<String> jogos = new ArrayList<String>();

        jogos.add("The Legend of Zelda: Ocarina of Time");
        jogos.add("The Legend of Zelda: Majora`s Mask");
        jogos.add("Dark Souls 1");
        jogos.add("Dark Souls 3");
        jogos.add("Dark Souls 3");
        jogos.add("Dark Souls 3");
        jogos.add("Dark Souls 3");
        jogos.add("Dark Souls 3");
        jogos.add("Dark Souls 3");
        jogos.add("Dark Souls 3");
        jogos.add("Dark Souls 3");
        jogos.add("The Legend of Zelda: Breath of the Wild");

        List<String> selecionadosJogos = selecionarJogos(jogos);

        System.out.println(selecionadosJogos);
    }

    public static List<String> selecionarJogos(List<String> jogos) {

        List<String> novaLista = new ArrayList<String>();

        for (String jogo : jogos) {
            if (!novaLista.contains(jogo)) {
                novaLista.add(jogo);
            }
        }
        return novaLista;
    }
}