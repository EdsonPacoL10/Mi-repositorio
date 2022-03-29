<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="yellow">
        <h1><center>REGISTRO DE LIBRO</center></h1>
        <h2><center>Ingrese los datos porfavor :-)</center></h2>
        <form action="Servlet_RegistroLibro"method="POST">
            <label>Titulo    </label>
            <input type="text" name="Titulo" value="" />
            <br>
            <label>Autor     </label>
            <input type="text" name="Autor" value="" />
            <br>
            <label>Resumen   </label>
            <input type="text" name="Resumen" value="" />
            <br>
            <label>Fisico    </label>
            <input type="radio" name="Medio" value="Fisico" checked="checked" />
            <br>
            <label>Magnetico </label>
            <input type="radio" name="Medio" value="Magnetico" checked="checked" />
            <br>
            <input type="submit" value="Procesar" />
        </form>
    </body>
</html>
