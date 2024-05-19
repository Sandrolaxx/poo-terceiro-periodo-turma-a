import java.util.Scanner;

public class trabalho3flores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean f3 = true;

        float Vetor[] = new float[50000];
        float Calendario[][] = new float[12][30];
        float HistoMes[] = new float [12];

        int i = -1;

        int Mes;

        int Dia;

        while (f3) {

            System.out.println("________________________________________\n");
            System.out.println("|            SISTEMA DA LOJA           |\n");
            System.out.println("|              Gabrielinha             |\n");
            System.out.println("|escolha uma das seguinte opreações:   |\n");
            System.out.println("|(1)fazer uma venda                    |\n");
            System.out.println("|(2)Historico de compra                |\n");
            System.out.println("|(3)Historico de compra por dia        |\n");
            System.out.println("|(4)sair do sistema                    |\n");
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

                            System.out.println("digita o dia da compra(em números)");
                            Dia = scanner.nextInt();
                            Dia = Dia - 1;

                            System.out.println("digita o mes da compra(em números)");
                            Mes = scanner.nextInt();
                            Mes = Mes - 1;

                            HistoMes[Mes]= HistoMes[Mes] + Valortotal;

                            Calendario[Mes][Dia] = Calendario[Mes][Dia] + Valortotal;

                            boolean f2 = true;

                            while (f2) {

                                i = i + 1;

                                Vetor[i] = Valortotal;

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

                case 2:

                    boolean f5 = true;

                    int y = 0;
                    while (f5) {
                        if (Vetor[y] == 0.0) {
                            f5 = false;
                        } else {
                            System.out.println("Histórico de compra " + (y + 1) + " = " + Vetor[y]);
                        }
                        y++;
                    }

                    break;

                case 3:

                    int Dia2 = 0;
                    int Mes2 = 0;

                    System.out.println("digita o dia(em números)");
                    Dia2 = scanner.nextInt();
                    Dia2 = Dia2 - 1;

                    System.out.println("digita o mes(em números)");
                    Mes2 = scanner.nextInt();
                    Mes2 = Mes2 - 1;

                    if (Calendario[Mes2][Dia2] == 0.0) {

                        System.out.println("Sem vendas no dia");
                        System.out.println("Total de vendas no mês:" + HistoMes[Mes2]);
                    

                    } else {
                        System.out.println("Total de vendas no dia:" + Calendario[Mes2][Dia2]);
                        System.out.println("Total de vendas no mês:" + HistoMes[Mes2]);
                    }

                    break;

                case 4:
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