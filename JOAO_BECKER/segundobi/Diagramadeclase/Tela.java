package segundobi.Diagramadeclase;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Tela extends JFrame{
    JTextField titulo = new JTextField();
    JTextField descricao = new JTextField();
    JFrame telaPostagem = new JFrame();

//TELA PRINCIPAL
    public Tela(){
        Font fontBotao = new Font("Arial", Font.BOLD, 12);
        setTitle("HellPet");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#1E1E21"));
        setVisible(true);


        JButton button1 = new JButton("Realizar postagem");
        button1.setBounds(10,400, 200, 50);
        button1.setFont(fontBotao);
        button1.setForeground(Color.decode("#FEFEFE"));
        button1.setBackground(Color.decode("#1E1E21"));

        button1.addActionListener(this::buttonPost);

        add(button1);

        JLabel label = new JLabel("Postagems");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(10,5, 800, 50);
        label.setForeground(Color.white);

        add(label);

    }
    
//POSTAGEM

    public void buttonPost(ActionEvent e){
        titulo.setText("");
        descricao.setText("");
        Font fontBotao = new Font("Arial", Font.BOLD, 12);
        telaPostagem.setTitle("Atividade 6 - calculadora");
        telaPostagem.setSize(800,500);
        telaPostagem.setResizable(false);
        telaPostagem.setLocationRelativeTo(null);
        telaPostagem.getContentPane().setBackground(Color.decode("#1E1E21"));
        telaPostagem.setVisible(true);
        telaPostagem.setLayout(null);

        JLabel tituloLabel =  new JLabel("Titulo");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 15));
        tituloLabel.setBounds(30,10, 80, 50);
        tituloLabel.setForeground(Color.decode("#FEFEFE"));

        titulo.setFont(new Font("Arial", Font.PLAIN, 15));
        titulo.setBounds(30,45, 735, 50);
        titulo.setForeground(Color.decode("#FEFEFE"));
        titulo.setBackground(Color.decode("#1E1E21"));

        JLabel descricaoLabel =  new JLabel("Descricao");
        descricaoLabel.setFont(new Font("Arial", Font.BOLD, 15));
        descricaoLabel.setBounds(30,100, 80, 50);
        descricaoLabel.setForeground(Color.decode("#FEFEFE"));

        descricao.setFont(new Font("Arial", Font.PLAIN, 15));
        descricao.setBounds(30,135, 735, 50);
        descricao.setForeground(Color.decode("#FEFEFE"));
        descricao.setBackground(Color.decode("#1E1E21"));

        JButton buttonFinish = new JButton("Postar");
        buttonFinish.setBounds(30,380, 100, 50);
        buttonFinish.setFont(fontBotao);
        buttonFinish.setForeground(Color.decode("#FEFEFE"));
        buttonFinish.setBackground(Color.decode("#1E1E21"));

        JButton buttonCancel = new JButton("Cancelar");
        buttonCancel.setBounds(170,380, 100, 50);
        buttonCancel.setFont(fontBotao);
        buttonCancel.setForeground(Color.decode("#FEFEFE"));
        buttonCancel.setBackground(Color.decode("#1E1E21"));

        telaPostagem.add(buttonFinish);
        telaPostagem.add(buttonCancel);
        telaPostagem.add(tituloLabel);
        telaPostagem.add(descricaoLabel);
        telaPostagem.add(titulo);
        telaPostagem.add(descricao);

        buttonCancel.addActionListener(this::cancelar);
    }

    public void finish(ActionEvent e){
        telaPostagem.setVisible(false);
        
    }

    public void cancelar(ActionEvent e){
        telaPostagem.setVisible(false);
    }

}