package ProvaPoo;


import java.util.ArrayList;


public class Autor {

    public static Livro buscarPorAutor(ArrayList<Livro> livros, String autor) {
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                return livro;
            }
        }
        return null;
    }
}

