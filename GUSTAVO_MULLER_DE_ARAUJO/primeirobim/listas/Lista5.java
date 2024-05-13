package primeirobim.listas;

public class Lista5 {

    public static void main(String[] args) {

    Loja loja1 = new Loja();

    loja1.nomeFantasia = "MyyPlant";
    loja1.razaoSocial = "PlantGA";
    loja1.cnpj = "123.456.789-01";
    loja1.cidade = "Tuiutí ";
    loja1.bairro = "Sei lá ";
    loja1.rua = "Não Sei";
    loja1.apresentarse();

    Cliente cliente1 = new Cliente();

    cliente1.nome = "Cleiton";
    cliente1.idade = 21;
    cliente1.cidade = "Pacaembu";
    cliente1.bairro= "Neimar";
    cliente1.rua= "Diadora";
    cliente1.apresentarse();
    loja1.addCliente(cliente1);

    Cliente cliente2 = new Cliente();

    cliente2.nome = "Miguel";
    cliente2.idade = 18;
    cliente2.cidade = "São Paulo";
    cliente2.bairro= "Itaquera";
    cliente2.rua= "Vasco";
    cliente2.apresentarse();
    loja1.addCliente(cliente2);

    Vendedor vendedor1 = new Vendedor();

    vendedor1.nome = "Vitor";
    vendedor1.idade = 30;
    vendedor1.cidade = "Santos";
    vendedor1.bairro = "Coqueiral";
    vendedor1.rua = "Pedro Miranda";
    vendedor1.loja=loja1;
    vendedor1.salarioBase = 1000;
    vendedor1.salarioRecebido = new double[]{1200, 1300, 1400};
    vendedor1.media = (vendedor1.salarioRecebido[0] +vendedor1.salarioRecebido[1] +vendedor1.salarioRecebido[2]) / 3;
    vendedor1.apresentarse();
    vendedor1.apresentarse2();
    loja1.addVendedor(vendedor1);

    Vendedor vendedor2 = new Vendedor();

    vendedor2.nome = "Altair";
    vendedor2.idade = 39;
    vendedor2.cidade = "Cascavel";
    vendedor2.bairro = "Veneza";
    vendedor2.rua = "Insumos";
    vendedor2.loja=loja1;
    vendedor2.salarioBase = 1500;
    vendedor2.salarioRecebido = new double[]{1000, 1500, 2000};
    vendedor2.media = (vendedor2.salarioRecebido[0] +vendedor2.salarioRecebido[1] +vendedor2.salarioRecebido[2]) / 3;
    vendedor2.apresentarse();
    vendedor2.apresentarse2();
    loja1.addVendedor(vendedor2);
}

}