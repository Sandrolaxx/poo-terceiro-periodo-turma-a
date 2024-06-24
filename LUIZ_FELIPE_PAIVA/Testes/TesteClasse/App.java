package Testes.TesteClasse;

public class App {
    public static void main(String[] args) {
        
        // Iphone 12, tela 6.1, 256gb
        // Galaxy Note 20, tela 6.9, 256gb
        // Xiaomi mi 11, tela de 6.81, 128gb

            Celular celularA = new Celular();
            celularA.nome = "Iphone 12";
            celularA.tamanhoTela = 6.1;
            celularA.espacoArmazenamento = 256;
            celularA.sistemaOperacional = "IOS";

            Celular celularB = new Celular();
            celularB.nome = "Galaxy Note 20";
            celularB.tamanhoTela = 6.9;
            celularB.espacoArmazenamento = 256;
            celularB.sistemaOperacional = "Android";

            Celular celularC = new Celular();
            celularC.nome = "Xiaomi mi 11";
            celularC.tamanhoTela = 6.81;
            celularC.espacoArmazenamento = 128;
            celularC.sistemaOperacional = "Android";

            Computador computador1 = new Computador();
            computador1.processador = "Ryzen 7 7800x3d";
            computador1.memoria = "XPG Lancer 2x16gb 6000mhz";
            computador1.placaVideo = "RTX 3060TI";
            computador1.armazenamento = "1TB";
            computador1.placaMae = "X670-E Plus";

            celularA.mostrarCelular();
            celularB.mostrarCelular();
            celularC.mostrarCelular();
            computador1.mostrarPC();



            

    }
}
