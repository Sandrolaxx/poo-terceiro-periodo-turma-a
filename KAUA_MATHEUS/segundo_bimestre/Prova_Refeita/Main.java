import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Listas
        List<Livro> lista_livros = new ArrayList<>();
        List<Aluno> lista_alunos = new ArrayList<>();

        // Um dia
        Long Umdia = 86400000l;
        Date ano = new Date();


        int entrada;
        String entrada_livro;
        String entrada_autor;

        do{

            System.out.println("\n--- Qual Operação deseja Fazer? ---");
            System.out.println("0: Sair");
            System.out.println("1: Cadastrar Livro");
            System.out.println("2: Procurar Livro");
            System.out.println("3: Procurar livro por Autor");
            System.out.println("4: Adicionar Aluno");
            System.out.println("5: Alugar livro\n");


            entrada = Integer.parseInt(scanner.nextLine());

            switch (entrada) {
                case 1:
                    // String nome_livro;
                    // System.out.println("Nome do Livro: ");
                    // nome_livro = scanner.nextLine();

                    // String nome_autor;
                    // System.out.println("Nome do Autor: ");
                    // nome_autor = scanner.nextLine();

                    // Livro livro = new Livro(lista_livros.size(), nome_livro, nome_autor, "Arqueiro");

                    Livro livro = new Livro(lista_livros.size(), "livro", "nome_autor", "Arqueiro");
                    lista_livros.add(livro);

                    break;
                
                case 2:

                    System.out.println("Qual livro você procura?");
                    entrada_livro = scanner.nextLine();

                    for (int i = 0; i < lista_livros.size(); i++) {
                        
                        
                        if (entrada_livro.equals(lista_livros.get(i).getNome())) {
                            lista_livros.get(i).getDesc();
                            break;
                        }
                        else if(i == lista_livros.size())
                        {
                            System.out.println("\nLivro não encontrado! \n");
                            break;
                        }
                    }
                break;

                case 3:

                    System.out.println("Qual autor você procura?");
                    entrada_autor = scanner.nextLine();

                    for (int i = 0; i < lista_livros.size(); i++) {
                        
                        if (entrada_autor.equals(lista_livros.get(i).getAutor())) {
                            lista_livros.get(i).getDesc();
                            break;
                        }
                        else if(i == lista_livros.size())
                        {
                            System.out.println("\nAutor não encontrado! \n");
                            break;
                        }
                    }
                break;

                case 4:
                    
                    // System.out.println("\nDigite o nome do aluno: ");
                    // String nome_aluno = scanner.nextLine();

                    // System.out.println("\nDigite o idade do aluno: ");
                    // int idade_aluno = Integer.parseInt(scanner.nextLine());

                    // Aluno aluno = new Aluno(lista_alunos.size() + 1, nome_aluno, idade_aluno);
                    Aluno aluno = new Aluno(lista_alunos.size(), "nome", 19);
                    lista_alunos.add(aluno);
                    break;
            
                
                case 5:

                    System.out.println("Id do livro: ");
                    int id_livro = Integer.parseInt(scanner.nextLine());

                    if(lista_alunos.size() > 0 && lista_livros.size() > 0){
                    if (lista_livros.get(id_livro).getStatus()) {
                        System.out.println("O livro está disponivel");

                        try{

                            //System.out.println("Qual o nome do aluno? ");
                            //nome_aluno = scanner.nextLine();
                            String nome_aluno = "nome";
                            for (int i = 0; i < lista_alunos.size(); i++) {
                                if(nome_aluno.equals(lista_alunos.get(i).getNome())){

                                    lista_alunos.get(i).alugarLivro(lista_livros.get(id_livro));
                                    lista_livros.get(id_livro).setStatus(false);
                                    System.out.println("O livro foi alugado! ");
                                }
                                else{
                                    System.out.println("Não foi possível alugar o livro! ");
                                }
                            }
                            

                        }catch(Exception r){
                            System.out.println("Não foi possível realizar o emprestimo! ");
                        }

                        
                    }}
                    else{
                        System.out.println("O livro está indisponivel");
                    }

                break;

                default:
                    break;
            }

        }while(entrada != 0);



    }
}
