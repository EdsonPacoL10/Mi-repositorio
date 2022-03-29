package Clases;
public class RegistroDeLibroClass {
private String Titulo;
private String Autor;
private String Resumen;
private String Medio;

    public RegistroDeLibroClass() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String Resumen) {
        this.Resumen = Resumen;
    }

    public String getMedio() {
        return Medio;
    }

    public void setMedio(String Medio) {
        this.Medio = Medio;
    }

    @Override
    public String toString() {
        return "RegistroDeLibroClass{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", Resumen=" + Resumen + ", Medio=" + Medio + '}';
    }
    

}

