/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Gustavo
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
        /*System.out.println("Dia 1 = " + Dias.LUNES);      
        indicarDiaSemana(Dias.MARTES);
        */
        
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to Continente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente no. 1: " + Continentes.AFRICA);
        System.out.println("No. Paises en el Primer Continente: " + Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){ //una variable de tipo dias
        switch(dias){
            case LUNES:
                System.out.println("Primer dia");
                break;
            case MARTES:
                System.out.println("Segundo dia");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia");
                break;
            case JUEVES:
                System.out.println("Cuarto dia");
                break;
            case VIERNES:
                System.out.println("Quinto dia");
                break;
            case SABADO:
                System.out.println("Sexto dia");
                break;
            case DOMINGO:
                System.out.println("Septimo dia");
                break;
            default:
                System.out.println("Dia erroneo");
        }
    }
}
