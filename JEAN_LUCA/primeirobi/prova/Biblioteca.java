package JEAN_LUCA.primeirobi.prova;

import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            Livros livro1 = new Livros();
            livro1.setTitulo("java iniciante");
            livro1.setAutor("sandrola");

            Livros livro2 = new Livros();
            livro2.setTitulo("java intermediario");
            livro2.setAutor("alex");

            Livros livro3 = new Livros();
            livro3.setTitulo("java avançado");
            livro3.setAutor("joao");

            Alunos alunos1 = new Alunos();
            alunos1.setAlunos("jean");
            Alunos alunos2 = new Alunos();
            alunos2.setAlunos("lucas");
            Alunos alunos3 = new Alunos();
            alunos3.setAlunos("eduarda");

            

           
            
            
            
            


     int menu;
             do{

                System.out.println("1 nome do alunos cadastrados aluno");

                System.out.println("2  nome do titulo cadastados");
               
                System.out.println("3 nome do autores cadastados");
                System.out.println("4 Realizar emprestimo");
                System.out.println("5 Realizar devolucao");
                System.out.println("6 verificar disponibilidade");
                System.out.println("7 multa existente");
                System.out.println("8 sair do sistema");
                menu = scanner.nextInt();

                   switch (menu) {
                    
                    case 1:
                    System.out.println("Alunos ja cadastrados: ");
                    alunos1.apresentarse();
                    alunos2.apresentarse();
                    alunos3.apresentarse();

                    System.out.println("-------------------------------------------");
                        break;
                       case 2:
                       System.out.println("Titulos cadastrados na biblioteca:");
                         livro1.titulos();
                         livro2.titulos();
                         livro3.titulos();
                         System.out.println("-------------------------------------------");
                         break;   
                         case 3:
                         System.out.println("Autores cadastrados na biblioteca:");
                           livro1.autores();
                           livro2.autores();
                           livro3.autores();
                           System.out.println("-------------------------------------------");
                           break;
                           case 4:
                           System.out.println("empretimo realizado com susesso");
                           Emprestimo e1 = new Emprestimo();
                           e1.getEmprestimos();
                           System.out.println("---------------------------");
                           livro1.autores();
                           livro1.titulos();
                          
                           System.out.println("-------------------------------------------");
                              break;
                              
                             case 5:
                             System.out.println("devolucao realizada dentro do prazo com  susesso");
                             Emprestimo e2 = new Emprestimo();
                             e2.devolucao();
                             System.out.println("--------------------------");
                             livro1.autores();
                             livro1.titulos();
                             break;
                             case 6:
                             System.out.println("livros disponives na biblioteca");
                             livro2.titulos();
                             livro3.titulos();
                             System.out.println("-------------------------------------------");
                           break;
                           case 7:
                           System.out.println("verificar multa");
                           Emprestimo e3 = new Emprestimo();
                             e3.multa();
                             Emprestimo md = new Emprestimo();
                            md.setMultas(3.50);
                             md.multas();
                             System.out.println("------------------------------");
                           
                           break;
                           
                     default:
                     System.out.println("saido do sistema...");
                        break;
                   }           
                 






             } while (menu !=8);
        }

    }
}
