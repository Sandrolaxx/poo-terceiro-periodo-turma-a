package segundobimestre.aulas.aulaQuatro;

public class EnumSample {
    public static void main(String[] args) {

        EnumPay formaPgto = EnumPay.PIX;

        switch (formaPgto) {
            case PIX:
                System.out.println("Selecionado PIX");
                System.out.println(formaPgto.getDescription());
                break;
            case CARTAO:
                System.out.println("Selecionado CARTAO");
                break;
            case BOLETO:
                System.out.println("Selecionado BOLETO");
                break;
            default:
                break;
        }

    }
}
