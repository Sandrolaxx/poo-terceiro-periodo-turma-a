

package primeirobimestre.Primeirobimestre.Myyplants;

class Cliente {
    String nome, cidade, bairro, rua;
    int idade;

    // Apresenta o cliente
    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua );
    }
}