package primeirobi.atividade07;
import java.util.Scanner;


class Loja {
    String nomeFantasia, razaoSocial, cnpj, cidade, bairro, rua;
    Vendedor[] vendedores;
    Cliente[] clientes;
    int[][] vendasDiarias = new int[30][12]; // Matriz de dias e meses

    Scanner scanner = new Scanner(System.in);

    // Conta clientes
    public int contarClientes() {
        return clientes.length;
    }

    // Conta vendedores
    public int contarVendedores() {
        return vendedores.length;
    }

    // Apresenta a loja
    public void apresentarse() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + rua + ", " + bairro + ", " + cidade);
    }

    // Registrar venda na loja
    public void registrarVenda(int dia, int mes, int valor) {
        vendasDiarias[dia - 1][mes - 1] += valor; // Subtraindo 1 para ajustar ao índice 0
    }

    // Calcular total de vendas para um determinado dia e mês
    public int calcularTotalVendas(int dia, int mes) {
        return vendasDiarias[dia - 1][mes - 1];
    }

    // Calcular salário do vendedor
    public double calcularSalarioVendedor(Vendedor vendedor) {
        // Calcula a média dos salários recebidos
        double mediaSalarios = vendedor.calcularMedia();
        // Calcula o bônus
        double bonus = vendedor.calcularBonus();
        // Retorna o salário total (média dos salários + bônus)
        return mediaSalarios + bonus;
    }


}