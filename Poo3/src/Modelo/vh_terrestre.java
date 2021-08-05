 
package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class vh_terrestre extends Vehiculo {
    private int  capacidad; 
    
    public vh_terrestre(){}

    public vh_terrestre(int capacidad, String color, String modelo, String placas, String marca, String matricula, int puerta, int asientos) {
        super(color, modelo, placas, marca, matricula, puerta, asientos);
       this.capacidad = capacidad;
    }
    
    
    public void arrancar(){}
    public void acelerar(){}
    public void frenar(){}
    public void parar(){}
    public void encender(){}
    public void security(){}
    

}
