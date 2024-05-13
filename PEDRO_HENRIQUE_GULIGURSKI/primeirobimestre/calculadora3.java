package primeirobimestre;

import java.util.Scanner;
import java.io.IOException;

public class calculadora3 {

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
            if (matriz[l][0] == 0.0) {
                break;
            }
            System.out.println("--------------------------------");
            System.out.println("Produto " + l);
            for (int c = 0; c < matriz[l].length; c++) {
                
                if (c == 0) { // QtdProduto
                    System.out.println("Quantidade de Produtos: " + (int)matriz[l][c]);
                } else if (c == 1) { // Valor Total
                    System.out.println("O valor total foi: R$" + matriz[l][c]);
                } else if (c == 2) { // Desconto
                    System.out.println("O desconto foi: R$" + matriz[l][c]);
                }
            }
        }
    }
    
    public static void marcarVendaCalendario(float[][] matrizVenda, float valorTotal) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Em qual dia deseja salvar a compra?");
        int dia = input.nextInt();
        System.out.println("E em que mês?");
        int mes = input.nextInt();
    
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Data inválida!");
            return;
        }
    
        if (matrizVenda[dia][mes] != 0.0f) {
            
            matrizVenda[dia][mes] += valorTotal;
        } else {
            matrizVenda[dia][mes] = valorTotal;
        }
    }
    

    public static void solicitaProduto(float[][] matriz, int linhaAtual, float[][] matrizVenda) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor unitário do produto: ");
        float valorProduto = input.nextFloat();

        System.out.println("Digite a quantidade de produtos: ");
        int qtdProduto = input.nextInt();
        float valorTotal = valorProduto * qtdProduto;
        float desconto = 0;
        if (qtdProduto > 10){
            desconto = valorTotal * 0.05f;
            valorTotal = valorTotal - desconto;
            System.out.println("O valor total foi de R$" + valorTotal);
        } else {
            System.out.println("O valor total foi de R$" + valorTotal);
        }
        

        System.out.println("Qual foi o valor pago?");
        float valorPago = input.nextFloat();

        marcarVendaCalendario(matrizVenda, valorTotal);

        adicionarNaLista(matriz, linhaAtual, qtdProduto, valorTotal, desconto, valorPago);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner input = new Scanner(System.in);
        float[][] listaCompras = new float[50][4];
        float[][] calendarioCompras = new float[32][13  ];
        int linhaAtual = 0;
        solicitaProduto(listaCompras, linhaAtual, calendarioCompras);
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Menu: \n[1] - Calcular preço total\n[2] - Calcular troco\n[3] - Adicionar a sacola\n[4] - Verificar sacola\n[5] - Verificar Venda por Dia\n[6] - Sair" );
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
                    solicitaProduto(listaCompras, linhaAtual, calendarioCompras);
                    break;
                case 4:
                    limparTerminal();
                    exibirLista(listaCompras);
                    break;
                    case 5:
                    System.out.println("De qual dia deseja ver a compra?");
                    if (!input.hasNextInt()) {
                        System.out.println("Entrada inválida para o dia.");
                        break;
                    }
                    int dia = input.nextInt();
                    System.out.println("E em que mês?");
                    if (!input.hasNextInt()) {
                        System.out.println("Entrada inválida para o mês.");
                        break;
                    }
                    int mes = input.nextInt();
                    if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
                        System.out.println("Data inválida!");
                        break;
                    }
                    float valorDia = calendarioCompras[dia][mes];
                    System.out.println("--------------------------------");
                    System.out.println("No dia " + dia + "/" + mes + " o valor da compra foi " + valorDia);
                    break;
                
                case 6:
                    input.close();

                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
