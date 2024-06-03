package primeirobim.prova;

import java.util.Scanner;

public class Livro {
    Scanner scanner = new Scanner(System.in);


    public String titulo;

    public String autor;

    public int id;

    public double valor;

    public int [] novosLivros;
 

    public void cadastraLivro () {
    
        System.out.println("Cadastro de livros");
        Livro[] livros = new Livro[3];
        
        for (int i = 0; i < livros.length; i++) {
            System.out.println("Livro " + (i + 1));
            
            System.out.println("Insira o nome do livro");
            String tituloLivro = scanner.next();

            System.out.println("Insira o autor do livro");
            String autorLivro = scanner.next();

            System.out.println("Insira o Id do livro");
            int idLivro = scanner.nextInt();
    
            Livro novoLivro = new Livro();
            novoLivro.titulo = tituloLivro;
            novoLivro.autor = autorLivro;
            novoLivro.id = idLivro;
            livros[i] = novoLivro;
            
        }
        for (Livro livro : livros) {
            System.out.println("Nome do livro: " + livro.titulo + "\n" + "Tipo do livro: " + livro.autor + "\n"
            + "Id do livro: " + livro.id + "\n");
        }
        }  
} 
