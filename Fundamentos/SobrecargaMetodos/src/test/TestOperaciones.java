/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import operaciones.Operaciones;

/**
 *
 * @author Gustavo
 */
public class TestOperaciones {
    public static void main(String[] args) {
        //Operaciones op1 = new Operaciones ();//COMO LOS METODOS SON ESTATICOS NO HAY NECESIDAD DE CREAR OBJETOS DE ESA CLASE
        var resultado1 = Operaciones.sumar(4, 8);
        System.out.println("resultado1 = " + resultado1);
        
        var resultado2 = Operaciones.sumar(4.5, 8.6);
        System.out.println("resultado2 = " + resultado2);
        
    }
}
