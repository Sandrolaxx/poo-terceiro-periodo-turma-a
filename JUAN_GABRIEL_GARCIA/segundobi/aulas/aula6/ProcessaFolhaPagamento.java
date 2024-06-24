package segundobi.aulas.aula6;

public class ProcessaFolhaPagamento {
    
    public void execute(Estagiario estagiario, Pj pj, Clt clt) {

        if (estagiario != null) {
            System.out.println("Calculando folha do estagiario");
            System.out.println((estagiario.getSalario() * 0.01) - 100d);
        }
        else if (pj != null) {
            System.out.println("Calculando folha do pj");
            System.out.println(pj.getSalario());
        }
    }
}
