package primeirobi.listas.Lista6;

public class Cliente {
    
    String nome;

    String idade;

    String cidade;

    String bairro;

    String rua;

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