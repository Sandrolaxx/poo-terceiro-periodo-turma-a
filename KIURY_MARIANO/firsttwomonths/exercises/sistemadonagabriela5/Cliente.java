// 2. Criar classe Cliente:
// com os atributos nome, idade, cidade, bairro e rua.
// Método apresentarse deve printar o nome, idade.

public class Cliente extends Pessoa{

    void apresentarse(){

        System.out.println("Cliente: " +getNome()+ ", idade: " +getIdade());
    }
}
