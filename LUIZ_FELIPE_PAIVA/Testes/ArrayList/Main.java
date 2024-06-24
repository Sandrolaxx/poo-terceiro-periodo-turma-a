package Testes.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        String [] arrayEstatico = new String[5];
        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Maria";
        arrayEstatico[2] = "Pedro";
        arrayEstatico[3] = "Vegeta";
        arrayEstatico[4] = "Bob Esponja";

        ArrayList <String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku");
        arrayDinamico.add("Maria");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Vegeta");
        arrayDinamico.add("Bob Esponja");


        System.out.println("Imprimindo array estatico: \n");

        for(int i = 0 ; i < arrayEstatico.length ; i++){
        System.out.println(arrayEstatico[i]);
        }

        System.out.println("\nTamanho do ArrayList "+ arrayDinamico.size());
        System.out.println("\nPrimeira posição no ArrayList "+arrayDinamico.get(0));
        System.out.println("\nImprimindo ArrayList: \n");
        System.out.println("Remover Pedro");
        arrayDinamico.remove(2);

        for(int i = 0; i < arrayDinamico.size(); i++){
            System.out.println(arrayDinamico.get(i));
        }
        System.out.println("\n ____________________________________________________________________________ \n");
        for (String nome : arrayDinamico) {
            System.out.println(nome);
            
        }

        arrayDinamico.clear();
        System.out.println("\nTamanho do ArrayList "+ arrayDinamico.size());
    }
}
