package primeirobi.atividade07;

public class Item {

    /*Atribuitos id, nome, tipo, valor*/
    private Integer id;
    private String tipo;
    private String nome;

    private Double valor;

    public void dadosFakes() {
        System.out.println("iD : 1");
        System.out.println("Nome: girasol");
        System.out.println("Tipo : Flor");
        System.out.println("Valor : 7");
    }

    public void listarItens() {
        System.out.println("iD : 1, Nome: girasol, Tipo : Flor, Valor : 7 "); 
        System.out.println("iD : 2, Nome: Cacto, Tipo : Planta, Valor : 2 "); 
        System.out.println("iD : 3, Nome: PoliHúmus, Tipo : Fertilizante, Valor : 9 "); 
    }



    public void imprimee(){

        System.out.println(this.id+""+this.nome+": "+ this.valor);
       }




    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getValor() {
        return valor;
    }


    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}