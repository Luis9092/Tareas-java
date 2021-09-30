<%-- 
    Document   : index
    Created on : 13/08/2021, 17:43:05
    Author     : Luis Fernando Paxel
--%>

<%@page import="modelos.Puestos" %>
<%@page import="modelos.Empleado" %>
<%@page import="java.util.HashMap" %>
<%@page import="javax.swing.table.DefaultTableModel" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

    <body>
        <button type="button" class="btn btn-primary text-white" data-toggle="modal" data-target="#modal_cliente" onclick="Limpiar()">
            Formulario
        </button>
        <h5><center>Formulario Empleado :3</center> </h5>
        <div class="container">
            <div class="modal fade" id="modal_cliente" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">

                        <!-- Modal body -->
                        <div class="modal-body">
                            <form  action="src_empleadoss" method="post" class="form-group">
                                <label for="lbl_id">ID: </label>
                                <input class="form-control" type="text" name="txt_id" id="txt_id" value="0" readonly>

                                <label for="lbl_codigo">Codigo: </label>
                                <input class="form-control" type="text" name="txt_codigo" id="txt_codigo" pattern="[E]{1}[0-9]{3}" placeholder="E00" required>

                                <label for="lbl_nombres">Nombres: </label>
                                <input class="form-control" type="text" name="txt_nombres" id="txt_nombres" placeholder="Nombres" required>

                                <label for="lbl_apellidos">Apellidos: </label>
                                <input class="form-control" type="text" name="txt_apellidos" id="txt_apellidos" placeholder="Apellidos" required>

                                <label for="lbl_direccion">Direccion: </label>
                                <input class="form-control" type="text" name="txt_direccion" id="txt_direccion" placeholder="Pais, Lugar, Casa" required>

                                <label for="lbl_telefono">No. Telefono: </label>
                                <input class="form-control" type="number" name="txt_telefono" id="txt_telefono" placeholder="000000000" required>

                                <label for="lbl_fn">Fecha Nacimiento: </label>
                                <input class="form-control" type="date" name="txt_fn" id="txt_fn" required placeholder="yyyy-MM-dd">
                                <br>
                                <label for="lbl_puesto">Puestos: </label>
                                <select name="drop-puesto" class="form-control" id="drop_puesto">
                                    <%
                                        Puestos puesto = new Puestos();
                                        HashMap<String, String> drop = puesto.seleccionar();
                                        for (String i : drop.keySet()) {
                                            out.println("<option value='" + i + "'>" + drop.get(i) + "</option>");
                                        }

                                    %>
                                </select>
                                <br>
                                <!-- submit -->
                                <center>    
                                    <button  name="btn_agregar" id="btn_agregar" value="agregar" class="btn btn-primary">Agregar</button>
                                    <button  name="btn_modificar" id="btn_modificar" value="modificar" class="btn btn-success ">Modificar</button>
                                    <button  name="btn_eliminar" id="btn_eliminar" value="eliminar" class="btn btn btn-danger " onclick ="javascript:if (!confirm('¿Desea Eliminar'))
                                return false"  >Eliminar</button>
                                </center>

                            </form>
                        </div>

                        <!-- Modal footer -->
                        <div class="modal-footer">
                            <button type="button" class="btn btn-warning text-white"  data-dismiss="modal">Close</button>
                        </div>

                    </div>
                </div>
            </div>



            <div class= "container">
                <table class="table table-dark table-hover">
                    <thead>
                        <tr>
                            <th>Codigo</th>
                            <th>Nombres</th> 
                            <th>Apellidos</th>
                            <th>Direccion</th>
                            <th>Telefono</th>
                            <th>Fecha Nacimiento</th>
                            <th>Puesto</th>
                        </tr>
                    </thead>

                    <tbody id="tbl_empleados">


                        <% 
                        Empleado empleado = new Empleado();
                        DefaultTableModel tabla = new DefaultTableModel();
                        tabla= empleado.leer3();
                        for (int r=0; r<tabla.getRowCount(); r++){
                        out.println("<tr data-id=" + tabla.getValueAt(r,0) + " data-id_p=" + tabla.getValueAt(r,8) + " >");
                        out.println("<td>" + tabla.getValueAt(r,1) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,2) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,3) + "</td>");
                
                        out.println("<td>" + tabla.getValueAt(r,4) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,5) + "</td>");     
                        out.println("<td>" + tabla.getValueAt(r,6) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,7) + "</td>");
                        out.println("</tr>");
                        }
                        %>

                    </tbody>
                </table>
            </div>

           
            <script type="text/javascript">
function Limpiar() {
                    $("#txt_id").val(0);
                    $("#txt_nombres").val('');
                    $("#txt_apellidos").val('');
                    $("#txt_direccion").val('');
                    $("#txt_apellidos").val('');
                    $("#txt_telefono").val('');
                    $("#txt_fn").val('');
                    $("#drop_puesto").val(0);
                  
                }
                      $('#tbl_empleados').on('click', 'tr td', function (evt) {
                          var target, id, id_p, codigo, nombres, apellidos, direccion, telefono, nacimiento;
                          target = $(event.target);
                          id = target.parent().data('id');
                          id_p = target.parent().data('id_p');
                          codigo = target.parent("tr").find("td").eq(0).html();
                          nombres = target.parent("tr").find("td").eq(1).html();
                          apellidos = target.parent("tr").find("td").eq(2).html();
                          direccion = target.parent("tr").find("td").eq(3).html();
                          telefono = target.parent("tr").find("td").eq(4).html();
                          nacimiento = target.parent("tr").find("td").eq(5).html();
                          $("#txt_id").val(id);
                          $("#txt_codigo").val(codigo);
                          $("#txt_nombres").val(nombres);
                          $("#txt_apellidos").val(apellidos);
                          $("#txt_direccion").val(direccion);
                          $("#txt_telefono").val(telefono);
                          $("#txt_fn").val(nacimiento);
                          $("#drop_puesto").val(id_p);
                          $("#modal_cliente").modal('show');
                      });

            </script>
        </div>
    </body>
</html>
