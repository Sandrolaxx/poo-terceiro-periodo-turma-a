package JEAN_LUCA.segundobi.prova;
import javax.swing.JOptionPane;


public class Main  {
    public static void main(String[] args) {

        RegistoDeTestemunho testemunhos = new RegistoDeTestemunho();
        
         ListaDeAlunos alunos = new ListaDeAlunos();
       

        String comeco = JOptionPane.showInputDialog(null,"Escolha uma opcao: \n a:Lista de Alunos , b:Testemunho , c: sair","opcoes",JOptionPane.QUESTION_MESSAGE);
        String opcao = comeco;
        switch (opcao){
            case "a":
            alunos.getJsonData();
            break;
            case "b":
           testemunhos.Registro();
            break;
            case "c":
            JOptionPane.showMessageDialog(null, "SAINDO....", "EXIT", JOptionPane.QUESTION_MESSAGE);
            default:
            JOptionPane.showMessageDialog(null, "ERRO", "404", JOptionPane.ERROR_MESSAGE);
               break;

        
        }
    }

}
