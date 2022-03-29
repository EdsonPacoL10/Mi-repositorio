<%@page import="Clases.InscripcionEnCursoClass"%>
<%
    InscripcionEnCursoClass Inscripcion = (InscripcionEnCursoClass)request.getAttribute("Inscripcion");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Revision Curso</title>
    </head>
    <body bgcolor="purple">
        <h1><center>SE REGISTRO CORRECTAMENTE LOS DATOS INGRESADOS</center></h1>
        <h1>Gracias por Registrar a  <%= Inscripcion.getNombre() %> </h1>
        <p><b>Los Datos Recibidos Son:</b></p>
        
        <p><b>SU NOMBRE ES     : </b>       <%= Inscripcion.getNombre() %> </p>
        <p><b>SU APELLIDO ES   : </b>       <%= Inscripcion.getApellido() %> </p>
        <p><b>SU CURSO ES      : </b>       <%= Inscripcion.getCurso() %> </p>
        <br>
        <a href="InscripcionEnCurso.jsp"><input type="button" value="Volver Atras">
        </a>
        <br>
        <br>
        <a href="index.jsp">
        <input type="button" value="Volver a Menu Principal">
        </a>
    </body>
</html>
