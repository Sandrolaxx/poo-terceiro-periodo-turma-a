package segundobim.listas.list1;

import java.util.Scanner;

public class Lista1 {

    // ATV 4 COLOCAR EM MÉTODO //

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolha;

        System.out.println("Insira a opção que deseja: ");
        System.out.println("1. Nome dos amigos + inicial");
        System.out.println("2. Insira numeros e veja quantos se repetem.");
        System.out.println("3. Insira os jogos que já zerou.");
        System.out.println("4. Inserir seus animes favoritos.");
        System.out.println("5. Configurações do PC.");

        escolha = scanner.nextInt();

        switch (escolha) {

            case 1:
            Amigos amigos = new Amigos(); // ArrayList
            amigos.favoritoAmigo();

            break;

            case 2:
                Numeros numeros = new Numeros(); // HashSet
                numeros.numerosRepetidos();
                break;

            case 3:
                Jogos jogo = new Jogos(); // HashSet
                jogo.jogosZerados();
                break;

            case 4:
                Anime anime = new Anime(); // PriorityQueue
                anime.insereAnimeNome();
                break;

            case 5:
                Computador computador = new Computador(); // Map
                computador.computadorEspecific();

        }
        scanner.close();
    }
}
