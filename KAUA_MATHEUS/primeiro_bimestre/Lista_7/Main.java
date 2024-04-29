package KAUA_MATHEUS.primeiro_bimestre.Lista_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
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

        Date hoje = new Date();
        Date ontem = new Date(123, 04, 20);

        Date quarta = new Date(123, 04, 17);

        // Criação de um Scanner
        Scanner scanner = new Scanner(System.in);
        Endereco endereco1 = new Endereco(
            "PR", "Cascavel", "Santa Cruz",
                "Txikaos", "13141", "Perto de um Lugar"
        );

        Loja store_1 = new Loja(
            "Myy Plant", "Myy Plant Varejo de Plantas", "151561", endereco1
        );

        Vendedor seller1 = new Vendedor();
        Vendedor seller2 = new Vendedor();
        seller1.setPessoa("João", 33, endereco1, 1900, wage_received, store_1);
        seller2.setPessoa("Pedro", 13, endereco1, 1900, wage_received, store_1);

        Cliente client1 = new Cliente();
        Cliente client2 = new Cliente();
        client1.setPessoa("João", 19, endereco1);
        client2.setPessoa("Pedro", 21, endereco1);

        Cliente[] lista_clientes = new Cliente[] {client1, client2};
        store_1.setClients(lista_clientes);

        Vendedor[] lista_vendedores = new Vendedor[] {seller1, seller2};
        store_1.setSellers(lista_vendedores);

        //pedido.gerarDescricaoVenda();
        //pedido1.gerarDescricaoVenda();
        //System.out.println(pedido.calculaValorTotal());


        // cores.add("Vermelho");
        // cores.add("Amarelo");
        // System.out.println(cores.size());
        // System.out.println(cores.get(0));

        int entrada;
        List<Item> itens = new ArrayList<>();
        Pedido pedido = new Pedido();

        do {
            System.out.println("Digite a Entrada");
            System.out.println("0: Sair");
            System.out.println("1: Cadastrar Item");
            System.out.println("2: Visualizar Item");
            System.out.println("3: Processar Pedido");

            entrada = Integer.parseInt(scanner.nextLine());
            

            switch (entrada) {
                case 1:

                    System.out.println();

                    String name_item, type_item;
                    float price_item;
                    
                    System.out.println("Nome do item:");
                    name_item = scanner.nextLine();

                    System.out.println("Tipo do item:");
                    type_item = scanner.nextLine();
                    
                    System.out.println("valor do item:");
                    price_item = Float.valueOf(scanner.nextLine()).floatValue();
        
                    Item item = new Item(itens.size() + 1, name_item, type_item, price_item);
                    itens.add(item);
                    System.out.println();

                    break;
                case 2:
                    System.out.println();

                    pedido.setPedido(itens.size() + 1, client2, seller2, 
                    store_1, itens, 
                    hoje, ontem);
            
                    pedido.listarItens();
                    System.out.println(pedido.itens.size());
                    System.out.println();
                    break;

                case 3:
                    System.out.println();

                    ProcessaPedido processo = new ProcessaPedido();
                    processo.setPedido(pedido);

                    try {
                        processo.checagemAgendamento();    
                    } catch (Exception e) {
                        System.out.println("Não existe pedido em Processo");
                    }
                    

                    System.out.println();
                case 0:
                    break;

                default:
                    break;
            }

            
        } while(entrada != 0);
        

        

        
        

        // ProcessaPedido processo = new ProcessaPedido();
        // processo.setPedido(itens);


        // System.out.println(itens.get(entrada));

}}
