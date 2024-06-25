package segundobim.listas.list3;

import javax.swing.JOptionPane;

//public class Lista3 {

    // ATIVIDADE 1;
    /*
    public static void main(String[] args) {

        mostraMensagem();
    }

    public static void mostraMensagem() {
        JOptionPane.showMessageDialog(null, "Olá Mundo");

    }
} */

 // ATIVIDADE 2;
 /*
    public static void main(String[] args) {
        mostraNome();
        }

        public static void mostraNome() {
            String nome = JOptionPane.showInputDialog("Digite seu nome");
            JOptionPane.showMessageDialog(null, "Olá " + nome);

        }
    
 } */

 
 // ATIVIDADE 3;
/*
 public static void main(String[] args) {
    mensagemContinuar();
    }

    public static void mensagemContinuar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Você deseja continuar?");
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu continuar");
    
    }
 }
}*/

// ATIVIDADE 4;
/*
public static void main(String[] args) {
    //Crie um método que apresente uma lista de opções ao usuário e exiba uma mensagem segundo a opção escolhida. Exemplos de lista("Opção 1", "Opção 2", "Opção 3");
    mostraOpcao();
    }

    public static void mostraOpcao() {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};

        String selectedOption = (String) JOptionPane.showInputDialog(
            null,
            "Selecione uma opção:",
            "Opções",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
            );


        if (selectedOption.equals("Opção 1")){
            JOptionPane.showMessageDialog(null, "Você escolheu a opção 1");
            } else if (selectedOption.equals("Opção 2")) {
                JOptionPane.showMessageDialog(null, "Você escolheu a opção 2");
                } else if (selectedOption.equals("Opção 3")) {
                    JOptionPane.showMessageDialog(null, "Você escolheu a opção 3");
                    
    }
}
}*/

// ATIVIDADE 5; 

/*
static class ErroPersonalizado extends Exception {

    public ErroPersonalizado(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }

}
   public static void main(String[] args) {
    try {
        JOptionPane.showInputDialog("Digite seu nome:");
        throw new ErroPersonalizado("Erro personalizado /(*_*)/!");
    } catch (ErroPersonalizado e) {

    }
}
}*/

// ATIVIDADE 6;

 /*
 public static void main(String[] args) {
        try {
            String[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
            String operacao = (String) JOptionPane.showInputDialog(
                    null, 
                    "Selecione uma opção:",
                    "Calculadora",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            if (operacao == null) {
                throw new ErroPersonalizado("Nenhuma operação foi selecionada");
            }

            String input1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
            if (input1 == null) {
                throw new ErroPersonalizado("Nenhum número foi digitado");
            }
            double num1 = parseInput(input1);
                
            String input2 = JOptionPane.showInputDialog("Digite o segundo número: ");
            if (input2 == null) {
                throw new ErroPersonalizado("Nenhum número foi digitado");
            }
            double num2 = parseInput(input2);

            double result = 0;
            switch (operacao) {
                case "Adição":
                    result = num1 + num2;
                    break;
                case "Subtração":
                    result = num1 - num2;
                    break;
                case "Multiplicação":
                    result = num1 * num2;
                    break;
                case "Divisão":
                    if (num2 == 0) {
                        throw new ErroPersonalizado("Divisão por zero não pode ser realizada!");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new ErroPersonalizado("Operação inválida");
            }
            
            JOptionPane.showMessageDialog(null, "O resultado é: " + result, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (ErroPersonalizado e) {
            // A mensagem de erro já foi exibida pelo construtor da ErroPersonalizado
        } catch (NumberFormatException e) {
            new ErroPersonalizado("Entrada inválida. Por favor, insira um número válido.");
        }
    }

    private static double parseInput(String input) throws ErroPersonalizado {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new ErroPersonalizado("Entrada inválida. Por favor, insira um número válido.");
        }
    }
}*/








