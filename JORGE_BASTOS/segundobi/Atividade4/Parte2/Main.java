package segundobi.Atividade4.Parte2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ListarConvenios listarConvenios = new ListarConvenios();
        ConsultarDadosConta consultarDadosConta = new ConsultarDadosConta();

        while (true) {
            String[] options = {"Listar Convênios", "Consultar Boleto", "Sair"};
            int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                listarConvenios.listar();
            } else if (choice == 1) {
                String digitableLine = JOptionPane.showInputDialog("Digite a linha digitável do boleto:");
                if (digitableLine != null && !digitableLine.isEmpty()) {
                    consultarDadosConta.consultar(digitableLine);
                } else {
                    JOptionPane.showMessageDialog(null, "Linha digitável não informada.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                break;
            }
        }
    }
}
