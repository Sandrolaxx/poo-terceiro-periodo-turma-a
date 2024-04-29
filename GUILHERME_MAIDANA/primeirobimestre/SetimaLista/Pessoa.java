package primeirobimestre.SetimaLista;

public class Pessoa {
    private String nome;


    private int  idade;


    private Endereco endereco;


    public void Apresentarse(){
        System.out.println("Meu nome é : " +this.nome+" e tenho " +this.idade+ " anos ");
        System.out.println(this.endereco.apresentarLogradouro());
    }




    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int  getIdade() {
        return idade;
    }


    public void setIdade(int  idade) {
        this.idade = idade;
    }


    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
