package listacircularsimple;
import java.util.Scanner;

public class ListaCircularSimple {
    NodoLCS primero = new NodoLCS();
    NodoLCS ultimo = new NodoLCS();
    
    public ListaCircularSimple(){
        primero = null;
        ultimo = null;
    }
    
    public void insertar(String nombre, int edad){
        NodoLCS nuevo = new NodoLCS();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        
        if(primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            ultimo = primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
        System.out.println("Nodo ingresado");
    }
    
    public void mostrar(){
        NodoLCS actual = new NodoLCS();
        actual = primero;
        if(actual != null){
            do{
                System.out.println("El nombre es: " + actual.getNombre());
                System.out.println("La edad es: " + actual.getEdad());
                actual = actual.siguiente;
            }while(actual != primero);
        }else{
            System.out.println("Lista vacia");
        }
    }
    
    public void modificar(String nombre){
        Scanner sc = new Scanner(System.in);
        NodoLCS actual = new NodoLCS();
        actual = primero;
        String buscado;
        boolean encontrado = false;
        System.out.println("Ingrese el dato a modificar");
        buscado = sc.next();
        if(primero != null){
            do{
                if(actual.getNombre().equals(buscado)){
                    System.out.println("Nodo encontrado");
                    System.out.println("Ingrese el nuevo dato: ");
                    nombre = sc.next();
                    actual.setNombre(nombre);
                    System.out.println("Nodo modificado");
                    encontrado = true;
                }actual = actual.siguiente;
            }while(actual != primero && encontrado != true);
            if(encontrado == false){
                System.out.println("Nodo no encontrado");
            }
        }else{
            System.out.println("Lista vacia");
        }
    }
    
    public void eliminar(){
        Scanner sc = new Scanner(System.in);
        NodoLCS actual = new NodoLCS();
        actual = primero;
        NodoLCS anterior = new NodoLCS();
        anterior = null;
        String buscado;
        boolean encontrado = false;
        System.out.println("Ingrese el dato a eliminar");
        buscado = sc.next();
        if(primero != null){
            do{
                if(actual.getNombre().equals(buscado)){
                    System.out.println("Nodo encontrado");
                    if(actual == primero){
                        primero = primero.siguiente;
                        ultimo.siguiente = primero;
                    }else if(actual == ultimo){
                        anterior.siguiente = primero;
                        ultimo = primero;
                    }else{
                        anterior.siguiente = actual.siguiente;
                    }
                    System.out.println("Nodo eliminado");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }while(actual != primero && encontrado != true);
            if(encontrado == false){
                System.out.println("Nodo no encontrado");
            }
        }else{
            System.out.println("Lista vacia");
        }
    }
    
}
