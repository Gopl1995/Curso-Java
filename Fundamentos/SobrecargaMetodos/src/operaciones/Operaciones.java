/*
 LA SOBRECARGA DE METODOS ES TENER UN METODO DEL MISMO NOMBRE, CON DIFERENES PARAMETROS
 LA DIFERENCIA LO HARA LA CANTIDAD DE ARGUMENTOS QUE TIENE EL METODO
 STATIC PARA NO INSTANCIAR OBJETOS DE ESA CLASE SINO UTILIZAR DIRECTAMENTE ESOS METODOS
 */
package operaciones;

/**
 *
 * @author Gustavo
 */
public class Operaciones {
    
    public static int sumar (int a, int b){
        return a + b;
    }
    
    public static double sumar (double a, double b){
        return a + b;
    }
}
