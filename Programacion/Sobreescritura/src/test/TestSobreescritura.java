/*
 *POLIMORFISMO es necesario saber herencia y sobreescritura. Significa multiples comportamientos, solo se visualiza en tiempo
de ejecucion
 */
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author Gustavo
 */
public class TestSobreescritura {
    public static void main(String[] args) {
        //SE COMENTARA POR POLIMORFISMO
        /*
        Gerente gerente1 = new Gerente("Juan", 2500, "Informatica");
        System.out.println("gerente1: " + gerente1.obtenerDetalles());
        */
        
        Empleado empleado = new Empleado ("Juan", 5000); //variable local al metodo main
        imprimir(empleado);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente ("Karla", 8000, "Informatica");
        imprimir(gerente);
        //System.out.println("gerente = " + gerente.obtenerDetalles());
    }
    
    //METODO QUE SE ENCARGA DE LLAMAR EL METODO OBTENER DETALLES DEPENDIENDO DE LA REFERENCIA DEL OBJETO QUE SE ESTE PASANDO
    public static void imprimir(Empleado empleado1){ //la variable empleado se puede comportar como gerente local al metodo imprimir
        System.out.println("empleado = " + empleado1.obtenerDetalles());
    }
}
