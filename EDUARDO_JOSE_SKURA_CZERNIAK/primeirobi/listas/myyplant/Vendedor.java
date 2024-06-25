// package primeirobi.listas.myyplant;

// public class Vendedor extends DadosFuncionario{
    

//     public Vendedor(String estado, String cidade, String bairro, String rua, Integer numero, String complemento,
//             String nomeFuncionario, Integer idadeFuncionario, String nomeFantasia, String razaoSocial, String cnpj) {
//         super(estado, cidade, bairro, rua, numero, complemento, nomeFuncionario, idadeFuncionario, nomeFantasia, razaoSocial,
//                 cnpj);
//     }

//     public void calcularMedia() {
//         Double[] salarioBase = new Double[3];
//         salarioBase[0]= 5389.56; // Vendedor 1 
//         salarioBase[1]= 2521.77; // Vendedor 2
//         salarioBase[2]= 1318.99; // Vendedor 3

//         Double[] salarioRecebido = new Double[3];
//         salarioRecebido[0]= (salarioBase[0] * 0.2); // Vendedor 1
//         salarioRecebido[1]= (salarioBase[1] * 0.2); // Vendedor 2
//         salarioRecebido[2]= (salarioBase[2] * 0.2); // Vendedor 3
//         double mediaCalculo = 0.0;
//         for (int i = 0; i < salarioRecebido.length; i++) {
//             mediaCalculo = salarioRecebido[i] + mediaCalculo;
//         };
//         System.out.println(" O resultado da média dos salários é de " + mediaCalculo + " reais!");
//     }
    
//     public void calcularBonus() {
//         Double[] salarioBase = new Double[3];
//         salarioBase[0]= 5389.56; // Vendedor 1
//         salarioBase[1]= 2521.77; // Vendedor 2
//         salarioBase[2]= 1318.99; // Vendedor 3

//         double bonusCalculo = 0.2;

//         Double[] salarioRecebido = new Double[3];
//         salarioRecebido[0]= (salarioBase[0] * bonusCalculo); // Vendedor 1
//         salarioRecebido[1]= (salarioBase[1] * bonusCalculo); // Vendedor 2
//         salarioRecebido[2]= (salarioBase[2] * bonusCalculo); // Vendedor 3

//         for (int i = 0; i < salarioRecebido.length; i++) {
//             System.out.println("O resultado do pagamento com bônus é de " + salarioRecebido[i] + " reais! ");
//         };

//     }

//     @Override
//     public void setRua(String rua) {
//         super.setRua(rua);
//     }


// }
