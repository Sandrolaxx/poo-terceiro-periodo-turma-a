package segundo_bimestre.ListasAulas.lista3;

import javax.swing.JOptionPane;

public class Nome {

    public static void main(String[] args) {
        exibirMensagemDeBoasVindas();
    }

    public static void exibirMensagemDeBoasVindas() {
       
        String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        
        
        JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome + "!");
    }
}
