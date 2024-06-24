
package Testes.Hashmap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adicionando elementos
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        
        // Acessando elementos
        int age = map.get("Alice");
        System.out.println("Idade de Alice: " + age);
        
        // Removendo elementos
        map.remove("Bob");
        
        // Iterando sobre os elementos
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
