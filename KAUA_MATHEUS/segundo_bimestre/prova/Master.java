package KAUA_MATHEUS.segundo_bimestre.prova;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Master {
    
    public static void main(String[] args) {

        RequestMethods requisicao = new RequestMethods();
        
        try {
        
        JFrame frame = new JFrame("ShowInputDialog - SelectOne");
        List<String> options_list = List.of("Listagem de alunos", "Criar registro de testemunho", "Sair");


        while (true)
        {
            String escolha = (String) JOptionPane.showInputDialog(frame, "Qual é a sua escolha?",
            "Operações", JOptionPane.QUESTION_MESSAGE, null,
            options_list.toArray(),
            options_list.toArray()[0]);

            switch (escolha) {

            case "Listagem de alunos":
                JOptionPane.showMessageDialog(frame, requisicao.getStudents(), null, JOptionPane.INFORMATION_MESSAGE);
                System.out.println(requisicao.getStudents());
                break;

            case "Criar registro de testemunho":

                // Foto https://avatars.githubusercontent.com/u/127451778?v=4
                /*
                desc A jornado do Dev nunca tem fim, são etapas e mais etapas, 
                     o sucesso é só uma consequência, sempre faça o seu melhor e 
                     logo chegará mais longe do que qualquer um!
                */
                // RA 10362

                String ra = JOptionPane.showInputDialog(frame, "Qual é o seu RA? ", null, 1);
                String photo = JOptionPane.showInputDialog(frame, "Qual é a sua foto? ", null, 1);
                String description = JOptionPane.showInputDialog(frame, "Qual é a sua descrição? ", null, 1);

                requisicao.setRa(ra);
                requisicao.setDesc(description);
                requisicao.setFoto(photo);

                requisicao.postStudent();

                break;

            case "Sair":
                System.exit(0);
                break;
        
            default:
                break;
        }}

    } catch (Exception e) {
        JFrame frame = new JFrame("ShowMessageDialog");
        JOptionPane.showMessageDialog(frame, "O usuário cancelou a operação \n" + e, null, JOptionPane.INFORMATION_MESSAGE);
        e.printStackTrace();
    }
    }


    

}
