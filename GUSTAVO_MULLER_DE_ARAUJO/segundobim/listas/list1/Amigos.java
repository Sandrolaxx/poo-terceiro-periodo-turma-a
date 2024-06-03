package segundobim.listas.list1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Amigos {

    // ATV 1 Criar um ArrayList de strings e
    //adicione os nomes de cinco dos seus colegas favoritos da turma.
    //Em seguida, itere sobre a lista
    //e imprima a inicial do seu nome + " - " + cada nome da lista.

    public void favoritoAmigo() {

        Scanner scanner = new Scanner(System.in);

        List<String> nomeAmigo = new ArrayList<String>();

        nomeAmigo.add("Juan");
        nomeAmigo.add("Schiestl");
        nomeAmigo.add("Gabriel");
        nomeAmigo.add("Kauã");
        nomeAmigo.add("João Otávio");

        String meuNome = "Gustavo";

        ArrayList<Character> primeiraLetra = new ArrayList<Character>(); // criando arraylist para pegar a primeira letra do meu nome e armazená-la letra do meu nome e armazená-la;

        if (!meuNome.isEmpty()) { // se meuNome nao for vazio, ele continuará o código;
            primeiraLetra.add(meuNome.charAt(0)); // vai pegar o caractere da posição 0, no caso a primeira letra e adicionará ao arrayList primeiraLetra;
        }

        nomeAmigo.replaceAll(item -> primeiraLetra + " - " + item); // método replaceAll serve para adicionar substrings, como o G nesse exemplo

        for (String name : nomeAmigo) {
            System.out.println(name);
        }

        scanner.close();

    }

}
