 
package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class automovil extends vh_terrestre {
    public automovil(){}
    
    private String tipo,altura,ancho;
    private int  llantas;

    public automovil(String tipo, String altura, String ancho, int llantas, int capacidad, String color, String modelo, String placas, String marca, String matricula, int puerta, int asientos) {
        super(capacidad, color, modelo, placas, marca, matricula, puerta, asientos);
        this.tipo = tipo;
        this.altura = altura;
        this.ancho = ancho;
        this.llantas = llantas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    
    
    public void arrancar(){}
    public void acelerar(){}
    public void frenar(){}
    public void parar(){}
    public void pAutomatico(){}
    public void encender(){}
    public void security(){}
    
}
