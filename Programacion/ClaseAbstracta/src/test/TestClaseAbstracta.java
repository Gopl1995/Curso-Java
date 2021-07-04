/*
 NO SE PUEDEN CREAR OBJETOS DE UNA CLASE ABSTRACTA
 */
package test;

import domain.*;

/**
 *
 * @author Gustavo
 */
public class TestClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo ("Rectangulo"); //asignar un tipo hijo a un tipo padre Rectangulo -> FiguraGeometrica
        figura.dibujarFigura();
    }
}
