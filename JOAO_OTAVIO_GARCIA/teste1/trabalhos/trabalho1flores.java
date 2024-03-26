import java.util.Scanner;

public class trabalho1flores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean f3 = true;

        while (f3) {

            System.out.println("________________________________________\n");
            System.out.println("|            SISTEMA DA LOJA           |\n");
            System.out.println("|              Gabrielinha             |\n");
            System.out.println("|escolha uma das seguinte opreações:   |\n");
            System.out.println("|(1)fazer uma venda                    |\n");
            System.out.println("|(2)sair do sistema                    |\n");
            System.out.println("|______________________________________|\n");

            int opc = scanner.nextInt();

            boolean f1 = true;

            switch (opc) {
                case 1:
                    while (f1) {

                        System.out.println("digite a quantidade de plantas vendidas");
                        int quantplant = scanner.nextInt();
                        if (quantplant > 0) {
                            float valortotal = 0;
                            float valor = 0;
                            for (int i = 0; i < quantplant; i++) {
                                boolean r = true;

                                while (r) {
                                    System.out.println("qual o valor da " + (i + 1) + " planta?");
                                    valor = scanner.nextFloat();
                                    if (valor > 0) {

                                        r = false;

                                    } else {
                                        System.out.println("valor negativo");
                                        r = true;
                                    }

                                }
                                valortotal = valor + valortotal;

                            }

                            System.out.println("insira o valor do pagamento");
                            float pagamento = scanner.nextFloat();

                            boolean f2 = true;

                            while (f2) {

                                System.out.println("_______________________________________\n");
                                System.out.println("|           SISTEMA DE VENDA          |\n");
                                System.out.println("|             Gabrielinha             |\n");
                                System.out.println("|Valor da compra: " + valortotal + "                 |\n");
                                System.out.println("|valor do pagamento: " + pagamento + "              |\n");
                                System.out.println(
                                        "|troco: " + (pagamento - valortotal) + "                         |\n");
                                System.out.println("|escolha uma das seguinte opreações:  |\n");
                                System.out.println("|(1)Fazer outra venda                 |\n");
                                System.out.println("|(2)sair da venda                     |\n");
                                System.out.println("|_____________________________________|\n");

                                int n = scanner.nextInt();
                                switch (n) {
                                    case 1:

                                        f2 = false;

                                        break;
                                    case 2:

                                        f2 = false;
                                        f1 = false;

                                        break;

                                    default:
                                        System.out.println("valor inserido invalido");

                                        break;
                                }
                            }

                        } else {
                            System.out.println("quantidade invalida");
                            f1 = true;

                        }
                    }

                    break;

                case 2:
                    System.out.println("saindo do sistema");
                    f3 = false;
                    scanner.close();

                    break;

                default:
                    System.out.println("opção invalida");

                    break;
            }
        }

    }

}
