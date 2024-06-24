package Testes.JOption;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Fala comigo");
        String nome = JOptionPane.showInputDialog("Digite seu nome ai doidão");
        JOptionPane.showMessageDialog(null, "Olá " +nome+ " baleia");
        int escolha = JOptionPane.showConfirmDialog(null, "Escolhe algo ai");
        String mensagem = "Oi tudo blz?";

        JOptionPane.showMessageDialog(null, mensagem, "mensagem", JOptionPane.INFORMATION_MESSAGE);
        
        scanner.close();
    }
    
}
