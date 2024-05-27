package segundobi.listas.lista1;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ATV1

        List<String> colegas = new ArrayList<String>();

        colegas.add("Jorge");
        colegas.add("Ian");
        colegas.add("Nathan");
        colegas.add("Hebernald");
        colegas.add("Jean");

        for(String i: colegas){
            System.out.println("J - "+i);
        }

        //ATV2

        Scanner  scanner = new Scanner(System.in);
        HashSet<Integer> numeros = new HashSet<>();
 
        numeros.add(5);
        numeros.add(10);
        numeros.add(5);
        numeros.add(15);
        numeros.add(20);
        numeros.add(40);
 
        System.out.println("Numero a pesquisar:");
        int pesquisa = scanner.nextInt();
 
        if(numeros.contains(pesquisa)){
         System.out.println("O numero foi encontrado dentro o HashSet");
        }else{
         System.out.println("O numero não foi encontrado dentro o HashSet");
        }


        //ATV 3

        List<String> jogos = new ArrayList<String>();
    
            jogos.add("The Witcher");
            jogos.add("The Witcher 2");
            jogos.add("Red Dead Redemption 2");
            jogos.add("GTA V");
            jogos.add("Stardew Valley");
            jogos.add("The Witcher");

            System.out.println(removerDuplicatas(jogos));

        //ATV 4

        PriorityQueue<String> top5 = new PriorityQueue<>();
        top5.add("Mushoku Tensei");
        top5.add("Vinland Saga");
        top5.add("Tensei shitara");
        top5.add("Full Metal Alquimist");
        top5.add("Shrek");
        System.out.println(ordemAlfabetica(top5));

        
        //ATV 5

        List<String> configuracaoPC = new ArrayList<>(gerarListaPecas());
        System.out.println(configuracaoPC);

    }
    //Remove a duplicatadas adicionando retunando um HashSet que nao permite elementos duplicados.
    public static HashSet<String> removerDuplicatas(List lista){
        HashSet<String> semDuplicatas = new HashSet<String>(lista);
        return semDuplicatas;
    }

    //Utiliza o poll para retirar os items em ordem alfabetica e adicionalos a uma lista e retornando uma lista já ordenada.
    public static List<String> ordemAlfabetica(PriorityQueue<String> fila){
        List<String> ordenada = new ArrayList();
        int x = fila.size();
        for(int i = 0;i<x;i++){
            ordenada.add(fila.poll());
        }
        return ordenada;
    }

    //Recolhe os dados das peças que o usuario deseja adicionar a lista.
    public static String dadosPeças(){
        Scanner  scanner = new Scanner(System.in);
        String peca ="";
        System.out.println("Insira nome da peça");
        peca=scanner.next();
        return peca;
    }

    //Utiliza os dados recolhidos do metodo dadosPecas(), e junta todos dentro de uma lista para formar uma configuração de um computador.
    public static List<String> gerarListaPecas(){
        Scanner  scanner = new Scanner(System.in);
        List<String> listaPecas =  new ArrayList<String>();
        boolean teste = true;
        int simNao = 1;
        while(teste=true){
            System.out.println("Deseja adicionar peça a lista?\n 1 - SIM | 2 -NÃO");
            simNao=scanner.nextInt();
            if(simNao!=1){
                break;
            }else{
                listaPecas.add(dadosPeças());
            }
        }
        return listaPecas;
    }
}


