package sv.edu.utec.listapersonas;

public class Persona {
    private String nombre, edad, direccion;
    private char genero;

    public Persona(String nombre, String edad, String direccion,  char genero){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
        this.genero=genero;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEdad(){
        return edad;
    }
    public String getDireccion(){
        return direccion;
    }
    public char getGenero(){
        return genero;
    }
}
