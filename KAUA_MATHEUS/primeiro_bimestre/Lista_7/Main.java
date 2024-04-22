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
        // Criação de um Scanner
        Scanner scanner = new Scanner(System.in);


        Endereco endereco1 = new Endereco(
            "PR", "Cascavel", "Santa Cruz",
                "Txikaos", "13141", "Perto de um Lugar"
        );


        Loja store1 = new Loja(
            "Myy Plant", "Myy Plant Varejo de Plantas", "151561", endereco1
        );


        store1.apresentarSe();


        Vendedor seller1 = new Vendedor("Kauã", 19, store1, endereco1, wage_received, 1800f);
        seller1.apresentarSe();

        Vendedor[] sellers = new Vendedor[] {seller1, seller1, seller1};

        store1.sellers = sellers;

        System.out.println(store1.contarVendedores());
        
    
}}
