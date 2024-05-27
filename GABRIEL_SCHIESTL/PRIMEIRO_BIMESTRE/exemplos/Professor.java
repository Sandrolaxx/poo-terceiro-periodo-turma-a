package PRIMEIRO_BIMESTRE.exemplos;

public class Professor {

    String nome = "Gabriel";

    String materia;

    public void sayHi(String name, String mat){
        this.nome = name;
        this.materia = mat;
        System.out.println("O professor ".concat(nome).concat(" leciona a materia de ").concat(materia));
    }

    public static void main(String[] args) {
        Professor p1 = new Professor();
        Professor p2 = new Professor();
        p1.sayHi("Sandrolaxx", "POO");
        System.out.println(p2.nome);
        Arma awp = new Arma();
        System.out.println(awp.toString());
    }
}