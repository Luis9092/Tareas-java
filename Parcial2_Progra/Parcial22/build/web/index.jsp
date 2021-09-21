<%-- 
    Document   : index
    Created on : Sep 20, 2021, 8:27:33 PM
    Author     : Luis Fernando Paxel
--%>

<%@page  import="modelo.Marcas" %>
<%@page import="java.util.HashMap" %>
<%@page import="javax.swing.table.DefaultTableModel" %>
<%@page  import="modelo.Productos" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fomulario</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    </head>
    <body>
        <h5><center>Formulario Productos :3</center> </h5>
        <div class="container p-3 my-3 bg-light  text-black">


            <form  action="src_producto" method="post" class="form-group">
                <label class="font-weight-bold"for="lbl_id">ID: </label>
                <input class="form-control text-dark" type="text" name="txt_id" id="txt_id" readonly>

                <label class="font-weight-bold" for="lbl_producto">Producto: </label>
                <input class="form-control text-dark" type="text" name="txt_producto" id="txt_producto" placeholder="Manzana" required>

                <label class="font-weight-bold" for="lbl_nombres">Descripción: </label>
                <input class="form-control text-dark" type="text" name="txt_desc" id="txt_desc" placeholder="Aguacates" required>

                <label class="font-weight-bold" for="lbl_apellidos">Precio Costo: </label>
                <input class="form-control text-dark" type="number" step="0.01" name="txt_pcos" id="txt_pcos" placeholder="00000000" required>

                <label class="font-weight-bold" for="lbl_direccion">Precio Venta: </label>
                <input class="form-control text-dark" type="number"step="0.01" name="txt_pven" id="txt_pven" placeholder="00000000" required>

                <label class="font-weight-bold" for="lbl_telefono">Existencia: </label>
                <input class="form-control text-dark" type="number" name="txt_exis" id="txt_exis" placeholder="000000000" required>
                <br>
                <label class="font-weight-bold" for="lbl_marca">Marcas: </label>
                <select name="drop-marca" class="form-select" id="drop_marcass">
                    <%
                        Marcas marca = new Marcas();
                        HashMap<String, String> drop = marca.seleccionar2();
                        for (String i : drop.keySet()) {
                            out.println("<option value='" + i + "'>" + drop.get(i) + "</option>");
                        }
                    %>
                </select>
                <br>  
                <center>    
                    <button  name="btn_agregar" id="btn_agregar" value="agregar" class="btn btn-primary btn-lg">Agregar</button>
                </center>

            </form>
            <div class= "container">
                <table class="table table-hover">
                    <thead class="thead-dark">
                        <tr>
                            <th>Producto</th> 
                            <th>Descripcion</th>
                            <th>Precio Costo</th>
                            <th>Precio Venta</th>
                            <th>Existencia</th>
                            <th>Marca</th>
                        </tr>
                    </thead>

                    <tbody id="tbl_productos">

                        <% 
                        Productos producto = new Productos();
                        DefaultTableModel tabla = new DefaultTableModel();
                        tabla= producto.leer12();
                        for (int r=0; r<tabla.getRowCount(); r++){
                        out.println("<tr data-id=" + tabla.getValueAt(r,0) + " data-id_pro=" + tabla.getValueAt(r,7) + " >");
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
            <script src="https://code.jquery.com/jquery-3.6.0.slim.js" integrity="sha256-HwWONEZrpuoh951cQD1ov2HUK5zA5DwJ1DNUXaM6FsY=" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
            <script type="text/javascript">

                $('#tbl_productos').on('click', 'tr td', function (evt) {
                    var target, id, id_pro, producto, descripcion, Pcosto, Pventa, existencia;
                    target = $(event.target);
                    id = target.parent().data('id');
                    id_pro = target.parent().data('id_pro');
                    producto = target.parent("tr").find("td").eq(0).html();
                    descripcion = target.parent("tr").find("td").eq(1).html();
                    Pcosto = target.parent("tr").find("td").eq(2).html();
                    Pventa = target.parent("tr").find("td").eq(3).html();
                    existencia = target.parent("tr").find("td").eq(4).html();
                    $("#txt_id").val(id);
                    $("#txt_producto").val(producto);
                    $("#txt_desc").val(descripcion);
                    $("#txt_pcos").val(Pcosto);
                    $("#txt_pven").val(Pventa);
                    $("#txt_exis").val(existencia);
                    $("#drop_marcass").val(id_pro);
                });

            </script>
        </div>
    </body>
</html>
