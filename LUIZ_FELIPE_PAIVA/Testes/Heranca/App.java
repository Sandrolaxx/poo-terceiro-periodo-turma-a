package Testes.Heranca;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Bilu");
        cachorro1.beber();
        cachorro1.comer();
        cachorro1.lamber();
        cachorro1.latir();
        System.err.println("\n____________________________________________________________________________\n");
        Gato gato1 = new Gato("Clara");
        gato1.comer();
        gato1.beber();
        gato1.miar();
        System.err.println("\n____________________________________________________________________________\n");
        Dragao dragao1 = new Dragao("Banguela");
        dragao1.soltarFogo();
        dragao1.voar();
        System.err.println("\n____________________________________________________________________________\n");
        Pombo pombo1 = new Pombo("Edivirges");
        pombo1.voar();
        pombo1.enviarCarta();
        pombo1.enviarCarta();
        pombo1.enviarCarta();
        pombo1.enviarCarta();
        pombo1.enviarCarta();
        pombo1.enviarCarta();
        pombo1.enviarCarta();
        pombo1.enviarCarta();
        pombo1.fazerPru();
        System.out.println(pombo1.getCartasEnviadas());
    }
}
