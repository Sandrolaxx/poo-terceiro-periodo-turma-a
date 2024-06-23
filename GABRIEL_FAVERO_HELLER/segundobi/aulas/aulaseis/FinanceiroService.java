package segundobi.aulas.aulaseis;

public class FinanceiroService implements IGerarRelatorio {

    @Override
    public void gerarPDF() {
        System.out.println("Gerando PDF financeiro!");
    }

    @Override
    public void gerarExcel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gerarExcel'");
    }
    
}
