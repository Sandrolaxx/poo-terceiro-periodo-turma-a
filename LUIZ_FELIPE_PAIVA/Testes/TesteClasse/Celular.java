package Testes.TesteClasse;

public class Celular {
    String nome;
    String sistemaOperacional;
    int espacoArmazenamento;
    double tamanhoTela;
    

    public void mostrarCelular(){
        System.out.println("Celular "+nome+ " com tela de " + tamanhoTela+ " polegadas com " +espacoArmazenamento+ "GB de armazenamento e sistema operacional " +sistemaOperacional );    }
}
