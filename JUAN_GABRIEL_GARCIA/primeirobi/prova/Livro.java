// package JUAN_GABRIEL_GARCIA.primeirobi.prova;

// import java.util.Date;
// import java.util.Scanner;

// public class Livro {

//     Scanner scan = new Scanner(System.in);

//     private String nome, autor, buscaNome, buscaAutor, devolverNome;

//     private int i = 0, escolhaImprestimo = 0;

//     private double multa = 3.5;

//     private String[] listaTitulo = new String[10];

//     private String[] listaAutor = new String[10];

//     private String[] imprestimoTitulo = new String[10];

//     private String[] imprestimoAutor = new String[10];

//     Date date = new Date();
//     long umDia = 86400000l;
//     long daquiSeteDias = date.getTime() + (7 * umDia);
//     Date seteDias = new Date(daquiSeteDias);

//     public String getDevolverNome() {
//         return devolverNome;
//     }

//     public void setDevolverNome(String devolverNome) {
//         this.devolverNome = devolverNome;
//     }

//     public int getEscolhaImprestimo() {
//         return escolhaImprestimo;
//     }

//     public void setEscolhaImprestimo(int escolhaImprestimo) {
//         this.escolhaImprestimo = escolhaImprestimo;
//     }

//     public double getMulta() {
//         return multa;
//     }

//     public void setMulta(double multa) {
//         this.multa = multa;
//     }

//     public String[] getImprestimoTitulo() {
//         return imprestimoTitulo;
//     }

//     public void setImprestimoTitulo(String[] imprestimoTitulo) {
//         this.imprestimoTitulo = imprestimoTitulo;
//     }

//     public String[] getImprestimoAutor() {
//         return imprestimoAutor;
//     }

//     public void setImprestimoAutor(String[] imprestimoAutor) {
//         this.imprestimoAutor = imprestimoAutor;
//     }

//     public Date getDate() {
//         return date;
//     }

//     public void setDate(Date date) {
//         this.date = date;
//     }

//     public long getUmDia() {
//         return umDia;
//     }

//     public void setUmDia(long umDia) {
//         this.umDia = umDia;
//     }

//     public long getDaquiSeteDias() {
//         return daquiSeteDias;
//     }

//     public void setDaquiSeteDias(long daquiSeteDias) {
//         this.daquiSeteDias = daquiSeteDias;
//     }

//     public Date getSeteDias() {
//         return seteDias;
//     }

//     public void setSeteDias(Date multaAtraso) {
//         this.seteDias = multaAtraso;
//     }

//     public Scanner getScan() {
//         return scan;
//     }

//     public void setScan(Scanner scan) {
//         this.scan = scan;
//     }

//     public String getNome() {
//         return nome;
//     }

//     public void setNome(String nome) {
//         this.nome = nome;
//     }

//     public String getAutor() {
//         return autor;
//     }

//     public void setAutor(String autor) {
//         this.autor = autor;
//     }

//     public String getBuscaNome() {
//         return buscaNome;
//     }

//     public void setBuscaNome(String buscaNome) {
//         this.buscaNome = buscaNome;
//     }

//     public String getBuscaAutor() {
//         return buscaAutor;
//     }

//     public void setBuscaAutor(String buscaAutor) {
//         this.buscaAutor = buscaAutor;
//     }

//     public int getI() {
//         return i;
//     }

//     public void setI(int i) {
//         this.i = i;
//     }

//     public String[] getListaTitulo() {
//         return listaTitulo;
//     }

//     public void setListaTitulo(String[] listaTitulo) {
//         this.listaTitulo = listaTitulo;
//     }

//     public String[] getListaAutor() {
//         return listaAutor;
//     }

//     public void setListaAutor(String[] listaAutor) {
//         this.listaAutor = listaAutor;
//     }

//     public void cadastrarLivro() {

//         System.out.println("Digite o nome do livro:");
//         nome = scan.next();
//         System.out.println("Digite o autor do livro:");
//         autor = scan.next();

//         for (i = 0; i < listaTitulo.length; i++) {

//             if (listaTitulo[i] == null) {
//                 listaTitulo[i] = nome;
//                 listaAutor[i] = autor;
//                 break;
//             }
//         }
//     }

//     public void buscarPorTitulo() {

//         System.out.println("Digite o nome do título do livro:");
//         buscaNome = scan.next();

//         for (i = 0; i < listaTitulo.length; i++) {

//             if (buscaNome.equals(listaTitulo[i])) {

//                 System.out.println("Livro: " + listaTitulo[i] + " | Autor: " + listaAutor[i] + " - Encontado");

//                 System.out.println("Deseja realizar imprestimo desse livro? Digite\n1 - Sim\n0 - não");
//                 escolhaImprestimo = scan.nextInt();

//                 switch (escolhaImprestimo) {
//                     case 1:

//                         imprestimoTitulo[i] = listaTitulo[i];
//                         imprestimoAutor[i] = listaAutor[i];
//                         listaTitulo[i] = null;
//                         listaAutor[i] = null;

//                         System.out.println("Imprestimo Realizado!\nData de realização de imprestimo:" + date +"\nData de devolução maxima sem multa: " + seteDias + "\nMulta por dia depois da data de atraso = R$: " + multa);
//                         break;
//                     case 0:
//                         break;
//                     default:
//                         System.out.println("Opção invalida!");
//                         break;
//                 }
//                 break;
//             } else {
//                 System.out.println("Livro não encontrado!");
//                 break;
//             }
//         }
//     }

//     public void buscarPorAutor() {

//         System.out.println("Digite o nome do título do livro:");
//         buscaAutor = scan.next();

//         for (i = 0; i < listaTitulo.length; i++) {

//             if (buscaAutor.equals(listaAutor[i])) {

//                 System.out.println("Livro: " + listaTitulo[i] + " | Autor: " + listaAutor[i] + " - Encontado");

//                 System.out.println("Deseja realizar imprestimo desse livro? Digite\n1 - Sim\n0 - não");
//                 escolhaImprestimo = scan.nextInt();

//                 switch (escolhaImprestimo) {
//                     case 1:

//                         imprestimoTitulo[i] = listaTitulo[i];
//                         imprestimoAutor[i] = listaAutor[i];
//                         listaTitulo[i] = null;
//                         listaAutor[i] = null;

//                         System.out.println("Imprestimo Realizado!\nData de realização de imprestimo:" + date +"\nData de devolução maxima sem multa: " + seteDias + "\nMulta por dia depois da data de atraso = R$: " + multa);
//                         break;
//                     case 0:
//                         break;
//                     default:
//                         System.out.println("Opção invalida!");
//                         break;
//                 }
//                 break;
//             } else {
//                 System.out.println("Livro não encontrado!");
//                 break;
//             }
//         }
//     }

//     public void devolucaoLivro() {

//         System.out.println("Digite o nome do livro que voce deseja devolver: ");
//         devolverNome = scan.next();

//         for (int i = 0; i < imprestimoTitulo.length; i++) {
            
//             if (devolverNome.equals(imprestimoTitulo[i])) {

//                 listaTitulo[i] = imprestimoTitulo[i];
//                 listaAutor[i] = imprestimoAutor[i];
//                 imprestimoTitulo[i] = null;
//                 imprestimoAutor[i] = null;
                
                
            
//                 if (date.after(seteDias)) {

//                     System.out.println("Pague sua multa de atraso!");
//                     break;
//                 }
//                 else {
//                     System.out.println("Livro devolvido com sucesso");
//                     break;
//                 }  
//             }
//             else {
//                 System.out.println("Livro não encontrado para devolver");
//                 break;
//             }
//         }
//     }

//     // public void listarLivros() {

//     //     for (int i = 0; i < listaAutor.length; i++) {

//     //         System.out.println("Livro: " + listaTitulo[i] + " | Autor: " + listaAutor[i]);
//     //     }
//     // }
// }
