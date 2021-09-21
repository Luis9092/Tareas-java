package modelo;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * @author Luis Fernando Paxel
 */
public class Productos {

    public Productos() {
    }
    private String producto, descripcion;
    private int existencia, id_marca;
    private float Pcosto, Pventa;
    private Conexion cn;

    public Productos(String producto,int id_marca, String descripcion,  float Pcosto, float Pventa, int existencia ) {
        this.producto = producto;
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.id_marca = id_marca;
        this.Pcosto = Pcosto;
        this.Pventa = Pventa;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public float getPcosto() {
        return Pcosto;
    }

    public void setPcosto(float Pcosto) {
        this.Pcosto = Pcosto;
    }

    public float getPventa() {
        return Pventa;
    }

    public void setPventa(float Pventa) {
        this.Pventa = Pventa;
    }

    public int agregar() {
        int retorno;

        {
            try {
                PreparedStatement parametro;
                String query = "insert into productos (producto,idMarca,descripcion,precio_costo,precio_venta,existencia)values(?,?,?,?,?,?);";
                cn = new Conexion();
                cn.abrirCon();
                parametro = (PreparedStatement) cn.conexiondb.prepareStatement(query);
                parametro.setString(1, this.getProducto());
                parametro.setString(2, String.valueOf(this.getId_marca()));
                parametro.setString(3, this.getDescripcion());
                parametro.setString(4, String.valueOf(this.getPcosto()));
                parametro.setString(5, String.valueOf(this.getPventa()));
                parametro.setString(6,String.valueOf(this.getExistencia()));
                
                retorno = parametro.executeUpdate();
                cn.cerrarCon();
            } catch (HeadlessException | SQLException ex) {
                System.out.println("Error!!" + ex.getMessage());
                retorno = 0;

            }
            return retorno;
        }
    }
    
      public DefaultTableModel leer12() {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            cn = new Conexion();
            cn.abrirCon();
            String query = "select idProducto as id, e.producto,e.descripcion,e.precio_costo, e.precio_venta,e.existencia, p.marca,p.idmarca from productos as e, marcas as p where e.idMarca= p.idmarca;";
            ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
            String encabezado[] = {"Id", "Producto", "Descripcion", "Precio Costo", "Precio Venta", "Existencia", "Marca", "Id_marca"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[9];
            while (consulta.next()) {
                datos[0] = consulta.getString("id");
                datos[1] = consulta.getString("producto");
                datos[2] = consulta.getString("descripcion");
                datos[3] = consulta.getString("precio_costo");
                datos[4] = consulta.getString("precio_venta");
                datos[5] = consulta.getString("existencia");
                datos[6] = consulta.getString("marca");
                datos[7] = consulta.getString("idmarca");
                tabla.addRow(datos);
            }
            cn.cerrarCon();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return tabla;
    }

}
