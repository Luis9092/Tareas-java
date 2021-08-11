 
package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Avion extends vh_aereo{
  public Avion(){}
    private     String  capacidad,velocidad;

    public Avion(String tipo_avion,String placas, String marca,String modelo, int llantas, String capacidad, String color,   int puerta,String velocidad,  int asientos) {
        super(tipo_avion, llantas, color, modelo, placas, marca, puerta, asientos);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    
   public void volar(){}
  public void despegar(){}
  public void aterrizar(){}
  public void pAutomatico(){}

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

   

   

}
