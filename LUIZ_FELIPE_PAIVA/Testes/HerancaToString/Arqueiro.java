package Testes.HerancaToString;

public class Arqueiro extends Personagem {
    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco Longo";
    }

   @Override
   public void atacar() {
        System.out.println("O personagem "+getNome()+" atirou com "+arma);
    }
   


    @Override
    public String toString() {
        String informacoes = String.format("Nome: "+getNome()+ "\nClasse: "+getClasse()+ "\nNivel: "+getNivel()+ "\nArma: "+arma);
        return informacoes;
    }
}
