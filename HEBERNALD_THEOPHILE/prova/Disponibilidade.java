package HEBERNALD_THEOPHILE.prova;

public class Disponibilidade {

    public static boolean verificarDisponibilidadeEmprestimo(Livro livro) {
        return !livro.isEmprestado();
    }
}
