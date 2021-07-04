/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author Gustavo
 */
public class TestBloquesInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); //el bloque estatico solo se ejecuta una vez
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona ();
        System.out.println("persona2 = " + persona2);
        
        Persona persona3 = new Persona ();
        System.out.println("persona3 = " + persona3);
    }
}
