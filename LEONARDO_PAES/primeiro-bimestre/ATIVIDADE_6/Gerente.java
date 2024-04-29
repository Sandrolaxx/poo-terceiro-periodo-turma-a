package ATIVIDADE_6;

import java.util.List;

public class Gerente extends Vendedor {

    Gerente(String nome, int idade, String loja, String cidade, String bairro, String rua, double salarioBase,
            List<Double> salarioRecebido) {
        super(nome, idade, loja, cidade, bairro, rua, salarioBase, salarioRecebido);
    }

    @Override
    public double calcularBonus() {

        return salarioBase * 0.35;
    }

}
