/*
 *InstanceOf: Determinar el tipo en tiempo de ejecucion...tipo new Empleado o new Gerente, permite de que tipo es
la referencia a la cual esta apuntando cierta variable
 */
package test;

import domain.Empleado;
import domain.Gerente;

/**
 *
 * @author Gustavo
 */
public class TestInstanceOf {
    public static void main(String[] args) {
        //SE COMENTARA POR POLIMORFISMO
        /*
        Gerente gerente1 = new Gerente("Juan", 2500, "Informatica");
        System.out.println("gerente1: " + gerente1.obtenerDetalles());
        */
        
        Empleado empleado = new Empleado ("Juan", 5000); //variable local al metodo main
        determinarTipo(empleado);
        //imprimir(empleado);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        
        //empleado = new Gerente ("Karla", 8000, "Sistemas") esto se puede hacer ya que la variable empleado es la variable padre y hereda los atributos a la hija
        Gerente gerente = new Gerente ("Karla", 8000, "Informatica");
        //determinarTipo(gerente);
        //imprimir(gerente);
        //System.out.println("gerente = " + gerente.obtenerDetalles());
    }
    
    //METODO QUE SE ENCARGA DE LLAMAR EL METODO OBTENER DETALLES DEPENDIENDO DE LA REFERENCIA DEL OBJETO QUE SE ESTE PASANDO
    public static void determinarTipo(Empleado empleado){ //la variable empleado se puede comportar como gerente local al metodo imprimir
        //si la variable empleado esta apuntando a un objeto en memoria de tipo Gerente
        if(empleado instanceof Gerente){ //primero las clases hijas y al final la clase padre
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;//variable de tipo empleado y el parentesis lo convierte al tipo Gerente
            gerente.getDepartamento();
            System.out.println("gerente: " + gerente.getDepartamento());
            //((Gerente) empleado).getDepartamento();//conversion del ide
        }if(empleado instanceof Empleado){            
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.getNombre());
            System.out.println("empleado = " + empleado.getSueldo());
        }if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
