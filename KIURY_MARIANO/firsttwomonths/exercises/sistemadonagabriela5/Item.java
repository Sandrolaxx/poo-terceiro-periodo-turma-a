// 4. Criar uma classe Item com:
// - Atribuitos id, nome, tipo, valor.
// - Método gerarDescricao, printa o id do item, nome, tipo e valor.

public class Item {
    
    private Integer id;
    private String nome;
    private String tipo;
    private double valor;

    void gerarDescricao(){
        System.out.println("===================================");
        System.out.printf("ID: %s - Nome: %s - Tipo: %s - R$: %s%n ", id, nome, tipo, valor);
        System.out.println("===================================");
    }

    public Integer getId() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
}
