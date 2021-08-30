/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Timestamp;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Empleado extends Persona {

    private String codigo_empleado, puesto;
    private int id;
    Conexion cn;

    public Empleado() {
    }

    public Empleado(int id, String codigo_empleado, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, String puesto) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo_empleado = codigo_empleado;
        this.puesto = puesto;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void agregar() {

        try {
            PreparedStatement parametro;
            String query = "INSERT INTO empleados(codigo,nombres,apellidos,direccion,telefono,Fecha_nacimiento,id_puesto)VALUES(?,?,?,?,?,?,?);";
            cn = new Conexion();
            cn.abrirCon();
            parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
            parametro.setString(1, getCodigo_empleado());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setString(7, getPuesto());
            int executar = 0;
            executar = parametro.executeUpdate();
            cn.cerrarCon();
            JOptionPane.showMessageDialog(null, Integer.toString(executar) + " Ingreso Exitoso!! ", "Guardado", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException ex) {
            System.out.println("-- Error --" + ex.getMessage());
        }
    }

    public DefaultTableModel Leer() {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            cn = new Conexion();
            cn.abrirCon();
            String query;
            //        query="select idempleado as id,codigo,nombres,apellidos,direccion,telefono,Fecha_nacimiento,id_puesto from empleados;";
            query = "SELECT r.idempleado,r.codigo,r.nombres,r.apellidos,r.direccion,r.telefono,r.Fecha_nacimiento,g.puesto FROM empleados as r inner join puestos as g on r.id_puesto = g.idpuestos;";
            ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
            String encabezado[] = {"Id", "Código", "Nombres", "Apellidos", "Dirección", "Teléfono", "Nacimiento", "Puesto"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[8];
            while (consulta.next()) {
                datos[0] = consulta.getString("r.idempleado");
                datos[1] = consulta.getString("r.codigo");
                datos[2] = consulta.getString("r.nombres");
                datos[3] = consulta.getString("r.apellidos");
                datos[4] = consulta.getString("r.direccion");
                datos[5] = consulta.getString("r.telefono");
                datos[6] = consulta.getString("r.Fecha_nacimiento");
                datos[7] = consulta.getString("g.puesto");

                tabla.addRow(datos);
            }
            cn.cerrarCon();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return tabla;
    }

    
    @Override
    public void modificar() {

                String g = "";

        try {
            cn = new Conexion();
            cn.abrirCon();
            String query;
            int f = this.getId();
            String gg = Integer.toString(f);

            query = "select id_puesto from empleados where idempleado = " + gg + "";
            ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);

            while (consulta.next()) {
                g = consulta.getString("id_puesto");

            }
      //      JOptionPane.showMessageDialog(null, g + " Registro Eliminado!! ", "\tEliminar", JOptionPane.INFORMATION_MESSAGE);

            cn.cerrarCon();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        String ps= this.getPuesto();
        int ps1 =Integer.parseInt(ps);
        if(ps1==0){
           try {
               
            PreparedStatement parametro2;
            String query2 = "update empleados set codigo=?,nombres=?,apellidos=?,direccion=?,telefono=?,Fecha_nacimiento=?,id_puesto=? where idempleado=?;";
            cn = new Conexion();
            cn.abrirCon();
            parametro2 = (PreparedStatement) cn.conexiondb.prepareStatement(query2);
            parametro2.setString(1, getCodigo_empleado());
            parametro2.setString(2, getNombres());
            parametro2.setString(3, getApellidos());
            parametro2.setString(4, getDireccion());
            parametro2.setString(5, getTelefono());
            parametro2.setString(6, getFecha_nacimiento());
            parametro2.setString(7, g);
            parametro2.setInt(8, getId());
            int executar = 0;
            executar = parametro2.executeUpdate();
            cn.cerrarCon();
            JOptionPane.showMessageDialog(null, Integer.toString(executar) + " Modificacion Exitosa!! ", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException ex) {
            System.out.println("-- Error --" + ex.getMessage());
        }
        }else if(ps1!=0) {
              try {
               
            PreparedStatement parametro2;
            String query2 = "update empleados set codigo=?,nombres=?,apellidos=?,direccion=?,telefono=?,Fecha_nacimiento=?,id_puesto=? where idempleado=?;";
            cn = new Conexion();
            cn.abrirCon();
            parametro2 = (PreparedStatement) cn.conexiondb.prepareStatement(query2);
            parametro2.setString(1, getCodigo_empleado());
            parametro2.setString(2, getNombres());
            parametro2.setString(3, getApellidos());
            parametro2.setString(4, getDireccion());
            parametro2.setString(5, getTelefono());
            parametro2.setString(6, getFecha_nacimiento());
            parametro2.setString(7, getPuesto());
            parametro2.setInt(8, getId());
            int executar = 0;
            executar = parametro2.executeUpdate();
            cn.cerrarCon();
            JOptionPane.showMessageDialog(null, Integer.toString(executar) + " Modificacion Exitosa!! ", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException ex) {
            System.out.println("-- Error --" + ex.getMessage());
        }
         
        }
 }

    @Override
    public void eliminar() {
        try {
            PreparedStatement parametro;
            String query = "delete from empleados where idempleado=?;";
            cn = new Conexion();
            cn.abrirCon();
            parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);//Casteo de variable
            parametro.setInt(1, getId());
            int executar = 0;
            executar = parametro.executeUpdate();

            cn.cerrarCon();
            JOptionPane.showMessageDialog(null, Integer.toString(executar) + " Regitro Eliminado ", "\tEliminar", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException ex) {
            System.out.println("-- Error --" + ex.getMessage());
        }
    }   

  
}
