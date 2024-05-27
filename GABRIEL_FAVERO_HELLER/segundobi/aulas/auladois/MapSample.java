package segundobi.aulas.auladois;

import java.util.Map;
import java.util.HashMap;

public class MapSample {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);

        map.put("B", 15);

        System.out.println(map);

        map.put("A", 5);

        System.out.println(map);

        System.out.println(map.containsKey("A"));

        System.out.println(map.containsValue(10));

        System.out.println(map.get("A"));
    }
}