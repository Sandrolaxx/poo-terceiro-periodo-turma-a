import java.util.ArrayList;

public class CasoJudicial {
    private Cliente cliente; //Cliente associado ao caso
    private int tipo;
    private boolean faltaDocumento;
    private ArrayList<String> listaDocumentos;
    private String casoTexto;
    private boolean temAdvogado;
    private ArrayList<Advogado> advogados; //lista de advogados associados ao caso

    public CasoJudicial(Cliente cliente, int tipo, boolean faltaDocumento, ArrayList<String> listaDocumentos, String casoTexto) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.faltaDocumento = faltaDocumento;
        this.listaDocumentos = listaDocumentos;
        this.casoTexto = casoTexto;
        this.temAdvogado = false;
        this.advogados = new ArrayList<>();
    }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public int getTipo() { return tipo; }
    public void setTipo(int tipo) { this.tipo = tipo; }

    public boolean isFaltaDocumento() { return faltaDocumento; }
    public void setFaltaDocumento(boolean faltaDocumento) { this.faltaDocumento = faltaDocumento; }

    public ArrayList<String> getListaDocumentos() { return listaDocumentos; }
    public void setListaDocumentos(ArrayList<String> listaDocumentos) { this.listaDocumentos = listaDocumentos; }

    public String getCasoTexto() { return casoTexto; }
    public void setCasoTexto(String casoTexto) { this.casoTexto = casoTexto; }

    public boolean isTemAdvogado() { return temAdvogado; }
    public void setTemAdvogado(boolean temAdvogado) { this.temAdvogado = temAdvogado; }

    public ArrayList<Advogado> getAdvogados() { return advogados; }
    public void adicionarAdvogado(Advogado advogado) {
        this.advogados.add(advogado);
        this.temAdvogado = true;
    }
    
    // Método para adicionar caso
    public void adicionarCaso() {
        // Implementação da lógica para adicionar caso
    }

}
