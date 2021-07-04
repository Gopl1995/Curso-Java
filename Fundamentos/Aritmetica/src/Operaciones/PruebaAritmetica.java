/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Gustavo
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        
        //Variables locales, se almacenan en la memoria stack 
        /*var a = 10;
        var b = 2;*/
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica (); // se almacenan en la memoria heap
        aritmetica1.a = 5; // la suma la hara a partir de los atributos de la clase
        aritmetica1.b = 10;
        aritmetica1.sumar();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("El resultado con retorno es :" + resultado);
        
        resultado = aritmetica1.sumarConArgumentos(2, 4);//estos ya son los parametros
        System.out.println("El resultado con argumentos es: = " + resultado);
        
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritemtica1 b: " + aritmetica1.b);
        
        
        Aritmetica aritmetica2 = new Aritmetica (5, 8);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
        
        /*aritmetica1 = null; // La variable ya no contiene su referencia
        System.gc(); //programa el recolector de basura garbage collector.*/
    }
    
    public static void miMetodo(){ //aca se agrego la palabra reservada static
        //la variable esta fuera del alcande donde fue definida
        //a = 10;
        
        System.out.println("Otro metodo");
    }
}
