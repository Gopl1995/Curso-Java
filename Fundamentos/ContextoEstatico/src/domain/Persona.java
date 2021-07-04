/*
ESTE PROGRAMA PERMITIRA CONTAR CUANTOS OBJETOS DE TIPO PERSONA SE PUEDEN CREAR
STATIC ES UNA VARIABLE QUE SE ASOCIA A UNA CLASE Y NO CON LOS OBJETOS
 */
package domain;

/**
 *
 * @author Gustavo
 */
public class Persona {

    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas; // contar cuantos objetos de tipo persona se crean
    
    //Solo se pasa un argumento, ya que el valor de idPersona se asignara de manera automatica y la variable contador persona
    //se ira incrementando por cada objeto de tipo persona que se cree
    
    public Persona (String nombre){ // cada vez que se cree un objeto se llama la variable para que se vaya incrementando
        this.nombre = nombre;
        //para el static no se usa el this, se usa el nombre de la clase y se llama a su variable
        Persona.contadorPersonas ++;
        //Asignar el nuevo valor a la variable persona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override //Notacion que inidica que estamos sobreescribiendo el metodo ToString
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
}
