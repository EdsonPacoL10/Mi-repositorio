package Clases;
public class RegistroDeProductosClass {
    
private String Producto;
private String Categoria;
private String Existencia;
private String Precio;

    public RegistroDeProductosClass() {
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getExistencia() {
        return Existencia;
    }

    public void setExistencia(String Existencia) {
        this.Existencia = Existencia;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "RegistroDeProductosClass{" + "Producto=" + Producto + ", Categoria=" + Categoria + ", Existencia=" + Existencia + ", Precio=" + Precio + '}';
    }
    

}
