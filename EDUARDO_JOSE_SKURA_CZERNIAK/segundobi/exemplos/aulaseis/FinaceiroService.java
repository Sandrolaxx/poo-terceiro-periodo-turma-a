package segundobi.exemplos.aulaseis;

public class FinaceiroService implements IGerarRelatorio{
    
    @Override
    public void gerarPDF() {
        System.out.println("Gerando PDF no Financeiro");
    }

    @Override
    public void gerarExcel() {
        throw new UnsupportedOperationException("Unimplemented method 'gerarExcel'");
    }
}
