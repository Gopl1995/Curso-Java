/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Monitor;
import dominio.Teclado;
import dominio.Computadora;
import dominio.Orden;
import dominio.Raton;
/**
 *
 * @author Gustavo
 */
public class MundoPc {
    public static void main(String[] args) {
                
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton ("Bluetooth", "HP");
        
        //YA QUE SE CREARON LOS COMPONENTES, YA SE PUEDE CREAR LA COMPUTADORA****
        Computadora computadoraHP = new Computadora ("ComputadoraHP", monitorHP, tecladoHP, ratonHP);
        
        //***CREANDO OTRA COMPUTADORA*****
        Monitor monitorDELL = new Monitor("DELL", 15);
        Teclado tecladoDELL = new Teclado("Alambrico", "DELL");
        Raton ratonDELL = new Raton ("Alambrico", "DELL");
        
        //YA QUE SE CREARON LOS COMPONENTES, YA SE PUEDE CREAR LA COMPUTADORA****
        Computadora computadoraDELL = new Computadora ("ComputadoraDELL", monitorDELL, tecladoDELL, ratonDELL);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDELL);
        orden1.mostrarOrden();
    }
}
