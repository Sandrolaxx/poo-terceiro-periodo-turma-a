package Testes.Getters;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("vascudo");
        pessoa.setIdade(26);
        pessoa.setAltura(1.65);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println("A altura da pessoa é: "+pessoa.getAltura()+" metros");
    }
}
