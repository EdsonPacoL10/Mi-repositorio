package Clases;
public class InscripcionEnCursoClass {
   private String Nombre;
    private String Apellido;
    private String Curso;
    public InscripcionEnCursoClass() {
        }
   public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
   public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public String getCurso() {
        return Curso;
    }
    @Override
    public String toString() {
        return "InscripcionEnCursoClass{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Curso=" + Curso + '}';
    }
}
