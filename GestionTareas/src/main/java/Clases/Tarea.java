package Clases;

public class Tarea {
    private int Id;
    private String Tarea;
    public Tarea(){
    
    }
    public Tarea(int Id, String Tarea) {
        this.Id = Id;
        this.Tarea = Tarea;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String Tarea) {
        this.Tarea = Tarea;
    }
   
    
    
    

}
