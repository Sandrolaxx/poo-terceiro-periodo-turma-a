package primeirobi.atividades.lista6;

public class Cliente extends Cidadao {

    public Cliente(String nome, String cidade, String bairro, String rua, int idade) {
        super(nome, cidade, bairro, rua, "", idade);
    }

    void apresentarSe(){
        System.out.println("Cliente: " + this.getNome()+ "\nIdade: " + this.getIdade());
    }

}

