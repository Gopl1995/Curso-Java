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
public class Orden {
    private final int idOrden;
    private Computadora computadoras [];
    private static int contadorOrdenes;
    private int contadorComputadoras; //Cuantos objetos de tipo Computadora se agregan al arreglo
    private static final int MAX_COMPUTADORAS = 10;//saber el maximo de computadoras que se puede crear al arreglo
    
    public Orden(){
        idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora [Orden.MAX_COMPUTADORAS]; //inicializamos el arreglo maximo de 10 computadoras
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has superado el limite: " + Orden.MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden (){
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras de la orden #: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    }
}
