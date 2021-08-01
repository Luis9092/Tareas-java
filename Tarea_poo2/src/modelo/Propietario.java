package modelo;

public class Propietario {
    private String nit;
    private double cui;
public Propietario(){}
    public Propietario(String nit, double cui) {
        this.nit = nit;
        this.cui = cui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getCui() {
        return cui;
    }

    public void setCui(double cui) {
        this.cui = cui;
    }

    public void agregar(){}
}
