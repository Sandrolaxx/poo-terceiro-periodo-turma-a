package Testes.HerancaToString;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private String arma;
    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    public void atacar(){
        System.out.println("O personagem "+nome+" atacou");
    }


    @Override
    public String toString() {
        String informacoes = String.format("Nome: "+nome+ "\nClasse: "+classe+ "\nNivel: "+nivel);
        return informacoes;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
}
