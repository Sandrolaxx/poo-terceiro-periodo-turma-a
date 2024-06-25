package primeirobi.exemplos;

public class AulaDois {

    public static void main(String[] args) {

        int idade = 20;
        int velocidade = 50;
        EnumLimiteVelocidade limiteVelocidade = EnumLimiteVelocidade.SEM_MULTA;

        if (velocidade > 80) {
            limiteVelocidade = EnumLimiteVelocidade.GRAVISSIMA;
        } else if (velocidade > 60 && velocidade < 80) {
            limiteVelocidade = EnumLimiteVelocidade.MEDIA;
        }

        switch (limiteVelocidade) {
            case GRAVISSIMA:
                System.out.println("Rodou!");
                break;
            case MEDIA:
                System.out.println("4 pontos");
                break;
            default:
                System.out.println("Tá tranquilo!");
                break;
        }

        int[] vetorzinho = new int[] { 23, 34, 72 };

        // System.out.println(vetorzinho[-1]);

        String[] palavras = new String[3];

        palavras[0] = "Teste";
        palavras[1] = "Teste1";
        palavras[2] = "Teste2";

        System.out.println(palavras[0]);
        System.out.println(palavras[1]);
        System.out.println(palavras[2]);
    }

}
