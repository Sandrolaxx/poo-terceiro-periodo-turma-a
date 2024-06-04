package segundobi.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        List<String> sacolaFrutas = new ArrayList<>();

        sacolaFrutas.add("1");
        sacolaFrutas.add("2");
        sacolaFrutas.add("1");
        sacolaFrutas.add("3");

        sacolaFrutas.forEach(fruta -> System.out.print(fruta));

        List<String> listaAlterada = sacolaFrutas.stream()
                .filter(fruta -> fruta.equals("1"))
                .map(fruta -> fruta.concat(" --- Fruta show"))
                .toList();

        System.out.println("\nSegunda lista-----");

        listaAlterada.forEach(fruta -> System.out.println(fruta));

        boolean existeLimao = sacolaFrutas.stream()
                .allMatch(fruta -> fruta.equals("1"));

        System.out.println(existeLimao);

        Optional<String> limao = sacolaFrutas.stream()
                .filter(fruta -> fruta.equals("1"))
                .findFirst();

        if (limao.isPresent()) {
            System.out.println(limao.get());
        }

        // ------Exemplo reduce

        List<Double> valoresParcela = List.of(12d, 30d, 20d);

        Double valorTotal = valoresParcela.stream()
                .reduce(0d,
                        (valorAnterior, valorAtual) -> valorAnterior + valorAtual);

        System.out.println("Valor total: " + valorTotal);

        List<Aluno> alunos = List.of(
                new Aluno("Kaua", 19),
                new Aluno("Schiestl", 27),
                new Aluno("Raul", 20),
                new Aluno("Pedro", 18));

        Integer totalIdade = alunos.stream()
                .map(aluno -> aluno.getAge())
                .reduce(0, (vl1, vl2) -> vl1 + vl2);

        System.out.println(totalIdade / alunos.size());
    }

    // for (String fruta : sacolaFrutas) {
    // System.out.println(fruta);
    // }

    // System.out.println("\n Segunda lista");

    // List<String> somenteLimoes = sacolaFrutas.stream()
    // .filter(fruta -> fruta.equals("🍋"))
    // .toList();

    // for (String fruta : somenteLimoes) {
    // System.out.println(fruta);
    // }

}
