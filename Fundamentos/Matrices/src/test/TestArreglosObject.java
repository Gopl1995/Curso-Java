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
public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas [] = new Persona [3];
        
        personas[0] = new Persona ("Gustavo");
        personas[1] = new Persona ("Omar");
        personas[2] = new Persona ("Rosario");
        
        System.out.println("personas 0 = " + personas [0].toString());
        System.out.println("personas 1= " + personas[1].getNombre());
        System.out.println("personas 2 = " + personas[2].toString());
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + "=" + personas[i].getNombre());
        }
        
        for (int j = 0; j < personas.length; j++) {
            System.out.println("personas = " + j + "=" + personas[j].toString());
        }
    }
}
