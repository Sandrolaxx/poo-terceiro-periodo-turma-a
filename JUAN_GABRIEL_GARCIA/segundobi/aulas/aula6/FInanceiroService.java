package segundobi.aulas.aula6;

public class FInanceiroService implements IGerarRelatorioExcel,
    IGerarRelatorioPDF{

    @Override
    public void gerarPDF() {
       System.out.println("Gerando PDF fincaneiro!");
    }

    @Override
    public void gerarExcel() {
        System.out.println("Gerando Excel fincaneiro!");
    }
    
}
