/*
PARA LAS PRUEBAS ES MEJOR QUE ESTEN EN OTRA CLASE Y EN OTRO PAQUETE
 */
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Gustavo", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente (new Date(), true, "Karla", 'F', 20, "Guatemala");
        System.out.println("cliente1 = " + cliente1); 
        
        Empleado empleado2 = new Empleado ("Omar", 8000.00);
        System.out.println("empleado2 = " + empleado2);
        
        //Persona persona1 = new Persona ()
    }
    
    
}
