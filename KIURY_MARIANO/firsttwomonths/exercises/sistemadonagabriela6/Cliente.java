// Criar classe Cliente:
// com os atributos nome, idade, cidade, bairro e rua.
// Método apresentarse deve printar o nome, idade.

package exercises.sistemadonagabriela6;

public class Cliente extends Pessoa{
    
    // Métodos

    void apresentarse(){
        System.out.println("\nCliente: " +getNome()+ ", idade: " +getIdade());
    }

}