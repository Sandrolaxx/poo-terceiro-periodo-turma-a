package NATHAN_MARIOTTO.segundobi.prova;

import javax.swing.*;

public class DialogoErro {
    public static void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
