/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Gustavo
 */
public class Gerente extends Empleado{    
    private String departamento;
    
    public Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo); //constructor de la clase padre
        this.departamento = departamento;
    }
    
    @Override //una arroba es una anotacion, que es modificar de cierta manera el metodo definido despues de la anotacion
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }
}
