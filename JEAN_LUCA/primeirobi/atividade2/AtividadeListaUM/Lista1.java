package primeirobi.atividade2.AtividadeListaUM;
import java.util.ArrayList;
import java.util.List;

public class Lista1{

      public static void main(String[] args) {
        List<String> users = new ArrayList<String>();

        users.add("kiury");
        users.add("eduardo");
        users.add("telles");
        users.add("ribinks");
        users.add("maidana");

        for (String nomes : users) {
            System.out.println("J-" + nomes);
        }

      }

}