package primeirobi.Exercicio7;
import java.util.ArrayList;

public class Vendedor {
    
    private String nome;
    private Integer idade;
    private String loja;
    private Double salarioBase;
    private ArrayList<Double> salarioRecebido = new ArrayList<Double>();
    private Endereco endereco;

    public Vendedor(String nome, Integer idade, String loja,Double salarioBase, ArrayList<Double> salarioRecebido, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public ArrayList<Double> getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(ArrayList<Double> salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
