package segundobimestre.listas.Classe;

import java.util.Date;

public class GenericSample {
    
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student();


        printClassName(teacher);
        printClassName(student);
        
        printClassName(Double.valueOf("24.90"));
        printClassName(new Date());
    }
    
    public static <T> T printClassName(T anyClass) {
        System.out.println(anyClass.getClass().getName());

        return anyClass;
    }

}