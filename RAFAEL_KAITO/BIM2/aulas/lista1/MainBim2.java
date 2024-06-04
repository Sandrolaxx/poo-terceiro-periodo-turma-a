package BIM2.aulas.lista1;
    
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class MainBim2 {
    //atv 1 -------------------------------------


    public static void listarColegas() {
    List<String> colegas = new ArrayList<String>();
    colegas.add("Imposto");
    colegas.add("Peseto");
    colegas.add("LeoYaki");
    colegas.add("Matias");
    colegas.add("LordeVinheteiro");
   
    System.out.println("\n ------------- \n");
    System.out.println("Lista colegas");


    Collections.sort(colegas);


    for (String nome : colegas) {
        char inicial = nome.charAt(0);
       
        System.out.println(inicial + "-" + nome);
    }
    }


    //atv 2 --------------------------------------


    public static void pesquisarNumeros() {
    Set<Integer> numeros = new HashSet<Integer>();
    numeros.add (42);
    numeros.add (24);
    numeros.add (11);
    numeros.add (14);
    numeros.add (42);
    numeros.add (11);
   
    System.out.println("Pesquise por um número");
    Scanner scanner = new Scanner(System.in);
    int pesquisa = scanner.nextInt();


    int contador = 0;
    for (int numero : numeros) {
        if (numero == pesquisa){
            contador++;
        }
    }


    if (contador > 0) {
        System.out.println("O número " + pesquisa + " está na lista " + contador + " vezes. Segue a lista completa:\n");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    } else {
        System.out.println("O número " + pesquisa + " não está na lista. Seguem os valores da lista:");
        System.out.println("Lista completa:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    }


    //atv 3 ------------------------------------------------------


    public static void listarJogos() {
    Set<String> juegos = new LinkedHashSet<>();
    juegos.add("Pou");
    juegos.add("Campo minado");
    juegos.add("Date ariane");
    juegos.add("South Park");
    juegos.add("South Park");
    juegos.add("South Park");
    juegos.add("South Park");
    juegos.add("Minezada");
   
    System.out.println("Lista de jogos já zerados");
    for (String jogo : juegos) {
       System.out.println(jogo);
    }
    }

    //atv 4 ------------------------------------------------------

    public static void listarFilmes(){
    Queue <String> peliculas = new PriorityQueue<String>();
    
    peliculas.add("Gente Grande");
    peliculas.add("Gente Grande 2");
    peliculas.add("Ultimo mestre do ar");
    peliculas.add("Todo mundo em panico 3");
    peliculas.add("Bob esponja o filme (aqle lá)");


    System.out.println("\n ------------- \n");
    System.out.println("Top melhores filmes de todos os tempos (ordem alfabetica)\n");

    while(!peliculas.isEmpty())
    {
        System.out.println(peliculas.poll()+"\n");
    }
    }
    //atv 5 ------------------------------------------------------
    public static void montarComputador(){
    List<String> pecasPC = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Processador:");
    String processador = scanner.nextLine();
    pecasPC.add (processador);
    System.out.println("Qual o preço do processador?");
    String precoProcessador = scanner.nextLine();
    pecasPC.add (precoProcessador);
    System.out.println("Placa de vídeo:");
    String video = scanner.nextLine();
    pecasPC.add (video);
    System.out.println("Qual o preço da Placa de vídeo?");
    String precoVideo = scanner.nextLine();
    pecasPC.add (precoVideo);
    System.out.println("RAM:");
    String ram = scanner.nextLine();
    pecasPC.add (ram);
    System.out.println("Qual o preço da memória RAM?");
    String precoRAM = scanner.nextLine();
    pecasPC.add (precoRAM);
    System.out.println("Placa Mãe:");
    String placa = scanner.nextLine();
    pecasPC.add (placa);
    System.out.println("Qual o preço da placa mãe?");
    String precoPlaca = scanner.nextLine();
    pecasPC.add (precoPlaca);
    System.out.println("SSD:");
    String ssd = scanner.nextLine();
    pecasPC.add (ssd);
    System.out.println("Qual o preço do ssd?");
    String precoSSD = scanner.nextLine();
    pecasPC.add (precoSSD);

    System.out.println("Componentes do computador e seus preços\n");
    for (String componentes : pecasPC){
        System.out.println(componentes);
    }

    
    }

    public static void main(String[] args) {


    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");


    Scanner scanner = new Scanner(System.in);
    int opc;
    do{
    System.out.println("\n ------------- \n");
    System.out.println("Testar atividades:\n [1] atv 1\n [2] atv 2\n [3] atv 3\n [4] atv 4\n [5] atv 5\n [6]Já deu, tmj");
    opc = scanner.nextInt();
    switch (opc) {
        case 1:
            listarColegas();
            break;
        case 2:
            pesquisarNumeros();
            break;
        case 3:
            listarJogos();
            break;
        case 4:
           listarFilmes();
            break;
        case 5:
           montarComputador();
            break;
        case 6:
            System.out.println("Parei");
            break;
        default:
            System.out.println("Opção inválida");
            break;
    }
    }while(opc!=6);
}

}
