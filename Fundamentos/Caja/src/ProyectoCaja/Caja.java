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
public class Caja {
    //atributos de la clase
    int ancho;
    int alto;
    int profundo;
    
    //Constructor vacio
    public Caja (){
        System.out.println("Calculo del volumen de la caja");
    }
    
    //Constructor lleno
    public Caja (int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen (){
       return ancho*alto*profundo;       
    }
}
