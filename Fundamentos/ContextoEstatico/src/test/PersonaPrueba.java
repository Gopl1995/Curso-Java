/*
SI SE QUIERE UTILIZAR OTRO METODO DENTRO DEL METODO MAIN, TIENE QUE SER ESTATICO
 */
package test;

import domain.Persona;

/**
 *
 * @author Gustavo 
 */
public class PersonaPrueba {
    
    public static void main(String[] args) { 
        Persona persona1 = new Persona ("Juan");
        //System.out.println("persona1: " + persona1);
        
        Persona persona2 = new Persona ("Carla");
        //System.out.println("persona2 = " + persona2);
        
        imprimir(persona1);
        imprimir(persona2);
        
    }
    
    public static void imprimir (Persona persona){ //variable persona de tipo Persona
        System.out.println("persona = " + persona);
    }
}
