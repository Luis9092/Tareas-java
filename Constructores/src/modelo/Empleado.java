/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Empleado extends Persona{
   private String codigo_empleado,puesto;
public Empleado(){}
    public Empleado(String codigo_empleado, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo_empleado = codigo_empleado;
        this.puesto = puesto;
    }

   
    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
   @Override
   public void agregar(){
   System.out.println("Codigo: "+this.getCodigo_empleado());
   System.out.println("Nombres: "+this.getNombres());
   System.out.println("Apellidos: "+ this.getApellidos());
   System.out.println("Telefono: "+this.getTelefono());
   System.out.println("Dirección: "+this.getDireccion());
   System.out.println("Fecha de nacimiento: "+this.getFecha_nacimiento());
   System.out.println("Puesto: "+this.getPuesto());
  System.out.println("----------------------------------------------------");
}
   @Override
   public void modificar(){
    System.out.println("----------------------------------------------------");
  System.out.println("\t\tMetodo Modificar");
 System.out.println("Codigo: "+this.getCodigo_empleado());
   System.out.println("Nombres: "+this.getNombres());
   System.out.println("Apellidos: "+ this.getApellidos());
   System.out.println("Telefono: "+this.getTelefono());
   System.out.println("Dirección: "+this.getDireccion());
   System.out.println("Fecha de nacimiento: "+this.getFecha_nacimiento());
   System.out.println("Puesto: "+this.getPuesto());
  
   }   
   @Override
   public void eliminar(){
    
}
}
