package Clases;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Servlet_Inscripcion", urlPatterns={"/Servlet_Inscripcion"})
public class Servlet_Inscripcion extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1
        String Nombre = request.getParameter("Nombre");
        String Apellido=request.getParameter("Apellido");
        String Curso=request.getParameter("Curso");
        // 2
        InscripcionEnCursoClass Ins = new InscripcionEnCursoClass();
        // 3
        Ins.setNombre(Nombre);
        Ins.setApellido(Apellido);
        Ins.setCurso(Curso);
        // 4
        request.setAttribute("Inscripcion", Ins);
        // 5
        request.getRequestDispatcher("Salida_InscripcionEnCurso.jsp").forward(request, response);
    }

}
