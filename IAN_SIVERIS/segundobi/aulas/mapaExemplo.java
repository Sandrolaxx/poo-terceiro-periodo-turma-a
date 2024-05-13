package segundobi.aulas;

import java.util.HashMap;
import java.util.Map;

public class mapaExemplo {
    
public static void main(String[] args) { 

    Map<String, Integer> vehicles = new HashMap<>();
}
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

System.out.println("Total de veiculos: " + vehicles.size());

vehicles.get("BMW"); // RETORNO → 5 
vehicles.get("Audi"); // RETORNO → 4
}
