package KAUA_MATHEUS.primeiro_bimestre.prova;

import java.sql.Date;

public class Livro {
    
    private int id;
    String nome, autor, editora;
    boolean disponivel = true;

    public Livro(int id, String nome,
    String autor,
    String editora){
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }

    public boolean getStatus(boolean status){
        disponivel = status;
        return disponivel;
    }


    public String getNome(){

        return this.nome;

    }

    public void getDesc(){

        System.out.printf("\nNome: %s\nAutor: %s\nEditora: %s\n\n", 
        this.nome, this.autor, this.editora);

    }
    
    public String getAutor(){

        return this.autor;

    }

}
