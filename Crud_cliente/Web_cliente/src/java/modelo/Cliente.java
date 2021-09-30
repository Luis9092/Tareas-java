
package modelo;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import modelos.Conexion;

/**
 * @author Luis Fernando Paxel
 */
public class Cliente extends Persona{
    private String nit;
    public Cliente(){}
private Conexion cn;
    public Cliente( int id,String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(id, nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
      public int agregar() {
        int retorno;

        {
            try {
                PreparedStatement parametro;
                String query = "insert into clientes (nit,nombres,apellidos,direccion,telefono,Fecha_nacimiento)values(?,?,?,?,?,?);";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setString(1, this.getNit());

                parametro.setString(2, getNombres());
                parametro.setString(3, getApellidos());
                parametro.setString(4, getDireccion());
                parametro.setString(5, getTelefono());
                parametro.setString(6, getFecha_nacimiento());
                
                retorno = parametro.executeUpdate();
                cn.cerrarCon();
            } catch (HeadlessException | SQLException ex) {
                System.out.println("Error!!" + ex.getMessage());
                retorno = 0;

            }
            return retorno;
        }
    }
        public DefaultTableModel leer3() {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            cn = new Conexion();
            cn.abrirCon();
            String query = "select id_cliente as id,nit,nombres,apellidos,direccion,telefono,Fecha_nacimiento from clientes;";
            ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
            String encabezado[] = {"Id", "Nit", "Nombres", "Apellidos", "Direccion", "Telefono", "Nacimiento"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[9];
            while (consulta.next()) {
                datos[0] = consulta.getString("id");
                datos[1] = consulta.getString("nit");
                datos[2] = consulta.getString("nombres");
                datos[3] = consulta.getString("apellidos");
                datos[4] = consulta.getString("direccion");
                datos[5] = consulta.getString("telefono");
                datos[6] = consulta.getString("Fecha_nacimiento");
                tabla.addRow(datos);
            }
            cn.cerrarCon();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return tabla;
    }
        
          @Override
    public int modificar() {
        int retorno;

        {
            try {
                PreparedStatement parametro;
                String query = "update clientes set nit=?,nombres=?,apellidos=?,direccion=?,telefono=?,Fecha_nacimiento=?where id_cliente=?;";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setString(1, this.getNit());
                parametro.setString(2, this.getNombres());
                parametro.setString(3, this.getApellidos());
                parametro.setString(4, this.getDireccion());
                parametro.setString(5, this.getTelefono());
                parametro.setString(6, this.getFecha_nacimiento());
                parametro.setInt(7, this.getId());
                retorno = parametro.executeUpdate();
                cn.cerrarCon();
            } catch (HeadlessException | SQLException ex) {
                System.out.println("Error!!" + ex.getMessage());
                retorno = 0;

            }
            return retorno;
        }
       } 
    @Override
  public int eliminar() {
        int retorno;

        {
            try {
                PreparedStatement parametro;
                String query = "delete from clientes where id_cliente=?;";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setInt(1, this.getId());
                retorno = parametro.executeUpdate();
                cn.cerrarCon();
            } catch (HeadlessException | SQLException ex) {
                System.out.println("Error!!" + ex.getMessage());
                retorno = 0;

            }
            return retorno;
        }
       } 

}
