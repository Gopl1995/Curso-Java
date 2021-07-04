/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author Gustavo
 */
public class PasoporReferencia { //referencia para los objetos
    public static void main(String[] args) {
        Persona persona1 = new Persona ();//la variables de tipo object "Persona"
        persona1.nombre = "Gustavo";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiarValor(persona1);
        //cambiaValor(persona1);//esta variable almacena el valor de la referencia del objeto que se creo new Persona...
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
    }
    
    /*public static void cambiaValor(Persona persona){//paso por referencia...tipode clase y variable
        persona.nombre = "Karla";
    }
    */
    
    public static Persona cambiarValor (Persona persona){ //regresara un tipo object
        persona.nombre = "Susan";
        return persona;
    }
    
    /*
    persona1 = almacena la referencia a los objetos como un hexadecimal 
    por eso el argumento persona1 y persona hacen referencia al mismo objeto y pueden cambiarse las veces que se desee
    
    */
}
