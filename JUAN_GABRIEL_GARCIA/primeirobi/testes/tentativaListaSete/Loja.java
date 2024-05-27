package primeirobi.testes.tentativaListaSete;

public class Loja { // tava com extends endereço
    
    private String nomeFantasia;

    private String razaoSocial;

    private String CPNJ;

    private String[] vetorVendedores = new String[100];

    private String[] vetorClientes = new String[100];

    private int i = 0;
    private int contadorClientes = 0;
    private int contadorVendedores = 0;

    Endereco endereco;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCPNJ() {
        return CPNJ;
    }

    public void setCPNJ(String cPNJ) {
        CPNJ = cPNJ;
    }

    public String[] getVetorVendedores() {
        return vetorVendedores;
    }

    public void setVetorVendedores(String vetorVendedores, int i) {
        this.vetorVendedores[i] = vetorVendedores;
    }

    public String[] getVetorClientes() {
        return vetorClientes;
    }

    public void setVetorClientes(String vetorClientes, int i) {
        this.vetorClientes[i] = vetorClientes;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getContadorClientes() {
        return contadorClientes;
    }

    public void setContadorClientes(int contadorClientes) {
        this.contadorClientes = contadorClientes;
    }

    public int getContadorVendedores() {
        return contadorVendedores;
    }

    public void setContadorVendedores(int contadorVendedores) {
        this.contadorVendedores = contadorVendedores;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void apresentarse() {

        String msg = "\nEndereço da loja: " + nomeFantasia + " - CNPJ: " + CPNJ;

        System.out.println(msg);
        endereco.apresentarLogradouro();  
    }

    public void contarClientes() {

        while (i < vetorClientes.length) {
            
            if (vetorClientes[i] == null) {
                break;
            }
            contadorClientes++;
            i++;

        }
        System.out.println("A quantidade de clientes que a empresa possui é: " + contadorClientes);
    }

    public void contarVendedores() {
        int i = 0;
        while (i < vetorVendedores.length) {
            
            if (vetorVendedores[i] == null) {
                break;
            }
            contadorVendedores++;
            i++;

        }
        System.out.println("A quantidade de vendedores que a empresa possui é: " + contadorVendedores + "\n");
    }
}

/* 
Crie uma classe Loja com:
Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array vendedores, array de clientes. ##
contarClientes, mosta a quantidade de clientes ##
contarVendedores, mosta a quantidade de vendedores. ##
Método apresentarse, printa nomeFantasia, cnpj e endereco. ##
*/