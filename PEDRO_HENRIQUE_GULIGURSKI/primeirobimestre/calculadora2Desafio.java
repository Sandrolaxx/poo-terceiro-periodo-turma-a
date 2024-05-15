package primeirobimestre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculadora2Desafio {
    
    static List<Float[]> listaCompras = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void adicionarNaLista(float item1, float item2, float item3, float item4) {
        listaCompras.add(new Float[] {item1, item2, item3, item4});
    }

    public static void exibirLista() {
        limparTerminal(); 
        for (int l = 0; l < listaCompras.size(); l++) {
            System.out.println("--------------------------------");
            System.out.println("Produto " + l);
            Float[] produto = listaCompras.get(l);
            System.out.println("Quantidade de Produtos: " + produto[0]);
            System.out.println("O valor total foi: R$" + produto[1]);
            System.out.println("O desconto foi: R$" + produto[2]);
        }
    }

    public static void solicitaProduto() {
        System.out.println("Digite o valor unitário do produto: ");
        float valorProduto = input.nextFloat();

        System.out.println("Digite a quantidade de produtos: ");
        int qtdProduto = input.nextInt();
        float valorTotal = valorProduto * qtdProduto;
        float desconto = qtdProduto > 10 ? valorTotal * 0.05f : 0;

        System.out.println("Qual foi o valor pago?");
        float valorPago = input.nextFloat();

        adicionarNaLista(qtdProduto, valorTotal, desconto, valorPago);
    }

    public static void main(String[] args) {
        boolean continua = true;

        do {
            System.out.println("--------------------------------");
            System.out.println("Menu: \n[1] - Calcular preço total\n[2] - Calcular troco\n[3] - Adicionar a sacola\n[4] - Verificar sacola\n[5] - Sair" );
            System.out.println("--------------------------------");
            switch (input.nextInt()) {
                case 1:  
                    float soma = listaCompras.stream().map(produto -> produto[1]).reduce(0f, Float::sum);
                    System.out.println("O valor total a ser pago é: R$" + soma);
                    break;
                case 2:
                    soma = listaCompras.stream().map(produto -> produto[1]).reduce(0f, Float::sum);
                    float pago = listaCompras.stream().map(produto -> produto[3]).reduce(0f, Float::sum);
                    if (pago == soma) {
                        System.out.println("Não há troco.");
                    } else if (pago < soma){
                        System.out.println("Está faltando " + (soma - pago) + " reais.");
                    } else {
                        System.out.println("O troco é " +  (pago - soma) + " reais.");
                    }
                    break;
                case 3:
                    solicitaProduto();
                    break;
                case 4:
                    exibirLista();
                    break;
                case 5:
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (continua);
    }
}
