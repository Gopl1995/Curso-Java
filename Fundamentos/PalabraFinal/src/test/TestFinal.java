/*
 EN VARIABLES: EVITA CAMBIAR EL VALOR QUE ALMACENA LA VARIABLE
 EN METODOS: EVITA QUE SE MODIFIQUE LA DEFINICI[ON DE UN METODO DESDE UNA SUBCLASE
 EN CLASES: EVITA QUE SE CREE UNA SUBCLASE
 */
package test;

import domain.Persona;

/**
 *
 * @author Gustavo
 */
public class TestFinal {
    public static void main(String[] args) {
        //CONCEPTO DE FINAL EN VARIABLE
        final int miVariable = 10;
        //miVariable = 8;//ESTO NO SE PUEDE HACER
        System.out.println("miVariable = " + miVariable);
        
        System.out.println("miConstante = " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona ();
        //persona1 = new Persona();
        persona1.setNombre("Karla");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Jimena");
        System.out.println("persona1 nombre: " + persona1.getNombre());
    }
}
