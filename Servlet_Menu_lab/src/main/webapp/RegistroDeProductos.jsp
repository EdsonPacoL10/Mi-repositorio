
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="yellow">
        <h1><center>REGISTRO DE PRODUCTOS</center></h1>
        <h2><center>Ingrese los datos porfavor :-)</center></h2>
        <form action="Servlet_RegistroDeProductos" method="POST">
            <label>Producto              </label>
            <input type="text" name="Producto" value="" />
            <br>
            <label>Categoria Del Libro   </label>
            <select name="Categoria" id="">
                <option>Accion</option>
                <option>Terror</option>
                <option>Animacion</option>
                <option>Historia</option>
                <option>Biologia</option>
                <option>Matematicas</option>
                <option>Fisica</option>
            </select>
            <br>
            <label>Existencia            </label>
            <input type="text" name="Existencia" value="" />
            <br>
            <label>Precio                </label>
            <input type="text" name="Precio" value="" />
            <br>
            <input type="submit" value="Procesar" />
        </form>
    </body>
</html>
