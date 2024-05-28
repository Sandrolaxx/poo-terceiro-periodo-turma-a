package ListaSeis;

class Item {
    private int id;
    private String nomeItem;
    private String tipo;
    private double valor;

    public Item (int id, String nomeItem, String tipo, double valor){
        this.id = id;
        this.nomeItem = nomeItem;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void gerarDescricao(){
        System.out.println("================================================");
        System.out.println("ID DO ITEM: " +id);
        System.out.println("NOME DO ITEM: " +nomeItem);
        System.out.println("TIPO DO ITEM: " +tipo);
        System.out.println("VALOR DO ITEM: R$ " +valor);
        System.out.println("================================================");
    }
    public String getNomeItem() {
        return nomeItem;
    }

    public double getValor() {
        return valor;
    }

}
