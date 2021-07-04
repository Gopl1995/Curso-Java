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
public class Aritmetica {
    //atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica (){//El constructor se llaman exactamente igual a la Clase no regresa ningun tipo de dato
        //El constructor construye un objeto y reserva espacio en memoria puede recibir o no argumentos
        System.out.println("Ejecutando constructor");        
    }
    
    //Sobrecarga de constructores
    public Aritmetica (int arg1, int arg2){ //se definen los argumentos para inicializar los atributos de la clase
        this.a = arg1; //this para acceder al atributo de la clase, this apunta al objeto que se crea en dicho momento
        this.b = arg2; // el argumento del metodo se asigna al atributo de la clase
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //metodos de la clase
    public void sumar (){
        int resultado = a + b;
        System.out.println("El resultado es: " + resultado);
    }
    
    public int sumarConRetorno(){
        /*esto tambien funciona
        int resultado = a + b;
        return resultado; */        
       
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){//la info que recibe el metodo son argumentos
        this.a = a; //esto es opcional, hace referencia a un atributo de la clase y NO a una variable local
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
}
