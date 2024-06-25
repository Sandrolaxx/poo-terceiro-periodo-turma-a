// package EDUARDO_JOSE_SKURA_CZERNIAK.primeirobi.prova;

// public class Biblioteca {
    
//     public static void main(String[] args) {

//         //Introdução

//         System.out.println("\nOlá seja bem-vindo(a) a biblioteca do Centro Universitário FAG!\n");
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//         System.out.println("\nCadastrando Aluno(s)...\n");
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//         //Dados de Alunos
//         Aluno aluUm = new Aluno(null, null, null, null, null, null, null, null, null, null);
//         Aluno aluDois = new Aluno(null, null, null, null, null, null, null, null, null, null);

//         aluUm.setNomeAluno("Eduardo");
//         aluUm.setIdAluno("123456789");
//         aluUm.setCursoAluno("Engenharia de Software");

//         aluDois.setNomeAluno("Clarissa");
//         aluDois.setIdAluno("987654321");
//         aluDois.setCursoAluno("Direito");


//         String[] vetorAlunos = new String[2];
//         vetorAlunos[0] =  aluUm.getNomeAluno();
//         vetorAlunos[1] = aluDois.getNomeAluno();

//         String[] vetorIdAlunos = new String[2];
//         vetorIdAlunos[0] =  aluUm.getIdAluno();
//         vetorIdAlunos[1] = aluDois.getIdAluno();

//         String[] vetorCursoAluno = new String[2];
//         vetorCursoAluno[0] =  aluUm.getCursoAluno();
//         vetorCursoAluno[1] = aluDois.getCursoAluno();

//         aluUm.apresentarAluno();
//         aluDois.apresentarAluno();

//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//         System.out.println("\nCadastrando Livro(s)...\n");
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//         //Dados de Livros

//         DadosLivro livUm = new DadosLivro(null, null, null, null, null, null, null, null, null, null);
//         DadosLivro livDois = new DadosLivro(null, null, null, null, null, null, null, null, null, null);

//         livUm.setTituloLivro("Fearless");
//         livUm.setAutorLivro("Lesserafim");
//         livUm.setDisponibilidadeLivro("true");

//         livDois.setTituloLivro("Drama");
//         livDois.setAutorLivro("Aespa");
//         livDois.setDisponibilidadeLivro("true");

//         livUm.apresentarLivro();
//         livDois.apresentarLivro();

//         String[] vetorTitulos = new String[2];
//         vetorTitulos[0] =  livUm.getTituloLivro();
//         vetorTitulos[1] = livDois.getTituloLivro();

//         String[] vetorAutores = new String[2];
//         vetorAutores[0] =  livUm.getAutorLivro();
//         vetorAutores[1] = livDois.getAutorLivro();

//         // Processo de Empréstimo de Livro - 001

//         Emprestimo empUm = new Emprestimo(null, null, null, null, null, null, null, null, null, null);

//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//         System.out.println("\nVerificando Disponibilidade...\n");
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//         System.out.println("\nDa Obra Fearless de Autoria de Lesserafim...\n");

//         empUm.setEmpNome(vetorAlunos[0]);
//         empUm.setEmpId(vetorIdAlunos[0]);
//         empUm.setEmpCurso(vetorCursoAluno[0]);
//         empUm.setHorarioAgora(new Date());
//         livUm.processoDisponibilidade();
//         livUm.setDisponibilidadeLivro("false");

//         // Processo de Devolução de Livro - 001

//         System.out.println("\nProcessando Devolução...\n");
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//         Long diaDate = 86400000l;
//     Long seteDias = diaDate * 7;

//     System.out.println("\n Elaine: VOCÊ ESTÁ ATRASADO! >=( \n)");
//     System.out.println(" irá 28 reais ok?");

//         long dataDevolucao = diaDate + seteDias;
//         if (dataDevolucao <= seteDias) {
//             Double pagamentoDevolucao;
//             pagamentoDevolucao = 3.50*(dataDevolucao/diaDate);
//             System.out.println("Você irá pagar " + pagamentoDevolucao + " reais!");
//             System.out.println(" 28 reais ok?");




//         }

//     }
// }
