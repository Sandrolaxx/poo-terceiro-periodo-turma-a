import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        Atividade_001(args);
        System.out.println("\n\n");
        Atividade_002(args);
        System.out.println("\n\n");
        Atividade_003(args);
        System.out.println("\n\n");
        Atividade_004(args);
        System.out.println("\n\n");
        Atividade_005(args);
    }

    // ======= Atividade 001 =======
    public static void Atividade_001(String[] args) {

        ArrayList<String> alunos = new ArrayList<String>();

        alunos.add("Ana");
        alunos.add("Pedro");
        alunos.add("Maria");
        alunos.add("João");
        alunos.add("Vanessa");

        for (String i : alunos) {
            System.out.println(i.charAt(0) + " - " + i);
        }
    }

    // ======= Atividade 002 =======
    public static void Atividade_002(String[] args) {

        HashSet<Integer> numeros = new HashSet<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(2);
        numeros.add(1);
        System.out.println("HashSet de números: " + numeros);
        procuraNumero(numeros, 1);
        procuraNumero(numeros, 2);
        procuraNumero(numeros, 3);
        procuraNumero(numeros, 4);
        procuraNumero(numeros, 5);
    }

    public static void procuraNumero(HashSet<Integer> numeros, int procura) {

        if (numeros.contains(procura)) {

            System.out.println("O número " + procura + " foi encontrado no HashSet.");

        } else {

            System.out.println("O número " + procura + " não foi encontrado no HashSet.");

        }
    }

    // ======= Atividade 003 =======
    public static void Atividade_003(String[] args) {

        List<String> listaJogos = List.of("Zelda", "Zelda", "The Witcher 3", "Final Fantasy VII", "Super Mario Odyssey",
                "Red Dead Redemption 2", "Minecraft", "Dark Souls 3");

        System.out.println("Lista de Jogos Zerados com Duplicados" + listaJogos);

        HashSet<String> jogosZerados = new HashSet<String>(listaJogos);

        System.out.println("Lista de Jogos Zerados sem Duplicados " + jogosZerados);

    }

    // ======= Atividade 004 =======
    public static void Atividade_004(String[] args) {

        ArrayList<String> melhoresFilmes = new ArrayList<String>();

        melhoresFilmes.add("O Senhor dos Anéis");
        melhoresFilmes.add("O Poderoso Chefão");
        melhoresFilmes.add("Interestelar");
        melhoresFilmes.add("A Origem");
        melhoresFilmes.add("Clube da Luta");
        melhoresFilmes.add("Cidade de Deus");
        melhoresFilmes.add("Matrix");
        melhoresFilmes.add("O Iluminado");
        melhoresFilmes.add("Pulp Fiction");

        System.out.println(melhoresFilmes);

        PriorityQueue<String> melhoresFilmesOrdenados = new PriorityQueue<String>(melhoresFilmes);

        while (!melhoresFilmesOrdenados.isEmpty()) {
            System.out.println(melhoresFilmesOrdenados.poll());
        }
    }

    // ======= Atividade 005 =======
    public static void Atividade_005(String[] args) {

        HashMap<String, String> minhasPecas = new HashMap<String, String>();
        minhasPecas.put("Procesador:", "11th Gen Intel(R) Core(TM) i5-11400H @ 2.70GHz   2.69 GHz");
        minhasPecas.put("Placa de Vídeo:", "NVIDIA GeForce RTX 3080");
        minhasPecas.put("Memória RAM:", "32GB DDR4 3200MHz");
        minhasPecas.put("SSD:", "Samsung 970 EVO Plus 2000GB");
        minhasPecas.put("Monitor:", "Dell Ultrasharp U2719D");

        for (String i : minhasPecas.keySet()) {
            System.out.println(i + " - " + minhasPecas.get(i));
        }

    }
}