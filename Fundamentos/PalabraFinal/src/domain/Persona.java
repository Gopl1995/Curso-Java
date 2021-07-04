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
public class Persona {
    public final static int MI_CONSTANTE = 1; //definiendo constante
    
    private String nombre;
    
    public void Imprimir(){
        System.out.println("Metodo Imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
