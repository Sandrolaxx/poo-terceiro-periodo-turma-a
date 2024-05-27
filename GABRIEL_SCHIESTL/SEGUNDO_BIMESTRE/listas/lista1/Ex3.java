package SEGUNDO_BIMESTRE.listas.lista1;

import java.util.List;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {

        List<String> games = new ArrayList<String>();

        games.add("Minecraft");
        games.add("Minecraft");
        games.add("Ben 10");
        games.add("RE 4");
        games.add("RE 4");
        games.add("Medal of Honor");
        games.add("Black");

        List<String> selectedGames = selectGames(games);

        System.out.println(selectedGames);
    }

    public static List<String> selectGames(List<String> games) {

        List<String> newList = new ArrayList<String>();

        for (String game : games) {
            if (!newList.contains(game)) {
                newList.add(game);
            }
        }

        return newList;
    }
}
