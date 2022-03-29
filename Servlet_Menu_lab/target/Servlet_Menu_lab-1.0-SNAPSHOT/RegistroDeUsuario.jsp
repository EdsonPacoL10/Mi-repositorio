
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="yellow">
      <h1><center>REGISTRO DE USUARIO</center></h1>
      <h2><center>Ingrese los datos porfavor :-)</center></h2>
        <form action="Servlet_RegistroDeUsuario" method="POST">
            <label>Nombre              </label>
            <input type="text" name="Nombre" value="" />
            <br>
            <label>Apellido            </label>
            <input type="text" name="Apellido" value="" />
            <br>
            <label>Correo Electronico  </label>
            <input type="text" name="Correo" value="" />
            <br>
            <label>Contraseña          </label>
            <input type="text" name="Contraseña" value="" />
            <br>
            <input type="submit" value="Procesar" />
        </form>
    </body>
</html>
