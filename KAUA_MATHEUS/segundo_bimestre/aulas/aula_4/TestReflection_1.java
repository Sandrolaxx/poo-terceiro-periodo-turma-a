import java.lang.reflect.Field;

public class TestReflection_1 {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.name = "Matheusinho";

        // Utilizando Reflection dentro do main
        try{
            Field field = aluno.getClass().getDeclaredField("name");
            field.setAccessible(true);
            String nome_aluno = (String) field.get(aluno);
            
            System.out.println(nome_aluno);

        }catch(IllegalAccessException | NoSuchFieldException e){
            e.printStackTrace();
        }

        Professor professor = new Professor();
        professor.setName("Joãozinho");

        // Alterando nomes privados de uma classe!!!
        try{
            Field field = professor.getClass().getDeclaredField("name");
            field.setAccessible(true);

            field.set(professor, "João");
            String nome_professor = (String) field.get(professor);
            
            System.out.println(nome_professor);

        }catch(IllegalAccessException | NoSuchFieldException e){
            e.printStackTrace();
        }
        


    }

    public static class Aluno{
        String name;
    }

    public static class Professor{
        
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }
}
