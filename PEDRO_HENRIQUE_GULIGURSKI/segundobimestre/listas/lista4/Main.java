package listas.lista4;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {
        String[] opcoes = {"Listar Convênios", "Consulta de Boleto", "Sair"};

        while (true) {
            int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    // Listar Convênios
                    listarConvenios();
                    break;
                case 1:
                    // Consulta de Boleto
                    consultarBoleto();
                    break;
                case 2:
                    // Sair do programa
                    JOptionPane.showMessageDialog(null, "Saindo do programa.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    public static void listarConvenios() {
        // finalizar
    }

    public static void consultarBoleto() {
        // finalizar
    }
}
