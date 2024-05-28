package primeirobi.listas.myyplant;

public class Vendedor {
    
    String nome;
    Integer idade;
    String cidade;
    String bairro;
    String rua;

    public void calcularMedia() {
        Double[] salarioBase = new Double[3];
        salarioBase[0]= 5389.56; // Gerente 
        salarioBase[1]= 2521.77; // Analista
        salarioBase[2]= 1318.99; // Secretariado

        Double[] salarioRecebido = new Double[3];
        salarioRecebido[0]= (salarioBase[0] * 0.2); // Gerente 
        salarioRecebido[1]= (salarioBase[1] * 0.2); // Analista
        salarioRecebido[2]= (salarioBase[2] * 0.2); // Secretariado
        double mediaCalculo = 0.0;
        for (int i = 0; i < salarioRecebido.length; i++) {
            mediaCalculo = salarioRecebido[i] + mediaCalculo;
        };
        System.out.println(" O resultado da média dos salários é de " + mediaCalculo + " reais!");
    }
    
    public void calcularBonus() {
        Double[] salarioBase = new Double[3];
        salarioBase[0]= 5389.56; // Gerente 
        salarioBase[1]= 2521.77; // Analista
        salarioBase[2]= 1318.99; // Secretariado

        double bonusCalculo = 0.2;

        Double[] salarioRecebido = new Double[3];
        salarioRecebido[0]= (salarioBase[0] * bonusCalculo); // Gerente 
        salarioRecebido[1]= (salarioBase[1] * bonusCalculo); // Analista
        salarioRecebido[2]= (salarioBase[2] * bonusCalculo); // Secretariado

        for (int i = 0; i < salarioRecebido.length; i++) {
            System.out.println("O resultado do pagamento com bônus é de " + salarioRecebido[i] + " reais! ");
        };

    }


}
