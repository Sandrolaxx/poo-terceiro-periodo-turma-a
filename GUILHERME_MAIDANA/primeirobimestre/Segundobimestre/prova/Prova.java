package GUILHERME_MAIDANA.primeirobimestre.Segundobimestre.prova;

import javax.swing.JOptionPane;

public class Prova { public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog(null, 
    "Escolha uma opção: 1 - Para Listar Alunos  2 - Criar Registro de Testemunho , 3 - Para Sair ", 
    "Lista de Opções",
    JOptionPane.QUESTION_MESSAGE);
    int opcao = Integer.parseInt(entrada);
    switch (opcao) {
        case 1:
        ConsultaAluno.listarAlunos();
            break;
        case 2:
        RegistroTestemunho.registroTestemunho(entrada, null);
            break;
        case 3:
            JOptionPane.showMessageDialog(null, "Saindo...", "Sair", JOptionPane.ERROR_MESSAGE);
            break;
        default:
        JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
            break;
}
    
}
}
