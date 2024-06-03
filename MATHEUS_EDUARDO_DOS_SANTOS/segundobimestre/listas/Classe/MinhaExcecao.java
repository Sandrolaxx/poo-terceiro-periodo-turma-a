package segundobimestre.listas.Classe;

import javax.swing.JOptionPane;

public class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
        
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

