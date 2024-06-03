package segundobi.listas.lista3;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Tela extends JFrame{
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JLabel result =  new JLabel("Resultado:");

//VISUAIS
    public Tela(){
        Font fontBotao = new Font("Arial", Font.BOLD, 12);
        setTitle("Lista 3");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#1E1E21"));
        setVisible(true);


        JButton button1 =new JButton("Atividade 1");
        button1.setBounds(50,380, 100, 50);
        button1.setFont(fontBotao);
        button1.setForeground(Color.decode("#FEFEFE"));
        button1.setBackground(Color.decode("#1E1E21"));

        JButton button2 =new JButton("Atividade 2");
        button2.setBounds(170,380, 100, 50);
        button2.setFont(fontBotao);
        button2.setForeground(Color.decode("#FEFEFE"));
        button2.setBackground(Color.decode("#1E1E21"));

        JButton button3 = new JButton("Atividade 3");
        button3.setBounds(290,380, 100, 50);
        button3.setFont(fontBotao);
        button3.setForeground(Color.decode("#FEFEFE"));
        button3.setBackground(Color.decode("#1E1E21"));

        JButton button4 = new JButton("Atividade 4");
        button4.setBounds(410,380, 100, 50);
        button4.setFont(fontBotao);
        button4.setForeground(Color.decode("#FEFEFE"));
        button4.setBackground(Color.decode("#1E1E21"));

        JButton button5 = new JButton("Atividade 5");
        button5.setBounds(530,380, 100, 50);
        button5.setFont(fontBotao);
        button5.setForeground(Color.decode("#FEFEFE"));
        button5.setBackground(Color.decode("#1E1E21"));

        JButton button6 = new JButton("Atividade 6");
        button6.setBounds(650,380, 100, 50);
        button6.setFont(fontBotao);
        button6.setForeground(Color.decode("#FEFEFE"));
        button6.setBackground(Color.decode("#1E1E21"));

        button1.addActionListener(this::button1);
        button2.addActionListener(this::button2);
        button3.addActionListener(this::button3);
        button4.addActionListener(this::button4);
        button5.addActionListener(this::button5);
        button6.addActionListener(this::button6);

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

        JLabel label = new JLabel("Selecione o exercicio");
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setBounds(180,150, 800, 50);
        label.setForeground(Color.white);

        add(label);

    }
    

//ATV1

    public void button1(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Olá mundo", "Atv1", JOptionPane.INFORMATION_MESSAGE);
    }

//ATV2

    public void button2(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(null,"Insira seu nome:", "Atv2", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Bem-Vindo " + nome, "Atv2", JOptionPane.INFORMATION_MESSAGE);
    }

//ATV3

    public void button3(ActionEvent e) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar", "Atv3", JOptionPane.YES_NO_OPTION);
        if (opcao == 0){
            JOptionPane.showMessageDialog(null,"Continuando", "Atv3", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Cancelando", "Atv3", JOptionPane.INFORMATION_MESSAGE);
        }
    }

//ATV4

    public void button4(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(null,"[1] - Entrar \n[2] - Cadastrar\n[3] - Sair", "Atv4", JOptionPane.QUESTION_MESSAGE);
        switch (nome) {
            case "1" :
                JOptionPane.showMessageDialog(null,"Entrando...", "Atv3", JOptionPane.INFORMATION_MESSAGE);   
                break;
        
            case "2":
                JOptionPane.showMessageDialog(null,"Cadastrando...", "Atv3", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "3":
                JOptionPane.showMessageDialog(null,"Aplicativo fechado com sucesso.", "Atv3", JOptionPane.INFORMATION_MESSAGE);
                break;
        
            default:
                JOptionPane.showMessageDialog(null,"Opção invalida", "Atv3", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

//ATV5

    public void button5(ActionEvent e){
        String message = JOptionPane.showInputDialog(null,"Insira um numero positivo", "Atv5", JOptionPane.QUESTION_MESSAGE);
        if(Integer.parseInt(message)<0){
            throw new CustomExeption("Numero Negativo");
        }
    
    }

//ATV6

    public void button6(ActionEvent e){
        Font fontBotao = new Font("Arial", Font.BOLD, 12);
        JFrame telaCalculadora = new JFrame();
        telaCalculadora.setTitle("Atividade 6 - calculadora");
        telaCalculadora.setSize(800,500);
        telaCalculadora.setResizable(false);
        telaCalculadora.setLocationRelativeTo(null);
        telaCalculadora.getContentPane().setBackground(Color.decode("#1E1E21"));
        telaCalculadora.setVisible(true);
        telaCalculadora.setLayout(null);

        JLabel num1Label =  new JLabel("Numero 1:");
        num1Label.setFont(new Font("Arial", Font.BOLD, 15));
        num1Label.setBounds(220,65, 80, 50);
        num1Label.setForeground(Color.decode("#FEFEFE"));

        JLabel num2Label =  new JLabel("Numero 2:");
        num2Label.setFont(new Font("Arial", Font.BOLD, 15));
        num2Label.setBounds(500,65, 80, 50);
        num2Label.setForeground(Color.decode("#FEFEFE"));

        result.setFont(new Font("Arial", Font.BOLD, 20));
        result.setBounds(220,150,580, 50);
        result.setForeground(Color.decode("#FEFEFE"));

        num1.setFont(new Font("Arial", Font.PLAIN, 15));
        num1.setBounds(220,100, 120, 50);
        num1.setForeground(Color.decode("#FEFEFE"));
        num1.setBackground(Color.decode("#1E1E21"));

        num2.setFont(new Font("Arial", Font.PLAIN, 15));
        num2.setBounds(500,100, 120, 50);
        num2.setForeground(Color.decode("#FEFEFE"));
        num2.setBackground(Color.decode("#1E1E21"));

        JButton buttonAdditon = new JButton("+");
        buttonAdditon.setBounds(170,380, 100, 50);
        buttonAdditon.setFont(fontBotao);
        buttonAdditon.setForeground(Color.decode("#FEFEFE"));
        buttonAdditon.setBackground(Color.decode("#1E1E21"));

        JButton buttonSubtraction = new JButton("-");
        buttonSubtraction.setBounds(310,380, 100, 50);
        buttonSubtraction.setFont(fontBotao);
        buttonSubtraction.setForeground(Color.decode("#FEFEFE"));
        buttonSubtraction.setBackground(Color.decode("#1E1E21"));

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setBounds(440,380, 100, 50);
        buttonMultiplication.setFont(fontBotao);
        buttonMultiplication.setForeground(Color.decode("#FEFEFE"));
        buttonMultiplication.setBackground(Color.decode("#1E1E21"));

        JButton buttonDivison = new JButton("/");
        buttonDivison.setBounds(570,380, 100, 50);
        buttonDivison.setFont(fontBotao);
        buttonDivison.setForeground(Color.decode("#FEFEFE"));
        buttonDivison.setBackground(Color.decode("#1E1E21"));

        telaCalculadora.add(buttonAdditon);
        telaCalculadora.add(buttonSubtraction);
        telaCalculadora.add(buttonMultiplication);
        telaCalculadora.add(buttonDivison);
        telaCalculadora.add(num1Label);
        telaCalculadora.add(num2Label);
        telaCalculadora.add(num1);
        telaCalculadora.add(num2);
        telaCalculadora.add(result);

        buttonAdditon.addActionListener(this::addition);
        buttonSubtraction.addActionListener(this::subtraction);
        buttonMultiplication.addActionListener(this::multiplication);
        buttonDivison.addActionListener(this::division);
    }

    public void addition(ActionEvent e){
        float n1 = Float.valueOf(num1.getText());
        float n2 = Float.valueOf(num2.getText());
        float resultadd = n1+n2;
        result.setText("Resultado: "+String.format("%.2f",resultadd));
    }
    
    public void subtraction(ActionEvent e){
        float n1 = Float.valueOf(num1.getText());
        float n2 = Float.valueOf(num2.getText());
        float resultsub = n1-n2;
        result.setText("Resultado: "+String.format("%.2f",resultsub));
    }

    public void multiplication(ActionEvent e){
        float n1 = Float.valueOf(num1.getText());
        float n2 = Float.valueOf(num2.getText());
        float resultmult = n1*n2;
        result.setText("Resultado: "+String.format("%.2f",resultmult));
    }

    public void division(ActionEvent e){
        float n1 = Float.valueOf(num1.getText());
        float n2 = Float.valueOf(num2.getText());
        if(n2 == 0){
            JOptionPane.showMessageDialog(null, "Nenhum número é divisivel por 0", "Erro",JOptionPane.ERROR_MESSAGE);
        }else{
            float resultdiv = n1/n2;
            result.setText("Resultado: "+String.format("%.2f",resultdiv));
        }
    }
}