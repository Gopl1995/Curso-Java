/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author Gustavo
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Gustavo", "Perez");//se crea un objeto de esta clase
        System.out.println(persona);
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Apellido: " + persona.apellido);
    }
}

class Persona{ // La clase Object es la clase padre de todas las clases en java
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);//primero se ejecuta el contructor
        //this se usa para imprimir el objeto actual
        //Imprimir imprimir = new Imprimir (); //esto tambien es valido
        new Imprimir().imprimir(this);//aca de una vez se crea el objeto y se manda a llamar el metodo
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual this" +  this);
    }
}