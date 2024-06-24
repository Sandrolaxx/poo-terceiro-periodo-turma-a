package Testes.Heranca;

public class Pombo extends Ave{
    private int cartasEnviadas = 10;

    public Pombo(String nome) {
        super(nome);
        
    }
    public void fazerPru(){
            System.out.println(getNome()+" Pruuu");
    }

    public void enviarCarta(){
        System.out.println(getNome()+" Enviou carta");
        cartasEnviadas++;
    }
    public int getCartasEnviadas() {
        return cartasEnviadas;
       
    }
}
