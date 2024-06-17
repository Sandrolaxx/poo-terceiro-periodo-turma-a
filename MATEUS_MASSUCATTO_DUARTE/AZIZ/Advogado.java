package AZIZ;

import java.util.ArrayList;

public class Advogado extends Pessoa {
    private String oabNumero;
    private ArrayList<CasoJudicial> casosAdvogado; //lista pra armazenar os casos do advogado

    public Advogado(String nome, Long cpf, String email, String telefone, String oabNumero) {
        super(nome, cpf, email, telefone);
        this.oabNumero = oabNumero;
        this.casosAdvogado = new ArrayList<>(); //inic. lista casos
    }

    // Getters e setters
    public String getOabNumero() { return oabNumero; }
    public void setOabNumero(String oabNumero) { this.oabNumero = oabNumero; }

    public ArrayList<CasoJudicial> getCasosAdvogado() { return casosAdvogado; }



    //metodo para adicionar um caso a lista dos casos do advogado
    public void adicionarCaso(CasoJudicial caso) {
        this.casosAdvogado.add(caso);
    }
}

