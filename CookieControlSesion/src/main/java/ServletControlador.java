import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "ServletControlador",urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter(); 
        int contador =0;
        Cookie[] cukis=request.getCookies();
        if (cukis!=null) {
            for (Cookie c:cukis) {
                if(c.getName().equals("visitas")){
                    contador=Integer.parseInt(c.getValue());
                }
            }      
        }
        contador++;
        Cookie c=new Cookie("visitas",Integer.toString(contador));
        //controlador de tiempo de sesion abierta en seg.
        //lo modificamos valor a 5seg por motivos de prueba
        c.setMaxAge(5);
        response.addCookie(c);
        
        response.setContentType("text/html");
        
        out.print("Visitas No:  "+contador);
        if(contador==1){
            response.setContentType("text/html");
            out.println("<html>");
            out.print("<head>");
            out.println("<title>CONTROLADOR</title>");
            out.println("</head>");
            out.println("<body bgcolor=red>");
            out.println("<h1><center>BIENVENIDO A NUESTRO SITIO WEB</center></h1>");
            out.println("</body>");
            out.println("</html>");
        }else{
            response.setContentType("text/html");
            out.println("<html>");
            out.print("<head>");
            out.println("<title>CONTROLADOR</title>");
            out.println("</head>");
            out.println("<body  bgcolor=red>");
            out.println("<h1><center>GRACIAS POR VISITARNOS NUEVAMENTE</center></h1>");
            out.println("</body>");
            out.println("</html>");
              }
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
