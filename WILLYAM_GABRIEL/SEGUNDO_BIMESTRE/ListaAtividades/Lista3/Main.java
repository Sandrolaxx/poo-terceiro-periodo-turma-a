package SEGUNDO_BIMESTRE.ListaAtividades.lista3;

import java.util.*;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        while (true) {
            JOptionPane.showMessageDialog(null, "OLÁ MUNDO");
            // ATV1

            String nomeUsuario = JOptionPane.showInputDialog("INFORME O SEU NOME: ");
            if (nomeUsuario == null) {
                JOptionPane.showMessageDialog(null, "OPERAÇÃO CANCELADA", "AVISO", JOptionPane.WARNING_MESSAGE);
                break;
            }

            JOptionPane.showMessageDialog(null, nomeUsuario + ", SEJA BEM-VINDO");
            // ATV2

            int escolha = JOptionPane.showConfirmDialog(null, nomeUsuario + ", DESEJA CONTINUAR ?");
            if (escolha == JOptionPane.CLOSED_OPTION) {
                break;
            }

            switch (escolha) {
                case JOptionPane.YES_OPTION:
                    JOptionPane.showMessageDialog(null, nomeUsuario + ", VOCÊ ESCOLHEU CONTINUAR");
                    break;

                case JOptionPane.NO_OPTION:
                    JOptionPane.showMessageDialog(null, nomeUsuario + ", VOCÊ ESCOLHEU NÃO CONTINUAR");
                    continue;

                case JOptionPane.CANCEL_OPTION:
                    JOptionPane.showMessageDialog(null, nomeUsuario + ", VOCÊ ESCOLHEU CANCELAR");
                    continue;
            }
            // ATV3

            List<String> opcoes = List.of("OPÇÃO 1", "OPÇÃO 2", "OPÇÃO 3", "OPÇÃO 4");

            try {
                String opcao = (String) JOptionPane.showInputDialog(null,
                        "OPÇÃO 1 - AQUI VOCÊ INFORMA A SUA COR FAVORITA\nOPÇÃO 2 - AQUI VOCÊ INFORMA O SEU JOGO FAVORITO\nOPÇÃO 3 - AQUI VOCÊ INFORMA A SUA COMIDA FAVORITA\nOPÇÃO 4 - AQUI VOCÊ INFORMA O SEU HOBBIE",
                        "ESCOLHA UMA DAS OPÇÕES",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes.toArray(),
                        opcoes.toArray()[0]);

                if (opcao == null) {
                    JOptionPane.showMessageDialog(null, "OPERAÇÃO CANCELADA", "AVISO", JOptionPane.WARNING_MESSAGE);
                    continue;
                }

                switch (opcao) {
                    case "OPÇÃO 1":
                        JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO 1");
                        String corFavorita = JOptionPane.showInputDialog("QUAL É A SUA COR FAVORITA ?");
                        JOptionPane.showMessageDialog(null, "SUA COR FAVORITA É: " + corFavorita);
                        break;

                    case "OPÇÃO 2":
                        JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO 2");
                        String jogoFavorito = JOptionPane.showInputDialog("QUAL É O SEU JOGO FAVORITO ?");
                        JOptionPane.showMessageDialog(null, "SEU JOGO FAVORITO É: " + jogoFavorito);
                        break;

                    case "OPÇÃO 3":
                        JOptionPane.showMessageDialog(null, "VOCÊ ESCOLHEU A OPÇÃO 3");
                        String comidaFavorita = JOptionPane.showInputDialog("QUAL É A SUA COMIDA FAVORITA ?");
                        JOptionPane.showMessageDialog(null, "SUA COMIDA FAVORITA É: " + comidaFavorita);
                        break;
                    // ATV4

                    case "OPÇÃO 4":
                        throw new ClasseErro(nomeUsuario
                                + ", SINTO EM INFORMAR, MAS PARECE QUE OCORREU UM ERRO NA OPÇÃO 4\nESSE ERRO OCORRE POIS A VERSÃO DO SEU PROGRAMA ESTÁ DESATUALIZADO\nPEÇO QUE AGUARDE A PROXIMA ATUALIZAÇÃO PARA PODER UTILIZAR A OPÇÃO 4");
                }

            } catch (ClasseErro e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            // ATV5

            List<String> operador = List.of("+", "-", "*", "/");
            JOptionPane.showMessageDialog(null, "INICIANDO A CALCULADORA");

            String valor1 = JOptionPane.showInputDialog("INFORME O PRIMEIRO VALOR: ");
            String valor2 = JOptionPane.showInputDialog("INFORME O SEGUNDO VALOR: ");

            if (valor1 != null && valor2 != null) {
                try {
                    double num1 = Double.parseDouble(valor1);
                    double num2 = Double.parseDouble(valor2);

                    String operacao = (String) JOptionPane.showInputDialog(null,
                            "ESCOLHA A OPERAÇÃO: ",
                            "OPERADOR",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            operador.toArray(),
                            operador.toArray()[0]);

                    if (operacao == null) {
                        JOptionPane.showMessageDialog(null, "OPERAÇÃO CANCELADA", "AVISO", JOptionPane.WARNING_MESSAGE);
                        continue;
                    }

                    double resultado = 0;
                    boolean operacaoValida = true;

                    switch (operacao) {
                        case "+":
                            resultado = num1 + num2;
                            break;

                        case "-":
                            resultado = num1 - num2;
                            break;

                        case "*":
                            resultado = num1 * num2;
                            break;

                        case "/":
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                throw new ClasseErro("ERRO 404\nDIVISÃO POR ZERO NÃO EXISTE");
                            }
                            break;

                        default:
                            operacaoValida = false;
                            JOptionPane.showMessageDialog(null, "OPERAÇÃO INVÁLIDA", "ERRO", JOptionPane.ERROR_MESSAGE);
                            break;
                    }

                    if (operacaoValida) {
                        JOptionPane.showMessageDialog(null,
                                "RESULTADO: " + num1 + " " + operacao + " " + num2 + " = " + resultado);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ERRO: VALOR INVÁLIDO", "ERRO", JOptionPane.ERROR_MESSAGE);
                } catch (ClasseErro e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "VALOR CANCELADO", "AVISO", JOptionPane.WARNING_MESSAGE);
            }

            int continuar = JOptionPane.showConfirmDialog(null, "DESEJA REALIZAR OUTRA OPERAÇÃO?");
            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }
            // ATV6
        }
    }
}