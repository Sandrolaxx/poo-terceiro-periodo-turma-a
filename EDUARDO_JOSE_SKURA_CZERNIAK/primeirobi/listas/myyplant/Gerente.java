// package primeirobi.listas.myyplant;

// public class Gerente extends DadosFuncionario {

//     public Gerente(String estado, String cidade, String bairro, String rua, Integer numero, String complemento,
//             String nomeFuncionario, Integer idadeFuncionario, String nomeFantasia, String razaoSocial, String cnpj) {
//         super(estado, cidade, bairro, rua, numero, complemento, nomeFuncionario, idadeFuncionario, nomeFantasia, razaoSocial,
//                 cnpj);
//     }


//     public void apresentarEndereco() {
//     System.out.println(getBairro());
//     System.out.println(getCidade());
//     System.out.println(getEstado());
//     System.out.println(getRua());
//     }

//     public void calcularMedia() {
//         Double[] salarioBase = new Double[3];
//         salarioBase[0]= 10389.56; // Gerente 1
//         salarioBase[1]= 5521.77; // Gerente 2
//         salarioBase[2]= 3318.99; // Gerente 3

//         Double[] salarioRecebido = new Double[3];
//         salarioRecebido[0]= (salarioBase[0] * 0.35); // Gerente 1
//         salarioRecebido[1]= (salarioBase[1] * 0.35); // Gerente 2
//         salarioRecebido[2]= (salarioBase[2] * 0.35); // Gerente 3
//         double mediaCalculo = 0.0;
//         for (int i = 0; i < salarioRecebido.length; i++) {
//             mediaCalculo = salarioRecebido[i] + mediaCalculo;
//         };
//         System.out.println(" O resultado da média dos salários é de " + mediaCalculo + " reais!");
//     }
    
//     public void calcularBonus() {
//         Double[] salarioBase = new Double[3];
//         salarioBase[0]= 5389.56; // Gerente 1
//         salarioBase[1]= 2521.77; // Gerente 2
//         salarioBase[2]= 1318.99; // Gerente 3

//         double bonusCalculo = 0.35;

//         Double[] salarioRecebido = new Double[3];
//         salarioRecebido[0]= (salarioBase[0] * bonusCalculo); // Gerente 1
//         salarioRecebido[1]= (salarioBase[1] * bonusCalculo); // Gerente 2
//         salarioRecebido[2]= (salarioBase[2] * bonusCalculo); // Gerente 3

//         for (int i = 0; i < salarioRecebido.length; i++) {
//             System.out.println("O resultado do pagamento com bônus é de " + salarioRecebido[i] + " reais! ");
//         };
//     }


//     public void setNomeGerente(String string) {
//         throw new UnsupportedOperationException("Unimplemented method 'setNomeGerente'");
//     }


//     public void setIdade(int i) {
//         throw new UnsupportedOperationException("Unimplemented method 'setIdade'");
//     }

//     @Override
//     public void setRua(String rua) {
//         super.setRua(rua);
//     }



// }
