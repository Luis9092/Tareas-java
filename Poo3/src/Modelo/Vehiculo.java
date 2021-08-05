 
package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
abstract class Vehiculo {
    
    public Vehiculo(){}
  
    private String color, modelo,placas,marca, matricula,tipo,motor;
    private int puerta, asientos;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public Vehiculo(String color, String modelo, String placas, String marca, String matricula, int puerta, int asientos) {
        this.color = color;
        this.modelo = modelo;
        this.placas = placas;
        this.marca = marca;
        this.matricula = matricula;
        this.puerta = puerta;
        this.asientos = asientos;
    }
    
   
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
    }


    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    
    
   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
 
    public void arrancar(){}
    public void acelerar(){}
    public void frenar(){}
    public void parar(){}
}
