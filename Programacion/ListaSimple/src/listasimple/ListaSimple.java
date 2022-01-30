package listasimple;
import java.util.Scanner;

public class ListaSimple {
    NodoLS primero = new NodoLS();
    NodoLS ultimo = new NodoLS();
    
    public ListaSimple(){//metodo constructor
        primero = null;
        ultimo = null;
    }
    
    public void insertar(String nombre, int edad){
        NodoLS nuevo = new NodoLS();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        
        if(primero == null){
            primero = nuevo;
            primero.siguiente = null;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            ultimo = nuevo;
        }
        System.out.println("Nodo ingresado");
    }
    
    public void mostrar(){
        NodoLS actual = new NodoLS();
        actual = primero;
        if(primero != null){
            while(actual != null){
                System.out.println("El nombre es: "+actual.getNombre());
                System.out.println("La edad es: "+actual.getEdad());
                System.out.println("|");
                actual = actual.siguiente;
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void modificar(String nombre){
        Scanner sc = new Scanner(System.in);
        NodoLS actual = new NodoLS();
        actual = primero;
        String buscado;
        //String modificado;
        boolean encontrado = false;
        System.out.println("Ingrese el dato a modificar");
        buscado = sc.next();
        if(primero != null){
            while(actual != null && encontrado == false){
                if(actual.getNombre().equals(buscado)){
                    System.out.println("Nodo encontrado");
                    System.out.println("Ingrese el nuevo dato: ");
                    //modificado = sc.next();
                    nombre = sc.next();
                    //actual.setNombre(modificado);
                    actual.setNombre(nombre);
                    System.out.println("Nodo modificado");
                    encontrado = true;
                }actual = actual.siguiente;
            }if(encontrado == false){
                System.out.println("Nodo no encontrado");
            }
        }else{
            System.out.println("Lista vacia");
        }        
    }
    
    public void eliminar(){
        Scanner sc = new Scanner(System.in);
        NodoLS actual = new NodoLS();
        actual = primero;
        NodoLS anterior = new NodoLS();
        anterior = null;
        String buscado;
        boolean encontrado = false;
        System.out.println("Ingresar el dato a eliminar");
        buscado = sc.next();
        if(primero != null){
            while(actual != null && encontrado == false){
                if(actual.getNombre().equals(buscado)){
                    System.out.println("Nodo encontrado");
                    if(actual == primero){
                        primero = primero.siguiente;
                    }else if(actual == ultimo){
                        anterior.siguiente = null;
                        ultimo = anterior;
                    }else{
                        anterior.siguiente = actual.siguiente;
                    }System.out.println("Nodo eliminado");
                     encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }if(encontrado == false){
                System.out.println("Nodo no encontrado");
            }            
        }else{
            System.out.println("Lista vacia");
        }
    }
}
