/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Empleado;

/**
 *
 * @author Gustavo
 */
public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("Juan", 5000);
        Empleado empleado2 = new Empleado ("Juan", 5000);
        
        //ESTO ES PARA SABER LA REFERNCIA
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos no son iguales");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor Hashcode es igual");
        } else {
            System.out.println("El valor HashCode es distinto");
        }
    }
}
