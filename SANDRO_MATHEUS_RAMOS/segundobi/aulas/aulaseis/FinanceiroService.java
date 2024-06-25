package segundobi.aulas.aulaseis;

public class FinanceiroService implements IGerarRelatorioPdf,
        IGerarRelatorioExcel {

    @Override
    public void gerarPDF() {
        System.out.println("Gerando PDF financeiro!");
    }

    @Override
    public void gerarExcel() {
        System.out.println("Gerando Excel financeiro!");
    }

}
