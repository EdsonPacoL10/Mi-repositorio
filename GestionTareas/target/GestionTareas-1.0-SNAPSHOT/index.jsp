<%@page import ="java.util.ArrayList" %>
<%@page import ="Clases.Tarea" %>

<%
    if (session.getAttribute("listTarea") == null){
        ArrayList<Tarea> lisaux = new ArrayList<Tarea>();
        session.setAttribute("listTarea", lisaux);
    }
    
    ArrayList<Tarea> listTarea = (ArrayList<Tarea>)session.getAttribute("listTarea");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="red">
        <h1 ><center>LISTA DE TAREA</center></h1>
        <form  action="Servlet_Tarea" method="post">
            <table>
                <tr>
                    <td>Id</td>
                    <td><input type="number" name="Id" value="" size="7"
                               required></td>
                </tr>
                <tr>
                    <td>Tarea</td>
                    <td><input type="text" name="Tarea" value="" size="7" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Insertar Tarea"></td>
                </tr>
            </table>
        </form>
        
        <a href="Servlet_Tarea?Opcion=Vaciar">Vaciar Lista</a>
        <center>
        <h2>Listado de Tareas</h2>
        <table border="3">
            <tr>
                <th>Id</th>
                <th>Tarea</th>
                <th>Seleccion</th>
                <th></th>
            </tr>
            <%
                if ( listTarea != null){
                    for (Tarea T : listTarea){
            %>
            <tr>
                <td><%= T.getId() %></td>
                <td><%= T.getTarea() %></td>
                <td><input type="checkbox" name="Tarea" /></td>
         
                <td><a href="Servlet_Tarea?Opcion=Eliminar&Id=<%= T.getId() %>">Eliminar</a></td>
            </tr>
            <%
                    }             }  
            %>
        </table>
        </center>
    </body>
</html>
