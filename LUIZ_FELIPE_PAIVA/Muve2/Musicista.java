package Muve2;

import javax.swing.*;
import java.io.File;

public class Musicista extends Login {
    private String cpf;
    private File musica;
    private int curtidas;

    public Musicista(String nome, int idade, String email, String cpf) {
        super(nome, idade, email);
        this.cpf = cpf;
        this.curtidas = 0;
    }

    public void adicionarMusica() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("MP3 files", "mp3"));
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            musica = fileChooser.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Música adicionada: " + musica.getName());
        }
    }

    public void excluirMusica() {
        if (musica != null) {
            JOptionPane.showMessageDialog(null, "Música excluída: " + musica.getName());
            musica = null;
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma música para excluir.");
        }
    }

    public void curtirMusica() {
        if (musica != null) {
            curtidas++;
            JOptionPane.showMessageDialog(null, "Música " + musica.getName() + " curtida! Total de curtidas: " + curtidas);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma música disponível para curtir.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}