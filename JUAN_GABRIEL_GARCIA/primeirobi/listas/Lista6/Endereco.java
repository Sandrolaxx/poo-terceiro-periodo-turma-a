package primeirobi.listas.Lista6;

public class Endereco {
    
    String
        estado,
        cidade,
        bairro,
        rua,
        numero,
        complemento;
    
    public void apresentarLogradouro() {
        
        String msg = " Estado: " + estado + "\n Cidade: "
         + cidade + "\n Bairro: " + bairro + "\n Rua: " + rua + "\n Numero: " 
         + numero + "\n Complemento: " + complemento + "\n";

         System.out.println(msg);
    }
}
