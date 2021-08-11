package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Helicoptero extends vh_aereo {
  
    private String Capacidad_tripulante;
    public Helicoptero(){}

    public Helicoptero( String tipo_avion, String placas, String marca,String modelo, int llantas,String Capacidad_tripulante, String color,  int puerta, int asientos) {
        super(tipo_avion, llantas, color, modelo, placas, marca, puerta, asientos);
        this.Capacidad_tripulante = Capacidad_tripulante;
    }

    public String getCapacidad_tripulante() {
        return Capacidad_tripulante;
    }

    public void setCapacidad_tripulante(String Capacidad_tripulante) {
        this.Capacidad_tripulante = Capacidad_tripulante;
    }


  
}
