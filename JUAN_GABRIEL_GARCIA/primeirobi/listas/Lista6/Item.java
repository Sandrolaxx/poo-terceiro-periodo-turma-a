package primeirobi.listas.Lista6;

public class Item {
    
    String
        tipo;
    
    float
        id,
        soma = 0,
        valorTotal;

    String[]
        nome = new String[100];

    float[]
        valor = new float[100];
        
    int[]
        quantidade = new int[100];

    public void gerarDescricao() {

      
        String msg =  nome + "\n Quantidade: " + quantidade + "\n id: " + id + "\n tipo: "
        + tipo + "\n valor: " + valor;
            
        System.out.println(msg);
    }
}
