/*
 *CLASES ENVOLVENTES DE TIPOS PRIMITIVOS
int - Integer
long - Long
float - Float
double - Double
byte - Byte
char - Character
short - Short
LAS CLASES CONTIENEN ATRIBUTOS Y METODOS A DIFERENCIA DE LOS TIPOS QUE SOLO ALMACENAN UN VALOR
 */
package test;

/**
 *
 * @author Gustavo
 */
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        Integer entero = 10; //Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());
        
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
