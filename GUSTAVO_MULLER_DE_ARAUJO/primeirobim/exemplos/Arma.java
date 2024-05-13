package primeirobim.exemplos;

public class Arma extends Object{

    String nome;

    String tipo;

    Integer dano;

    public void mostrarma() {

        String msg = "Arma: " + nome + " tipo: " + tipo + " dano: " + dano;

        System.out.println(msg);
        
    }

}
