/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author Gustavo
 */
public class ClaseHija extends Clase1 {
    
    public ClaseHija(){
        //super(); // se manda a llamar el constructor protegido de la clase padre
//        this.atributoProtected = "Modificacion atributo protected";
//        System.out.println("atributoProtegido = " + this.atributoProtected);
//        this.metodoProtegido();
        super("publico");
    }
}
