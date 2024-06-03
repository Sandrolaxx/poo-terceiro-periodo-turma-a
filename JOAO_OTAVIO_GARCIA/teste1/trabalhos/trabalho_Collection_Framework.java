import java.util.*;

public class queisso {

    public static void main(String[] args) {
        // Atividade 1
        ArrayList<String> Amigos = new ArrayList<>();
        Amigos.add("Felipe");
        Amigos.add("Heitor");
        Amigos.add("Cleiton");
        Amigos.add("Will");
        Amigos.add("Luiz");

        System.out.println("Atividade 1 :");
        for (String nome : Amigos) {
            System.out.println(nome.charAt(0) + " - " + nome);

        }

        // Atividade 2

        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);

        int numeroVerificar = 8;

        int quantidadeNumeroVerificar = 0;

        for (int num : numeros) {
            if (num == numeroVerificar) {
                quantidadeNumeroVerificar++;
            }
        }

        System.out.println("\nAtividade2:");
        System.out.println("Lista dos números" + numeros);
        System.out.println("Contém " + numeroVerificar + "? " + numeros.contains(numeroVerificar)
                + "/Quantas vezes apareceu na lista: " + quantidadeNumeroVerificar);

        numeroVerificar = 1;

        quantidadeNumeroVerificar = 0;

        for (int num : numeros) {
            if (num == numeroVerificar) {
                quantidadeNumeroVerificar++;
            }
        }
        System.out.println("Contém " + numeroVerificar + "? " + numeros.contains(numeroVerificar)
                + "/Quantas vezes apareceu na lista: " + quantidadeNumeroVerificar);

        numeroVerificar = 4;

        quantidadeNumeroVerificar = 0;

        for (int num : numeros) {
            if (num == numeroVerificar) {
                quantidadeNumeroVerificar++;
            }
        }
        System.out.println("Contém " + numeroVerificar + "? " + numeros.contains(numeroVerificar)
                + "/Quantas vezes apareceu na lista: " + quantidadeNumeroVerificar);

        // Atividade 3

        List<String> jogos = new ArrayList<>();
        jogos.add("Watch Dogs");
        jogos.add("Celeste");
        jogos.add("Minecraft");
        jogos.add("Dark Souls 1");
        jogos.add("Dark Souls 1");
        jogos.add("Celeste");
        jogos.add("Half Life 1");
        jogos.add("Half Life 2");
        jogos.add("Dark Souls 3");
        jogos.add("Portal 1");
        jogos.add("Portal 2");
        jogos.add("Dark Souls 3");
        jogos.add("Hollow Knight");
        jogos.add("My friend Pedro");
        jogos.add("Stray");
        jogos.add("Red dead Redemption 2");
        jogos.add("The witcher 3");
        jogos.add("Hot line Miami");
        jogos.add("SUPER CHICKEN JUMPER");

        System.out.println("\nAtividade 3:");
        System.out.println("Lista de jogos antes: " + jogos);
        List<String> jogosUnicos = removeDuplicatas(jogos);
        System.out.println("Lista de jogos únicos: " + jogosUnicos);

        // ATIVIDADE 4

        PriorityQueue<String> Animes = new PriorityQueue<>();
        Animes.add("Cowboy Bebop");
        Animes.add("Evagelion");
        Animes.add("One piece");
        Animes.add("Alucard");
        Animes.add("Fullmetal Alchemist: Brotherhood");

        System.out.println("\nAtividade 4:");
        System.out.println("Animes Favoritos");

        for (String anime : Animes) {

            System.out.println(anime);

        }

        // Atividade 5

        Map<String, String> Pc = new HashMap<>();
        Pc.put("Processador", "Ryzen 5 5600G");
        Pc.put("Placa de vídeo", "GTX 1660 SUPER");
        Pc.put("Memória RAM", "16GB DDR4");
        Pc.put("Armazenamento", "SSD 500GB");
        Pc.put("Armazenamento", "HD 2TB");
        Pc.put("Placa-mãe", "B450M S2H");

        System.out.println("\nAtivida 5");
        for (Map.Entry<String, String> entry : Pc.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static List<String> removeDuplicatas(List<String> lista) {
        Set<String> set = new LinkedHashSet<>(lista);
        return new ArrayList<>(set);
    }
}
