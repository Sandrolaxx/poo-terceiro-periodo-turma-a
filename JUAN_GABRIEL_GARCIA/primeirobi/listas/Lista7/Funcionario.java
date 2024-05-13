package primeirobi.listas.Lista7;

public class Funcionario {
    private String nome;

    private String idade;

    private Loja loja;

    private Endereco endereco;

    private int[] salarioBase = new int[100];

    private int[] salarioRecebido = new int [100];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int[] getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase, int i) {
        this.salarioBase[i] = salarioBase;
    }

    public int[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(int salarioRecebido, int i) {
        this.salarioRecebido[i] = salarioRecebido;
    }

    public void apresentarse() {

        String msg = ("\n Me chamo "
        .concat(nome)
        .concat(", tenho ")
        .concat(idade)
        .concat(" anos e trabalho na ")
        .concat((loja.getNomeFantasia()) + "\n"));
         
        System.out.println(msg);
    }

    public void calcularMedia() {
        int soma = 0;
        int i;
        for (i = 0; i < salarioRecebido.length; i++) {
            
            if (salarioRecebido[i] == 0.0) {
                break;
            }
            else {
                soma += salarioRecebido[i];
            }
            
        }

        int media = (soma/i);

        System.out.println("A media é: dos salarios de " + nome + " é: " + media);
    }

    public void calcularBonus() {
        int i;
        for (i = 0; i < salarioBase.length; i++) {

            if (salarioBase[i] == 0.0) {
                break;
            }
            else {
                System.out.println("O salario de " + nome + " recebera um bonus de R$: " + (salarioBase[i] * 0.2));
                System.out.println();
            }
        }  
    }
}
