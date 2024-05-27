package listasete2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Vendedor extends Funcionario {

    protected Vendedor(int id, String nome, int idade, Double salarioBase) {
        super(id, nome, idade, salarioBase);
    }

    @Override
    protected double calcularBonus() {
        return calcularMedia() * 0.20;
    }

    @Override
    protected void apresentarSe() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.print("INFORME A QUANTIDADE DE VENDEDORES NA LOJA: ");
        int quantVendedor = scanner.nextInt();

        for (int i = 0; i < quantVendedor; i++) {

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.print("NOME DO FUNCIONARIO(A) " + (i + 1) + ": ");
            this.nome = scanner.next();

            System.out.print("IDADE DO(A) " + this.nome + ": ");
            this.idade = scanner.nextInt();

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("PARA INFORMAR OS MESES (JANEIRO, FEVEREIRO, MARÇO, ETC...) INFORME O NUMERO DO MÊS");
            System.out.println("-------------------------------------------------------------------------------------");


            System.out.print("INFORME QUANTOS MESES O/A " + this.nome + " RECEBEU: ");
            int meses = scanner.nextInt();

            SimpleDateFormat formatacao = new SimpleDateFormat("MMM");

            for (int j = 0; j < meses; j++) {
                System.out.println("-------------------------------------------------------------------------------------");
                System.out.print("INFORME O SALARIO DO(A) " + this.nome + " NO MÊS "+ formatacao.format(new Date(2077, j, 1)) + " : R$");
                this.setSalarioBase(scanner.nextDouble());
                adicionarSalario(salarioBase);
                System.out.println("SALARIO DO MÊS " + formatacao.format(new Date(2077, j, 1)) + ": R$" + this.getSalarioBase());
                System.out.println("-------------------------------------------------------------------------------------");

            }

            System.out.println("MÉDIA SALARIAL: R$" + calcularMedia());
            System.out.println("BÔNUS SALARIAL DE 0.2%: R$" + calcularBonus());
        }
    }
}