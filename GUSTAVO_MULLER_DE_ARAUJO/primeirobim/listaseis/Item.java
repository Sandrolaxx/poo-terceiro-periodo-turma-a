package primeirobim.listaseis;

import java.util.Scanner;

public class Item {

    public int id;

    public String nome;

    public String tipo;

    public double valor;

    public int qntd;

    public int [] item;

    public void gerarDescricao() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Consulta de itens");
        Item[] itens = new Item[2];
        
        for (int i = 0; i < itens.length; i++) {
            System.out.println("Item " + (i + 1));
            
            System.out.println("Insira o nome do item");
            String nomeItem = scanner.next();
            System.out.println("Insira o tipo do item");
            String tipoItem = scanner.next();
            System.out.println("Insira o Id do item");
            int idItem = scanner.nextInt();
            System.out.println("Insira o valor do Item");
            double valorItem = scanner.nextDouble();
    
            Item novoItem = new Item();
            novoItem.nome = nomeItem;
            novoItem.tipo = tipoItem;
            novoItem.id = idItem;
            novoItem.valor = valorItem;
            itens[i] = novoItem;
        }

        for (Item item : itens) {
            System.out.println("Nome do item: " + item.nome + "\n" + "Tipo do item: " + item.tipo + "\n"
            + "Id do item: " + item.id + "\n" + "Valor do item: " + item.valor + "\n");
  
        }
    }
    }

    

