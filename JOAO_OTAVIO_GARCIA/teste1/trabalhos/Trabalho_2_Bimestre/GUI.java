import javax.swing.JOptionPane;

public class GUI {

    // atividade 5
    static class Erro extends Exception {
        public Erro(String message) {
            super(message);
            JOptionPane.showMessageDialog(null, message, "TU FEZ M@#@", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {

        // atividade 1
        JOptionPane.showMessageDialog(null, "To Vivo");

        // atividade 2
        String Name = JOptionPane.showInputDialog(null, "FALA SEU NOME?");
        JOptionPane.showInputDialog(null, "OPA MEU AMIGO " + Name + ", COM VAI?");
        JOptionPane.showMessageDialog(null, "QUE BOM");

        // atividade 3
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "OBA, TU VAI CONTINUAR :)!!");
        } else if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "QUE PENA MAS VC ESCOLHEU NÃO CONTINUAR, MAS TU VAI KKKKKKK");
        } else {
            JOptionPane.showMessageDialog(null, "VOCÊ  CANCELOU, CANCELOU NADA!");
        }

        // atividade 4
        String[] opcao = { "BOB ESPONJA PLAY 2", "MINERINHO SUPER ADIVENTURES", "FIFA" };
        int escolha = JOptionPane.showOptionDialog(null, "ESCOLHA UM JOGO", "JOGOS",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcao, opcao[0]);

        JOptionPane.showMessageDialog(null, "ECA VOCE ESCOLHEU " + opcao[escolha]);

        // atividade 6

        String[] calculadora = { "SOMA(+)", "SUBTRAÇÃO(-)", "MULTIPLICAÇÃO(*)", "DIVISÃO(/)" };
        int escolha2 = JOptionPane.showOptionDialog(null, "ESCOLHA A OPERAÇÃO MATEMATICA", "CALCULADORA",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, calculadora,
                calculadora[0]);

        try {
            double n1 = getNumero("DIGITE UM NUMERO");
            double n2 = getNumero("DIGITE UM NUMERO");
            double result = 0;

            switch (escolha2) {
                case 0:
                    result = n1 + n2;
                    break;
                case 1:
                    result = n1 - n2;
                    break;
                case 2:
                    result = n1 * n2;
                    break;

                case 3:
                    if (n2 == 0) {
                        throw new Erro("Não é possível dividir por zero");
                    } else {
                        result = n1 / n2;
                    }
                    break;

                default:
                    break;
            }

            JOptionPane.showMessageDialog(null, "O RESULTADO DEU:" + result);
        }

        catch (Erro e) {
        }
    }

    private static double getNumero(String mensagem) throws Erro {
        try {
            return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
        } catch (NumberFormatException e) {
            throw new Erro("INSIRA UM NÚMERO VÁLIDO");
        }
    }
}
