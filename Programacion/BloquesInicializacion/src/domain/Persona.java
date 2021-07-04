/*
HAY 2 TIPOS ESTATICOS Y NO ESTATICOS, AMBOS SE EJECUTAN ANTES QUE EL CONSTRUCTOR
 */
package domain;

/**
 *
 * @author Gustavo
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //bloque de inicializacion estatico
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas; //se incrementa la variable contador personas;
    }
    
    //bloque de inicializacio no estatico
    {
        System.out.println("Ejecucion bloque no estatico");
        idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
            
    
}
