package segundobi.aulas.aulaquatro;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericSample {
    
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        Student student = new Student();

        Teacher teacherAfterPrint = printClassName(teacher);
        Student studentAfterPrint = printClassName(student);
        
        printClassName(Double.valueOf("24.90"));
        printClassName(new Date());

        GenericBox<Teacher> boxWithTeacher = new GenericBox<>(new Teacher());
        GenericBox<Student> boxWithStudent = new GenericBox<>(studentAfterPrint);
        GenericBox<Date> boxWithDate = new GenericBox<Date>(new Date());

        System.out.println(boxWithTeacher.getContent());
        System.out.println(boxWithStudent.getContent());
        System.out.println(boxWithDate.getContent());
    }
    
    public static <T> T printClassName(T anyClass) {
        System.out.println(anyClass.getClass().getName());

        return anyClass;
    }

}
