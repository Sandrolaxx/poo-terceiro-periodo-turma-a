package SEGUNDO_BIMESTRE.aulas.MidLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamAPI {
    
    public static void main(String[] args) {

        List<String> sacolaFrutas = new ArrayList<>();

        sacolaFrutas.add("Maça");
        sacolaFrutas.add("Limao");
        sacolaFrutas.add("Uva");
        sacolaFrutas.add("Limao");

        List<String> streamResult = sacolaFrutas.stream().filter(fruta -> fruta.toLowerCase().contains("m"))
        .toList();

        System.out.println(streamResult);

        List<String> streamBanana = sacolaFrutas.stream().map(fruta -> "Banana").toList();

        System.out.println(streamBanana);

        Boolean existeUva = sacolaFrutas.stream().anyMatch(fruta -> fruta.equals("Uva"));

        System.out.println(existeUva);

        Optional<String> limao = sacolaFrutas.stream().filter(fruta -> fruta.equals("Limao")).findFirst();

        if (limao.isPresent()) {
            System.out.println(limao.get());
        }

        List<Double> valoresParcela = List.of(12d, 40d, 30d, 22d);

        Double valorTotal = valoresParcela.stream().reduce(0d, (acc, valor) -> acc + valor);

        System.out.println(valorTotal);

        List<Aluno> alunos = List.of(
            new Aluno("Gabriel", 19),
            new Aluno("Kaua", 29),
            new Aluno("Gustavo", 20)
        );

        Integer totalAge = alunos.stream().map(aluno -> aluno.getAge()).reduce(0, (soma, idade) -> soma + idade);

        System.out.println(totalAge);

    }

}
