public class TestGenerics_1{

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.name = "Kauã";

        Professor professor = new Professor();
        professor.name = "Matheus";

        fazOperacao(professor);
        fazOperacao(aluno);



    }

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

    public static <T> T fazOperacao(T outraClasse){
        System.out.println("O nome da classe é " + outraClasse.getClass().getSimpleName());
        if (outraClasse.getClass().equals(Professor.class)) {
            // Cumprindo ações em casos específicos de uma classe
            System.out.println("É da classe professor! ");
        }
        return outraClasse;
    }

}