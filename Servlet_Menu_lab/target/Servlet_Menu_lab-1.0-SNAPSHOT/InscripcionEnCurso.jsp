<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="yellow">
        <h1><center>INSCRIPCION EN CURSO</center></h1>
        <h2><center>Ingrese los datos porfavor :-)</center></h2>
        <form action="Servlet_Inscripcion"method="POST">
            <label>Nombre    </label>
            <input type="text" name="Nombre" value="" />
            <br>
            <label>Apellido  </label>
            <input type="text" name="Apellido" value="" />
            <br>
            <label>Curso     </label>
            <select name="Curso" id="">
                <option>Paralelo "A" </option>
                <option>Paralelo "B" </option>
                <option>Paralelo "C" </option>
            </select>
            <br>
            <input type="submit" value="Procesar" />
        </form>
    </body>
</html>
