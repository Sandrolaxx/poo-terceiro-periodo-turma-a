import java.util.Scanner;

public class trabalho2flores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean f3 = true;

        float vetor[] = new float[50000];

        int i = -1;

        while (f3) {

            System.out.println("________________________________________\n");
            System.out.println("|            SISTEMA DA LOJA           |\n");
            System.out.println("|              Gabrielinha             |\n");
            System.out.println("|escolha uma das seguinte opreações:   |\n");
            System.out.println("|(1)fazer uma venda                    |\n");
            System.out.println("|(2)Historico de compra                |\n");
            System.out.println("|(3)sair do sistema                    |\n");
            System.out.println("|______________________________________|\n");

            int opc = scanner.nextInt();

            boolean f1 = true;

            String Desc = "";

            switch (opc) {
                case 1:
                    while (f1) {

                        System.out.println("digite a quantidade de plantas vendidas");
                        int Quantplant = scanner.nextInt();
                        if (Quantplant > 0) {
                            float Valortotal = 0;
                            float Valor = 0;
                            for (int p = 0; p < Quantplant; p++) {
                                boolean r = true;

                                while (r) {
                                    System.out.println("qual o valor da " + (p + 1) + " planta?");
                                    Valor = scanner.nextFloat();
                                    if (Valor >= 0) {

                                        r = false;

                                    } else {
                                        System.out.println("valor negativo");
                                        r = true;
                                    }

                                }
                                Valortotal = Valor + Valortotal;

                            }
                            if (Quantplant >= 10) {

                                Valortotal *= 0.95;

                                Desc = "Desconto";

                            }

                            System.out.println("insira o valor do pagamento");
                            float Pagamento = scanner.nextFloat();

                            boolean f2 = true;

                            while (f2) {

                                i = i + 1;

                                vetor[i] = Valortotal;

                                System.out.println("_______________________________________\n");
                                System.out.println("|           SISTEMA DE VENDA          |\n");
                                System.out.println("|             Gabrielinha             |\n");
                                System.out.println("|" + Desc + "                                      |");
                                System.out.println("|Valor da compra: " + Valortotal + "                 |\n");
                                System.out.println("|valor do pagamento: " + Pagamento + "              |\n");
                                System.out.println(
                                        "|troco: " + (Pagamento - Valortotal) + "                         |\n");
                                System.out.println("|escolha uma das seguinte opreações:  |\n");
                                System.out.println("|(1)Fazer outra venda                 |\n");
                                System.out.println("|(2)sair da venda                     |\n");
                                System.out.println("|_____________________________________|\n");
                                Desc = "";

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

                case 3:
                    System.out.println("saindo do sistema");
                    f3 = false;
                    scanner.close();

                    break;

                case 2:

                    boolean f5 = true;

                    int y = 0;
                    while (f5) {
                        if (vetor[y] == 0.0) {
                            f5 = false;
                        } else {
                            System.out.println("Histórico de compra " + (y + 1) + " = " + vetor[y]);
                        }
                        y++;
                    }

                    break;

                default:
                    System.out.println("opção invalida");

                    break;
            }
        }

    }
}