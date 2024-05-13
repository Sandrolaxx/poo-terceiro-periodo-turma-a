package primeirobim.listaseis;

import java.util.Scanner;

public class Lista6 {

        // ENTREGAR HOJE 22/04

        //PRINTAR ENDEREÇO DE UMA MANEIRA INTERESSANTE


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {

            System.out.println("\nMenu:");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Apresenta informações de clientes, vendedores e gerente.");
            System.out.println("2. Printa o endereço de um modo interessante");
            System.out.println("3. Cadastro e listagem de item.");
            System.out.println("4. Inserir pedido e consulta data de vencimento.");
            System.out.println("5. Realizar pedido");
            System.out.println("6. Sair do programa");


            escolha = scanner.nextInt();

            if (escolha == 1) {

                Loja loja1 = new Loja();
                loja1.apresentaLoja();


                Cliente cliente = new Cliente();
                cliente.apresentaCliente();
               

                Vendedor vendedor = new Vendedor();
          
                vendedor.apresentaVendedor();
                vendedor.calcularMedia();
                vendedor.calcularBonus();
                

                Gerente gerente = new Gerente();

                gerente.apresentaGerente();
                gerente.calcularMedia();
                gerente.calcularBonus();
            }

                if (escolha == 2) {

                    Endereco endereco = new Endereco();
                    endereco.apresentarLogradouro();
                }

                if (escolha == 3) {

                    Item item = new Item();
                    item.gerarDescricao();
                }
            
                if (escolha == 4) {

                    Loja loja1 = new Loja();
                    loja1.nomeFantasia = "My Plantt";
                    loja1.cnpj = "123456789";

                    Pedido pedido = new Pedido();
                    pedido.calcularValorTotal();
                    pedido.gerarDescricaoVenda();
                }

                if (escolha == 5) {

                    ProcessaPedido processa = new ProcessaPedido();
                    processa.processar();
                }
            }
         while (escolha != 6);

    }
}
