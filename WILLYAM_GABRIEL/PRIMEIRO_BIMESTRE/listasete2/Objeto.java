package listasete2;

import java.util.ArrayList;
import java.util.Date;

class Objeto
 {    
    int id;
    
    protected Objeto(int id) {
        this.id = id;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void apresentarSe() {
        System.out.println("METODO NAO IMPLEMENTADO");
    }
}
