package ListaSete;

import java.util.Scanner;

class Cliente extends Pessoa {
    protected Cliente(int id, String nome, int idade) {
        super(id, nome, idade);
    }

    @Override
    protected void apresentarSe() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("INFORME O NOME DO(A) CLIENTE: ");
        this.nome = scanner.next();

        System.out.print("INFORME A IDADE DO(A) CLIENTE " + nome + ": ");
        this.idade = scanner.nextInt();
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("AS INFOMAÇÕES DO(A) CLIENTE " + nome + " FORAM REGISTRADAS COM SUCESSO");
        System.out.println("-------------------------------------------------------------------------------------");
    
    }
}
