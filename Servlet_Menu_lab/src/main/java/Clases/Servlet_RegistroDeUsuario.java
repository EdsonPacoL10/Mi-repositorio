package Clases;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet_RegistroDeUsuario", urlPatterns = {"/Servlet_RegistroDeUsuario"})
public class Servlet_RegistroDeUsuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          // 1
        String Nombre = request.getParameter("Nombre");
        String Apellido = request.getParameter("Apellido");
        String Correo =  request.getParameter("Correo");
        String Contraseña =request.getParameter("Contraseña");
        // 2
        RegistroDeUsuarioClass usu = new RegistroDeUsuarioClass();
        // 3
        usu.setNombre(Nombre);
        usu.setApellido(Apellido);
        usu.setCorreo(Correo);
        usu.setContraseña(Contraseña);
        // 4
        request.setAttribute("usuario", usu);
        // 5
        request.getRequestDispatcher("Salida_RegistroDeUsuario.jsp").forward(request, response);

    }

}

