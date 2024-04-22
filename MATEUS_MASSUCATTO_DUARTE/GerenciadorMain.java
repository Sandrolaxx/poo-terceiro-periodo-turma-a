//        import java.util.Date;
//        import java.util.Scanner;
//
//        public class GerenciadorMain 
//        {
//            public static void main(String[] args) 
//            {
//                Scanner scanner = new Scanner(System.in);
//                
//                Loja loja = new Loja("Arbor", "My Plant", 123456789, "Salto do Lontra", "Fraron", "Morumbi", 5612, "Atras de Majula");
//                Vendedor[] vendedores = new Vendedor[2];
//                Cliente[] clientes = new Cliente[2];
//                Gerente[] gerentes = new Gerente[1];
//
//                //associando os arrays de vendedores e clientes para a loja
//                loja.vendedores = vendedores;
//                loja.clientes = clientes;
//                loja.gerentes = gerentes;
//
//                System.out.println("Quantidade de vendedores na loja: " + loja.contarVendedores());
//                System.out.println("Quantidade de clientes na loja: " + loja.contarClientes());
//                System.out.println("Quantidae de gerentes na loja: " + loja.contarGerentes());
//                loja.apresentarseL();
//               System.out.println("---------------------------------------------------");
//            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//                Vendedor vendedorUm = new Vendedor("Carlinhos", 23, "Arbor", "Salto do Lontra", "Limoeiro", "Sao Pualo", 1363, "Shrine of Amana", 2500, (2500 + 3000 + 2650));  
//                vendedorUm.apresentarseV();
//                vendedorUm.calcularMedia();
//                vendedorUm.calcularBonus();
//                System.out.println("\n");
//
//                Vendedor vendedorDois = new Vendedor("Clebusglóides", 25, "Arbor", "Dois vizinhos", "Anor Londo", "Juriquaquara", 2862, "Ao lado da Cripta dos Mortos-Vivos", 2600, (2600 + 3100 + 2750));
//                vendedorDois.apresentarseV();
//                vendedorDois.calcularMedia();
//                vendedorDois.calcularBonus();
//                System.out.println("\n");
//
//                Cliente clienteUm = new Cliente("Soclovaldirno", 43, "Majula", "Ambarino", "São Denis", 2862, "Perto de Iron Keep");
//                clienteUm.apresentarseC();
//                System.out.println("\n");
//
//                Cliente clienteDois = new Cliente("Jin Sakai", 32, "Nova Austin", "Izuhara", "Ocha no Mizu", 9746, "2 quadras a direita de Things Betwixt");
//              clienteDois.apresentarseC();
//            System.out.println("\n");
//
//                Gerente gerenteUm = new Gerente("Nashandra", 824, "Arbor", "Doors of Pharos", "Kyoto", "Lost Sinner", 7636, "Ap 2 do condomínio Brighstone Cove Tseldora", 5200, (5200 + 5100 + 4950));
//                gerenteUm.apresentarseG();
//                gerenteUm.calcularMediaG();
//                gerenteUm.calcularBonusG();
//                System.out.println("\n");
//                int opcao;
//                Pedido pedido = new Pedido();
//                Item[] itens = new Item[quantidadeItens];
//                do
//                {
//                    System.out.println("Digite 1 para continuar criando pedidos, 2 para cancelar");
//                    opcao = scanner.nextInt();
//                    if (opcao == 1)
//                    {
//                        //criando e processando um pedido de exemplo
//                        System.out.println("Digite o id do produto: ");
//                        pedido.id = scanner.nextInt();
//                      pedido.dataCriacao = new Date();
//                    pedido.dataVencimentoReserva = new Date(pedido.dataCriacao.getTime() + 3 * 24 * 60 * 60 * 1000);// 3 dias apos a criacao
//                  pedido.cliente = clientes[0]; // atribuindo um cliente de exemplo
//                        pedido.vendedor = vendedores[0]; //"""
//                        pedido.loja = loja; // atrbuindo a loja
//                        System.out.println("Digite a quantidade de itens: ");
//                        int quantidadeItens = scanner.nextInt();
//                        //criar um array de itens com o tamanho especificado
//                        
//
//                        for(int i = 0; i < quantidadeItens; i++)
//                        {
//                            Item item = new Item();
//                            System.out.println("Item " + (i + 1) + ":");
//                            System.out.println("Digite o nome do item: ");
//                            item.nome = scanner.nextLine();
//                            System.out.println(item.nome);
//
//                            System.out.println("Digite o tipo do produto: ");
//                            item.tipo = scanner.nextLine();
//                            System.out.println(item.tipo);
//
//                            System.out.println("Digite o valor do produto");
//                            item.valor = scanner.nextInt();
//                            System.out.println(item.valor);
//                            itens[i] = item;
//                        }
//                    }    
//                } while(opcao != 3);    
//                //associar o array de itens ao pedido
//                pedido.itens = itens;
//
//                //processar o pedido
//                ProcessaPedido processador = new ProcessaPedido();
//                processador.processar(pedido);
//            }    
//        }
//