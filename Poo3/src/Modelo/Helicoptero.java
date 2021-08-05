package Modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Helicoptero extends vh_aereo {
  
    private String ametralladora,lanzamisil,lanzallamas,bomba_agua;
    public Helicoptero(){}

    public Helicoptero(String ametralladora, String lanzamisil, String lanzallamas, String bomba_agua) {
        this.ametralladora = ametralladora;
        this.lanzamisil = lanzamisil;
        this.lanzallamas = lanzallamas;
        this.bomba_agua = bomba_agua;
    }
    
   
    public String getAmetralladora() {
        return ametralladora;
    }

    public void setAmetralladora(String ametralladora) {
        this.ametralladora = ametralladora;
    }

    public String getLanzamisil() {
        return lanzamisil;
    }

    public void setLanzamisil(String lanzamisil) {
        this.lanzamisil = lanzamisil;
    }

    public String getLanzallamas() {
        return lanzallamas;
    }

    public void setLanzallamas(String lanzallamas) {
        this.lanzallamas = lanzallamas;
    }

    public String getBomba_agua() {
        return bomba_agua;
    }

    public void setBomba_agua(String bomba_agua) {
        this.bomba_agua = bomba_agua;
    }
    
    
    
    public void volar(){}
    public void despegar(){}
    public void aterrizar(){}

}
