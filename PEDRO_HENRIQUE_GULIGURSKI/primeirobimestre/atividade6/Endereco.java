package primeirobimestre.atividade6;

public class Endereco {
    
    String estado;
    String cidade;
    String bairro;
    String numero;
    String complemento;

    public Endereco(String estado, String cidade, String bairro, String numero, String complemento){
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String apresentarLogradouro(){
        String msg = "Endereço: "
                .concat("Estado: "+estado)
                .concat("Cidade: "+cidade)
                .concat("Bairro: "+bairro)
                .concat("Número: "+numero)
                .concat("'"+complemento+"'");
        System.out.println(msg);
        return msg;
    }  

}
