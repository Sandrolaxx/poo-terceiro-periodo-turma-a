import java.util.*;
public class StreamApi_Test2 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        List <Double> lista = List.of(1.2d, 51d, 15.56d);

        // Gerador de números aleatórios
        Random gerador = new Random();

        // Soma de valores de uma lista em apenas uma linha de código!

        Double valortotal =  lista.stream()
            .reduce( 0d, (valorAnterior, valorAtual) -> valorAnterior + valorAtual);
        

        System.out.println(valortotal);

        List<Alunos> alunos = new ArrayList<>();
        alunos.add(new Alunos("Kauã", 19));

        alunos.add(new Alunos("Matheus", 21));

        alunos.add(new Alunos("Luiz", 99));

        Integer total_idades = alunos.stream()
            .map(idade -> idade.getAge())
            .reduce(0, (idadeAnterior, idadeAtual) -> idadeAnterior + idadeAtual);

        double media_idades = total_idades / alunos.size();
        System.out.println(media_idades);


    }
    
}
