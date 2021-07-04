/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;
/**
 *
 * @author Gustavo
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Gustavo", 2500.50, true);
        System.out.println("Nombre: " + persona1.getNombre() + " Sueldo: " + persona1.getSueldo() + " Boolean: " + persona1.isEliminado());
        persona1.setNombre("Omar");
        persona1.setSueldo(500.50);
        persona1.setEliminado(false);
        /*persona1.nombre = "Juan" **ESTO YA NO ES POSIBLE YA QUE LOS DATOS ESTAN EN ACCESO PRIVADO
        System.out.println("nombre: " persona1.nombre); ****TAMPOCO ES POSIBLE POR LOS ACCESOS */
        System.out.println("Nombre2: " + persona1.getNombre() + " Sueldo2: " + persona1.getSueldo() + " Boolean: " + persona1.isEliminado());
        System.out.println("persona1: " + persona1.toString());
        //EL METODO print o println llama al metodo toString de manera automatica, ejemplo abajo.
        System.out.println("persona1: " + persona1);
    }
}
