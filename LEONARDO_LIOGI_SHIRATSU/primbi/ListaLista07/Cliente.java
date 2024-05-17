package primbi.ListaLista07;

class Cliente extends Funcionario {
    public Cliente(String nome, int idade, String cidade, String bairro, String rua) {
        super.setNome(nome);
        super.setIdade(idade);
        super.setCidade(cidade);
        super.setBairro(bairro);
        super.setRua(rua);
    }
    
}