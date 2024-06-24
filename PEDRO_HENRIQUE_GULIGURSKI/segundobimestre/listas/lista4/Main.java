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
        String[] options = {"Convenios Nacionais", "Convenios Estaduais", "Todos os Convenios"};
        int choice = JOptionPane.showOptionDialog(null, "Selecione o tipo de convênio:",
                "Seleção de Convênio", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (choice == 0) {
            System.out.println(ListagemConvenio.getConvenio(0)); 
        } else if (choice == 1) {
            System.out.println(ListagemConvenio.getConvenio(1)); 
        } else if (choice == 2) {
            System.out.println(ListagemConvenio.getConvenio(2)); 
        } else {
            System.out.println("Operação cancelada pelo usuário.");
        }
    }

    public static void consultarBoleto() {
        // finalizar
    }
}
