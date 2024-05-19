package BIM1;

import java.util.ArrayList;
import java.util.Scanner;

public class VeiaExigente3 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int opc;
        ArrayList<ArrayList<Integer>> listaVendas = new ArrayList<>();


        final int QUANTIDADE_INDEX = 0;
        final int PRECO_INDEX = 1;
        final int MES_INDEX = 2;
        final int DIA_INDEX = 3;
        final int TOTAL_INDEX = 4;


        do {
            System.out.println("\nSelecione a ação:\n[1] Cálculo de preço total\n[2] Cálculo de troco\n[3] Sair\n[4] Histórico de vendas\n[5] Pesquisar por data\n");
            opc = scanner.nextInt();


            switch (opc) 
            {
                case 1:
                    System.out.println("Qual a quantidade de plantas?");
                    int quant = scanner.nextInt();


                    System.out.println("Qual o valor da espécie de planta escolhida?");
                    int prec = scanner.nextInt();


                    double valtot = quant * prec;
                    System.out.println("O valor da compra ficou: " + valtot);


                    if (quant >= 10) {
                        valtot = valtot - (valtot * 0.05);
                        System.out.println("Receba seus 5%, o valor com desconto ficou " + valtot);
                    }


                    System.out.println("Digite o mês da compra (1-12):");
                    int mes = scanner.nextInt();


                    System.out.println("Digite o dia da compra (1-30):");
                    int dia = scanner.nextInt();


                    int valorTotalInteiro = (int) Math.round(valtot);


                    ArrayList<Integer> venda = new ArrayList<>();
                    venda.add(quant);
                    venda.add(prec);
                    venda.add(mes);
                    venda.add(dia);
                    venda.add(valorTotalInteiro);
                    listaVendas.add(venda);
                    break;


                case 2:
                    System.out.println("Quanto será pago pelo cliente?");
                    int pag = scanner.nextInt();
                    System.out.println("Qual o total do compra?");
                    int valtot2 = scanner.nextInt();
                    float troco = pag - valtot2;
                    if (troco >= 0) {
                        System.out.println("O troco é:" + troco);
                    } else {
                        System.out.println("O pagamento não é suficiente para a compra");
                    }
                    break;


                case 3:
                    System.out.println("Operação encerrada");
                    scanner.close();
                    break;


                case 4:
                    System.out.println("Histórico de vendas:\n");
                    for (int i = 0; i < listaVendas.size(); i++) {
                        ArrayList<Integer> vendaAtual = listaVendas.get(i);
                        System.out.println("Data da compra: " + vendaAtual.get(DIA_INDEX) + "/" + vendaAtual.get(MES_INDEX) +
                                "\nQuantidade: " + vendaAtual.get(QUANTIDADE_INDEX) + "\nValor: " + vendaAtual.get(PRECO_INDEX) +
                                 "\nTotal da compra: " + vendaAtual.get(TOTAL_INDEX) + "conto");
                    }
                    break;


                case 5:
                    System.out.println("Digite o mês que deseja pesquisar (1-12):");
                    int mesPesquisa = scanner.nextInt();
                    System.out.println("Digite o dia que deseja pesquisar (1-30):");
                    int diaPesquisa = scanner.nextInt();
                    System.out.println("Vendas no dia " + diaPesquisa + " do mês " + mesPesquisa + ":");
                    boolean encontrouVenda = false;
                    for (int i = 0; i < listaVendas.size(); i++) {
                        ArrayList<Integer> vendaAtual = listaVendas.get(i);
                        if (vendaAtual.get(MES_INDEX) == mesPesquisa && vendaAtual.get(DIA_INDEX) == diaPesquisa) {
                            encontrouVenda = true;
                            System.out.println("Data da compra: " + vendaAtual.get(DIA_INDEX) + "/" + vendaAtual.get(MES_INDEX) +
                                    "\nQuantidade: " + vendaAtual.get(QUANTIDADE_INDEX) + "\nValor: " + vendaAtual.get(PRECO_INDEX) +
                                    "\nTotal da compra: " + vendaAtual.get(TOTAL_INDEX) + "conto");
                        }
                    }
                    if (!encontrouVenda) {
                        System.out.println("Nenhuma venda encontrada para o dia " + diaPesquisa + " do mês " + mesPesquisa);
                    }
                    break;


                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opc != 3);
    }
}
