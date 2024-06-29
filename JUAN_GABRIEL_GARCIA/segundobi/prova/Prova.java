package JUAN_GABRIEL_GARCIA.segundobi.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import javax.swing.JOptionPane;

public class Prova {

    public static void main(String[] args) {

        CriacaoTestemunho testemunho = new CriacaoTestemunho();

        ListagemAlunos listaAlunos = new ListagemAlunos();

        String[] opcoes = { "Listar dados dos alunos", "Criar testemunho", "Sair" };

        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha uma das opções abaixo:",
                "Prova - Juan",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION,
                null,
                opcoes,
                opcoes[0]);

        switch (escolha) {
            
            case 0:
            listaAlunos.listarDadosAlunos();
                break;

            case 1:
            testemunho.criarTestemunho();
                break;

            case 2:
                break;

            default:
                break;
        }
    }
}

// Criar exception para erros - 1 pt

// tem que criar um testemunho para nosso usuario
