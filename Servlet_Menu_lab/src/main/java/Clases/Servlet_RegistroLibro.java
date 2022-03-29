package Clases;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Servlet_RegistroLibro", urlPatterns = {"/Servlet_RegistroLibro"})
public class Servlet_RegistroLibro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1
        String Titulo = request.getParameter("Titulo");
        String Autor = request.getParameter("Autor");
        String Resumen =  request.getParameter("Resumen");
        String Medio = request.getParameter("Medio");
        // 2
        RegistroDeLibroClass libro = new RegistroDeLibroClass();
        // 3
        libro.setTitulo(Titulo);
        libro.setAutor(Autor);
        libro.setResumen(Resumen);
        libro.setMedio(Medio);
        
        // 4
        request.setAttribute("libro", libro);
        // 5
        request.getRequestDispatcher("Salida_RegistroDeLibros.jsp").forward(request, response);

    }

}
