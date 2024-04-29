package JOAO_BECKER.primeirobi.Prova;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Main {

    public static void main(String[] args) {
        Boolean menuTeste = true;
        try (Scanner scanner = new Scanner(System.in)) {
            int menuOpcao;
            String pesquisa;
            int testeDisponibilidade;
            String livro;
            ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
            ArrayList<Livro> listaLivros = new ArrayList<Livro>();
            while (menuTeste == true) {
                System.out.println("[1] - Cadastrar aluno\n[2] - Cadastrar livro\n[3] - Realizar emprestimo/devolução\n[4] - Sair");
                menuOpcao = scanner.nextInt();
                switch (menuOpcao) {
                    case 1:
                        scanner.nextLine();
                        Aluno alunoTemp = new Aluno(null);
                        System.out.println("Nome do aluno: ");
                        alunoTemp.setNome(scanner.next());
                        listaAlunos.add(alunoTemp);
                        break;
                    
                    case 2:
                        scanner.nextLine();
                        Livro livroTemp =  new Livro(null, null,false ,null, null);
                        System.out.println("Insira nome do livro: ");
                        livroTemp.setNome(scanner.next());
                        System.out.println("Insira autor do livro: ");
                        livroTemp.setAutor(scanner.next());
                        listaLivros.add(livroTemp);
                        break;

                    case 3:
                        int devolucaoMenu;
                        System.out.println("[1] - Realizar emprestimo\n[2] - Realizar devolução");
                        devolucaoMenu = scanner.nextInt();
                        int testeAutorNome;
                        switch (devolucaoMenu) {
                            case 1:
                                System.out.println("[1] - pesquisar por nome\n[2] - Pesquisar por autor");
                                testeAutorNome = scanner.nextInt();
                                if(testeAutorNome == 1){
                                    scanner.nextLine();
                                    System.out.println("Insira nome do livro: ");
                                    pesquisa = scanner.next();
                                    for(int i = 0;i < listaLivros.size();i++){
                                        if(listaLivros.get(i).getNome().equals(pesquisa)){
                                            System.out.println("O titulo "+listaLivros.get(i).getNome()+" do autor "+listaLivros.get(i).getAutor()+" está em nossa biblioteca");
                                            System.out.println("Verificar disponibilidade [1-SIM] [2-NÃO]");
                                            testeDisponibilidade = scanner.nextInt();
                                            if(testeDisponibilidade==1){
                                                listaLivros.get(i).emprestarLivro();
                                            }else{
                                                break;
                                            }
                                        }
                                    }    
                                }if(testeAutorNome==2){
                                    scanner.nextLine();
                                    System.out.println("Insira nome do livro: ");
                                    pesquisa = scanner.next();
                                    for(int i = 0;i < listaLivros.size();i++){
                                        if(listaLivros.get(i).getAutor().equals(pesquisa)){
                                            System.out.println("O titulo "+listaLivros.get(i).getNome()+" do autor "+listaLivros.get(i).getAutor()+" está em nossa biblioteca");
                                            System.out.println("Verificar disponibilidade [1-SIM] [2-NÃO]");
                                            testeDisponibilidade = scanner.nextInt();
                                            if(testeDisponibilidade==1){
                                                listaLivros.get(i).emprestarLivro();
                                            }else{
                                                break;
                                            }
                                        }
                                    }    
                                }

                                break;
                            
                            case 2:
                            System.out.println("[1] - pesquisar por nome\n[2] - Pesquisar por autor");
                            testeAutorNome = scanner.nextInt();
                            if(testeAutorNome == 1){
                                scanner.nextLine();
                                System.out.println("Insira nome do livro: ");
                                pesquisa = scanner.next();
                                for(int i = 0;i < listaLivros.size();i++){
                                    if(listaLivros.get(i).getNome().equals(pesquisa)){
                                        System.out.println("O titulo "+listaLivros.get(i).getNome()+" do autor "+listaLivros.get(i).getAutor()+" está em nossa biblioteca");
                                        System.out.println("Devolver livro [1-SIM] [2-NÃO]");
                                        testeDisponibilidade = scanner.nextInt();
                                        if(testeDisponibilidade==1){
                                            listaLivros.get(i).devolverLivro();
                                        }else{
                                            break;
                                        }
                                    }
                                }    
                            }if(testeAutorNome==2){
                                scanner.nextLine();
                                System.out.println("Insira nome do livro: ");
                                pesquisa = scanner.next();
                                for(int i = 0;i < listaLivros.size();i++){
                                    if(listaLivros.get(i).getAutor().equals(pesquisa)){
                                        System.out.println("O titulo "+listaLivros.get(i).getNome()+" do autor "+listaLivros.get(i).getAutor()+" está em nossa biblioteca");
                                        System.out.println("Devolver livro  [1-SIM] [2-NÃO]");
                                        testeDisponibilidade = scanner.nextInt();
                                        if(testeDisponibilidade==1){
                                            listaLivros.get(i).devolverLivro();
                                        }else{
                                            break;
                                        }
                                    }
                                }    
                            }
                            default:
                                break;
                                
                        }        
                        break;
                    
                    case 4:
                        menuTeste = false;
                        break;

                    default:
                        System.out.println("Opção invalida tente novamente.");
                        break;
                }
            }
        }
    }
}

