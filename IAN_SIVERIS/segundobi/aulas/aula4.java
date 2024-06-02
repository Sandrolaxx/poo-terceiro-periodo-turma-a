package segundobi.aulas;

public class aula4 {

    public class Caixa<T> {
         private T conteudo;

    public T getConteudo() { 
        return conteudo;
}
public void setConteudo(T conteudo) {
    this.conteudo = conteudo;
}

public Caixa (T conteudo) { 
    this.conteudo = conteudo;

    }
}
}
