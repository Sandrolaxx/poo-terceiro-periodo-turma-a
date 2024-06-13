package BIM2.aulas.lista3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


import javax.swing.*;
public class MainLista3 extends JFrame
{


    final private Font mainFont = new Font ("Arial", Font.BOLD, 14);
    final private Font fonticon = new Font ("Arial", Font.BOLD, 64);
    JTextField tfPrimernome, tfSobrenome;
    JLabel lbOla;
   
    public void atv1(){
        JPanel panelPrin = new JPanel();
        panelPrin.setLayout(new BorderLayout());
        panelPrin.setBackground(Color.PINK);
        JLabel OlaMundo = new JLabel("Buenos dias Mundo!");
        panelPrin.add(OlaMundo, BorderLayout.PAGE_START);


        add(panelPrin);


        setTitle("Aoba!");
        setSize(600, 500);
        setMinimumSize(new Dimension(400,300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void atv2() {


        // bloco nomes -----------
        JLabel primernome = new JLabel("Primeiro nome:");
        primernome.setFont(mainFont);


        tfPrimernome = new JTextField();
        tfPrimernome.setFont(mainFont);


        JLabel sobrenome = new JLabel("Sobrenome:");
        sobrenome.setFont(mainFont);


        tfSobrenome = new JTextField();
        tfSobrenome.setFont(mainFont);


        JPanel NomePanel = new JPanel();
        NomePanel.setLayout(new GridLayout(4, 1, 5 , 5));
        NomePanel.setOpaque(false);
        NomePanel.add(primernome);
        NomePanel.add(tfPrimernome);
        NomePanel.add(sobrenome);
        NomePanel.add(tfSobrenome);


        // bloco tanto faz-----------
        lbOla = new JLabel();
        lbOla.setFont(mainFont);


        // botões ----------
        JButton butaoOK = new JButton("OK");
        butaoOK.setFont(mainFont);
        butaoOK.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
               String primeironome = tfPrimernome.getText();
               String ultimonome = tfSobrenome.getText();
               lbOla.setText("Seja muito bem vindo, "+ primeironome + " " + ultimonome + "!");
            }
           
        });
        JButton butaoClear = new JButton("Limpar");
        butaoClear.setFont(mainFont);
        butaoClear.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                tfPrimernome.setText(" ");
                tfSobrenome.setText(" ");
                lbOla.setText(" ");
            }
           
        });


        // painel geral -------------


        JPanel butaoPanel = new JPanel();
        butaoPanel.setLayout(new GridLayout(1,2, 5, 5));
        butaoPanel.setOpaque(false);
        butaoPanel.add(butaoOK);
        butaoPanel.add(butaoClear);


        JPanel panelPrin = new JPanel();
        panelPrin.setLayout(new BorderLayout());
        panelPrin.setBackground(Color.PINK);
        panelPrin.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelPrin.add(NomePanel, BorderLayout.NORTH);
        panelPrin.add(lbOla, BorderLayout.CENTER);
        panelPrin.add(butaoPanel, BorderLayout.SOUTH);


        add(panelPrin);


        setTitle("Aoba");
        setSize(600, 500);
        setMinimumSize(new Dimension(400,300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


    }


    public void atv3(){




        JPanel panelPrin = new JPanel();
        panelPrin.setLayout(new BorderLayout());
        panelPrin.setBackground(Color.PINK);
        JLabel texto = new JLabel("Grandiosa calculadora");
        texto.setFont(mainFont);
        panelPrin.add(texto, BorderLayout.PAGE_START);


        //botões e tal----------


        JButton adicao = new JButton("+");
        adicao.addActionListener(new OperationListener('+'));


        JButton subtracao = new JButton("-");
        subtracao.addActionListener(new OperationListener('-'));


        JButton multiplicacao = new JButton("*");
        multiplicacao.addActionListener(new OperationListener('*'));


        JButton divisao = new JButton("/");
        divisao.addActionListener(new OperationListener('/'));


        //painel geral-----------------


        JPanel butaoPanel = new JPanel();
        butaoPanel.setLayout(new GridLayout(2, 2, 5, 5));
        butaoPanel.setFont(fonticon);
        butaoPanel.add(adicao);
        butaoPanel.add(subtracao);
        butaoPanel.add(multiplicacao);
        butaoPanel.add(divisao);


        panelPrin.add(butaoPanel, BorderLayout.CENTER);


        add(panelPrin);


        setTitle("Calc, its just short for calculator");
        setSize(600, 500);
        setMinimumSize(new Dimension(400,300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


        //ação dos botôes--------------


        private class OperationListener implements ActionListener
        {
            private char opc;
   
            public OperationListener(char opc) {
                this.opc = opc;
            }
   
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    String primerStr = JOptionPane.showInputDialog("Digite o primeiro valor:");
                    if (primerStr == null){
                        return;
                    }
                    double primerValor = Double.parseDouble(primerStr);
   
                    String segunStr = JOptionPane.showInputDialog("Digite o segundo valor:");
                    if (segunStr == null){
                        return;
                    }
                    double segunValor = Double.parseDouble(segunStr);
   
                    double result = 0;
                    switch (opc)
                    {
                        case '+':
                            result = primerValor + segunValor;
                            break;
                        case '-':
                            result = primerValor - segunValor;
                            break;
                        case '*':
                            result = primerValor * segunValor;
                            break;
                        case '/':
                            if (segunValor == 0) {
                                JOptionPane.showMessageDialog(null, "Divide certo amigão", "Erro", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            result = primerValor / segunValor;
                            break;
                    }
   
                    JOptionPane.showMessageDialog(null, "O resultado é: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }
                    catch (NumberFormatException excecao){
                        throw new Excecao ("O senhor deve usar números comuns, e apenas números, por obséquio");
                    }
            }
        }
    public static void main(String[] args)
    {


        MainLista3 mainLista = new MainLista3();


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");




        @SuppressWarnings("resource")
        final Scanner scanner = new Scanner(System.in);
        int opc;
        do
        {
            System.out.println("\n ------------- \n");
            System.out.println("Testar atividades:\n [1]Atividade 1\n [2]Atividade 2\n [3]Resto das atividades\n [4]Cancelar\n");
            opc = scanner.nextInt();
            switch (opc)
            {
                case 1:
                    mainLista.atv1();
                break;
                case 2:
                    mainLista.atv2();
                break;
                case 3:
                    mainLista.atv3();
                break;
                case 4:
                    System.out.println("Encerrando...");
                break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
        }while(opc!=4);
    }
}
