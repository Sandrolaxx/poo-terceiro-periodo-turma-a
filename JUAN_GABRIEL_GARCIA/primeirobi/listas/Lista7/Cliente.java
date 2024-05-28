package primeirobi.listas.Lista7;

public class Cliente {
    
    private String nome;

    private String idade;

    private Endereco endereco;
    

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

    public void apresentarse() {

        String msg = "\n Me chamo "
                .concat(nome)
                .concat (" e tenho ")
                .concat((String) idade)
                .concat (" anos \n");

        System.out.println(msg);
        
    }


}

/* 
Criar classe Cliente:
com os atributos nome, idade, cidade, bairro e rua. ##
Método apresentarse deve printar o nome, idade. ##
 */