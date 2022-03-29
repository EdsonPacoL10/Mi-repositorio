<%@page import="Clases.RegistroDeProductosClass"%>
<%
 RegistroDeProductosClass pro=(RegistroDeProductosClass)request.getAttribute("produc");
 
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="purple">
       <h1><center>SE REGISTRO CORRECTAMENTE LOS DATOS INGRESADOS</center></h1>
        <h2>Gracias por Registrar el Producto  <%= pro.getProducto() %> </h2>
        <p><b>Los Datos Recibidos Son:</b></p>
        
        <p><b>SU PRODUCTO ES     : </b>      <%= pro.getProducto() %> </p>
        <p><b>SU CATEGORIA ES    : </b>      <%= pro.getCategoria() %> </p>
        <p><b>SU EXISTENCIA ES   : </b>      <%= pro.getExistencia() %> </p>
        <p><b>SU PRECIO ES       : </b>      <%= pro.getPrecio() %> </p>
        <br>
        <a href="RegistroDeProductos.jsp">
        <input type="button" value="Volver Atras">
        </a>
        <br>
        <br>
        <a href="index.jsp">
        <input type="button" value="Volver a Menu">
        </a>
    </body>
</html>
