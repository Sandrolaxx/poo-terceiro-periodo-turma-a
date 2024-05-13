package primeirobimestre.atividade1ao4;

import java.util.Scanner;
import java.io.IOException;


public class calculadora2 {

    int[][] listaCompras = new int[50][4];


    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void adicionarNaLista(float[][] matriz, int linhaAtual, float item1, float item2, float item3, float item4) {
        if (linhaAtual >= matriz.length) {
            System.out.println("A matriz está cheia. Não é possível adicionar mais itens.");
            return;
        }
        matriz[linhaAtual][0] = item1;
        matriz[linhaAtual][1] = item2;
        matriz[linhaAtual][2] = item3;
        matriz[linhaAtual][3] = item4;
    }

    public static void exibirLista(float[][] matriz) {
        limparTerminal(); 
        for (int l = 0; l < matriz.length; l++) {
            if (matriz[l][l] == 0.0) {
                break;
            }
            System.out.println("--------------------------------");
            System.out.println("Produto " + l);
            for (int c = 0; c < matriz[l].length; c++) {

                if (c == 0) { // QtdProduto
                    System.out.println("Quantidade de Produtos: " + (int)matriz[l][c]);
                } else if (c == 1) { // Valor Total
                    System.out.println("O valor total foi: R$" + (float)matriz[l][c]);
                } else if (c == 2) { // Desconto
                    System.out.println("O desconto foi: R$" + matriz[l][c]);
                }
            }
        }
    }

    public static void solicitaProduto(float[][] matriz, int linhaAtual) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor unitário do produto: ");
        float valorProduto = input.nextInt();

        System.out.println("Digite a quantidade de produtos: ");
        int qtdProduto = input.nextInt();
        float valorTotal = valorProduto * qtdProduto;
        float desconto = 0;
        if (qtdProduto > 10){
            desconto = (float) (valorTotal * 0.05);
            valorTotal = valorTotal - desconto;
            System.out.println("O valor total foi de R$" + valorTotal);
        } else {
            System.out.println("O valor total foi de R$" + valorTotal);
        }


        System.out.println("Qual foi o valor pago?");
        float valorPago = input.nextInt();

        adicionarNaLista(matriz, linhaAtual, qtdProduto, (float)valorTotal, (float)desconto, (float)valorPago);
        input.close();
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        float[][] listaCompras = new float[50][5];
        int linhaAtual = 0;
        solicitaProduto(listaCompras, linhaAtual);
        do {
            System.out.println("--------------------------------");
            System.out.println("Menu: \n[1] - Calcular preço total\n[2] - Calcular troco\n[3] - Adicionar a sacola\n[4] - Verificar sacola\n[5] - Sair" );
            System.out.println("--------------------------------");
            switch (input.nextInt()) {
                case 1:  
                    float soma = 0;
                    limparTerminal();               
                    for (int l = 0; l < (linhaAtual + 1); l++){
                        float valor = listaCompras[l][1];
                        soma = soma + valor;
                    }
                    System.out.println("O valor total a ser pago é: R$" + soma);
                    break;
                case 2:
                    limparTerminal();
                    soma = 0;
                    float pago = 0;
                    for (int l = 0; l < (linhaAtual + 1); l++){
                        float valor = listaCompras[l][1];
                        soma = soma + valor;
                    }
                    for (int l = 0; l < (linhaAtual + 1); l++){
                        float valor = listaCompras[l][3];
                        pago = pago + valor;
                    }
                    limparTerminal();
                    if (soma == pago) {
                        System.out.println("Não há troco.");
                    } else if (pago < soma){
                        System.out.println("Está faltando " + (soma - pago) + " reais.");
                    } else {
                        System.out.println("O troco é " +  (pago - soma) + " reais.");
                    }
                    break;
                case 3:
                    limparTerminal();
                    linhaAtual = linhaAtual + 1;
                    solicitaProduto(listaCompras, linhaAtual);
                    break;
                case 4:
                    limparTerminal();
                    exibirLista(listaCompras);
                    break;
                case 5:
                    System. exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            input.close();
        } while (true);
    }
}