package GABRIEL_SCHIESTL.SEGUNDO_BIMESTRE.prova;

import javax.swing.JOptionPane;

public class Main {

    private static PostSample post = new PostSample();
    private static GetSample get = new GetSample();

    public static void main(String[] args) {
        String[] options = { "Listar dados dos alunos", "Criar testemunho", "Sair" };

        String selectedOption;

        do {
            selectedOption = (String) JOptionPane.showInputDialog(null,
                    "Escolha uma ação:", null, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);

            if (selectedOption.equals("Listar dados dos alunos")) {
                get.getStudents();
            } else if (selectedOption.equals("Criar testemunho")) {
                post.createTestimonial();
            } else {
                System.out.println("Saindo do sistema...");
                break;
            }
        } while (!selectedOption.equals("Sair"));
    }
}
