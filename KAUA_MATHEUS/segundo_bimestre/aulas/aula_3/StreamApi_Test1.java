import java.util.*;

public class StreamApi_Test1{

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        List <Integer> lista = new ArrayList<>();

        // Gerador de números aleatórios
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            lista.add(gerador.nextInt(100));
        }

        List lista_menores50 = lista.stream()
            .filter(valor -> valor <= 50)
            .toList();


        // tratamento de Erros
        try{
            //lista_menores50.forEach(valor -> System.out.println(valor));
            System.out.println(lista_menores50.get(-1));
        }catch(java.lang.ArrayIndexOutOfBoundsException Error){

            // Veja que o Código captura o erro!
            lista_menores50
                .forEach(valor -> System.out.println(valor));
            System.err.printf("Ocorreu-se um erro! %s\n", Error);
        }
        catch(Exception Error){
            System.out.println("Erro padrão!\n");
        }

        // Porém a execução não para!
        lista_menores50
            .forEach(valor -> System.out.println(valor));
        

        System.out.println();
        Optional <Integer> primeiro = lista.stream()
            .filter(valor -> valor.equals(10))
            .findFirst();

        System.out.println();
        System.out.println("Checagem se existe algo");

        // Utilização do isPresent
        if (primeiro.isPresent()) {
            System.out.println(primeiro.get());
            System.out.println("Existe 10!");
            
        }
        else{
            System.out.println("Não existe 10!");
        }
    }
}