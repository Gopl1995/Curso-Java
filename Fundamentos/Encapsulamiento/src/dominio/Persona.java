/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Gustavo
 */
public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona (String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() { //metodos publicos y el get es para recuperar u obtener los datos 
        return nombre;
    }

    public void setNombre(String nombre) { //set para modificar o poner los datos
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { // is en lugar de get para los tipos boolean
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString(){ // Metodo que permite imprimir el estado del objeto en cualquier momento, los valores de sus atributos
        return "Persona [nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]"; 
    }
    
}
