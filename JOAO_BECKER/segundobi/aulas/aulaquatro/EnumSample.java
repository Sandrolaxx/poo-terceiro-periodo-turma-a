package segundobi.aulas.aulaquatro;

public class EnumSample {

    public static void main(String[] args) {

        EnumPaymentMethod formaPgto = EnumPaymentMethod.PIX;

        System.out.println(EnumPaymentMethod.parseStr("pix").getKey());

        switch (formaPgto) {
            case PIX:
                System.out.println("Selecionado PIX");
                System.out.println(formaPgto.getDescription());
            case CARTAO:
                System.out.println("Selecionado CARTAO");
                System.out.println(EnumPaymentMethod.CARTAO.getDescription());
            case BOLETO:
                System.out.println("Selecionado BOLETO");
                System.out.println(EnumPaymentMethod.BOLETO.getDescription());
                break;
        }

    }

}
