 
package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class vh_aereo extends Vehiculo{
    public vh_aereo(){}
    private String Turbinas,tipo_avion;

    public vh_aereo(String Turbinas, String tipo_avion, String color, String modelo, String placas, String marca, String matricula, int puerta, int asientos) {
        super(color, modelo, placas, marca, matricula, puerta, asientos);
        this.Turbinas = Turbinas;
        this.tipo_avion = tipo_avion;
    }
   
    public String getTurbinas() {
        return Turbinas;
    }

    public void setTurbinas(String Turbinas) {
        this.Turbinas = Turbinas;
    }

    public String getTipo_avion() {
        return tipo_avion;
    }

    public void setTipo_avion(String tipo_avion) {
        this.tipo_avion = tipo_avion;
    }
    
       public void volar(){}
    public void despegar(){}
    public void aterrizar(){}
    public void pAutomatico(){}
}
