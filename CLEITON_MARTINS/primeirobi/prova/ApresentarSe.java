package CLEITON_MARTINS.primeirobi.prova;

public class ApresentarSe 
{
    public void menuInicial()
    {
        String mensagem = "Dado às informações abaixo, escolha sua ação: "
            .concat("1 - Cadastrar Aluno: ")
            .concat("2 - Cadastrar Livro: ")
            .concat("3 - Emprestar Livro: ")
            .concat("4 - Devolver Livro: ");
        System.out.println(mensagem);
    }    
}
