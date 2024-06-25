package Testes.ExerciciosClasse;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Mateus", 19, 1.65, 89);
        System.out.println("Informações Iniciais:");
        pessoa.exibirInfo();
        pessoa.calcularIMC();
        pessoa.saudacao();
        pessoa.maiorIdade();


        
        System.out.println("Informações Atualizadas:");
        
        pessoa.atualizarAltura(1.80);
        pessoa.atualizarIdade(17);
        pessoa.exibirInfo();
        pessoa.calcularIMC();
        pessoa.saudacao();
        pessoa.maiorIdade();

    }
}
