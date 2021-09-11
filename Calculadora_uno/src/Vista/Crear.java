package Vista;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;

/**
 *
 * @author Luis Fernando Paxel
 */
public class Crear {

    private int nuevo;
    private float numero1, numero2, resultado;
    private String operacion;
    private int contador;
    private String nombre = "C:\\Users\\Luis Fernando Paxel\\Documents\\NetBeansProjects\\Calculadora_uno\\Archivo Historial\\bitacoraCalculadora.txt";

    public Crear() {
    }

    public Crear(int nuevo, float numero1, float numero2, String operacion, float resultado,int contador) {
        this.nuevo = nuevo;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
        this.operacion = operacion;
        this.contador= contador;
    }

    public int getNuevo() {
        return nuevo;
    }

    public void setNuevo(int nuevo) {
        this.nuevo = nuevo;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void Guardar() throws IOException {
         File archivo = new File(nombre);
        FileWriter insertar;
        PrintWriter ver;
        if (!archivo.exists()) {
            /*
            try {
               
                archivo.createNewFile();
               insertar= new FileWriter(archivo,true);
                ver=new PrintWriter(insertar);
                ver.println(numero1);
                ver.println(operacion);
                ver.println(numero2);
                ver.println(resultado);
                ver.close();
               insertar.close();

            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
*/
}

          else{
            try {

                insertar = new FileWriter(archivo, true);
                ver = new PrintWriter(insertar);
                if (this.getNuevo() == 1) {

                    BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                    bw.write("");
                    bw.close();
                    ver.println("-------   Nuevo Historial ------");
                } else {
                  
                    ver.println(numero1+ " "+ operacion+ " "+numero2 + "= " + resultado);

                }

                insertar.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }

    public String Visualizar_historial() {
          File archivo = new File(nombre);
        String texto = "", linea;

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((linea = br.readLine()) != null) {
                texto += linea + "\n ";
            }

        } catch (Exception ex) {

        }
        return texto;
    }

}
