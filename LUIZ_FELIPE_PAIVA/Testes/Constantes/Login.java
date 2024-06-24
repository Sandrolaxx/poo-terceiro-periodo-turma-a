package Testes.Constantes;

public class Login {

    private static final int TAMANHO_MINIMO_SENHA = 7;
//SNAKE CASE MAISCULO SEPARADO POR __
//CAMEL CASE tamanhoMinimoSenha
    public void verificarSenha(String senha){
        if (senha.length() >= TAMANHO_MINIMO_SENHA) {
            System.out.println("Senha válida");
        }
        else{
            System.out.println("Senha inválida");
        }
        
    }
}
