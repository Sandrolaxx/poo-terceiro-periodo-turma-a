package segundobi.aulas.aulaquatro;

public enum EnumPaymentMethod {

    PIX("PIX", "Pagamentos Instantaneos"),
    CARTAO("CARTAO", "Cartão débito"),
    BOLETO("BOLETO", "Boleto");

    private String key;

    private String description;

    EnumPaymentMethod(String key, String description) {
        this.key = key;
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    public static EnumPaymentMethod parseStr(String strEnum) {
        for (EnumPaymentMethod value : EnumPaymentMethod.values()) {
            if (value.getKey().equalsIgnoreCase(strEnum)) {
                return value;
            }
        }

        return null;
    }

}
