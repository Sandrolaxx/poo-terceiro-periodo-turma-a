package primeirobim.listas;

public class Cliente {

    String nome;

    int idade;

    String cidade;

    String bairro;

    String rua;

    public void apresentarse(){

        String msg = "Nome do cliente: " + nome + "\n" + "Idade: " + idade + "\n";
        System.out.println(msg);
    }
}


