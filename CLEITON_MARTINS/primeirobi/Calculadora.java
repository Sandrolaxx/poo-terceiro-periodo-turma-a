package primeirobi;

import java.time.LocalDate;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

import java.util.Arrays;

import java.util.stream.Collectors;

import java.util.stream.Stream;

public class Calculadora 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        List <String> listaDeFlores = new ArrayList<>();
        
        listaDeFlores.add("1 - Violeta");
        listaDeFlores.add("2 - Flor de Liz");
        listaDeFlores.add("3 - Gira Sol");
        listaDeFlores.add("4 - Rosa");
        listaDeFlores.add("5 - Margarida");

        System.out.println("Olá, seja bem vindo!");
        System.out.println("Conheça nossos produtos:");

        for (String flores : listaDeFlores)
        {
            System.out.println(flores);
        }

        System.out.println("Selecione um produto para prosseguir...");

        double violeta = 1.50;
        double florDeLiz = 2.50;
        double giraSol = 3.00;
        double rosa = 4.50;
        double margarida = 5.00;
        
        int inserirProduto = scanner.nextInt();

        switch (inserirProduto) 
        {
            case 1:
                System.out.println("produto selecionado: Violeta " + (violeta) + " reais");
                break;
            case 2:
                System.out.println("produto selecionado: Flor de Liz " + (florDeLiz) + " reais");
                break;
            case 3:
                System.out.println("produto selecionado: Gira Sol " + (giraSol) + " reais");
                break;
            case 4:
                System.out.println("produto selecionado: Rosa " + (rosa) + " reais");
                break;
            case 5:
                System.out.println("produto selecionado: Margarida " + (margarida) + " reais");
                break;
            default:
                System.out.println("O produto inserido não está registrado no sistema ");
                break;
        }
        
        System.out.println("Insira a quantidade do produto");
        
        double produto = inserirProduto;

        int quantidade = scanner.nextInt();
        
        double valorTotal = produto * quantidade;
        
        System.out.println("Insira o valor em reais dado pelo cliente:");
        
        double pagamento = scanner.nextDouble();

        double troco = 0;
        double desconto = 0;

        if (pagamento < valorTotal) 
        {
            System.out.println("Quantidade insuficiente, você precisa de mais dinheiro. ");
        }
        
        if (quantidade >= 10)
        {
            desconto = valorTotal * 0.95;
            troco = pagamento - desconto;
            System.out.println("o valor final com desconto é de " + desconto + " reais");
        }
        else
        {
            troco = pagamento - valorTotal; //não está dando o valor correto quando possui número com vírgula
        }

        System.out.println("1. Visualizar o valor total");
        System.out.println("2. Visualizar o troco");
        System.out.println("3. Sair");

        int informarValores;

        informarValores = scanner.nextInt();

        switch (informarValores) 
        {
            case 1:
                System.out.println("O valor total é de " + (valorTotal) + " reais.");
                break;
            case 2:
                System.out.println("O troco será de " + troco + " reais.");
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção incorreta.");
        }

        double[] vetor1 = new double[5]; //quantidade
        double[] vetor2 = new double[5]; //produto
        double[] vetor3 = new double[5]; //desconto

        for (int i=0; i<5; i++)
        {
            vetor1[i] = quantidade;
            vetor2[i] = produto;
            vetor3[i] = desconto;
        }

        System.out.println("insira uma das opções abaixo para conferir as informações descritas:");
        System.out.println("1 - quantidade de plantas vendidas");
        System.out.println("2 - valor da venda");
        System.out.println("3 - valor do desconto aplicado");
        System.out.println("4 - valor do caixa do dia");

        int conferirVendas = scanner.nextInt();
        
        switch (conferirVendas)
        {
	        case 1:
		        System.out.println("a quantidade plantas vendidas é de: " + vetor1[0]);
		    break;
	        case 2:
		        System.out.println("o valor da venda é de: " + vetor2[0]);
		    break;
	        case 3:
		        System.out.println("o valor do desconto aplicado é de: " + vetor3[0]);
		    break;
            case 4:
                double [][] matrizData = new double[30][12];
    
                for (int i = 0; i < 30; i++)
                {
                    for (int j = 0; j < 12; j++)
                    {
                        System.out.println("O valor total do caixa do dia foi de " + (valorTotal) + " reais");
                    }
                }
            break;
	        default:
		        System.out.println("Insira uma alternativa válida!");
            break;
        }

        List<String> nomeFlores = Arrays.asList("Violeta", "Flor de Liz", "Gira Sol", "Rosa", "Margarida");

        List<String> filtroFlores = nomeFlores.stream()
            .filter(flor -> flor.startsWith("V"))
            .sorted()
            .collect(Collectors.toList());

        filtroFlores.forEach(System.out::println);

        scanner.close();
    }   
}