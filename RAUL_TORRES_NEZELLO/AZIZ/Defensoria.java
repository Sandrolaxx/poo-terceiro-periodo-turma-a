import java.util.ArrayList;

public class Defensoria {
    private String nomeDefensoria;
    private String email;
    private String telefone;
    private ArrayList<CasoJudicial> listagemCasos;

    public Defensoria(String nomeDefensoria, String email, String telefone) {
        this.nomeDefensoria = nomeDefensoria;
        this.email = email;
        this.telefone = telefone;
        this.listagemCasos = new ArrayList<>();
    }

    public String getNomeDefensoria() { return nomeDefensoria; }
    public void setNomeDefensoria(String nomeDefensoria) { this.nomeDefensoria = nomeDefensoria; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public ArrayList<CasoJudicial> getListagemCasos() { return listagemCasos; }

    public void analisarCaso(CasoJudicial caso) {
        // Implementação da lógica para analisar o caso
    }

    public CasoJudicial pesquisarCaso(int id) {
        // Implementação da lógica para pesquisar o caso
        return null;
    }

    public void apresentarLista() {
        for (CasoJudicial caso : listagemCasos) {
            System.out.println(caso);
        }
    }
}