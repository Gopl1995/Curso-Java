
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        var n1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        var n2 = sc.nextInt();
        
        var resultado = (n1 > n2) ? "El numero mayor es: " + n1 : "El numero mayor es: " +n2;
        System.out.println(resultado);
    }
    
}
