package Atividade_007;

public class ClassEndereco {

    private String state;
    private String city;
    private String ngbh;
    private String number;
    private String complement;

    //construtor
    public ClassEndereco(String state, String city, String ngbh, String number, String complement) {
        this.state = state;
        this.city = city;
        this.ngbh = ngbh;
        this.number = number;
        this.complement = complement;
    }

    public void apresentarLogradouro() {

        System.out.println("estado:" + state + "\ncidade:" + city + "\nbairro:" + ngbh + "\nnumero:" + number + "\ncomplemento:" + complement);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    
}
