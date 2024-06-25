package segundobimestre.aulas.aulaTres;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> sacolaFrutas = new ArrayList<>();

        sacolaFrutas.add("abacaxi");
        sacolaFrutas.add("uva");
        sacolaFrutas.add("maça");
        sacolaFrutas.add("uva");

        List<String> somenteUva = sacolaFrutas.stream()
            .filter(fruta -> fruta.equals("uva"))
            .collect(Collectors.toList());

        for (String fruta : somenteUva) {
            System.out.println(fruta);
        }

        sacolaFrutas.forEach(fruta -> System.out.println(fruta));

        List<String> listaAlterada = sacolaFrutas.stream()
        .map(fruta -> "banana")
        .collect(Collectors.toList());

        listaAlterada.forEach(fruta -> System.out.println(fruta));

        List<Double> valoresParcela = List.of(12d,40d,30d);
        Double valorTotal = valoresParcela.stream()
            .reduce(0d, (valorAnterior, valorAtual) -> valorAnterior + valorAtual);
        System.out.println("Valor total:" + valorTotal);
            
    }
}
