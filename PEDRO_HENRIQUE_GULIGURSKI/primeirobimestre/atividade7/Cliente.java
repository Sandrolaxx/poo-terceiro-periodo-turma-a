package primeirobimestre.atividade7;

public class Cliente extends Pessoa{
    
    public Cliente(String nome, Integer idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void apresentarse() {
        String msg = "Olá, me chamo "
                .concat(nome)
                .concat(" e tenho ")
                .concat(idade + " anos.");
        System.out.println(msg);
    }

    public void apresentarEndereco(){
        endereco.apresentarLogradouro();
    }

}
