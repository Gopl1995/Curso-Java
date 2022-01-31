package listacirculardoble;


public class NodoLCD {
    
    private String nombre;
    private int edad;
    NodoLCD siguiente = null;
    NodoLCD atras = null;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }   
}
