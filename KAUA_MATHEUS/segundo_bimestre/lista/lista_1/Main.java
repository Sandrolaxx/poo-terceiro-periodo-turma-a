package lista_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Em uma classe Main:
            Atv1 - Criar um ArrayList de strings e adicione os nomes de cinco dos seus colegas favoritos da turma. Em seguida, itere sobre a lista e imprima a inicial do seu nome + " - " + cada nome da lista.
            Atv2 - Crie um HashSet de números inteiros e adicione alguns números repetidos. Verifique se o conjunto contém um número específico e imprima o resultado.
            Atv3 - Escreva um método que receba uma lista de strings contendo os jogos que você já zerou. Caso tenha zerado mais de uma vez, adicione o nome do jogo para cada vez. Após criar a lista de jogos zerados, retorne uma nova lista contendo apenas as strings únicas (sem duplicatas).
            Atv4 - Crie um método que utilize PriorityQueue para ordenar uma lista com o nome dos cinco melhores animes/filmes que você já viu em ordem alfabética. Em seguida, imprima a lista ordenada.
            Atv5 - Crie um método que crie uma estrutura que permita salvar as configurações de hardware da sua máquina, exemplo: "Processador" : "i5 7500U". Faça isso para no mínimo 5 peças e imprima a peça e seu respectivo valor.
            Crie todas as atividades em um arquivo Main.class, atividades separadas por comentários, exemplo //ATV1, abaixo do código
         */


        // ATV1
        System.out.println("ATV1");
        List<String> lista_nomes = new ArrayList<>();
        lista_nomes.add("Gabriel Schiestl");
        lista_nomes.add("Gabriel Favero");
        lista_nomes.add("João Otávio");
        lista_nomes.add("Juan Gabriel");
        lista_nomes.add("Gustavo Muller");
        
        lista_nomes.forEach(nome -> System.out.printf("K - %s\n", nome));


        // ATV2
        System.out.println("\nATV2");
        HashSet<Integer> numeros = new HashSet<>();
        int checagem = 10;
        numeros.add(10);
        numeros.add(1);
        numeros.add(20);
        numeros.add(10);
        System.out.println(numeros);

        for(Integer item : numeros){
            if (item.equals(checagem)) {
                System.out.println(item);
            }
        }
        
        
        // ATV3
        System.out.println("\nATV3");
        List<String> lista_zerados = new ArrayList<>();
        lista_zerados.add("GTA San Andreas");
        lista_zerados.add("Control");
        lista_zerados.add("GTA 5");
        lista_zerados.add("Assassins Cred 1");
        lista_zerados.add("Bully");
        lista_zerados.add("GTA 5");

        List<String> nova_lista = entraJogo(lista_zerados);
        System.out.println("Lista zerados: " + lista_zerados);
        System.out.println("Lista nova: " + nova_lista);
        

        // ATV 4
        System.out.println("\nATV4");
        melhoresFilmes();


        // ATV5
        System.out.println("\nATV4");
        escrevePc();

    }

    // ATV3 Método
    public static List<String> entraJogo(List<String> lista){

        List<String> novalista = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if(novalista.contains(lista.get(i))){
                continue;
            }
            else{
                novalista.add(lista.get(i));
            }
        }
        return novalista;
    }

    // ATV4 Método
    public static void melhoresFilmes(){
        Queue<String> listaQueue = new PriorityQueue<>();
        try (Scanner leitor = new Scanner(System.in)) {

            for (int i = 0; i < 5; i++) {

                System.out.printf("Digite o filme Nº%s: \n", i+1);
                listaQueue.add(leitor.nextLine());
            }
        }catch(Exception e){
            System.out.println("Opa, ocorreu um Erro! " + e);
        }
        System.out.println("\nAqui está a sua lista! ");
        System.out.println();
        int quant = listaQueue.size();
        for (int i = 0; i < quant; i++) {
            System.out.println(listaQueue.remove());    
        }
        
    }
  
    // ATV5
    public static void escrevePc(){

        try (Scanner leitor = new Scanner(System.in)) {

            String tipo, componente;
            boolean cont = true;
            Map <String, String> mapaComponentes = new HashMap<>();

            while(cont){
                System.out.println("Qual o tipo do componente? ");
                tipo = leitor.nextLine();

                System.out.println("Componente: ");
                componente = leitor.nextLine();

                mapaComponentes.put(tipo, componente);

                System.out.println("Continuar? ");
                if(leitor.nextLine().equals("S")){
                    cont = true;
                }
                else{
                    cont = false;
                }
            }
            System.out.println(mapaComponentes);
            
        }catch(Exception e){
            System.out.println("Opa, Aconteceu um erro!! " + e);
        }

    }
}
