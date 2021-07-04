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
public class Orden {
    private int idOrden;
    private Producto productos [];
    private static int contadorOrdenes;
    private int contadorProductos;//cuantos productos se han agregado por cada objeto de tipo Orden
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes; //++preIncremento asi empieza desde 1
        this.productos = new Producto [Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){ //se recibe un objeto de tipo producto
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;//postIncremento, se agrega el producto y se incrementa la variable
        }else{
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal (){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto = this.productos[i];//se obtiene el producto que se esta iterando en ese momento
            //total += producto.getPrecio(); //total = total + prudocto.getPrecio();
            total += this.productos[i].getPrecio(); //se obtiene el precio de cada producto, para obtener el total sumando el precio de todos los productos que se han agregado al arreglo
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: " + totalOrden);
        System.out.println("Productos de la Orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
