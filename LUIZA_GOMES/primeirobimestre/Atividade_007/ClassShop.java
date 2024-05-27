package Atividade_007;

import java.util.List;

public class ClassShop { // Atributos, nome fantasia, razão social, cpnj, cidade, bairro, rua, array
                         // vendedores, array de clientes.

    private String nomeFantasia;
    private String corporateName;
    private int cnpj;
    private String city;
    private String ngbh;
    private String street;
    private List<String> clientes;
    private List<String> vendedores;

    public ClassShop(String nomeFantasia, String corporateName, int cnpj, String city, String ngbh, String street,
            List<String> clientes, List<String> vendedores) {
        this.nomeFantasia = nomeFantasia;
        this.corporateName = corporateName;
        this.cnpj = cnpj;
        this.city = city;
        this.ngbh = ngbh;
        this.street = street;
        this.clientes = clientes;
        this.vendedores = vendedores;
    }

    void countCustomer() {
        System.out.println("Total clientes: " + clientes.size());
        System.out.println(clientes);

    }

    void countSeller() {
        System.out.println("Total vendedores: " + vendedores.size());
        System.out.println(vendedores);
    }

    void apresentarse() {
        System.out.println("Nome fantasia: " + nomeFantasia + ", CNPJ " + cnpj + ", endereço: " + street + "\t" + ngbh
                + "\t" + city);

    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNgbh() {
        return ngbh;
    }

    public void setNgbh(String ngbh) {
        this.ngbh = ngbh;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public List<String> getClientes() {
        return clientes;
    }

    public void setClientes(List<String> clientes) {
        this.clientes = clientes;
    }

    public List<String> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<String> vendedores) {
        this.vendedores = vendedores;
    }

}
