package primeirobi.Exercicio6;

public class Item {
    Integer id;
    String nome;
    String tipo;
    Double valor;

    public void gerarDescricao(){
        System.out.println("Item: "+nome);
        System.out.println("Tipo: "+tipo);
        System.out.println("ID: "+id);
        System.out.println("Valor: R$"+valor);
    }

    
}
