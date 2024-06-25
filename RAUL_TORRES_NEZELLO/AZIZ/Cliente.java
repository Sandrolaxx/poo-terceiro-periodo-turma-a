import java.util.ArrayList;

public class Cliente extends Pessoa {
    //lista pra armazenar casos do Cliente
    private ArrayList<CasoJudicial> casosCliente;

    public Cliente(String nome, Long cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        this.casosCliente = new ArrayList<>();//inicializa a lista de casos
    }

    public ArrayList<CasoJudicial> getCasosCliente() {
        return casosCliente;
    }

    public void adicionarCaso(CasoJudicial caso) {
        this.casosCliente.add(caso);
    }

    public void listarCasos() {
        for (CasoJudicial caso : casosCliente) {
            System.out.println(caso);
        }
    }
}