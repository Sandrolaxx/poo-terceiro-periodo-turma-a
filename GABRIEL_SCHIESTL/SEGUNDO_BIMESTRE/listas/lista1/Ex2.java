package SEGUNDO_BIMESTRE.listas.lista1;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        numbers.add(25);
        numbers.add(12);
        numbers.add(5);
        numbers.add(25);
        numbers.add(12);
        numbers.add(5);
        numbers.add(25);
        numbers.add(12);
        numbers.add(5);

        System.out.println("Qual numero quer pesquisar?");
        Integer searchNumber = sc.nextInt();

        if (numbers.contains(searchNumber)) {

            System.out.println("O numero " + searchNumber + " existe na lista");
        } else {

            System.out.println("O numero " + searchNumber + " não existe na lista");
        }
    }
}
