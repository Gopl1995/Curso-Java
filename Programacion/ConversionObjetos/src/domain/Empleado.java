/*
 * En sobreescritura de metodos hay que aplicar Herencia, ya que un metodo en la clase hija, modifica el comportamiento
de la clase padre...lo sobreescribe
 */
package domain;

/**
 *
 * @author Gustavo
 */
public class Empleado {
    private String nombre;
    private double sueldo;
    
    public Empleado (String nombre, double sueldo){ //publico para poder usarlo en otras clases
        this.nombre = nombre; //se inicializan cada uno de los atributos
        this.sueldo = sueldo;
    }
    
    //ESTE METODO SUSTITUIRA A TO STRING
    public String obtenerDetalles(){ //Desde la clase hija se modificara este comportamiento
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
}
