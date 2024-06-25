package SEGUNDO_BIMESTRE.aulas.SOLID;

public class FinanceiroService implements IGerarRelatorioPDF, IGerarRelatorioExcel{

    @Override
    public void gerarPDF() {
        
        System.out.println("Gerando PDF financeiro");

    }

    @Override
    public void gerarExcel() {
        
        System.out.println("Gerando excel financeiro");

    }
    


}
