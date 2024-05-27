// Criar uma classe Item com:
// - Atribuitos id, nome, tipo, valor.
// - Método gerarDescricao, printa o id do item, nome, tipo e valor.

package exercises.sistemadonagabriela6;

public class Item {
    
    private int id;
    private String nome;
    private String tipo;
    private double valor;
    
    // Métodos

    void gerarDescricao(){

        System.out.println("\nId[" +getId()+ "] - Item: " +getNome()+ ". Tipo: " +getTipo()+ ". Valor: R$" + getValor());
    }

    // Geters e Seters

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
    
}