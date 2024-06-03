package segundobi.aulas.aula2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ListaUm 
{
    public static void main(String[] args)
    {
        //----------Atividade Um
        List<String> closeFriends = new ArrayList <String>();
        closeFriends.add("Luiz");
        closeFriends.add("Matheus");
        closeFriends.add("Willyam");
        closeFriends.add("Heitor");
        closeFriends.add("Pedro");
        System.out.println("C -" + closeFriends);

        //----------Atividade Dois
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(1);
        numeros.add(1);
        numeros.add(0);
        
        System.out.println("contém zero");
        for (Integer contagem : numeros)
        {
            numeros.remove(1);
            System.out.println(contagem);
        }

        //----------Atividade Três
        Set<String> jogos = new HashSet<>();

        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("Manhunt");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_SA");
        jogos.add("GTA_V");
        jogos.add("GTA_V");
        jogos.add("GTA_V");
        jogos.add("GTA_V");
        jogos.add("GTA_V");

        if (jogos.add("Manhunt"))
        {
            System.out.println("Manhunt foi adicionado à jogos zerados");
        }

        if (jogos.add("GTA_SA"))
        {
            System.out.println("GTA SA foi adicionado à jogos zerados");
        }

        if (jogos.add("GTA_V"))
        {
            System.out.println("GTA V foi adicionado à jogos zerados");
        }

        if (jogos.isEmpty())
        {
            System.out.println("O set está vazio");
        }
        else
        {
            System.out.println("O set não está vazio");
        }

        System.out.println("Jogos zerados " + jogos);

        //----------Atividade Quatro
        List<String> listaFilmes = Arrays.asList("Fury","Fight Club","Into the Forest","Donnie Darko","Sons of Anarchy");
        Queue<String> queueFilmes = new LinkedList<>(listaFilmes);
        System.out.println(queueFilmes);

        Queue<String> queuePriority = new PriorityQueue<>();
        queueFilmes.add("Fury");
        queueFilmes.add("Fight Club");
        queueFilmes.add("Into the Forest");
        queueFilmes.add("Donnie Darko");
        queueFilmes.add("Sons of Anarchy");
        System.out.println(queuePriority);

        //----------Atividade Cinco
        Map<String, String> computadores = new HashMap<>();

        computadores.put("processador","i3 9100F");
        computadores.put("placa de vídeo","GeForce GTX 1050ti");
        computadores.put("armazenamento","SSD Sata 128Gb");
        computadores.put("memórias","16Gb Dual Channel");
        computadores.put("fonte","Corsair VS550");
        System.out.println("componentes do computador: " + computadores.size());
    }
}
