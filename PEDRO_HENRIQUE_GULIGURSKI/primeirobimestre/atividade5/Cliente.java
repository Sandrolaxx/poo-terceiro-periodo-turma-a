package primeirobimestre.atividade5;

public class Cliente {
    
    String nome;
    Integer idade;
    String[] endereco = new String[3];

    public void apresentarse() {
        String msg = "Olá, me chamo "
                .concat(nome)
                .concat(" e tenho ")
                .concat(idade + " anos.");

        System.out.println(msg);
    }

}
