package KIURY_MARIANO.secondtwomonths.prova;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;


// A unica funcão desta classe é exibir de forma mais organizada e descente os estudantes com suas respectivas RA.


public class tela{

    public static String visualizarApi(String response) {
        String jsonString = response;

        jsonString = jsonString.replaceAll("\\s+", "")
                            .replaceAll(",]", "]");

        StringBuilder message = new StringBuilder();
        message.append("Lista de estudantes:\n\n");

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
            String ra = "";

            for (String field : fields) {
                if (field.contains("name")) {
                    nome = field.split(":")[1].replaceAll("\"", "");
                } else if (field.contains("ra")) {
                    ra = field.split(":")[1].replaceAll("\"", "");
                }
            }

            message.append("Nome: ").append(nome).append("\n");
            message.append("RA: ").append(ra).append("\n");
            message.append("----------------------------------\n");
        }

        textArea.setText(message.toString());

        JOptionPane.showMessageDialog(null, scrollPane, "Estudantes", JOptionPane.INFORMATION_MESSAGE);
        return null;
    }
}