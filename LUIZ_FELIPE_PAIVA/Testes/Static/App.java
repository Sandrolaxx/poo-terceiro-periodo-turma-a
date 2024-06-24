package Testes.Static;

public class App {
    public static void main(String[] args) {
      // System.out.println(Matematica.calcularAreaCirculo(25));
      Carro ferrari = new Carro("Ferrari", 2023);
      Carro fusca = new Carro("Fusca", 1999);

      System.out.println(ferrari.anoDaCompra);
    }
}
