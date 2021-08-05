 
package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Avion extends vh_aereo{
  public Avion(){}
    private     String  capacidad,velocidad;

    public Avion(String capacidad, String velocidad) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }  

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

     public void volar(){}
  public void despegar(){}
  public void aterrizar(){}
public void pAutomatico(){}
 
}
