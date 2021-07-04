/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Gustavo
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1; // solo se crea una variable de tipo persona, no se crea ningun objeto
        persona1 = new Persona (); // se manda a llamar el constructor, el constructor permite crear objetos de la clase persona
        persona1.nombre = "Gustavo";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona (); //creacion de instancia
        System.out.println("persona2 = " + persona2);
        
        persona2.nombre = "Sherilyn";
        persona2.apellido = "Silva";
        persona2.desplegarInformacion();
    }
}
