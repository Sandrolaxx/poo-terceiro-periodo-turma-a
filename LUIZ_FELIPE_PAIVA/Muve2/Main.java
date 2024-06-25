package Muve2;

import javax.swing.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String[] options = {"Usuário Normal", "Musicista", "Contratante"};
        int choice = JOptionPane.showOptionDialog(null, "Escolha o tipo de usuário:",
                "Tipo de Usuário", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        String nome = JOptionPane.showInputDialog("Informe seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
        String email = JOptionPane.showInputDialog("Informe seu email:");

        switch (choice) {
            case 0:
                UsuarioNormal usuario = new UsuarioNormal(nome, idade, email);
                JOptionPane.showMessageDialog(null, "Usuário Normal registrado:\nNome: " + usuario.getNome() + "\nIdade: " + usuario.getIdade() + "\nEmail: " + usuario.getEmail());
                break;
            case 1:
                String cpf = JOptionPane.showInputDialog("Informe seu CPF:");
                Musicista musicista = new Musicista(nome, idade, email, cpf);

                InformacaoSite infoSite = new InformacaoSite();
                infoSite.mostrarInformacoes();

                boolean manageMusic = true;
                while (manageMusic) {
                    String[] musicOptions = {"Adicionar Música", "Excluir Música", "Curtir Música", "Sair"};
                    int musicChoice = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                            "Gerenciamento de Música", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, musicOptions, musicOptions[0]);

                    switch (musicChoice) {
                        case 0:
                            musicista.adicionarMusica();
                            break;
                        case 1:
                            musicista.excluirMusica();
                            break;
                        case 2:
                            musicista.curtirMusica();
                            break;
                        case 3:
                            manageMusic = false;
                            break;
                        default:
                    }
                }
                break;
            case 2:
                String cnpj = JOptionPane.showInputDialog("Informe seu CNPJ:");
                Contratante contratante = new Contratante(nome, idade, email, cnpj);
                JOptionPane.showMessageDialog(null, "Contratante registrado:\nNome: " + contratante.getNome() + "\nIdade: " + contratante.getIdade() + "\nEmail: " + contratante.getEmail() + "\nCNPJ: " + contratante.getCnpj());
                break;
            default:
        }
        InformacaoSite infoSite = new InformacaoSite();
        infoSite.mostrarInformacoes();

    }
}