package Muve2;

import javax.swing.JOptionPane;

public class InformacaoSite {
    private String mensagem;

    public InformacaoSite() {
        this.mensagem = "Seja bem-vindo ao MUVE, um aplicativo voltado aos amantes da música e criado para ligar você aos artistas da sua região para criar laços e se divertir com os melhores artistas em inúmeros estilos musicais.";
    }

    public void mostrarInformacoes() {
        JOptionPane.showMessageDialog(null, mensagem, "Bem-vindo ao Muve", JOptionPane.INFORMATION_MESSAGE);
    }
}