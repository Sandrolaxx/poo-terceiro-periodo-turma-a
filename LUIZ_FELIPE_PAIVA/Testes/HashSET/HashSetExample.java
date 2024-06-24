package Testes.HashSET;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        // Adicionando elementos
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");
        
        // Tentando adicionar um elemento duplicado
        set.add("Alice"); // Não será adicionado
        
        // Verificando se um elemento existe
        boolean exists = set.contains("Bob");
        System.out.println("Bob está no conjunto: " + exists);
        
        // Removendo elementos
        set.remove("Charlie");
        
        // Iterando sobre os elementos
        for (String name : set) {
            System.out.println(name);
        }
    }
}