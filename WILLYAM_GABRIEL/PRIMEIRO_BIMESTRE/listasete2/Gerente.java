package ListaSete;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Gerente extends Funcionario {

    protected Gerente(int id, String nome, int idade, Double salarioBase) {
        super(id, nome, idade, salarioBase);
    }

    @Override
    protected double calcularBonus() {
        return calcularMedia() * 0.35;
    }

    @Override
    protected void apresentarSe() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.print("NOME DO(A) GERENTE: ");
        this.nome = scanner.next();

        System.out.print("IDADE DO(A) GERENTE " + nome + ": ");
        this.idade = scanner.nextInt();

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("PARA INFORMAR OS MESES (JANEIRO, FEVEREIRO, MARÇO, ETC...) INFORME O NUMERO DO MÊS");
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.print("INFORME QUANTOS MESES O(A) GERENTE " + nome + " RECEBEU: ");
        int meses = scanner.nextInt();

        SimpleDateFormat formatacao = new SimpleDateFormat("MMM");

        for (int i = 0; i < meses; i++) {

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.print("INFORME O SALARIO DO(A) GERENTE NO MÊS " + formatacao.format(new Date(2077, i, 1)) + " : R$");
            double salarioBase = scanner.nextDouble();
            adicionarSalario(salarioBase);

            System.out.println("SALARIO DO MÊS " + formatacao.format(new Date(2077, i, 1)) + ": R$" + salarioBase);
            System.out.println("-------------------------------------------------------------------------------------");

        }

        System.out.println("MÉDIA SALARIAL: R$" + calcularMedia());
        System.out.println("BÔNUS SALARIAL DE 0.35%: R$" + calcularBonus());

    }

}
