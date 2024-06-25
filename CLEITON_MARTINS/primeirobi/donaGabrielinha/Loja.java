package primeirobi.donaGabrielinha;

public class Loja
    {
        public String nomeFantasia;
    
        public String razaoSocial;
    
        public String cnpj;
    
        public Endereço endereço;

        public Integer[] arrayVendedores = new Integer[3];

        public Integer[] arrayClientes = new Integer[3];

        public void apresentarse()
        {
            String mensagem = "Olá! Nós somos " + nomeFantasia + " de CNPJ " + " no endereço " + endereço;
            System.out.println(mensagem);
        }
    }