package ListaSete;

import java.util.Scanner;

class Endereco extends Objeto {
    String cidade;
    String estado;
    String bairro;
    String rua;
    int numero;
    String complemento;

    protected Endereco(int id, String estado, String cidade, String bairro, String rua, int numero, String complemento) {
        super(id);
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.complemento = complemento;
    }

    protected String getEstado() {
        return estado;
    }

    protected void setEstado(String estado) {
        this.estado = estado;
    }

    protected String getCidade() {
        return cidade;
    }

    protected void setCidade(String cidade) {
        this.cidade = cidade;
    }

    protected String getBairro() {
        return bairro;
    }

    protected void setBairro(String bairro) {
        this.bairro = bairro;
    }

    protected String getRua() {
        return rua;
    }

    protected void setRua(String rua) {
        this.rua = rua;
    }

    protected int getNumero() {
        return numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    protected String getComplemento() {
        return complemento;
    }

    protected void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    protected void apresentarLogradouro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================================");

        System.out.println("INFORME O ENDEREÇO COMPLETO DA LOJA\n");

        System.out.print("ESTADO: ");
        this.estado = scanner.next();

        System.out.print("CIDADE: ");
        this.cidade = scanner.next();

        System.out.print("BAIRRO: ");
        this.bairro = scanner.next();

        System.out.print("RUA: ");
        this.rua = scanner.next();

        System.out.print("NUMERO: ");
        this.numero = scanner.nextInt();

        System.out.print("COMPLEMENTO: ");
        this.complemento = scanner.next();

        System.out.println("================================================");

    }
}