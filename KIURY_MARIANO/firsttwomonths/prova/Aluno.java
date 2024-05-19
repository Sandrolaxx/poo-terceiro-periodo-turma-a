package KIURY_MARIANO.firsttwomonths.prova;

public class Aluno {
    
    private String nome;
    private int id;
    private String matricula;
    private int idade;
    private String telefone;
    private String email;
    private String cidade;
    private String rua;
    private int numero;

    // Métodos

    void apresentarse(){
        System.out.println("\nAluno: " +getNome()+ ", idade: " +getIdade());
    }
    // Geters e Seters
    
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}