package primeirobi.provas.primeirachamada2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainBiblioteca {
    
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner input = new Scanner(System.in);

        while (true) {

            // Menu
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Menu Biblioteca FAG");
            System.out.println("[1] Cadastrar Aluno");
            System.out.println("[2] Cadastrar Livro");
            System.out.println("[3] Busca Livro - Id");
            System.out.println("[4] Realizar Empréstimo do Livro");
            System.out.println("[5] Realizar Devolução do Livro");
            System.out.println("[6] Verificar Disponibilidade do Livro");
            System.out.println("[7] Sair");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int opcao = input.nextInt(); input.nextLine();

        switch (opcao) {

            // Cadastro do Aluno

            case 1:
                System.out.println("[Cadastrando Nome do Aluno...]");
                String alunoNome = input.nextLine();
                System.out.println("[Cadastrando Curso do Aluno...]");
                String alunoCurso = input.nextLine();
                System.out.println("[Cadastrando ID do Aluno...]");
                String alunoId = input.nextLine();
                biblioteca.cadastrarAluno(new Aluno(alunoNome, alunoCurso, alunoId));
                break;

                // Cadastro do Livro

            case 2:
                System.out.println("[Cadastrando Título do Livro...]");
                String livroTitulo = input.nextLine();
                System.out.println("[Cadastrando Autor do Livro...]");
                String livroAutor = input.nextLine();
                System.out.println("[Cadastrando ID do Livro...]");
                String livroId = input.nextLine();
                biblioteca.cadastrarLivro(new Livro(livroTitulo, livroAutor, livroId, null, false));
            break;

            // Busca do Livro

            case 3:
                System.out.println("[Buscando pelo Id do Livro...]");
                Livro livroIdBusca = biblioteca.buscarPorId(input.nextLine());
                if (livroIdBusca != null){
                    System.out.println("Livro encontrado: " + livroIdBusca.getTitulo() + " por " + livroIdBusca.getAutor());
                } else {
                    System.out.println("Livro não encontrado");
                }
            break;

            // Empréstimo

            case 4:
                System.out.println("[Realizando Empréstimo...]");
                System.out.println("Digite o ID do Livro");
                String livroIdEmp = input.nextLine();
                boolean livroEmprestimo = biblioteca.realizarEmprestimo(livroIdEmp);
                if (livroEmprestimo) {
                    System.out.println("Empréstimo realizado");
                } else {
                    System.out.println("Falha no empréstimo");
                }

            break;

            // Devolução

            case 5:
                System.out.println("[Realizando Devolução...]");
                System.out.println("Digite o ID do Livro");
                boolean livroDevolucao = biblioteca.RealizarDevolucao(input.nextLine());

                // Date
                Date hoje = new Date();
                Date dataLancamento = new Date();

                long diferencaMs = hoje.getTime() - dataLancamento.getTime();
                long diferencaDias = diferencaMs / (1000 * 60 * 60 * 24);

                double multa = diferencaDias * 3.50;

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(hoje);
                calendar.add(Calendar.DAY_OF_YEAR, 7);
                Date seteDiasDepois = calendar.getTime();

                // Se o livro estiver null (indísponivel) e listado como emprestado:
                if (livroDevolucao) {
                    System.out.println("Devolução realizada");
                } else {
                    System.out.println("Falha na devolução");
                }
                if (dataLancamento.after(seteDiasDepois) ) {
                    System.out.println("Aviso de Multa com total de" + multa + " R$!");

                } else {
                    System.out.println("Nenhum índicio de Multa!");
                }
            break;

            case 6:
                System.out.println("[Verificando Disponibilidade...]");
                boolean livroDisponibilidade = biblioteca.verificarDisp(input.nextLine());
                if (livroDisponibilidade) {
                    System.out.println("Livro disponível");
                } else {
                    System.out.println("Livro indísponivel");
                }
                break;

            case 7:
                System.out.println("[Saindo...]");
                return;

            default:
                System.out.println("Erro, Tente Novamente");
                input.close();
                break;

        }
        
    }
    }
}
