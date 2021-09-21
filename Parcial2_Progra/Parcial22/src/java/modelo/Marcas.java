/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
/**
 * @author Luis Fernando Paxel
 */
public class Marcas {
    private int Id_marca;
    private String marca;
    private Conexion cn;
    public Marcas(){}

    public Marcas(int Id_marca, String marca) {
        this.Id_marca = Id_marca;
        this.marca = marca;
    }

    public int getId_marca() {
        return Id_marca;
    }

    public void setId_marca(int Id_marca) {
        this.Id_marca = Id_marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Conexion getCn() {
        return cn;
    }

    public void setCn(Conexion cn) {
        this.cn = cn;
    }

       public HashMap seleccionar2(){
        HashMap <String, String> drop = new HashMap();
    try{
        cn = new Conexion();
        String query=("select idmarca as id,marca from marcas;");
        cn.abrirCon();
        ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
        while(consulta.next()){
            drop.put(consulta.getString("id"), consulta.getString("marca"));
        }
        cn.cerrarCon();
    }catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
        return drop;
    }
}
