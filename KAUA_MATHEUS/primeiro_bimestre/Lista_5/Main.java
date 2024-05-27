package KAUA_MATHEUS.primeiro_bimestre.Lista_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {

        // Cores
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String standart = "\u001B[m";

        // Instância das listas
        
        float[] wage_received = new float[] {1800, 1800, 1800, 2000, 9000f, 10};

        // Instância da Classe Loja
        Loja store_1 = new Loja("Myy Plant", "Myy Plante Varejo LTDA", "12312312312",
                                "Cascavel", "Cvel. Velho", "Itália"
        );

        // Instância da Classe Vendedor
        Vendedor seller_1 = new Vendedor("Pedro", 18, store_1,
         "Cascavel", "Santa Cruz", "Xavântes",
        wage_received, 1800f);

        // Instância da Classe Cliente        
        Cliente client_1 = new Cliente("João", 22, "Cascavel", "Santa Cruz", "Txikaos");
        Cliente client_2 = new Cliente("Matheus", 17, "Cascavel", "Santa Cruz", "Borroros");


        // Inicialização atrasada
        Cliente[] clientes = new Cliente[] {client_1, client_2};
        Vendedor[] sellers_list = new Vendedor[] {seller_1};

        store_1.clients = clientes;
        store_1.sellers = sellers_list;


        // Métodos Vendedor
        System.out.printf("\n%sMétodos Vendedor%s\n", red, standart);
        seller_1.apresentarSe();
        System.out.printf("A média dos meus salários é: R$%s%.2f%s\n", green, seller_1.calcularMedia(), standart);
        System.out.printf("O bonûs no meu salário é: R$%s%.2f%s\n",yellow, seller_1.calcularBonus(), standart);

        // Métodos Cliente
        System.out.printf("\n%sMétodos Cliente%s\n", red, standart);
        client_1.apresentarSe();

        // Métodos Loja
        System.out.printf("\n%sMétodos Loja%s\n", red, standart);
        store_1.apresentarSe();
        System.out.printf("A quantidade de Clientes é: %s%d%s\n", green, store_1.contarClientes(), standart);
        System.out.printf("A quantidade de Vendedores é: %s%d%s", green, store_1.contarVendedores(), standart);

    }
}
