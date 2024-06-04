package segundobi.aulas.aulacinco;

import java.util.List;

import javax.swing.JOptionPane;

public class JOptionPaneSample {

    public static void main(String[] args) {

        String opcao = JOptionPane.showInputDialog(
                null,
                "[1] Iniciar busca\n[2]Registrar pedido",
                "Insira os dados",
                JOptionPane.INFORMATION_MESSAGE);

        if (opcao.equals("2")) {
            throw new CustomException("Valor inválido!!");
        }

        JOptionPane.showMessageDialog(
                null,
                "Valor inserido" + opcao,
                "Retorno valor",
                JOptionPane.ERROR_MESSAGE);

        List<String> nomes = List.of("Cleber", "Roberto", "Luiz");

        JOptionPane.showInputDialog(
                null,
                "Selecione o aluno",
                "Seleção",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                nomes.toArray(),
                nomes.toArray()[0]);

    }

}
