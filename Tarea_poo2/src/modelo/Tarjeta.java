
package modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Tarjeta extends Vehiculo{
    private String no_tarjeta,uso;
private String operaciones;
    public Tarjeta(){}

    public Tarjeta(String operaciones) {
        this.operaciones = operaciones;
    }

    public Tarjeta(String no_tarjeta, String uso, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea, String asientos, String tipo) {
        super(placa, chasis, serie, motor, cilindros, marca, modelo, linea, asientos, tipo);
        this.no_tarjeta = no_tarjeta;
        this.uso = uso;
    }
 
   

    public String getNo_tarjeta() {
        return no_tarjeta;
    }

    public void setNo_tarjeta(String no_tarjeta) {
        this.no_tarjeta = no_tarjeta;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
    
    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }

  public void agregar(){
      System.out.println("--------------------    L I C E N S I A     --------------------------");
    System.out.println("No de Tarjeta: "+this.getNo_tarjeta());
   System.out.println("Uso: "+this.getUso());
   System.out.println("\n----------------   C A R A C T E R I S T I C A S     --------------------");
   
    System.out.println("Placa: "+this.getPlaca());
    System.out.println("Chasis: "+this.getChasis());
    System.out.println("Serie: "+this.getSerie());
    System.out.println("Motor: "+this.getMotor());
    System.out.println("Cilindros: "+this.getCilindros());
    System.out.println("Marca: "+this.getMarca());
    System.out.println("Modelo: "+this.getModelo());
    System.out.println("Linea: "+this.getLinea());
    System.out.println("Asientos: "+this.getAsientos());
   System.out.println("-------------------------------------------------------------------------\n");
//  System.out.println("Tipo: "+this.getTipo());
  
  }
    @Override
    public void mostrar(){}
    
    /**
     *
     */
    @Override
    public void operation(){

//        if (miTextField.getText().equals(Cadena)){
   String vehiculo []={"motocicleta","carro","tractor","avion","barco,velero"};
        String funcion []={"Corre a 30 km/h", "2da y 3ra. Velocidad","Abrir compuerta","Frenar","Bagon","Acelerar","Volar de un lugar a otro","Aterrizar","Flotar","Girar"};
   String ss = getOperaciones();
   // if (ss==moto[0]){
   switch(ss){
       
       case "carro":
   System.out.println("Sus operaciones son: ");
    System.out.println(""+funcion[5]);
    System.out.println(""+funcion[3]);
    System.out.println(""+funcion[1]);
    System.out.println(""+funcion[2]);
    break;
    case "motocicleta":
   System.out.println("Sus operaciones son: ");
    System.out.println(""+funcion[5]);
    System.out.println(""+funcion[3]);
    System.out.println(""+funcion[1]);
    break;
     case "trailer":
   System.out.println("Sus operaciones son: ");
    System.out.println(""+funcion[5]);
    System.out.println(""+funcion[3]);
    System.out.println(""+funcion[2]);
    System.out.println(""+funcion[1]);
    System.out.println(""+funcion[4]);
    
    break;
     case "avion":
   System.out.println("Sus operaciones son: ");
    System.out.println(""+funcion[5]);
    System.out.println(""+funcion[3]);
    System.out.println(""+funcion[1]);
    System.out.println(""+funcion[6]);
    System.out.println(""+funcion[7]);
  
    break;
     case "barco":
    System.out.println("Sus operaciones son: ");
    System.out.println(""+funcion[8]);
    System.out.println(""+funcion[9]);
    System.out.println(""+funcion[3]);
    System.out.println(""+funcion[5]);
    
  break;
     default: System.out.println("Operaciones no encontradas :3");
  
   }
   // } 
/*
    if (ss.equals(moto[1])){
  System.out.println("\n----------------        O P E R A C I O N E S         --------------------");
  System.out.println("s"+Motocicleta[0]);
System.out.println("s"+Motocicleta[1]);

  }

    }
    */
}
}