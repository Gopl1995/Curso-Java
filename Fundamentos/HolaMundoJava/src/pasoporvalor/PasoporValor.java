/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author Gustavo
 */
public class PasoporValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x= " + x);
        
        
        cambiarValor(x);
        System.out.println("x nuevo valor = " + x );
    }
    
    public static void cambiarValor(int arg1){//paso por valor aplica a tipos primitivos...static por estar en el metodo main
        System.out.println("arg = " + arg1);
        arg1 = 15;
        
    }
}
