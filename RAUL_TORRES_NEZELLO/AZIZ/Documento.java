public class Documento {
    private String nomeDocumento;
    private String conteudoDocumento;

    public Documento(String nomeDocumento, String conteudoDocumento) {
        this.nomeDocumento = nomeDocumento;
        this.conteudoDocumento = conteudoDocumento;
    }


    public String getNomeDocumento() { return nomeDocumento; }
    public void setNomeDocumento(String nomeDocumento) { this.nomeDocumento = nomeDocumento; }

    public String getConteudoDocumento() { return conteudoDocumento; }
    public void setConteudoDocumento(String conteudoDocumento) { this.conteudoDocumento = conteudoDocumento; }
}