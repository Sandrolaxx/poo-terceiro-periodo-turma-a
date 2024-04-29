package PEDRO_HENRIQUE_GULIGURSKI.primeirobimestre.prova;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Livro[] estanteA = new Livro[30];
        Livro[] emprestimos = new Livro[30];
        Aluno[] listaDeAlunos = new Aluno[30];
        Biblioteca bibliotecaFag = new Biblioteca(estanteA, listaDeAlunos);

        String menuInicial = "[1] - Novo cadastro\n" // escolhe se é livro ou aluno
            .concat("[2] - Buscar livro\n") // escolhe se é por nome ou autor
            .concat("[3] - Emprestar livro\n")
            .concat("[4] - Devolver livro\n")
            .concat("[5] - Sair"); 

        String menuBusca = "[1] - Buscar por título\n"
            .concat("[2] - Buscar por autor\n")
            .concat("[3] - Voltar");

        String menuCadastro = "[1] - Aluno\n"
            .concat("[2] - Livro\n")
            .concat("[3] - Voltar");
        
        String divisoria = "----------------------------------";
        int contadorEstante = 0;
        int contadorAlunos = 0;
        while (true) {
            
            System.out.println(divisoria+"\n"+menuInicial+"\n"+divisoria);
            switch (input.nextInt()) {
                case 1:
                    limparTerminal();
                    System.out.println(divisoria+"\n"+menuCadastro+"\n"+divisoria);
                    Integer respo1 = input.nextInt();
                    input.nextLine();

                    if (respo1 == 1){
                        System.out.println("Insira o nome do aluno:");
                        String nomeAluno = input.nextLine();
                        System.out.println("Insira a turma do aluno:");
                        String turmaAluno = input.nextLine();
                        limparTerminal();
                        contadorAlunos++;
                        listaDeAlunos[contadorAlunos] = bibliotecaFag.cadastraAluno(nomeAluno, turmaAluno);

                    } else if (respo1 == 2) {
                        System.out.println("Insira o título do livro:");
                        String tituloLivro = input.nextLine();
                        System.out.println("Insira o nome do autor do livro:");
                        String autorLivro = input.nextLine();
                        limparTerminal();
                        estanteA[contadorEstante] = bibliotecaFag.cadastrarLivro(tituloLivro, autorLivro, bibliotecaFag.getEstante());
                        contadorEstante++;

                    } else if (respo1 == 3) {
                        break;

                    } else {
                        limparTerminal();
                        System.out.println("Opção inválida!");
                        break;
                    }
                    break;

                case 2:
                    limparTerminal();
                    System.out.println(divisoria+"\n"+menuBusca+"\n"+divisoria);
                    Integer respo2 = input.nextInt();
                    input.nextLine();
                    
                    if (respo2 == 1){
                        System.out.println("Insira o título do livro:");
                        String tituloBuscar = input.nextLine();
                        bibliotecaFag.buscarTitulo(tituloBuscar, bibliotecaFag.getEstante());

                    } else if (respo2 == 2) {
                        System.out.println("Insira o nome do autor do livro:");
                        String autorBuscar = input.nextLine();
                        
                    } else if (respo2 == 3) {
                        break;

                    } else {
                        limparTerminal();
                        System.out.println("Opção inválida!");
                        break;

                    }
                    break;

                case 3:
                    limparTerminal();
                    System.out.println("Escreva o titulo do livro que deseja emprestar: ");
                    String tituloEmprestar = input.nextLine();
                    bibliotecaFag.emprestar(tituloEmprestar, emprestimos, estanteA);
                    

                    break;
                case 4:
                    // String tituloDevolver = input.nextLine();

                    break;
                    
                case 5:
                    input.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

}
