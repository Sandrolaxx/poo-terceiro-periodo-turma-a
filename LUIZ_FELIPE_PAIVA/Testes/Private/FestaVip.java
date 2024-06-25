package Testes.Private;

public class FestaVip {
    int quantidadeCafe = 30;
    int quantidadeSalgados = 50;

    public void entrar (){
        beberCafe();
        comerSalgado();
    }
    
    private void beberCafe(){
        quantidadeCafe --;
        System.out.println("Bebeu 1 xícara de café");
    }

    private void comerSalgado(){
        quantidadeSalgados --;
        System.out.println("Comeu 5 salgados");
    }
}
