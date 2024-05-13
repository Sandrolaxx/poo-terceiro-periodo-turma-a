package LEONARDO_PAES.primeiro_bimestre.prova;

import java.util.List;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Livraria Livraria = new Livraria();

        Livro livro1 = new Livro("Livro1", "Autor1");
        Livro livro2 = new Livro("Livro2", "Autor2");
        Livro livro3 = new Livro("Livro3", "Autor3");

        Livraria.LivroAdiciona(livro1);
        Livraria.LivroAdiciona(livro2);

        boolean disponivel = Livraria.disponibilidadeLivro(livro1);
        if (disponivel) {
            System.out.println("Livro 1 está disponível para emprestimo.");
        } else {
            System.out.println("Livro 1 não está disponível para emprestimo.");
        }

        boolean disponivel1 = Livraria.disponibilidadeLivro(livro2);
        if (disponivel1) {
            System.out.println("Livro 2 está disponível para emprestimo.");
        } else {
            System.out.println("Livro 2 não está disponível para emprestimo.");
        }

        Aluno aluno1 = new Aluno("Thiago");
        Aluno aluno2 = new Aluno("Jose");
        Aluno aluno3 = new Aluno("Sla mais kkk");

        Livraria.LivroEmprestar(livro1, aluno1);
        System.out.println("Livro emprestado: " + livro1.getAlunoEmprestado().getNome());

        boolean disponivel2 = Livraria.disponibilidadeLivro(livro1);
        if (disponivel2) {
            System.out.println("Livro 1 está disponível para emprestimo.");
        } else {
            System.out.println("Livro 1 não está disponível para emprestimo.");
        }

        Livraria.LivroDevolver(livro1);
        System.out.println("Livro devolvido.");

        System.out.println("Multa após 7 dias R$" + Livraria.MultaLivro(livro1));

        String tituloBusca = "Livro1";
        List<Livro> livrosPorTitulo = Livraria.BuscaTitulo(tituloBusca);
        System.out.println("Livros encontrados com título " + tituloBusca);
        for (Livro livro : livrosPorTitulo) {
            System.out.println(livro.getTitulo() + livro.getAutor() + ")");
        }

        String tituloBusca1 = "Livro5";
        List<Livro> livrosPorTitulo1 = Livraria.BuscaTitulo(tituloBusca1);
        System.out.println("Livros encontrados com título " + tituloBusca);
        for (Livro livro : livrosPorTitulo1) {
            System.out.println(livro.getTitulo() + livro.getAutor() + ")");
        }

        String autorBusca = "Autor1";
        List<Livro> livrosPorAutor = Livraria.ProcuraAutor(autorBusca);
        System.out.println("\nLivros encontrados com autor " + autorBusca);
        for (Livro livro : livrosPorAutor) {
            System.out.println(livro.getTitulo() + livro.getAutor());
        }

    }
}
