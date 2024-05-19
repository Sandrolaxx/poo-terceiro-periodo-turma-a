package primeirobi.atividade2.AtividadeListaUM;
import java.util.HashMap;
import java.util.Map;
public class Lista5 {
    public static void main(String[] args) {
        Map<String, String> pc = new HashMap<>();


        pc.put("Processador","i5 11400h");
        pc.put("Placa de video","RTX 3050");
        pc.put("Memoria Ram","16 gb");
        pc.put("Armazenamento","500 gb");
       
        pc.entrySet().forEach(ks->{
                System.out.println(ks.getKey()+": "+ ks.getValue());
              });
    }
}
