package segundobi.exemplos.aulaseis;

public class ProcessaFolhaPgto {
    
    public void execute (Estagiario estagiario, Pj pj, Clt clt) {

        if (estagiario != null){
            System.out.println("Calculando folha... estag");
            System.out.println((estagiario.getSalario() + (estagiario.getSalario() * 0.01) - 100d));
        } else if (pj != null) {
            System.out.println("Folha do pj");
            System.out.println(pj.getSalario());
        } else if (clt != null) {
            System.out.println("clt");
            System.out.println(clt.getSalario() /2);
        }
    }{

    }

    public void execute(Object object, segundobi.exemplos.aulaseis.Pj pj2, Object object2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }
}
