package PRIMEIRO_BIMESTRE.lists.Lista6.lista6;

public class Loja extends Endereco {
    private String popularName;
    private String socialReason;
    private String cnpj;
    private String[] sellers = new String[100];
    private String[] customers = new String[1000];

    public Loja(String popularName, String socialReason, String cnpj) {
        this.popularName = popularName;
        this.socialReason = socialReason;
        this.cnpj = cnpj;
    }

    public void countCustomers() {
        int x = 0;
        int qttCustomers = 0;
        while (x < customers.length) {
            if (customers[x] == null) {
                break;
            }
            qttCustomers++;
            x++;
        }
        System.out.println("A loja tem " + qttCustomers + " clientes");
    }

    public String getPopularName() {
        return popularName;
    }

    public void setPopularName(String popularName) {
        this.popularName = popularName;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String[] getSellers() {
        return sellers;
    }

    public void setSellers(String[] sellers) {
        this.sellers = sellers;
    }

    public String[] getCustomers() {
        return customers;
    }

    public void setCustomers(String[] customers) {
        this.customers = customers;
    }

    public void countSellers() {
        int x = 0;
        int qttSellers = 0;
        while (x < sellers.length) {
            if (sellers[x] == null) {
                break;
            }
            qttSellers++;
        }
        System.out.println("A loja tem " + qttSellers + " vendedores");
    }

    public void presentation() {
        System.out.println("Nome fantasia: ".concat(popularName));
        System.out.println("CNPJ: ".concat(cnpj));
        System.out.println("Rua ".concat(getStreet()).concat(", bairro: ")
                .concat(getBlock()).concat(", ".concat(getCity())));
    }
}
