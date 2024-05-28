package segundobimestre.listas.Classe;

public enum EnumPay {
    
    PIX("PIX", "Pagamento"),
    CARTAO("CARTAO"),
    BOLETO("BOLETO");

    private String key;

    private String description;


    EnumPay(String key) {
        this.key = key;
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }
}
