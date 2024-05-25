package segundobim.testes.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestFilter_Map {

    //filter filtra;
    //map manipula/muda;
    public static void main(String[] args) {

        List<String> sacolaDeFrutas = new ArrayList<String>();
    
    sacolaDeFrutas.add("Uva");
    sacolaDeFrutas.add("Morango");
    sacolaDeFrutas.add("Morango");
    sacolaDeFrutas.add("Morango");
    sacolaDeFrutas.add("Mamão");
    sacolaDeFrutas.add("Maçã");

    sacolaDeFrutas.forEach(fruta -> System.out.println(fruta));

    List<String> listaAlterada = sacolaDeFrutas.stream() // criando uma lista alterada da sacola de frutas;
    .map(fruta -> "Maçã") // transforma as frutas todas em Maçã;
    .toList();
    System.out.println(listaAlterada);

    Optional <String> morango = sacolaDeFrutas.stream()
    .filter(fruta -> fruta.equals("Morango"))
    .findFirst();

    if (morango.isPresent()) {
        System.out.println(morango.get());
        
    }

    //---------Exemplo reduce 
    List<Double> valoresParcela = List.of(12d, 30d, 20d);
    Double valorTotal = valoresParcela.stream() //.map(produto -> produto.getValor(1));
    .reduce(0d, 
    (valorAnterior, valorAtual) -> valorAnterior + valorAtual);
    
    System.out.println(valorTotal);

    List<Aluno> alunos = List.of(
    new Aluno("Kaua", 12),
    new Aluno("Xtel", 43),
    new Aluno("Gabriel", 9));

    Integer totalIdade = alunos.stream()
    .map(aluno -> aluno.getAge())
    .reduce(0, Integer :: sum);

    System.out.println(totalIdade/alunos.size()); // mostra a média entre a soma das idades e a quantidade (size);
    // System.out.println(totalIdade); //mostra as idades somadas

    



        
    //System.out.println("Todas as frutas:"); // printando todas as frutas da sacola;
    //for (String fruta : sacolaDeFrutas) {
        //System.out.println(fruta);
        
    //}
    //System.out.println();

    //List<String> somenteMorangos = sacolaDeFrutas.stream() // criando uma lista de somente morangos da sacola de frutas;
    //.filter(fruta -> fruta.equals("Morango")) // filtra apemas os Morangos;
    //.map(fruta -> + " fruta")
    //.toList(); // adiciona a lista somenteMorangos;

    //System.out.println("Somente morangos:"); // printando a lista de apenas morangos;
    //for (String fruta : somenteMorangos) {
        //System.out.println(fruta);
        
//}
    
    
}
}
