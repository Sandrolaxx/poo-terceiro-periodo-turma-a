package Testes.Telefone;

import java.util.ArrayList;

public class Contatos {
    private ArrayList <Contato> contatos;

    public Contatos() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionar(String nome, String numero){
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }

    public void adicionar (Contato novoContato){
        contatos.add(novoContato);
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        String informacao = "Contatos: \n";
        for (Contato contato : contatos) {
            informacao += contato.toString() + "\n";
        }
        return informacao;
    }

    public Contatos buscar(String palavraChave){
        Contatos contatosFiltrados = new Contatos();
        for (Contato contato : contatos) {
            String nomeContato = contato.getNome();
            if(nomeContato.startsWith(palavraChave)){
                contatosFiltrados.adicionar(contato);
            }
        }
        return contatosFiltrados;
    }
}
