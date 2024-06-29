package KIURY_MARIANO.secondtwomonths.prova;

import java.util.List;
import javax.swing.JOptionPane;


// A função dessa classe é ser a principal do sistema, onde serão selecionados as opções que o usuário desejar.


public class menu {

    public static void main(String[] args) {

        List<String> options = List.of("Listar Estudantes", "Adicionar testemunho", "Sair");

        String selected = "";

        while (selected != "Sair") {
            
            selected = (String) JOptionPane.showInputDialog(null,
                "Selecione a opção desejada:",
                "PROVA POO",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options.toArray(),
                "Selecione uma opção...");

            switch (selected) {

                case "Listar Estudantes":

                    listarTestemunhos.getStudents();
                    break;

                case "Adicionar testemunho": 

                    addTestemunho.addNewTestimonial();
                    break;
                
                case "Sair":
                
                    JOptionPane.showMessageDialog(
                            null,
                            "Você saiu!",
                            null,
                            0);
                    break;

                default:

                    JOptionPane.showMessageDialog(
                        null,
                        "Operação cancelada!",
                        null,
                        0);
                        break;
                }

        }
        
    }
}
