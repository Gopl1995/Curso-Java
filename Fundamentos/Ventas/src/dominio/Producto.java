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
public class Producto {
    private final int idProducto; //para este metodo solo se usa el metodo get, ya que el set se obtiene por defaul o bien usar final ya que no cambiara su valor
    private String nombre;
    private double precio;
    private static int contadorProductos; 
    
    private Producto(){ //Al ser privado solo se puede usar dentro de esta clase, solo srive para inicializar idProducto
        this.idProducto = ++Producto.contadorProductos; //por cada objeto producto que se cree se tendra un identificador
        //cada identificador se le asigna a la variable idProducto
    }
    
    public Producto (String nombre, double precio){
        this();//si se usa la llamada a un constructor interno, la primera linea tiene que ser el constructor privado
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getIdProducto(){
        return idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
