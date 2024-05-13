package primeirobi.Exercicio7;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Floricultura {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Boolean menu = true;
            ArrayList<Item> itemsRegistrados = new ArrayList<Item>();
            while(menu==true){
                System.out.println("[1] - Gerar pedido \n[2] - Cadastro de itens\n[3] - Listar itens\n[4] - Cadastrar cliente\n[5] - Cadastrar vendedor\n[6] - Cadastrar gerente\n[7] - Cadastrar loja\n[8] - Sair ");
                short menuOpcao;
                menuOpcao=scanner.nextShort();
                switch (menuOpcao) {
                    case 1:
                        String id;
                        int qtd;
                        System.out.println("Id do item");
                        id = scanner.next();
                        System.out.println("Quantidade do item");
                        qtd = scanner.nextInt();
                        
                        break;

                    case 2:
                        Item itemTemp =  new Item(null, null, null, null);
                        System.out.println("ID: ");
                        itemTemp.setId(scanner.next());
                        System.out.println("Nome: ");
                        itemTemp.setNome(scanner.next());
                        System.out.println("Tipo: ");
                        itemTemp.setTipo(scanner.next());
                        System.out.println("Valor: ");
                        itemTemp.setValor(scanner.nextDouble());
                        itemsRegistrados.add(itemTemp);
                        break;

                    case 3:
                        for (int i = 0; i < itemsRegistrados.size(); i++) {
                                System.out.println("ID :"+itemsRegistrados.get(i).getId());
                                System.out.println("Nome :"+itemsRegistrados.get(i).getNome());
                                System.out.println("Tipo :"+itemsRegistrados.get(i).getTipo());
                                System.out.println("Valor :"+itemsRegistrados.get(i).getValor());
                                System.out.println("\n");
                        }    
                        break;

                    case 4:
                        Cliente clienteUm = new Cliente(null, null, null);
                        System.out.println("Nome: ");
                        clienteUm.setNome(scanner.next());
                        System.out.println("Idade: ");
                        clienteUm.setIdade(scanner.nextInt());
                        break;

                    case 5:
                        Vendedor vededorUm = new Vendedor(null, null, null, null, null, null);
                        System.out.println("Nome: ");
                        vededorUm.setNome(scanner.next());
                        System.out.println("Idade: ");
                        vededorUm.setIdade(scanner.nextInt());
                        
                        break;

                    case 6:
                        Gerente gerenteUm = new Gerente(null, null, null, null, null, null, null, null, null);
                        System.out.println("Nome: ");
                        gerenteUm.setNome(scanner.next());
                        System.out.println("Idade: ");
                        gerenteUm.setIdade(scanner.nextInt());
                        break;

                    case 7:
                        Loja lojaUm =  new Loja(null, null, null, null, null, null);
                        System.out.println("Nome fantasia");
                        lojaUm.setNomeFantasia(scanner.next());
                        System.out.println("CNPJ");
                        lojaUm.setCnpj(scanner.next());
                        break;

                    case 8:
                        menu = false;
                        break;

                    default:
                    System.out.println("Opção invalida.");
                        break;
                }
            }
        }
     }
     }
/*Realizar melhorias de encapsulamento.

2. Implementar/Melhorar ProcessaPedido, possibilitar a venda com item definido pelo cliente.

3. Refatorar Menu existente. Adicione ao menu existente as seguintes opções:
- Cadastro de itens - Realiza o cadastro de um novo item.
- Listar itens - Apenas lista os itens já cadastrados, min 2 itens.

4. Cliente deverá selecionar o item que deseja compra, com isso criar o pedido.
 */
