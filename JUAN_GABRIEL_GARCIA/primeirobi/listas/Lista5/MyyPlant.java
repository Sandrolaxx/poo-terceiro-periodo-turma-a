package primeirobi.listas.Lista5;

import java.util.Scanner;

public class MyyPlant {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contador = 1;

        while (contador != 0) {

            System.out.println("Escolha uma opção para o sistema:\n 1. Calcular media e bonus dos salários e verificar o salario recebido\n 2. Apresentar vendedores \n 3. Apresentar cliente(s) \n 4. Apresentar informacoes da loja \n 0: Encerrar sistema");
            contador = scan.nextInt();

            switch (contador) {
                case 1:

                Vendedor salarios = new Vendedor();

                salarios.salarioRecebido[0] = 1412;
                salarios.salarioRecebido[1] = 2242;
                salarios.salarioRecebido[2] = 2346;

                salarios.calcularMedia();

                System.out.println();

                salarios.calcularBonus();
                
                    break;
                case 2:
                    
                Vendedor vendedor1 = new Vendedor();
                Vendedor vendedor2 = new Vendedor();
                Vendedor vendedor3 = new Vendedor();
                Loja myyPlant = new Loja();
                vendedor1.loja = myyPlant;
                vendedor2.loja = myyPlant;
                vendedor3.loja = myyPlant;
                
                myyPlant.nomeFantasia = "MyyPlant";

                    vendedor1.nome = "Augusto Paulo Levi Pinto";
                    vendedor1.idade = "34";

                    vendedor2.nome = "Diogo Felipe da Conceição";
                    vendedor2.idade = "47";

                    vendedor3.nome = "Igor Antonio Barbosa";
                    vendedor3.idade = "44";

                vendedor1.apresentarse();
                vendedor2.apresentarse();
                vendedor3.apresentarse();
                    
                    break;
                case 3:
                    
                Cliente cliente1 = new Cliente();
                Cliente cliente2 = new Cliente();

                    cliente1.nome = "Roberto";
                    cliente1.idade = "19";

                    cliente2.nome = "Jurandir";
                    cliente2.idade = "43";

                cliente1.apresentarse();
                cliente2.apresentarse();
                    break;
                case 4:

                Loja loja1 = new Loja();

                    loja1.nomeFantasia = "Myy Plant";
                    loja1.CPNJ = "24.097.770/0001-62";
                    loja1.cidade = "Cascavel";
                    loja1.bairro = "Rubem Braga";
                    loja1.rua = "Rua Rubens Rangel";
                    loja1.vetorClientes[0] = "Roberto";
                    loja1.vetorClientes[1] = "Jurandir";
                    loja1.vetorVendedores[0] = "Augusto Paulo Levi Pinto";
                    loja1.vetorVendedores[1] = "Diogo Felipe da Conceição";
                    loja1.vetorVendedores[2] = "Igor Antonio Barbosa";

                    loja1.apresentarse();
                    loja1.contarClientes();
                    loja1.contarVendedores();

                    break;
                default:
                    break;
            }
        }
    }  
}
