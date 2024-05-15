package LUIZ_FELIPE_PAIVA.primerio_bimestre.lista06;

class Item {
    private int id;
    private String nomeDoItem;
    private String tipo;
    private double valor;

    public Item (int id, String nomeDoItem, String tipo, double valor){
        this.id = id;
        this.nomeDoItem = nomeDoItem;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void gerarDescricao(){
        System.out.println("ID do Item: " + id);
        System.out.println("Nome do Item: " + nomeDoItem);
        System.out.println("Tipo do Item: " + tipo);
        System.out.println("Valor do Item: R$ " + valor);
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public double getValor() {
        return valor;
    }

}
