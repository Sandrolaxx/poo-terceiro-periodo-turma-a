package Testes.TestesConstrutor;

public class App {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Mateus", "Guerreiro");
        Personagem personagem1 = new Personagem("Kaka ", "Mago");
        personagem.mostrarStatus();
        personagem1.mostrarStatus();
        personagem.setNome("MMR");
        

    }
}
