package Clases;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="Servlet_RegistroDeProductos", urlPatterns={"/Servlet_RegistroDeProductos"})

public class Servlet_RegistroDeProductos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1
        String Productos = request.getParameter("Producto");
        String Categoria = request.getParameter("Categoria");
        String Existencia =  request.getParameter("Existencia");
        String Precio =request.getParameter("Precio");
        // 2
        RegistroDeProductosClass prod = new RegistroDeProductosClass();
        // 3
        prod.setProducto(Productos);
        prod.setCategoria(Categoria);
        prod.setExistencia(Existencia);
        prod.setPrecio(Precio);
        // 4
        request.setAttribute("produc", prod);
        // 5
        request.getRequestDispatcher("Salida_RegistroDeProductos.jsp").forward(request, response);

    }

}
