package KIURY_MARIANO.firsttwomonths.prova;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        
        Livro primeiroLivro = new Livro();
        primeiroLivro.setAutor("Marcelo");
        primeiroLivro.setTitulo("o Nascimetno de POO");
        primeiroLivro.setDisponibilidade(true);
        primeiroLivro.setEditora("tupi");
        primeiroLivro.setTipo("Terror");
        primeiroLivro.setLancamento(new Date());

        Scanner scanner = new Scanner(System.in);

        Aluno[] listaAlunos = {};
        Livro[] listaLivros = {primeiroLivro};

        int contIdIAluno = 0;
        int contIdILivro = 0;
        
        while (true) {
            System.out.println("\n\t[----------------------MENU---------------------]");
            System.out.println("\t[\t(1) -> Cadastrar aluno\t\t\t]");
            System.out.println("\t[\t(2) -> Cadastrar livro\t\t\t]");
            System.out.println("\t[\t(3) -> Buscar por título\t\t]");
            System.out.println("\t[\t(4) -> Buscar por autor\t\t\t]");
            System.out.println("\t[\t(5) -> Realizar empréstimo\t\t]");
            System.out.println("\t[\t(6) -> Realizar devolução\t\t]");
            System.out.println("\t[\t(7) -> Verificar disponibilidade\t]");
            System.out.println("\t[\t(8) -> Sair do sistema\t\t\t]");
            System.out.println("\t[-----------------------------------------------]\n");

            int option = scanner.nextInt();

            switch (option) {
            
                case 1:

                System.out.println("\n\t *Cadastro de novo Aluno*");

                    Aluno novoAluno = new Aluno();

                    novoAluno.setId(contIdIAluno);
                    contIdIAluno += 1;

                    System.out.println("Informe o nome do aluno: ");
                    String nome = scanner.next();
                    novoAluno.setNome(nome);

                    System.out.println("Informe a matricula do aluno: ");
                    String matricula = scanner.next();
                    novoAluno.setMatricula(matricula);

                    System.out.println("Informe o telefone do aluno: ");
                    String telefone = scanner.next();
                    novoAluno.setTelefone(telefone);

                    System.out.println("Informe o email do aluno: ");
                    String email = scanner.next();
                    novoAluno.setEmail(email);

                    System.out.println("Informe a numero da residencia do aluno: ");
                    int numeroRua = scanner.nextInt();
                    novoAluno.setNumero(numeroRua);

                    listaAlunos = Arrays.copyOf(listaAlunos, listaAlunos.length + 1);

                    listaAlunos[listaAlunos.length - 1] = novoAluno;
                    
                    continue;


                case 2:

                    System.out.println("\n\t *Cadastro de novo Livro*");

                    Livro novoLivro = new Livro();

                    novoLivro.setId(contIdILivro);
                    contIdILivro += 1;

                    System.out.println("Informe o nome do livro: ");
                    String nomeLivro = scanner.next();
                    novoLivro.setTitulo(nomeLivro);

                    System.out.println("Informe nome do autor: ");
                    String autor = scanner.next();
                    novoLivro.setAutor(autor);

                    System.out.println("Informe o tipo do livro: ");
                    String tipo = scanner.next();
                    novoLivro.setTipo(tipo);

                    System.out.println("Informe a  editora do livro: ");
                    String editora = scanner.next();
                    novoLivro.setEditora(editora);

                    System.out.println("Informe o ano de lançamento do livro: ");
                    novoLivro.setlancamento(new Date());

                    novoLivro.setDisponibilidade(true);

                    listaLivros = Arrays.copyOf(listaLivros, listaLivros.length + 1);

                    listaLivros[listaLivros.length - 1] = novoLivro;
                    
                    System.out.println(listaLivros[0].getTitulo());
                    continue;


                case 3:
                    System.out.println("Informe o titulo:");
                    String buscatitulo = scanner.next();
                    
                    for (int i = 0; i < listaLivros.length; i++) {
                        if (buscatitulo.equals(listaLivros[i].getTitulo())) {
                            System.err.println("Livro: " +listaLivros[i].getTitulo()+ " encontrado.");   
                        }
                        
                    }
                continue;

                
                case 4:
                    System.out.println("Informe o nome do autor:");
                    String buscaAutor = scanner.next();
                    
                    for (int i = 0; i < listaLivros.length; i++) {
                        if (buscaAutor.equals(listaLivros[i].getTitulo())) {
                            System.err.println("Livro ["+i+"]: " +listaLivros[i].getTitulo()+ " encontrado.");   
                        }
                        
                    }

                continue;


                case 5:
                    System.out.println("Selecione o livro.");
                    int optionLivro = scanner.nextInt();

                    listaLivros[optionLivro].realizarEmprestimo();
                
                    
                continue;
                

                case 6:
                    System.out.println("Selecione o livro.");
                    optionLivro = scanner.nextInt();

                    listaLivros[optionLivro].realizarDevolucao();
                    continue;


                case 7:
                    System.out.println("*Listando todos os Livros*");

                    for (int i = 0; i < listaLivros.length; i++) {
                        System.out.println("Título: " +listaLivros[i].getTitulo()+ ". Autor: " +listaLivros[i].getAutor() + ". Disponibilidade: " +listaLivros[i].isDisponibilidade());
                        
                    }

                    continue;


                case 8:
                    break;


                default:
                    System.out.println("\n Digite uma opção valida. ");
                    continue;
            }
            break;
       }
    }
}