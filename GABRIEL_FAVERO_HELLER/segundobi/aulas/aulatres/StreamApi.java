package segundobi.aulas.aulatres;

import java.util.ArrayList;
import java.util.List;

public class StreamApi {
    
    public static void main(String[] args) {
        List<String> sacolaFrutas = new ArrayList<>();
        
        sacolaFrutas.add("Limão");
        sacolaFrutas.add("Maça");
        sacolaFrutas.add("Uva");
        sacolaFrutas.add("Limão");

        for (String fruta : sacolaFrutas) {
            System.out.println(fruta);
        }
        System.out.println("\nSegunda Lista");

        List<String> somenteLimoes = sacolaFrutas.stream()
            .filter(fruta -> fruta.equals("Limão"))
            .toList();

        for (String fruta : somenteLimoes) {
            System.out.println(fruta);
        }

        System.out.println("\nTerceira Lista");

        List<String> transformarBananas = sacolaFrutas.stream()
            .map(fruta -> fruta = "Banana")
            .toList();

        for (String fruta : transformarBananas) {
            System.out.println(fruta);
        }
        System.out.println(transformarBananas);

        //Exemplo reduce
        System.out.println("\nQuarta Lista");

        List<Double> valoresParcela = List.of(12d, 30d, 22d);
        Double valorTotal = valoresParcela.stream()
            .reduce(0d, (acumulador, valor) -> acumulador + valor);

        System.out.println(valorTotal);

        //Exemplo aluno
        System.out.println("\nQuinta Lista");

        List<Alunos> alunos = List.of(
            new Alunos("Kauã", 19),
            new Alunos("Schiestl", 27),
            new Alunos("Raul", 19),
            new Alunos("Pedro", 18));

        Integer totalAge = alunos.stream().map(aluno -> aluno.getAge()).reduce(0, (soma, idade) -> soma + idade);
        System.out.println(totalAge);
    }
}