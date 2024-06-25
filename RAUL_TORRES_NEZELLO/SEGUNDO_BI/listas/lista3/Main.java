package SEGUNDO_BI.listas.lista3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)){
           
            //Atividade 1
            JFrame frame = new JFrame("Atividade");


            JOptionPane.showMessageDialog(frame,
                    "Olá, Sandrolax",
                    "Atividade 1",
                    JOptionPane.INFORMATION_MESSAGE);


            //Atividade 2
            String nome = JOptionPane.showInputDialog(frame,
                    "Digite seu nome",
                    "Atividade 2",
                    JOptionPane.QUESTION_MESSAGE);


            JOptionPane.showMessageDialog(frame,
                    "Seja bem vindo "+nome+"!",
                    "Atividade 2",
                    JOptionPane.INFORMATION_MESSAGE);


            //Atividade 3
            int resposta = JOptionPane.showConfirmDialog(frame,
                    "Deseja continuar?",
                    "Atividade 3",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);


            if(resposta == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(frame,
                    "Continuando",
                    "Atividade 3",
                    JOptionPane.INFORMATION_MESSAGE);
            }
            else if(resposta == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(frame,
                    "Parando",
                    "Atividade 3",
                    JOptionPane.INFORMATION_MESSAGE);
            }


            //Atividade 4
            List<String> opcoes = List.of("Opção 1","Opção 2", "Opção 3");


            String opcao = (String) JOptionPane.showInputDialog(frame,
                    "Escolha uma opção",
                    "Atividade 4",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes.toArray(),
                    opcoes.toArray()[0]);


            if (opcao.equals("Opção 1")) {
                JOptionPane.showMessageDialog(frame,
                    "Você escolheu a Opção 1",
                    "Atividade 4",
                    JOptionPane.INFORMATION_MESSAGE);
            }

            else if (opcao.equals("Opção 2")) {
                JOptionPane.showMessageDialog(frame,
                    "Você escolheu a Opção 2",
                    "Atividade 4",
                    JOptionPane.INFORMATION_MESSAGE);
            }  

            else if (opcao.equals("Opção 3")) {
                JOptionPane.showMessageDialog(frame,
                    "Você escolheu a Opção 3",
                    "Atividade 4",
                    JOptionPane.INFORMATION_MESSAGE);
            }
           
            //Atividade 6
            List<String> operacoes = List.of("+","-","x","/");


            String operacaoSelecionada = (String) JOptionPane.showInputDialog(frame,
                    "Escolha uma operação matematica",
                    "Calculadora",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    operacoes.toArray(),
                    operacoes.toArray()[0]);


            String input1 = JOptionPane.showInputDialog(frame,
                    "Digite o primeiro numero de seu calculo",
                    "Calculadora",
                    JOptionPane.QUESTION_MESSAGE);

            String input2 = JOptionPane.showInputDialog(frame,
                    "Digite o segundo numero de seu calculo",
                    "Calculadora",
                    JOptionPane.QUESTION_MESSAGE);


            if (input1 == null || input2 == null) {

                throw new Excecao("Valor não informado");

            }

           else{

                Double primeiroNumero = Double.parseDouble(input1);

                Double segundoNumero = Double.parseDouble(input2);

                Double resultado = 0.0;

                switch (operacaoSelecionada) {
                        case "+":
                                resultado =  primeiroNumero + segundoNumero;
                        break;


                        case "-":
                                resultado = primeiroNumero - segundoNumero;
                        break;


                        case "x":
                                resultado = primeiroNumero * segundoNumero;
                        break;


                        case "/":
                                if (segundoNumero==0) {
                                        throw new Excecao("Não é possivel dividir por 0");
                                }
                                else{     
                                        resultado = primeiroNumero / segundoNumero;
                                }
                        break;


                        default:
                                throw new Excecao("Ocorreu um erro na aplicação");

                }

                JOptionPane.showMessageDialog(frame,
                    primeiroNumero+" "+operacaoSelecionada+" "+segundoNumero+" = "+resultado,
                    "Calculadora",
                    JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }
}
