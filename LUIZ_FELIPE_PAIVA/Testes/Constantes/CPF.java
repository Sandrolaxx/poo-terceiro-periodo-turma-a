package Testes.Constantes;


public class CPF {
private static final int INDICE_REGIAO_CPF = 8;
private static final int INDICE_PRIMEIRO_VERIFICADOR = 9;
private static final int INDICE_SEGUNDO_VERIFICADOR = 10;

public void validar(String cpf){
    int regiao = cpf.charAt(INDICE_PRIMEIRO_VERIFICADOR);
    int primeiroDigitoVerificador = cpf.charAt(INDICE_PRIMEIRO_VERIFICADOR);
    int segundoDigitoVerificador = cpf.charAt(INDICE_SEGUNDO_VERIFICADOR);
}
}
