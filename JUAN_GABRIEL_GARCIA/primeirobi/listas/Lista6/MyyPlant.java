package primeirobi.listas.Lista6;

import java.util.Scanner;

public class MyyPlant {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 1;

        while (contador != 0) {

            System.out.println("Escolha uma opção para o sistema:\n 1. Calcular media e bonus dos salários e verificar o salario recebido, apresentar vendedores e gerente\n 2. Apresentar cliente(s) \n 3. Apresentar informacoes da loja \n 4. Realizar pedido \n 0: Encerrar sistema");
            contador = scan.nextInt();

            switch (contador) {
                case 1:

                Vendedor vendedor1 = new Vendedor();
                Vendedor vendedor2 = new Vendedor();
                Gerente gerente1 = new Gerente();
                Loja myyPlant = new Loja();
                
                vendedor1.loja = myyPlant;
                vendedor2.loja = myyPlant;
                gerente1.loja = myyPlant;
                
                myyPlant.nomeFantasia = "MyyPlant";

                vendedor1.nome = "Augusto Paulo Levi Pinto";
                vendedor1.idade = "34";

                vendedor2.nome = "Diogo Felipe da Conceição";
                vendedor2.idade = "47";

                gerente1.nome = "Elenilton Silva Mendes";
                gerente1.idade = "55";

                vendedor1.salarioBase[0] = 1412;
                vendedor1.salarioRecebido[0] = 1412;
                vendedor1.salarioRecebido[1] = 1588;
                vendedor1.salarioRecebido[2] = 1000;

                vendedor2.salarioBase[0] = 1412;
                vendedor2.salarioRecebido[0] = 2242;
                vendedor2.salarioRecebido[1] = 1758;
                vendedor2.salarioRecebido[2] = 2000;

                gerente1.salarioBase[0] = 10000;
                gerente1.salarioRecebido[0] = 10000;
                gerente1.salarioRecebido[1] = 12000;
                gerente1.salarioRecebido[2] = 13000;

                vendedor1.calcularMedia();
                vendedor2.calcularMedia();
                gerente1.calcularMedia();

                System.out.println();

                vendedor1.calcularBonus();
                vendedor2.calcularBonus();
                gerente1.calcularBonus();
                
                vendedor1.apresentarse();
                vendedor2.apresentarse();
                gerente1.apresentarse();
                
                    break;
                case 2:
                    
                Cliente cliente1 = new Cliente();
                Cliente cliente2 = new Cliente();

                    cliente1.nome = "Roberto";
                    cliente1.idade = "19";

                    cliente2.nome = "Jurandir";
                    cliente2.idade = "43";

                cliente1.apresentarse();
                cliente2.apresentarse();
                    break;
                case 3:

                Loja loja1 = new Loja();

                    loja1.nomeFantasia = "Myy Plant";
                    loja1.CPNJ = "24.097.770/0001-62";
                    loja1.estado = "Parana";
                    loja1.cidade = "Cascavel";
                    loja1.bairro = "Rubem Braga";
                    loja1.rua = "Rua Rubens Rangel";
                    loja1.complemento = "sem complemento";
                    loja1.numero = "1873";

                    loja1.vetorClientes[0] = "Roberto";
                    loja1.vetorClientes[1] = "Jurandir";
                    loja1.vetorVendedores[0] = "Augusto Paulo Levi Pinto";
                    loja1.vetorVendedores[1] = "Diogo Felipe da Conceição";
                    loja1.vetorVendedores[2] = "Igor Antonio Barbosa";

                    loja1.apresentarse();
                    loja1.contarClientes();
                    loja1.contarVendedores();

                    break;
                case 4:

                ProcessaPedido processa = new ProcessaPedido();

                ProcessaPedido pagamento = new ProcessaPedido();

                processa.processar();

                System.out.println();

                processa.calcularValorTotal();

                System.out.println();

                processa.gerarDescricaoVenda();

                pagamento.confirmarPagamento();

                    break;
                default:
                    break;
            }
        }
    }  
}
