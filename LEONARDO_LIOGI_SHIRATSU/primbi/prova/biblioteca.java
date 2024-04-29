package LEONARDO_LIOGI_SHIRATSU.primbi.prova;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class biblioteca {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Livro> listaLivros = new ArrayList<>();
    private static List<Emprestimo> listaEmprestimos = new ArrayList<>();

public static void main(String[] args) {
        listaLivros.add(new Livro("MobyDick", 1, "Elias"));
        listaLivros.add(new Livro("A Dama", 2, "Célia"));

    int opcao;
        do {
            System.out.println("\n1. Cadastrar aluno");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Lista de livros");
            System.out.println("4. Buscar por autor");
            System.out.println("5. Mostrar disponibilidade");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar aluno");
                    break;
                case 2:
                    realizarEmpretimo();
                    break;
                case 3:
                    System.out.println("\nLista de Livros");
                    for (Livro livro : listaLivros) {
                        System.out.println("Nome: " + livro.getNomeLivro() + "ID:" + livro.getIdLivro() );
                    }
                    break;
                case 4:
                    procurarAutor();

                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void realizarEmpretimo() {
        System.out.println("\n SELECIONE OS ITENS ");
        System.out.println("Escolha os itens:");
        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.println((i + 1) + ". " + listaLivros.get(i).getNomeLivro());
        }
        scanner.nextLine();
        String escolhaItensStr = scanner.nextLine();
        String[] escolhaItensArray = escolhaItensStr.split(",");
        List<Livro> itensSelecionados = new ArrayList<>();  
        for (String escolhaItem : escolhaItensArray) {
            int escolha = Integer.parseInt(escolhaItem.trim());
            if (escolha >= 1 && escolha <= listaLivros.size()) {
                itensSelecionados.add(listaLivros.get(escolha - 1));
            }
        }
        if (!itensSelecionados.isEmpty()) {
            Emprestimo novoEmprestimo = new Emprestimo(listaEmprestimos.size() + 1, 0, itensSelecionados, itensSelecionados, new Date()   );
            listaEmprestimos.add(novoEmprestimo);
            
        } else {
            System.out.println("Nenhum item selecionado.");
        }
    }
    
           

    private void cadastarAluno(){
        System.out.println("Digite o nome do aluno");
    }

    private static void procurarAutor(){
        System.out.println("Digite o nome do autor:");
    
    }
}
