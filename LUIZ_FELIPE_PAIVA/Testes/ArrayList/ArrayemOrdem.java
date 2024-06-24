package Testes.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayemOrdem {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(100);
        numeros.add(78);
        numeros.add(4);
        numeros.add(-32);
        numeros.add(4);
        numeros.add(8);

        Collections.sort(numeros);

        for (Integer numero : numeros) {
            System.out.println(numero);
            
        }

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("\n __________________________________________________ \n");
        for (Integer numero : numeros) {
            System.out.println(numero);
            
        }
    }
    //Pessoa joao = new Pessoa ("Joao", 20);
    //Pessoa maria = new Pessoa ("Maria", 20);
    //Pessoa pedro = new Pessoa ("Pedro", 20);
    //ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();
    //pessoas.add(joao);
    //pessoas.add(maria);
    //pessoas.add(pedro);
    // ou pessoas.add(new Pessoa("Pedro",20));

    // for (Pessoa pessoa : pessoas)
        // System.out.printl(pessoa.getNome());
}
