<%@page import="Clases.RegistroDeLibroClass"%>
<%
    RegistroDeLibroClass libro= (RegistroDeLibroClass)request.getAttribute("libro");
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
        <h1>Gracias por Registrar el libro de  <%= libro.getTitulo() %> </h1>
        <p><b>Los Datos Del Libro Son : </b></p>
        
        <p><b>SU TITULO ES    : </b>       <%= libro.getTitulo() %> </p>
        <p><b>SU AUTOR ES     : </b>       <%= libro.getAutor() %> </p>
        <p><b>SU RESUMEN ES   : </b>       <%= libro.getResumen() %> </p>
        <p><b>SU MEDIO ES     : </b>       <%= libro.getMedio() %> </p>
        <br>
        <a href="RegistroDeLibros.jsp">
        <input type="button" value="Volver Atras">
        </a>
        <br>
        <br>
        <a href="index.jsp">
        <input type="button" value="Volver a Menu">
        </a>
               
    </body>
</html>
