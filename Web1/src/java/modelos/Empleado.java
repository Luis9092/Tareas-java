package modelos;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

/*
 *
 * @author Luis Fernando Paxel
 */
public class Empleado extends Persona {

    private String codigo;
    private int id_puesto;
    private Conexion cn;

    public Empleado() {
    }

    public Empleado(int id, String codigo,String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento, int id_puesto) {
        super(id, nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.id_puesto = id_puesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }

    @Override
    public int agregar() {
        int retorno;

        {
            try {
                PreparedStatement parametro;
                String query = "insert into empleados (codigo,nombres,apellidos,direccion,telefono,Fecha_nacimiento,id_puesto) values(?,?,?,?,?,?,?);";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setString(1, getCodigo());

                parametro.setString(2, getNombres());
                parametro.setString(3, getApellidos());
                parametro.setString(4, getDireccion());
                parametro.setString(5, getTelefono());
                parametro.setString(6, getFecha_nacimiento());
                parametro.setInt(7, getId_puesto());
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
            String query = "select idempleado as id, e.codigo,e.nombres,e.apellidos, e.direccion,e.telefono,e.Fecha_nacimiento, p.puesto, p.idpuestos from empleados as e, puestos as p where e.id_puesto= p.idpuestos;";
            ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
            String encabezado[] = {"Id", "Codigo", "Nombres", "Apellidos", "Direccion", "Telefono", "Nacimiento", "Puesto", "id_puesto"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[9];
            while (consulta.next()) {
                datos[0] = consulta.getString("id");
                datos[1] = consulta.getString("codigo");
                datos[2] = consulta.getString("nombres");
                datos[3] = consulta.getString("apellidos");
                datos[4] = consulta.getString("direccion");
                datos[5] = consulta.getString("telefono");
                datos[6] = consulta.getString("Fecha_nacimiento");
                datos[7] = consulta.getString("puesto");
                datos[8] = consulta.getString("idpuestos");
                tabla.addRow(datos);
            }
            cn.cerrarCon();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return tabla;
    }

    @Override
    public void mostrar() {

    }

    @Override
    public int modificar() {
        int retorno;

        {
            try {
                PreparedStatement parametro;
                String query = "update empleados set codigo=?,nombres=?,apellidos=?,direccion=?,telefono=?,Fecha_nacimiento=?,id_puesto=? where idempleado=?;";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setString(1, this.getCodigo());
                parametro.setString(2, this.getNombres());
                parametro.setString(3, this.getApellidos());
                parametro.setString(4, this.getDireccion());
                parametro.setString(5, this.getTelefono());
                parametro.setString(6, this.getFecha_nacimiento());
           parametro.setInt(7, this.getId_puesto());
           parametro.setInt(8, this.getId());
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
                String query = "delete from empleados where idempleado=?;";
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