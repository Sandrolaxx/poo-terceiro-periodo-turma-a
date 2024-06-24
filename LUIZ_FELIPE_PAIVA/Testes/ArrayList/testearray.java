package Testes.ArrayList;
import java.util.ArrayList;

public class testearray {
    public static void main(String[] args) {
        ArrayList <String> carros = new ArrayList<String>();
        carros.add("Corsa");
        carros.add("Uno");
        carros.add("Celta");
        carros.add("UP");
        carros.add("HB20");
        carros.remove(0);

        System.out.println(carros);
        System.out.println("____________________");
        System.out.println(carros.size());
        System.out.println("____________________");
        for (String cont : carros) {
            System.out.println(cont);
        }
    }
}
