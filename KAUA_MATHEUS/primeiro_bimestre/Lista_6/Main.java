package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.lang.Thread;

public class Main {
    
    public static void main(String[] args) {

        // Cores
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String standart = "\u001B[m";

        // Instância das listas
        
        float[] wage_received = new float[] {1800, 1800, 1800, 2000, 9000f, 10};
        Long Umdia = 86400000l;

        // Instância da Classe Loja
        Loja store_1 = new Loja("Myy Plant", "Myy Plante Varejo LTDA", "12312312312", "Paraná",
                                "1124", "Perto do Muffatão",
                                "Cascavel", "Cvel. Velho", "Itália"
        );

         // Instância da Classe Vendedor
         Vendedor seller_1 = new Vendedor("Pedro", 18, store_1, "Paraná",
         "1124", "Perto do Muffatão",
         "Cascavel", "Cvel. Velho", "Itália",
         wage_received, 1800f);
 
        // Métodos Vendedor
        //System.out.printf("A média dos meus salários é: R$%s%.2f%s\n", green, seller_1.calcularMedia(), standart);
        //System.out.printf("O bonûs no meu salário é: R$%s%.2f%s\n",yellow, seller_1.calcularBonus(), standart);

        // Instância da Classe Cliente        
        Cliente client_1 = new Cliente("João", 22, "Paraná",
        "1124", "Perto do Muffatão",
        "Cascavel", "Cvel. Velho", "Itália");
        Cliente client_2 = new Cliente("Matheus", 17, "Paraná",
        "1124", "Perto do Muffatão",
        "Cascavel", "Cvel. Velho", "Itália");


        // Inicialização atrasada
        Cliente[] clientes = new Cliente[] {client_1, client_2};
        Vendedor[] sellers_list = new Vendedor[] {seller_1};

        store_1.clients = clientes;
        store_1.sellers = sellers_list;


        //System.out.printf("A quantidade de Clientes é: %s%d%s\n", green, store_1.contarClientes(), standart);
        //System.out.printf("A quantidade de Vendedores é: %s%d%s\n", green, store_1.contarVendedores(), standart);
        
        // Instância de Gerente
        Gerente gerente1 = new Gerente("Matheus", 55, store_1, 
        "Paraná", "1245", "Ruia as qa ", "Cascavel", 
        "Interlagos", "Palmeiras", wage_received, 3000f);

        //System.out.printf("A média dos meus salários é: R$%s%.2f%s\n", green, gerente1.calcularMedia(), standart);
        //System.out.printf("O bonûs no meu salário é: R$%s%.2f%s\n",yellow, gerente1.calcularBonus(), standart);

        // Instância de Item
        Item item1 = new Item();
        item1.setItem("10", "Banana", "Fruta", 2.4f);

        Item item2 = new Item();
        item2.setItem("11", "Arroz", "Grãos", 22.4f);
        Item[] itens = new Item[] {item1, item2};

        // Instância de Pedido
        Date hoje = new Date(-1900 + 2024, 04, 14);
        Date terca = new Date(124, 04, 11);
        Pedido pedido1 = new Pedido("1", client_1, seller_1, store_1,
        itens, terca, hoje);

        // Instância de ProcessaPedido
        ProcessaPedido processo1 = new ProcessaPedido();
        processo1.order = pedido1;
        
        int option, conter=1;

        // Criação de um Scanner
        Scanner scanner = new Scanner(System.in);

        while (true) {
            option = MostraMenu();

            switch (option) {
                case 1:
                    Pedido pedido = new Pedido(Integer.toString(conter), client_1, seller_1, store_1,
                    itens, terca, hoje);
                    conter += 1;
                    break;
            
                default:
                    break;
            }
        }

    }

    // Mostra menu
    public static int MostraMenu(){
        System.out.println("\n===Menu===\n");
        
        System.out.println("1 - Criar Pedido:");
        System.out.println("2 - Resumir pedido: \n");
        /*System.out.println("3 - Visualizar Histórico de Compra  ");
        System.out.println("4 - Apagar Histórico de Compra \n");
        System.out.println("5 - Adicionar caixa ");
        System.out.println("6 - Visualizar caixa \n");
        System.out.println("7 - Fechar do Aplicativo \n");*/

        // Criação de Scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor de option
        int option = Integer.parseInt(scanner.nextLine());

        return option;
    }

    
}
