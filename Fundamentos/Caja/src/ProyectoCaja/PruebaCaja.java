/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCaja;

/**
 *
 * @author Gustavo
 */
public class PruebaCaja {
    public static void main(String[] args) {
        /*int anchocaja = 3;
        int altocaja = 2;
        int profundocaja = 6;
        caja1.ancho = anchocaja; tambien puede ser asi
        */
        
        
        Caja caja1 = new Caja ();
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundo = 6;
        int resultado = caja1.calcularVolumen();
        
        System.out.println("El resultado de la caja1 es: " + resultado);
        
        Caja caja2 = new Caja (2,4,6);
        int resultado2 = caja2.calcularVolumen();
        System.out.println("El resultado de la caja 2 es:" + resultado2);
    }
}
