package segundobi.listas.lista4;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        while(x==1){
        String nome = JOptionPane.showInputDialog(null,"[1] Consultar Listagem de convenios\n[2]Solicitar consulta de boletos\n[3]Sair", "Ensira os dados", JOptionPane.QUESTION_MESSAGE);
        switch (nome) {
            case "1" :
                JOptionPane.showMessageDialog(null,"Entrando...", "Atv3", JOptionPane.INFORMATION_MESSAGE);   
                break;
        
            case "2":
                JOptionPane.showMessageDialog(null,"Cadastrando...", "Atv3", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "3":
                JOptionPane.showMessageDialog(null,"Saindo", "Atv3", JOptionPane.INFORMATION_MESSAGE);
                x=0;
                break;
        
            default:
                JOptionPane.showMessageDialog(null,"Opção invalida", "Atv3", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    }    
}

