package primeirobi.testes.tentativaListaSete;

import java.util.Scanner;

public class MyyPlant {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 1;

        Item item = new Item();

        while (contador != 0) {

            System.out.println("\nTESTE Escolha uma opção para o sistema:\n1. Calcular media e bonus dos salários e verificar o salario recebido, apresentar vendedores e gerente\n2. Apresentar cliente(s) \n3. Apresentar informacoes da loja \n4. Cadastar item \n5. Listar itens \n6. Criar pedido \n0: Encerrar sistema");
            contador = scan.nextInt();

            switch (contador) {
                case 1:

                Vendedor vendedor1 = new Vendedor();
                Vendedor vendedor2 = new Vendedor();
                Gerente gerente1 = new Gerente();
                Loja myyPlant = new Loja();
                
                vendedor1.setLoja(myyPlant);
                vendedor2.setLoja(myyPlant);
                gerente1.setLoja(myyPlant);
                
                myyPlant.setNomeFantasia("MyyPlant");

                vendedor1.setNome("Augusto Paulo Levi Pinto");
                vendedor1.setIdade("34");

                vendedor2.setNome("Diogo Felipe da Conceição");
                vendedor2.setIdade("47");

                gerente1.setNome("Elenilton Silva Mendes");
                gerente1.setIdade("55");

                vendedor1.setSalarioBase(1412, 0);
                vendedor1.setSalarioRecebido(1412, 0);
                vendedor1.setSalarioRecebido(1412, 1);
                vendedor1.setSalarioRecebido(1412, 2);

                vendedor2.setSalarioBase(1412, 0);
                vendedor2.setSalarioRecebido(2242, 0);
                vendedor2.setSalarioRecebido(1758, 1);
                vendedor2.setSalarioRecebido(2000, 2);

                gerente1.setSalarioBase(10000, 0);
                gerente1.setSalarioRecebido(10000, 0);
                gerente1.setSalarioRecebido(12000, 1);
                gerente1.setSalarioRecebido(12000, 2);

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

                    cliente1.setNome("Roberto");
                    cliente1.setIdade("19");

                    cliente2.setNome("Jurandir");
                    cliente2.setIdade("43");

                cliente1.apresentarse();
                cliente2.apresentarse();
                    break;
                case 3:

                Loja loja1 = new Loja();
                Endereco enderecoLoja = new Endereco();

                loja1.endereco = enderecoLoja;

                enderecoLoja.setEstado("Parana");
                enderecoLoja.setCidade("Cascavel");
                enderecoLoja.setBairro("Rubem Braga");
                enderecoLoja.setRua("Rua Rubens Rangel");
                enderecoLoja.setComplemento("sem complemento");
                enderecoLoja.setNumero("1873");

                    loja1.setNomeFantasia("Myy Plant");
                    loja1.setCPNJ("12812012740912");

                    loja1.setVetorClientes("Roberto", 0);
                    loja1.setVetorClientes("Jurandir", 1);

                    loja1.setVetorVendedores("Augusto Paulo Levi Pinto", 0);
                    loja1.setVetorVendedores("Diogo Felipe da Conceição", 1);
                    loja1.setVetorVendedores("Igor Antonio Barbosa", 2);

                    loja1.apresentarse();
                    loja1.contarClientes();
                    loja1.contarVendedores();

                    break;
                case 4:

                item.cadastrarItem();
                    break;
                
                
                case 5:

                item.listarItens();
                break;

                case 6:

                item.criarPedido();

                    break;
                default:
                    break;
            }
        }
    }  
}