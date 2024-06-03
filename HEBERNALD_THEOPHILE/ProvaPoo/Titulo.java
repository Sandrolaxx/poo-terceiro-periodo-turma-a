package ProvaPoo;

import java.util.ArrayList;


public class Titulo {

    public static Livro buscarPorTitulo(ArrayList<Livro> livros, String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
