package Testes.TesteMetodo;

import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    public void mostrarStatus(){
        System.out.println("Personagem " +nome+ " nivel " +nivel+ " com forca de "+forca);
    }

    public int calcularDano(){
        Random gerador = new Random();
        int dano20Faces = 1+ gerador.nextInt(19);
        int dano = forca + dano20Faces;
        return dano;
    }

    public void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if (habilidade.length() == 0) {
            System.out.println(nome+ " atacou "+alvo+ " e causou " +danoCausado+ " de dano");
        }
        else{
            System.out.println(nome+ " atacou "+alvo+ " e causou " +danoCausado+ " de dano usando " +habilidade);
        }
        
    }

    }

