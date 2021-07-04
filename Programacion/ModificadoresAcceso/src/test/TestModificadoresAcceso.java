/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

/**
 *
 * @author Gustavo
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        //System.out.println("clase1 = " + clase1.atributoPublico);
        //clase1.metodoPublico();
        
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        
        Clase1 clase2 = new Clase1("Publico");
        System.out.println("Atributo privado: " + clase2.getAtributoPrivado());
        //no se puede llamar el metodo private porque es private...se tendria que cambiar a public para hacerlo
    }
}
