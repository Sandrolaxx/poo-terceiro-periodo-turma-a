package PRIMEIRO_BIMESTRE.lists.Lista5;

public class Loja {
    String popularName;
    String socialReason;
    String cnpj;
    String city;
    String block;
    String street;
    String[] sellers = new String[100];
    String[] customers = new String[1000];

    public void countCustomers(){
        System.out.println("A loja tem " + customers.length + " clientes");
    }

    public void countSellers(){
        System.out.println("A loja tem " + sellers.length + " vendedores");
    }

    public void presentation(){
        System.out.println("Nome fantasia: ".concat(popularName));
        System.out.println("CNPJ: ".concat(cnpj));
        System.out.println("Rua ".concat(street).concat(", bairro: ")
        .concat(block).concat(", ".concat(city)));
    }
}
