 
package modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Persona extends Propietario{
   private String nombres,apellidos,direccion, fecha_dia,fecha_mes,fechaanio;
private int telefono;
private int edad;
public Persona(){}
    public Persona(String nit, double cui,String nombres, String apellidos,int telefono, String direccion, String fecha_dia, String fecha_mes, String fechaanio ) {
        super(nit, cui);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fecha_dia = fecha_dia;
        this.telefono = telefono;
        this.fecha_mes = fecha_mes;
        this.fechaanio = fechaanio;
        
    }

    public Persona(int edad) {
        this.edad = edad;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacido() {
        return fecha_dia;
    }

    public void setFecha_nacido(String fecha_dia) {
        this.fecha_dia = fecha_dia;
    }
  public String getFecha_mes() {
        return fecha_mes;
    }

    public void setFecha_mes(String fecha_mes) {
        this.fecha_mes = fecha_mes;
    }
    
      public String getFechaanio() {
        return fechaanio;
    }

    public void setFechaanio(String fechaanio) {
        this.fechaanio = fechaanio;
    }


    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public String getFecha_dia() {
        return fecha_dia;
    }

    public void setFecha_dia(String fecha_dia) {
        this.fecha_dia = fecha_dia;
    }
   
    
    
 @Override
   public void agregar(){
   System.out.println("----------------  D A T O S    D E   L A   P E R S O N A ----------------");
    System.out.println("Nit: "+this.getNit());
   System.out.println("CUI: "+this.getCui());
   System.out.println("Nombres: "+this.getNombres());
   System.out.println("Apellidos: "+this.getApellidos());
   System.out.println("Telefono: "+this.getTelefono());
System.out.println("Direccion: "+this.getDireccion());
   System.out.println("Fecha de Nacimiento: "+this.getFecha_dia()+"-"+this.getFecha_mes()+"-"+this.getFechaanio());
   System.out.println("------------------------------------------------------------------------");
   
   }
   public void edad(){
   System.out.println("-------------------------------  E D A D --------------------------------");
   
  System.out.println("Su edad es: "+this.getEdad()+" años");
   }

   
}


