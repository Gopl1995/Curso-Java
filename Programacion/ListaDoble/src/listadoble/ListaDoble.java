package listadoble;
import java.util.Scanner;

public class ListaDoble {
    NodoLD primero = new NodoLD();
    NodoLD ultimo = new NodoLD();
    
    public ListaDoble(){
        primero = null;
        ultimo = null;
    }
    
    public void insertar(String nombre, int edad){
        NodoLD nuevo = new NodoLD();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        
        if(primero == null){
            primero = nuevo;
            primero.siguiente = null;
            primero.atras = null;
            ultimo = primero;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            nuevo.atras = ultimo;
            ultimo = nuevo;
        }
        System.out.println("Nodo ingresado");
    }
    
    public void mostrar(){
        NodoLD actual = new NodoLD();
        actual = primero;
        if(primero != null){
            while(actual != null){
                System.out.println("El nombre es: " + actual.getNombre());
                System.out.println("La edad es: " + actual.getEdad());
                actual = actual.siguiente;
            }
        }else{
            System.out.println("Lista vacia");
        }
    }
    
    public void modificar(String nombre){
        Scanner sc = new Scanner(System.in);
        NodoLD actual = new NodoLD();
        actual = primero;
        String buscado;
        boolean encontrado = false;
        System.out.println("Ingrese el dato a modificar");
        buscado = sc.next();
        if(primero != null){
            while(actual != null && encontrado == false){
                if(actual.getNombre().equals(buscado)){
                    System.out.println("Nodo encontrado");
                    System.out.println("Ingrese el nuevo dato: ");
                    nombre = sc.next();
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
        NodoLD actual = new NodoLD();
        actual = primero;
        NodoLD anterior = new NodoLD();
        anterior = null;
        String buscado;
        boolean encontrado = false;
        System.out.println("Ingrese el dato a eliminar");
        buscado = sc.next();
        if(primero != null){
            while(actual != null && encontrado == false){
                if(actual.getNombre().equals(buscado)){
                    System.out.println("Nodo encontrado");
                    if(actual == primero){
                        primero = primero.siguiente;
                        primero.atras = null;
                    }else if(actual == ultimo){
                        anterior.siguiente = null;
                        ultimo = anterior;
                    }else{
                        anterior.siguiente = actual.siguiente;
                        actual.siguiente.atras = anterior;
                    }
                    System.out.println("Nodo eliminado");
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
