package primeirobimestre.atividade5;

import primeirobimestre.atividade6.Endereco;

public class Vendedor {

    private String nome;
    private Integer idade;
    private String loja;
    @SuppressWarnings("unused")
    private Endereco endereco;
    private Float salarioBase;
    private Float[] salarioRecebido = new Float[3];

    

    public Vendedor(String nome, Integer idade, String loja,Endereco endereco, Float salarioBase, Float[] salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.endereco = endereco;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }
    
    public void apresentarse() {
        String msg = "Olá, me chamo "
                .concat(nome + " e tenho ")
                .concat(idade + " anos. ")
                .concat("E trabalho na loja ")
                .concat(loja);
        System.out.println(msg);
    }

    public float calcularMedia() {
        Float mediaSalario = 0.0f;
        for (int i = 0; i < 3; i++) {
            mediaSalario += salarioRecebido[i];
        }
        System.out.println("A média de meu salário é "+(mediaSalario / 3));
        return mediaSalario / 3;
    }


    public float calcularBonus() {
        System.out.println("Meu bonus é "+(salarioBase * 0.2));
        return (float) (salarioBase * 0.2);
    }
    }






