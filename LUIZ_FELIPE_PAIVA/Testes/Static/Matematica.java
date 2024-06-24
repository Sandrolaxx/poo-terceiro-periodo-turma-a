package Testes.Static;

public class Matematica {
    private static double valorPi = 3.14;
    public static int somar(int numeroA, int numeroB){
        return numeroA + numeroB;
    } 
    public static double calcularAreaQuadrado(double lado){
        return lado*lado;
    }
    public static double calcularAreaCirculo(double raio){
        double area = valorPi*raio*raio;
        return area;
    }
    public static double calcularDobroDaAreaCirculo(double raio){
        double area = calcularAreaCirculo(raio);
        return area;
    }
}
