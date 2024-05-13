package primeirobimestre.atividade5;

import primeirobimestre.atividade6.Endereco;

public class Cliente{
    
    private String nome;
    private Integer idade;
    @SuppressWarnings("unused")
    private Endereco endereco;
    
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

}
