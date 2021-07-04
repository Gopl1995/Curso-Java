/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Gustavo
 */
public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton (String tipoEntrada, String marca){
        super(tipoEntrada, marca); //inicializar atributos de la clase padre
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() + '}'; //incluye los atributos de tipo entrada y marca
    }
    
    
}
