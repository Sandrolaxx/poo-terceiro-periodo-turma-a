package PRIMEIRO_BIMESTRE.prova;

import java.util.Date;

public class Livro {
    private String name, writer;
    private Boolean disponible = false;
    private Date day;

    public Livro(String name, String writer) {
        this.setName(name);
        this.setWriter(writer);
        this.setDisponible(getDisponible());
    }

    public Date getDay() {
        return this.day;
    }

    public void setDay() {
        this.day = new Date();
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = !disponible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

}
