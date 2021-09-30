<%-- 
    Document   : index
    Created on : Sep 29, 2021, 8:31:46 PM
    Author     : Luis Fernando Paxel
--%>
<%@page import="modelo.Cliente" %>

<%@page import="java.util.HashMap" %>
<%@page import="javax.swing.table.DefaultTableModel" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

    </head>
    <body class="bg-primary ">
        <button type="button" class="btn btn-warning text-white" data-toggle="modal" data-target="#modal_cliente" onclick="Limpiar()">
            Formulario
        </button>

        <div class="container">
            <center> <h1>Formulario Clientes</h1></center>
            <div class="modal fade" id="modal_cliente" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">

                        <!-- Modal body -->
                        <div class="modal-body bg-secondary">
                            <form  action="src_cliente" method="post" class="form-group">
                                <b>  <label for="lbl_id">ID: </label></b>
                                <input class="form-control" type="text" name="txt_id" id="txt_id" value="0" readonly>

                                <b>  <label for="lbl_nit">Nit: </label> </b>
                                <input class="form-control" type="text" name="txt_nit" id="txt_nit" pattern="[0-9]{1,6}[-][0-9]{1}" placeholder="E00" required>
                
                                <b> <label for="lbl_nombres">Nombres: </label></b>
                                <input class="form-control" type="text" name="txt_nombres" id="txt_nombres" placeholder="Nombres" pattern="[A-Z]{1}[a-zA-ZÀ-ÿ\s]{4,40}([ ][A-Z]{1}[a-zA-ZÀ-ÿ\s]{4,40})?" required>

                                <b> <label for="lbl_apellidos">Apellidos: </label></b>
                                <input class="form-control" type="text" name="txt_apellidos" id="txt_apellidos" placeholder="Apellidos"pattern="[A-Z]{1}[a-zA-ZÀ-ÿ\s]{4,40}[ ][A-Z]{1}[a-zA-ZÀ-ÿ\s]{4,40}" required>

                                <b> <label for="lbl_direccion">Direccion: </label></b>
                                <input class="form-control" type="text" name="txt_direccion" id="txt_direccion" pattern="[A-Z]{1}[a-zA-ZÀ-ÿ\s]{4,40}[ ][A-Z]{1}[a-zA-ZÀ-ÿ\s]{4,40}" placeholder="Municipo,Pais" required>

                                <b> <label for="lbl_telefono">No. Telefono: </label></b>
                                <input class="form-control" type="text"  name="txt_telefono" id="txt_telefono" minlength="8"maxlength="8" placeholder="000000000" required>

                                <b> <label for="lbl_fn">Fecha Nacimiento: </label></b> 
                                <input class="form-control" type="date" name="txt_fn" id="txt_fn" required  placeholder="yyyy-MM-dd">
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
                        <div class="modal-footer bg-secondary">
                            <button type="button" class="btn btn-warning text-white" onclick="unselect()" data-dismiss="modal">Close</button>
                        </div>

                    </div>
                </div>
            </div> 

       <div class= "container">
                <table class="table bg-secondary" table-hover">
                    <thead>
                        <tr>
                            <th>Nit</th>
                            <th>Nombres</th> 
                            <th>Apellidos</th>
                            <th>Direccion</th>
                            <th>Telefono</th>
                            <th>Fecha Nacimiento</th>
                        </tr>
                    </thead>

                    <tbody id="tbl_clientes">


                        <% 
                        Cliente cliente = new Cliente();
                        DefaultTableModel tabla = new DefaultTableModel();
                        tabla= cliente.leer3();
                        for (int r=0; r<tabla.getRowCount(); r++){
                        out.println("<tr data-id=" + tabla.getValueAt(r,0) + " >");
                        out.println("<td>" + tabla.getValueAt(r,1) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,2) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,3) + "</td>");
                
                        out.println("<td>" + tabla.getValueAt(r,4) + "</td>");
                        out.println("<td>" + tabla.getValueAt(r,5) + "</td>");     
                        out.println("<td>" + tabla.getValueAt(r,6) + "</td>");
                        out.println("</tr>");
                        }
                        %>

                    </tbody>
                </table>
            </div>

            <script type="text/javascript">
                function Limpiar() {
                    $("#txt_id").val(0);
                    $("#txt_nit").val('');

                    $("#txt_nombres").val('');
                    $("#txt_apellidos").val('');
                    $("#txt_direccion").val('');
                    $("#txt_apellidos").val('');
                    $("#txt_telefono").val('');
                    $("#txt_fn").val('');

                }
                $('#tbl_clientes').on('click', 'tr td', function (evt) {
                    var target, id, nit, nombres, apellidos, direccion, telefono, nacimiento;
                    target = $(event.target);
                    id = target.parent().data('id');
                    nit = target.parent("tr").find("td").eq(0).html();
                    nombres = target.parent("tr").find("td").eq(1).html();
                    apellidos = target.parent("tr").find("td").eq(2).html();
                    direccion = target.parent("tr").find("td").eq(3).html();
                    telefono = target.parent("tr").find("td").eq(4).html();
                    nacimiento = target.parent("tr").find("td").eq(5).html();

                    $("#txt_id").val(id);
                    $("#txt_nit").val(nit);
                    $("#txt_nombres").val(nombres);
                    $("#txt_apellidos").val(apellidos);
                    $("#txt_direccion").val(direccion);
                    $("#txt_telefono").val(telefono);
                    $("#txt_fn").val(nacimiento);
                    $("#modal_cliente").modal('show');
                });

            </script>
        </div>
    </body>
</html>
