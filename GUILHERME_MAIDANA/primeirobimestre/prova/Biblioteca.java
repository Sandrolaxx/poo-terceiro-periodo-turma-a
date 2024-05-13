package GUILHERME_MAIDANA.primeirobimestre.prova;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca {
    private List<Aluno> alunos;
    private List<Livro> livros;
    private List<Emprestimo> emprestimos;
    private Map<String, Double> multas;

    public Biblioteca() {
        alunos = new ArrayList<>();
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
        multas = new HashMap<>();
    }

    // Cadastro de Aluno
    public void cadastrarAluno(String nome, int matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    // Cadastro de Livro
    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    // Buscar por Título
    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    // Buscar por Autor
    public Livro buscarPorAutor(String autor) {
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                return livro;
            }
        }
        return null;
    }

    // Realizar Empréstimo
    public void realizarEmprestimo(int matricula, String titulo) {
        Aluno aluno = null;
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                aluno = a;
                break;
            }
        }
        if (aluno == null) {
            System.out.println("Aluno não encontrado!");
            return;
        }

        Livro livro = buscarPorTitulo(titulo);

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro não está disponível para empréstimo.");
            return;
        }

        Emprestimo emprestimo = new Emprestimo(aluno, livro);
        emprestimos.add(emprestimo);
        livro.setDisponivel(false);
        System.out.println("Empréstimo realizado com sucesso!");
    }

    // Realizar Devolução
    public void realizarDevolucao(String titulo) {
        Livro livro = buscarPorTitulo(titulo);

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().equals(livro)) {
                emprestimos.remove(emprestimo);
                livro.setDisponivel(true);
                System.out.println("Devolução realizada com sucesso!");
                return;
            }
        }

        System.out.println("Livro não foi emprestado!");
    }

    // Verificar Disponibilidade de Empréstimo
    public void verificarDisponibilidade(String titulo) {
        Livro livro = buscarPorTitulo(titulo);

        if (livro == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        if (livro.isDisponivel()) {
            System.out.println("O livro está disponível para empréstimo.");
        } else {
            System.out.println("O livro não está disponível para empréstimo.");
        }
    }

    // Criar Multa de Atraso
    public void criarMulta() {
        for (Emprestimo emprestimo : emprestimos) {
            LocalDate hoje = LocalDate.now();
            LocalDate dataDevolucao = emprestimo.getDataDevolucao();
            if (hoje.isAfter(dataDevolucao)) {
                long diasAtraso = hoje.toEpochDay() - dataDevolucao.toEpochDay();
                double multa = diasAtraso * 3.50;
                multas.put(emprestimo.getLivro().getTitulo(), multa);
                System.out.println("Multa criada para o livro '" + emprestimo.getLivro().getTitulo() +
                        "' no valor de R$ " + multa);
            }
        }
    }

    
    public void exibirMultas() {
        if (multas.isEmpty()) {
            System.out.println("Nenhuma multa encontrada.");
        } else {
            System.out.println("Multas:");
            for (Map.Entry<String, Double> entry : multas.entrySet()) {
                System.out.println("Livro: " + entry.getKey() + ", Multa: R$ " + entry.getValue());
            }
        }
    }

    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n  Biblioteca - Menu  ");
            System.out.println("1. Cadastro de Aluno");
            System.out.println("2. Cadastro de Livro");
            System.out.println("3. Buscar Livro por Título");
            System.out.println("4. Buscar Livro por Autor");
            System.out.println("5. Realizar Empréstimo");
            System.out.println("6. Realizar Devolução");
            System.out.println("7. Verificar Disponibilidade de Empréstimo");
            System.out.println("8. Criar Multa de Atraso");
            System.out.println("9. Exibir Multas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n Cadastro de Aluno ");
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    int matricula = scanner.nextInt();
                    biblioteca.cadastrarAluno(nomeAluno, matricula);
                    break;

                case 2:
                    System.out.println("\n Cadastro de Livro ");
                    System.out.print("Digite o título do livro: ");
                    String tituloLivro = scanner.nextLine();
                    System.out.print("Digite o nome do autor do livro: ");
                    String autorLivro = scanner.nextLine();
                    biblioteca.cadastrarLivro(tituloLivro, autorLivro);
                    break;

                case 3:
                    System.out.println("\n Busca por Título ");
                    System.out.print("Digite o título do livro: ");
                    String tituloBusca = scanner.nextLine();
                    Livro livroEncontrado = biblioteca.buscarPorTitulo(tituloBusca);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado:");
                        System.out.println("Título: " + livroEncontrado.getTitulo());
                        System.out.println("Autor: " + livroEncontrado.getAutor());
                        System.out.println("Disponível: " + (livroEncontrado.isDisponivel() ? "Sim" : "Não"));
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("\n Busca por Autor ");
                    System.out.print("Digite o nome do autor: ");
                    String autorBusca = scanner.nextLine();
                    Livro livroAutorEncontrado = biblioteca.buscarPorAutor(autorBusca);
                    if (livroAutorEncontrado != null) {
                        System.out.println("Livro encontrado:");
                        System.out.println("Título: " + livroAutorEncontrado.getTitulo());
                        System.out.println("Autor: " + livroAutorEncontrado.getAutor());
                        System.out.println("Disponível: " + (livroAutorEncontrado.isDisponivel() ? "Sim" : "Não"));
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;

                case 5:
                    System.out.println("\n Realizar Empréstimo ");
                    System.out.print("Digite a matrícula do aluno: ");
                    int matriculaEmprestimo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Digite o título do livro: ");
                    String tituloEmprestimo = scanner.nextLine();
                    biblioteca.realizarEmprestimo(matriculaEmprestimo, tituloEmprestimo);
                    break;

                case 6:
                    System.out.println("\n Realizar Devolução ");
                    System.out.print("Digite o título do livro: ");
                    String tituloDevolucao = scanner.nextLine();
                    biblioteca.realizarDevolucao(tituloDevolucao);
                    break;

                case 7:
                    System.out.println("\n Verificar Disponibilidade de Empréstimo ");
                    System.out.print("Digite o título do livro: ");
                    String tituloDisponibilidade = scanner.nextLine();
                    biblioteca.verificarDisponibilidade(tituloDisponibilidade);
                    break;

                case 8:
                    System.out.println("\n Criar Multa de Atraso ");
                    biblioteca.criarMulta();
                    break;

                case 9:
                    System.out.println("\n Exibir Multas ");
                    biblioteca.exibirMultas();
                    break;

                case 0:
                    System.out.println("\nSaindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
