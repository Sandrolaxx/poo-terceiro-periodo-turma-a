package Testes.Telefone;

public class App {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("4002 8922");
        telefone.getContatos();
        Contato contatoA = new Contato("Luiz", "45 998624638");
        Contato contatoB = new Contato("Rafa", "45 489744669");
        Contato contatoC = new Contato("Luan", "45 912453682");


        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);


        System.out.println("Contatos filtrados: ");
        System.out.println(telefone.getContatos().buscar("Lu"));
    }
}
