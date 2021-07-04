/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Gustavo
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int[3]; //3 es la cantidad de elementos que almacenara.
        //lado izquierdo se declara la variable y del lado derecho se instancia un objeto de tipo arreglo
        //System.out.println("edades = " + edades);
        
        edades [0] = 4;
        edades [1] = 3;
        edades [2] = 2;
        
        System.out.println("edad en la posicion 0: " + edades [0]);
        
        for (int i=0; i<edades.length; i++) { //i es el contador, el .length para la cantidad del arreglo
            System.out.println("edades: " + edades [i]);
        }
        
        //SINTAXIS RESUMIDA EN ARREGLO***//////
        String frutas [] = {"Naranja", "Platano", "Banano"};
        
        for (int j = 0; j < frutas.length; j++) {
            System.out.println("Fruta" +j + "=" + frutas[j]);
        }
    }
}
