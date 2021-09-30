package modelos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * @author Luis Fernando Paxel
 */
public class Puestos {
    private String puesto;
    private int id_puesto;
    private Conexion cn;
public Puestos(){  
}

    public Puestos(int id_puesto,String puesto ) {
        this.id_puesto = id_puesto;
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }

    public Conexion getCn() {
        return cn;
    }

    public void setCn(Conexion cn) {
        this.cn = cn;
    }
  
      public HashMap seleccionar(){
        HashMap <String, String> drop = new HashMap();
    try{
        cn = new Conexion();
        String query=("select idpuestos as id,puesto from puestos;");
        cn.abrirCon();
        ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
        while(consulta.next()){
            drop.put(consulta.getString("id"), consulta.getString("puesto"));
        }
        cn.cerrarCon();
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
        return drop;
    }

    
}
