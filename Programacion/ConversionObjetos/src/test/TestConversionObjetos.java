/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*; //* para importar todas

/**
 *
 * @author Gustavo
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor ("Omar", 5000, TipoEscritura.MODERNO);
        System.out.println("empleado = " + empleado);
        
        
    }
}
