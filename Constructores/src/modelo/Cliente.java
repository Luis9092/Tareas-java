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
public class Cliente extends Persona {
    private String nit;
public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
    public void agregar(){
    System.out.println("Nit: "+getNit());
    System.out.println("Nombres: "+getNombres());
    System.out.println("Apellidos: "+getApellidos());
    System.out.println("Direccion: "+getDireccion());
    System.out.println("Telefono: "+getTelefono());
    System.out.println("Fecha de nacimiento: "+getFecha_nacimiento());
    System.out.println("--------------------------------------------------- ");
    
    }
    @Override
    public void modificar(){
    System.out.println("--------------------------------------------------- ");
    System.out.println("----   Metodo Modificar   ----");
    System.out.println("--------------------------------------------------- ");
    System.out.println("Nit: "+getNit());
    System.out.println("Nombres: "+getNombres());
    System.out.println("Apellidos: "+getApellidos());
    System.out.println("Direccion: "+getDireccion());
    System.out.println("Telefono: "+getTelefono());
    System.out.println("Fecha de nacimiento: "+getFecha_nacimiento());
    
    }
    
    public void eliminar(){
        
    }
}
