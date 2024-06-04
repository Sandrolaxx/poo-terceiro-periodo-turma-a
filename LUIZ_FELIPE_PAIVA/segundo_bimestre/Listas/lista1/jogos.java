package segundo_bimestre.Listas.lista1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class jogos {
    public static void main(String[] args) {
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("GTA V");
        jogosZerados.add("GOW 3");
        jogosZerados.add("Resident Evil 4");
        jogosZerados.add("The Witcher 3");
        jogosZerados.add("GTA V"); 
        jogosZerados.add("Resident Evil 4"); 

        List<String> jogosUnicos = removerDuplicatas(jogosZerados);

        System.out.println("Jogos zerados únicos:");
        for (String jogo : jogosUnicos) {
            System.out.println(jogo);
        }
    }

    public static List<String> removerDuplicatas(List<String> lista) {
        HashSet<String> conjunto = new HashSet<>(lista);
        return new ArrayList<>(conjunto);
    }
}

