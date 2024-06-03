package segundobimestre.aulas.aulaCinco;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class JOption {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("EXEMPLO");
        frame.setSize(400, 300);
        //tamanho da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //comportamento fechar janela

        //criando painel
        JPanel panel = new JPanel();
        //cor de funco 
        panel.setBackground(Color.WHITE);
        //criando jlabel
        JLabel label = new JLabel("CLIQUE NO BOTÃO");
        //centralizando texto
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //Criando JButton
        JButton button = new JButton("CLIQUE AQUI!");

        //ad
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                boolean isBtnClicado = label.getText().equals("Botão Clicado!");

                //altera texto jlabel
                label.setText(isBtnClicado ? "CLIQUE AQUI!" : "Botão Clicado!");
            }
        });

        frame.add(panel);
        panel.add(label);
        panel.add(button);

        frame.add(panel);
        
        frame.setVisible(true); //exibindo o JFrame
    }
}
