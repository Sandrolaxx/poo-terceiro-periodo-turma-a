package training;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class menuJOptionPane {

    public static void main(String[] args) {

        List<String> options = List.of("Listagem de convênios", "Consulta de Boletos");

        String selected = (String) JOptionPane.showInputDialog(null,
                "Selecione a opção desejada:",
                "GET / POST:",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options.toArray(),
                "Selecione uma opção...");

        switch (selected) {

            case "Listagem de convênios":

                try {

                    JOptionPane.showMessageDialog(
                            null,
                            exampleGet.getJsonData(),
                            null,
                            0);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                break;

            case "Consulta de Boletos":

                // JOptionPane.showInputDialog(
                //         null,
                //         "Informe a linha digitável do boleto:",
                //         "Linha digitável",
                //         JOptionPane.QUESTION_MESSAGE);


                examplePost.genQRCode("", 200.0);

                break;

            case null:

                JOptionPane.showMessageDialog(
                        null,
                        "Operação cancelada!",
                        null,
                        0);
                break;

            default:
                break;
        }
    }
}
