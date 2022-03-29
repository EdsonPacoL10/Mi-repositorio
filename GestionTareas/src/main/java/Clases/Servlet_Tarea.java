package Clases;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="Servlet_Tarea",urlPatterns={"/Servlet_Tarea"})
public class Servlet_Tarea extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              String Opcion = request.getParameter("Opcion");

        if (Opcion.equals("Vaciar")) {
            // Vaciar lista de tarea
            HttpSession ses = request.getSession();
            ses.invalidate();
            response.sendRedirect("index.jsp");
        }
        if (Opcion.equals("Eliminar")){
            int Pos = -1;
            int Buscado = -1;
            int Id = Integer.parseInt(request.getParameter("Id"));
            // Eliminar el producto
            HttpSession ses = request.getSession();
            ArrayList<Tarea> lista = (ArrayList<Tarea>)ses.getAttribute("listTarea");
            
            for(Tarea p : lista){
                Pos++;
                if (p.getId() == Id){
                    Buscado = Pos;
                }                
            }
            lista.remove(Buscado);
            response.sendRedirect("index.jsp");
        }

    }
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    int Id = Integer.parseInt(request.getParameter("Id"));
        String Tarea = request.getParameter("Tarea");
        
        Tarea Ta= new Tarea();
      //  Producto prod = new Producto();

        Ta.setId(Id);
        Ta.setTarea(Tarea);

        HttpSession ses = request.getSession();

        ArrayList<Tarea> lista = (ArrayList<Tarea>) ses.getAttribute("listTarea");

        lista.add(Ta);

        response.sendRedirect("index.jsp");

    
    }
    

}
