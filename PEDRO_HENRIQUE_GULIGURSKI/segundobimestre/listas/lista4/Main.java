package listas.lista4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


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
        String respo = "";
        if (choice == 0) {
            respo = ListagemConvenio.getConvenio(0);
            System.out.println(convenioFormatado(respo)); 
        } else if (choice == 1) {
            respo = ListagemConvenio.getConvenio(1);
            System.out.println(convenioFormatado(respo));  
        } else if (choice == 2) {
            respo = ListagemConvenio.getConvenio(2);
            System.out.println(convenioFormatado(respo)); 
        } else {
            System.out.println("Operação cancelada pelo usuário.");
        }
    }


    
    public static void consultarBoleto() {
        // finalizar
    }

    public static String convenioFormatado(String response) {
        String jsonString = response;

        jsonString = jsonString.replaceAll("\\s+", "")
                               .replaceAll(",]", "]");

        StringBuilder message = new StringBuilder();
        message.append("Lista de Convênios:\n\n");

        Pattern pattern = Pattern.compile("\\{(.*?)\\}");
        Matcher matcher = pattern.matcher(jsonString);

        JTextArea textArea = new JTextArea(20, 50); 
        textArea.setEditable(false);
        textArea.setText(message.toString());

        JScrollPane scrollPane = new JScrollPane(textArea);

        while (matcher.find()) {
            String convenantStr = matcher.group();

            String[] fields = convenantStr.split(",");
            String nome = "";
            String tipo = "";
            String estado = "";
            String horario = "";

            for (String field : fields) {
                if (field.contains("Nomeconvenant")) {
                    nome = field.split(":")[1].replaceAll("\"", "");
                } else if (field.contains("Tipoconvenant")) {
                    tipo = field.split(":")[1].replaceAll("\"", "");
                } else if (field.contains("statesconvenant")) {
                    estado = field.split(":")[1].replaceAll("\"", "");
                } else if (field.contains("timeLimit")) {
                    horario = field.split(":")[1].replaceAll("\"", "");
                }
            }

            message.append("Nome: ").append(nome).append("\n");
            message.append("Tipo: ").append(tipo).append("\n");
            message.append("Estado: ").append(estado).append("\n");
            message.append("Horário limite: ").append(horario).append("\n");
            message.append("----------------------------------\n");
        }

        textArea.setText(message.toString());

        // Exibindo a mensagem em um JOptionPane com JScrollPane
        JOptionPane.showMessageDialog(null, scrollPane, "Convênios", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }
}

