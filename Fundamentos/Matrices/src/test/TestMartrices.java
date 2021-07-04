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
public class TestMartrices {
    public static void main(String[] args) {
        int edades [] [] = new int [3][2];
        //System.out.println("edades = " + edades);
        
        edades [0][0] = 1;
        edades [0][1] = 2;
        edades [1][0] = 3;
        edades [1][1] = 4;
        edades [2][0] = 5;
        edades [2][1] = 6;
        
        System.out.println("edades = " + edades[0][0]);
        System.out.println("edades = " + edades[0][1]);
        
        //iter por cada renglon una columna
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades[fila].length; col++) { //largo de las columnas
                System.out.println("edades = " + fila + "-" + col + ": " + edades[fila][col]);
            }
        }
        
        //SINTAXIS RESUMIDA////
        String frutas [][] = {{"Naranja", "Limon"},{"Fresa","Kiwi"}};
        imprimir(frutas);
        /*
        for (int y = 0; y < frutas.length; y++) {
            for (int z = 0; z < frutas[y].length; z++) {
                System.out.println("frutas = " + y + "-" + z + ": " + frutas[y][z]);
            }
        }
        */
        
        Persona personas [][] = new Persona [2] [3];
        personas [0][0] = new Persona ("Gustavo");
        personas [0][1] = new Persona ("Rosario");
        personas [1][0] = new Persona ("Omar"); 
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz [][]){//recibe un objeto de tipo object para imprimir personas y frutas
        for (int y = 0; y < matriz.length; y++) {
            for (int z = 0; z < matriz[y].length; z++) {
                System.out.println("matriz = " + y + "-" + z + ": " + matriz[y][z]);
            }
        }
    }
}
