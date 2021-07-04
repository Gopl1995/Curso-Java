/*
 FOR MEJORADO, SIMPLIFICA LA FORMA EN QUE SE RECORREN LOS ARREGLOS O COLECCIONES
 VARIABLE DEL MISMO TIPO DEL ARREGLO
 */
package test;

import domain.Persona;

/**
 *
 * @author Gustavo
 */
public class TestForEach {
    public static void main(String[] args) {
        int edades [] = {5,6,8,9};
        
        //esto es recorriendolo con un for
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades: " + edades[i]);
        }
        
        //esto es recorriendolo con un foreach, no se maneja un contador
        //se coloca una variable que almacenara el arreglo de su mismo tipo despues de dos puntos el nombre del arreglo a recorrer
        for (int edad: edades) {
            System.out.println("edad = " + edad);
        }
        
        Persona personas[]={new Persona ("Luis"), new Persona ("Gustavo"), new Persona ("Rosario")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
