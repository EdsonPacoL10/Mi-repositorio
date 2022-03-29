<%@page import="Clases.RegistroDeUsuarioClass"%>
<%
    RegistroDeUsuarioClass usu = (RegistroDeUsuarioClass)
            request.getAttribute("usuario");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Revision Registro Usuario</title>
    </head>
    <body bgcolor="purple">
        <h1><center>EL USUARIO SE REGISTRO CORRECTAMENTE</center></h1>
        <h1>Gracias por Registrar al Usuario  <%= usu.getNombre() %> </h1>
        <p><b>Los Datos Recibidos Son:</b></p>
        
        <p><b>SU NOMBRE ES      : </b>       <%= usu.getNombre()%> </p>
        <p><b>SU APELLIDO ES    : </b>       <%= usu.getApellido() %> </p>
        <p><b>SU CORREO ES      : </b>       <%= usu.getCorreo() %> </p>
        <p><b>SU CONTRASEÑA ES  : </b>       <%= usu.getContraseña() %> </p>
        <br>
        <a href="RegistroDeUsuario.jsp">
        <input type="button" value="Volver Atras">
        </a>
        <br>
        <br>
        <a href="index.jsp">
        <input type="button" value="Volver a Menu">
        </a>
    </body>
</html>
