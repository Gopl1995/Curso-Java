/*
TAMBIEN CONOCIDOS COMO VARARGS, es cuando se pasa un argumento hacia un metodo
metodo imprimira cierta cantidad de numeros. No se especifica cuantos valores se pasara al metodo
 */
package test;

/**
 *
 * @author Gustavo
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("Juan", 4, 6, 8);
    }
    
    private static void variosParametros(String nombre, int...numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros (int...numeros){//tipo variable y tres puntos, ya que no se sabe la cantidad de elementos a recibir
        //numeros se convierte en un arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i]);
        }
    }
    
}
