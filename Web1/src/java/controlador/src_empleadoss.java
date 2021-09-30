package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelos.Empleado;

/**
 * @author Luis Fernando Paxel
 */
public class src_empleadoss extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Empleado empleado;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet src_empleadoss</title>");
            out.println("</head>");
            out.println("<body>");
               empleado = new Empleado(Integer.valueOf(request.getParameter("txt_id")),request.getParameter("txt_codigo"), request.getParameter("txt_nombres"), request.getParameter("txt_apellidos"), request.getParameter("txt_direccion"), request.getParameter("txt_telefono"), request.getParameter("txt_fn"), Integer.valueOf(request.getParameter("drop-puesto")));
        
            if("agregar".equals(request.getParameter("btn_agregar"))){              
             if (empleado.agregar() > 0) {
                out.println("<h1>Registro Ingresado Correctamente :vv</h1>");
                out.println("<a href ='index.jsp '> Regresar </a>");
            } else {
                out.println("<h1>Error carnal</h1>");
                out.println("<a href ='index.jsp '> Regresar </a>");

            }
            }
             if("modificar".equals(request.getParameter("btn_modificar"))){              
             if (empleado.modificar()> 0) {
                out.println("<h1>Registro Modificado Correctamente :vv</h1>");
                out.println("<a href ='index.jsp '> Regresar </a>");
            } else {
                out.println("<h1>Error carnal</h1>");
                out.println("<a href ='index.jsp '> Regresar </a>");

            }
            }
              if("eliminar".equals(request.getParameter("btn_eliminar"))){              
             if (empleado.eliminar()> 0) {
                out.println("<h1>Registro eliminado Correctamente :vv</h1>");
                out.println("<a href ='index.jsp '> Regresar </a>");
            } else {
                out.println("<h1>Error carnal</h1>");
                out.println("<a href ='index.jsp '> Regresar </a>");

            }
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
