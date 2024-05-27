package primeirobimestre.Segundobimestre.Segundobi.Exemplos.Aulas.Auladois.Aulatres;

import java.util.ArrayList;
import java.util.List;


public class StreamApi {
    public static void main(String[] args) {
        List<String> sacolaFrutas = new ArrayList<>();

        sacolaFrutas.add("🍔");
        sacolaFrutas.add("🌭");
        sacolaFrutas.add("🌮");
        sacolaFrutas.add("🧇");
        
        sacolaFrutas.forEach(fruta -> System.out.println(fruta));

        List<String> listaAlterada = sacolaFrutas.stream()
        .filter(fruta -> fruta.equals("🍔"))
        .map(fruta -> fruta.concat("------- Fruta Show"))
        .toList();

        System.out.println("/n Segunda Lista");

        listaAlterada.forEach(fruta -> System.out.println(fruta));

        /*for (String fruta : sacolaFrutas) {
            System.out.println(fruta);
        }


        System.out.println("/n Segunda Lista");

        List<String> somenteLimoes =  sacolaFrutas.stream()
            .filter(fruta -> fruta.equals("🌮"))
            .toList();

            for (String fruta : somenteLimoes) {
                System.out.println(fruta);
            }*/

            
    }
}
