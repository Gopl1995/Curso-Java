
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
public class Rectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el alto del rectangulo: ");
        var alto = sc.nextInt();
        
        System.out.println("Ingrese el ancho del rectangulo: ");
        var ancho = sc.nextInt();
        
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
    
}
