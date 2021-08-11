package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Moto extends vh_terrestre{
    public Moto(){}
    private String tipo,velocidad;
    private int llantas;

    public Moto(String tipo,String placas, String marca,String modelo, int llantas, int capacidad, String color,   int puerta,String velocidad,  int asientos) {
        super(capacidad, color, modelo, placas, marca, puerta, asientos);
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.llantas = llantas;
    }

 
 // 2008 c4560 
    public void arrancar(){}
    public void acelerar(){}
    public void frenar(){}
    public void parar(){}
    public void encender(){}
    public void security(){}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

   
    
}
