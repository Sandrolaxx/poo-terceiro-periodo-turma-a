package segundobi.Atividade1;
import java.util.HashMap;
import java.util.Map;

public class ativ5 {
    public static void main(String[] args) {
        Map<String, String> setup = new HashMap<>();


        setup.put("Placa de vídeo","AMD Radeon RX 6700 XT OC, 12GB");
        setup.put("Processador","AMD Ryzen 9 5900X");
        setup.put("Memória RAM","32GB");
        setup.put("Fonte","Corsair CX Series CX750");
        setup.put("Gabinete","Gabinete Gamer Rise Mode Galaxy Glass");
       
        setup.entrySet().forEach(ks->{
                System.out.println(ks.getKey()+": "+ ks.getValue());
              });
    }
}
