package SEGUNDO_BIMESTRE.test;

import javax.swing.JOptionPane;

public class testeDeCodigos {
    public static void main(String[] args) {
        // Opções para a primeira caixa de diálogo
        String[] colors = {"Vermelho", "Azul", "Verde", "Amarelo"};
        String favoriteColor = (String) JOptionPane.showInputDialog(
                null,
                "Escolha sua cor favorita:",
                "Escolha de Cor",
                JOptionPane.QUESTION_MESSAGE,
                null,
                colors,
                colors[0]);

        if (favoriteColor != null) {
            // Opções para a segunda caixa de diálogo
            String[] animals = {"Cachorro", "Gato", "Pássaro", "Peixe"};
            String favoriteAnimal = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha seu animal favorito:",
                    "Escolha de Animal",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    animals,
                    animals[0]);

            if (favoriteAnimal != null) {
                // Mostrar a escolha final do usuário
                JOptionPane.showMessageDialog(
                        null,
                        "Sua cor favorita é " + favoriteColor + " e seu animal favorito é " + favoriteAnimal + ".",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Você cancelou a escolha do animal.",
                        "Cancelado",
                        JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Você cancelou a escolha da cor.",
                    "Cancelado",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
}
