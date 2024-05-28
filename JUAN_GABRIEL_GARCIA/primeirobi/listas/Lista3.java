package primeirobi.listas; // cd .. para usar os comandos do git

import java.util.Scanner;

public class Lista3 {

    /*
     * Dona Gabrielinha ficou muito feliz com o software desenvolvido, porém, na
     * utilização ela observou que poderia melhorar mais o sistema para lhe ajudar
     * em pontos que ela não tinha se atentado no início.
     * 
     * Ela te contatou novamente e pediu as seguintes alterações no sistema:
     * 
     * 1. Desconto Especial:
     * Quando um cliente compra mais de 10 plantas, Dona Gabrielinha oferece um
     * desconto especial de 5% no valor total da compra.
     * 
     * Entrada: Receber dois valores, primeiro a quantidade da referida planta,
     * segundo a valor o preço da mesma.
     * Saída: Retornar caso a quantidade informada for maior que 10 realizar o
     * desconto.
     * 
     * 2. Registro de Vendas:
     * Dona Gabrielinha deseja manter um registro das vendas, incluindo a quantidade
     * de plantas vendidas, o valor venda e os descontos aplicados.
     * 
     * Entrada: Venda realizada sistema
     * Saída: Armazenamento desses dados no sistema.
     * 
     * 3. Adicionar ao menu existente função 2 e aprimorar cálculo do valor a pagar
     * com a função 1.
     * 
     * Espero que nessa atividade leve em conta convenções de nomenclatura, para
     * fazer um código mais limpo e compreensivo.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 0, tamanho = 0, dia, mes;
        float valor_planta, valor_recebido, diferenca_desconto = 0, valor_desconto, valor_total, qnt_planta, vendas_dia = 0;
        float[] vetor_plantas = new float[100];
        float[] vetor_venda = new float[100];
        float[] vetor_desconto = new float[100];
        float[][] matriz_vendas = new float[13][31]; // Se deixar 12 e 30 ele da exception out of bounds

        while (contador != 6) {

            System.out.println(
                    "\n Escolha uma opção: \n 1: Calcular preco \n 2: Calcular troco \n 3: Registro de vendas \n 4: Resgistrar valor total de vendas em um dia \n 5: Buscar Quantidade de vendas um um dia especifico \n 6: Sair \n");
            contador = scan.nextInt();
            scan.nextLine();

            switch (contador) {
                case 1:

                    System.out.println("\n Quantas plantas o cliente comprou? \n");
                    qnt_planta = scan.nextInt();
                    scan.nextLine();

                    System.out.println("\n Qual o valor da(s) plantas? \n");
                    valor_planta = scan.nextInt();
                    scan.nextLine();

                    if (qnt_planta <= 0 || valor_planta <= 0) {

                        System.out.println("VALORES INVÁLIDOS");
                    } else {
                        valor_total = qnt_planta * valor_planta;

                        if (qnt_planta > 10) {

                            valor_desconto = valor_total * 0.95f;
                            diferenca_desconto = valor_total - valor_desconto;
                            System.out
                                    .println("O valor total a ser pago, com 10% de desconto é de R$:" + valor_desconto);
                            vetor_plantas[tamanho] = qnt_planta;
                            vetor_venda[tamanho] = valor_total;
                            vetor_desconto[tamanho] = diferenca_desconto;
                        } else {
                            System.out.println("O valor total a ser pago é de R$:" + valor_total);
                            vetor_plantas[tamanho] = qnt_planta;
                            vetor_venda[tamanho] = valor_total;
                            vetor_desconto[tamanho] = 0;
                        }
                        tamanho++;
                    }
                    break;

                case 2:
                    System.out.println("\n Qual o valor total da compra?");
                    valor_total = scan.nextInt();

                    System.out.println("\n Qual o valor recebido pelo cliente? \n");
                    valor_recebido = scan.nextInt();
                    scan.nextLine();

                    if (valor_recebido > valor_total && valor_total > 0) {

                        System.out.println("O troco sera R$:" + (valor_recebido - valor_total));
                        scan.nextLine();
                    } else if (valor_recebido == valor_total && valor_total > 0) {
                        System.out.println("Não há troco a ser pago!");
                        scan.nextLine();
                    }

                    else {

                        System.out.println("VALOR INVALIDO");
                        scan.nextLine();
                    }
                    break;

                case 3:

                    for (int i = 0; i < tamanho; i++) {

                        System.out.println("\n" + (i + 1) + "ª COMPRA: \n Quantidade de plantas vendidadas: "
                                + vetor_plantas[i] + "\n Valor total da venda: " + vetor_venda[i]
                                + "\n Desconto aplicado: R$:" + vetor_desconto[i] + "\n");
                    }
                    break;

                case 4:
                    
                    System.out.println("Qual o valor total das vendas? \n");
                    vendas_dia = scan.nextFloat();

                    
                    System.out.println("Que mês voce deseja salvar?");
                    mes = scan.nextInt();

                    if (mes > 0 && mes < 13) {

                        System.out.println("Que dia voce deseja salvar?");
                        dia = scan.nextInt();

                        if (dia > 0 && dia < 31) {

                            matriz_vendas[mes][dia] = vendas_dia;

                        }
                        else {
                            System.out.println("DIA INVÁLIDO");
                        }
                    }
                    else {
                        System.out.println("MÊS INVÁLIDO");
                    }
                    break;

                case 5:

                System.out.println("Que mês voce deseja buscar?");
                mes = scan.nextInt();

                if (mes > 0 && mes < 13) {

                    System.out.println("Que dia voce deseja salvar?");
                    dia = scan.nextInt();

                    if (dia > 0 && dia < 31) {

                    System.out.println("No dia "+ dia + " do mês " + mes + " Voce registrou um valor total de vendas de R$:" + matriz_vendas[mes][dia]);

                    }
                    else {
                        System.out.println("DIA INVÁLIDO");
                    }
                }
                else {
                    System.out.println("MÊS INVÁLIDO");
                }
                    break;
                case 6:

                    System.out.println("Encerrando sistema");

                    break;

                default:
                    System.out.println("OPÇÃO INVALIDA");
                    scan.nextLine();
                    break;
            }
        }
    }
}