package listasete2;

import java.util.Scanner;

class Item extends Objeto {

    String nomeItem;
    String tipo;
    double valor;

    protected Item(int id, String nomeItem, String tipo, double valor) {
        super(id);
        this.nomeItem = nomeItem;
        this.tipo = tipo;
        this.valor = valor;
    }

    protected String getNomeItem() {
        return nomeItem;
    }

    protected void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    protected String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected double getValor() {
        return valor;
    }

    protected void setValor(double valor) {
        this.valor = valor;
    }

    protected void gerarDescricao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.print("INFORME A QUANTIDADE DE ITENS NO ESTOQUE: ");
        int quantEstoque = scanner.nextInt();

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.print("INFORME A QUANTIDADE DE PLANTAS NO ESTOQUE: ");
        int quantPlanta = scanner.nextInt();

        System.out.print("INFORME A QUANTIDADE DE VASOS NO ESTOQUE: ");
        int quantVaso = scanner.nextInt();

        int totalItens = quantPlanta + quantVaso;

        if (quantEstoque < totalItens) {
            System.out
                    .println("-------------------------------------------------------------------------------------");
            System.out.print("A QUANTIDADE DE PLANTAS E/OU VASOS FOI INFORMADA INCORRETAMENTE");
            System.out.println("-------------------------------------------------------------------------------------");

        } else {
            System.out
                    .println("-------------------------------------------------------------------------------------");
            System.out.println(
                    "PARA INFORMAR O TIPO DO ITEM, ESCREVA CONFORME A SEGUIR:\nPARA INFORMAR QUE O ITEM É UMA PLANTA, INFORME: PL\nPARA INFORMAR QUE O ITEM É UM VASO, INFORME: VS");
            System.out.println("-------------------------------------------------------------------------------------");

        }
    }

    @Override
    protected void apresentarSe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("INFORME O TIPO DO ITEM: ");
        tipo = scanner.next();

        switch (tipo) {
            case "PL":

                System.out.println(
                        "-------------------------------------------------------------------------------------");
                System.out.print("NOME DA PLANTA NO ESTOQUE: ");
                this.nomeItem = scanner.next();

                System.out.print("INFORME O ID DO ITEM: ");
                this.id = scanner.nextInt();

                System.out.print("VALOR DO ITEM: R$ ");
                this.valor = scanner.nextDouble();
                System.out.println(
                        "-------------------------------------------------------------------------------------");

                break;

            case "VS":
                
                System.out.print("MODELO DE VASO NO ESTOQUE: ");
                this.nomeItem = scanner.next();

                System.out.print("INFORME O ID DO ITEM: ");
                this.id = scanner.nextInt();

                System.out.print("VALOR DO ITEM: R$ ");
                this.valor = scanner.nextDouble();
                System.out.println(
                        "-------------------------------------------------------------------------------------");

                break;

            default:
                System.out.println(
                        "-------------------------------------------------------------------------------------");
                System.out.println("ERRO: FOI INFORMADO O TIPO ERRADO");
                System.out.println(
                        "-------------------------------------------------------------------------------------");

                break;
        }
    }
}
