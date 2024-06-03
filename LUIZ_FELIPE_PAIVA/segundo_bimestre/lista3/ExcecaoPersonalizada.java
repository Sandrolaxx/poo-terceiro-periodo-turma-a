package segundo_bimestre.lista3;

import javax.swing.JOptionPane;

class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
 
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
public class ExcecaoPersonalizada {

    public static void main(String[] args) {
        try {
  
            throw new MinhaExcecao("Ocorreu um erro personalizado!");
        } catch (MinhaExcecao e) {
         
        }
    }
}


