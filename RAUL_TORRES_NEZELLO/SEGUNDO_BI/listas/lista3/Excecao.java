package SEGUNDO_BI.listas.lista3;


import javax.swing.JOptionPane;


public class Excecao extends RuntimeException{


    //Atividade 5
    public Excecao(String errorMsg){
        JOptionPane.showMessageDialog(
            null,
            errorMsg,
            "ERRO",
            JOptionPane.ERROR_MESSAGE);
    }
}

