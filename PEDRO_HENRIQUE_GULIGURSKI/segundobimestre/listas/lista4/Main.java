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
                    listarConvenios();
                    break;
                case 1:
                    ConsultaBoleto.consultarBoleto();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
                    return;
                default:
                    return;
            }
        }
    }

    public static void listarConvenios() {
        String[] options = {"Convenios Nacionais", "Convenios Estaduais", "Todos os Convenios"};
        int choice = JOptionPane.showOptionDialog(null, "Selecione o tipo de convênio:",
                "Seleção de Convênio", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        String respo = "";
        if (choice == 0) {
            respo = ListagemConvenio.getConvenio(0);
            System.out.println(ListagemConvenio.convenioFormatado(respo)); 
        } else if (choice == 1) {
            respo = ListagemConvenio.getConvenio(1);
            System.out.println(ListagemConvenio.convenioFormatado(respo));  
        } else if (choice == 2) {
            respo = ListagemConvenio.getConvenio(2);
            System.out.println(ListagemConvenio.convenioFormatado(respo)); 
        } else {
            System.out.println("Operação cancelada pelo usuário.");
        }
    }

    public static void consultarBoleto() {
        ConsultaBoleto.consultarBoleto();
    }


    
}


