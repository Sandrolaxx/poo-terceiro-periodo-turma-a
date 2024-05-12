package segundobimestre;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class Main 
{
    public static void main(String[] args) 
    {
        //atividade 1 inicio/////////////////////////////////////////////
        ArrayList<String> colegas = new ArrayList<>();

        colegas.add("K West");
        colegas.add("K Lamar");
        colegas.add("MF DOOM");
        colegas.add("Ze da garoa");
        colegas.add("Cartolinha");

        char inicial = 'M';
        String resultado = inicial + " - "; 

        for (int i = 0; i < colegas.size(); i++) 
        {
            resultado += colegas.get(i);
            if (i != colegas.size() - 1) { // Adiciona um traço apenas se não for o último nome
                resultado += " - ";
            }
        }

        System.out.println(resultado );
        System.out.println("\n");
        //atividade 1 final///////////////////////////////////////////////

        //atividade 2 inicio//////////////////////////////////////////////
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(25);
        numeros.add(20);
        numeros.add(35);
        numeros.add(10);

        Integer numeroEspecifico = 25;
        if (numeros.contains(numeroEspecifico))
        {
            System.out.println("O conjunto numérico contém o número " + numeroEspecifico);
        }
        else
        {
            System.out.println("O conjunto numérico não contém o número " + numeroEspecifico);
        }
        System.out.println("\n");
        //atividade 2 final////////////////////////////////////////////////

        //atividade 3 início///////////////////////////////////////////////
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("Ghost of Tsushima");
        jogosZerados.add("Red Dead Redemption 2");
        jogosZerados.add("Dark Souls 2");
        jogosZerados.add("Wolfenstein 1");
        jogosZerados.add("Wolfenstein 2");
        jogosZerados.add("Gris");
        jogosZerados.add("Contraband Police");
        jogosZerados.add("Far Cry Primal");
        jogosZerados.add("Stardew Valley");
        jogosZerados.add("Journey");

        List<String> jogosUnicos = removerDuplos(jogosZerados);
        System.out.println("Jogos zerados: ");
        for (String jogo : jogosUnicos)
        {
            System.out.println(jogo);
        }
        System.out.println("\n");
        //atividade 3 final////////////////////////////////////////////////

        //atividade 4 inicio///////////////////////////////////////////////
        ArrayList<String> filmes = new ArrayList<>();
        filmes.add("StarWars: Episode ll - Attack of the Clones");
        filmes.add("Rick and Morty");
        filmes.add("StarWars: Episode lll - Revenge of the Sith");
        filmes.add("All quiet on the Western Front");
        filmes.add("八角笼中(never say never)");

        PriorityQueue<String> filaPrioritariaFilmes = new PriorityQueue<>(filmes);//passando a arrayList filmes como argumento pro construtor, automaticamente insere todos os itens na fila

        System.out.println("Top 5 filmes/série do bacanos: ");
        while (!filaPrioritariaFilmes.isEmpty()) 
        {
            System.out.println(filaPrioritariaFilmes.poll());//usando poll() itero sobre a fila para remover e imprimir os filmes em ordem alfabetica
        }
        System.out.println("\n");
        //atividade 4 final///////////////////////////////////////////////

        //atividade 5 inicio/////////////////////////////////////////////
        List<String> Hardware = new ArrayList<>();
        Hardware.add("Processador : i5 9400F - 808R$");
        Hardware.add("Placa de video: RTX 2060 - 1157R$");
        Hardware.add("RAM : Ballistix 8GB - 257R$");
        Hardware.add("RAM : Team Group 8GB - 108R$");
        Hardware.add("SSD : Kingston 447GB - 177R$");
        System.out.println("Configurações da máquina");

        for (String peca : Hardware)
        {
            System.out.println(peca);
        }
        //atividade 5 final//////////////////////////////////////////////
    }

    //metodo da atividade 3//
    public static List<String> removerDuplos(List<String> jogos)
    {
        //conjunto jogos vira uma hashset temporaria para remover os duplos, e logo depois colocando de volta em jogos, assim, jogos = jogosUnicos
        HashSet<String> conjuntoJogos = new HashSet<>(jogos); // "jogos" contem os itens de jogosZerados
        // Limpa a lista de entrada e adiciona os elementos unicos
        jogos.clear();
        jogos.addAll(conjuntoJogos);
        return jogos;
    }
}
