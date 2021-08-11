 
package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class vh_aereo extends Vehiculo{
    public vh_aereo(){}
    private String tipo_avion;
private int llantas;
   
    
    

     public void volar(){}
    public void despegar(){}
    public void aterrizar(){}
    public void pAutomatico(){}

    public vh_aereo(String tipo_avion, int llantas, String color, String modelo, String placas, String marca, int puerta, int asientos) {
        super(color, modelo, placas, marca, puerta, asientos);
        this.tipo_avion = tipo_avion;
        this.llantas = llantas;
    }

    public String getTipo_avion() {
        return tipo_avion;
    }

    public void setTipo_avion(String tipo_avion) {
        this.tipo_avion = tipo_avion;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

  

}
