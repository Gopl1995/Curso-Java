/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Producto;
import dominio.Orden;

/**
 *
 * @author Gustavo
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.25);
        Producto producto2 = new Producto("Pantalon", 75.50);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.calcularTotal();
        orden1.mostrarOrden();
    }
}
