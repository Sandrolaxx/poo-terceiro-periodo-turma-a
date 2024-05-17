package HEBERNALD_THEOPHILE.prova;

public class Multa {
    private static final double VALOR_MULTA_DIARIA = 3.50;

    public static double calcularMulta(int diasAtraso) {
        return diasAtraso * VALOR_MULTA_DIARIA;
    }
}
