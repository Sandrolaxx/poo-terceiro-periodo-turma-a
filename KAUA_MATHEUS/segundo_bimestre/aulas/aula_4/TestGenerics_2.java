import java.lang.reflect.Field;

public class TestGenerics_2 {

    public static class Aluno{
        
        String name;
        int age;

        public String getName(){
            return this.name;
        }

    }

    public static class Professor{
        
        String name;
        int age;

        public String getName(){
            return this.name;
        }

    }

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.name = "Kauã";

        Professor professor = new Professor();
        professor.name = "Matheus";

        System.out.println(GetGenericsClassName(aluno));
        System.out.println(GetGenericsClassName(professor));


    }

    public static <T> String GetGenericsClassName(T genericClass){

        try{

            // Isso se chama Reflection, podemos utilizar isso para obter atributos de dentro de uma classe, mesmo que privados!!
            Field field = genericClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            return (String) field.get(genericClass);

        }catch(IllegalAccessException | NoSuchFieldException e){
            // Tratamento de erros comuns nesse tipo de operação
            e.printStackTrace();
            return null;
        }
    }

    
    
}
