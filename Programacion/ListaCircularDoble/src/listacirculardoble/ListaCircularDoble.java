package listacirculardoble;
import java.util.Scanner;

public class ListaCircularDoble {
    NodoLCD primero = new NodoLCD();
    NodoLCD ultimo = new NodoLCD();
    
    public ListaCircularDoble(){
        primero = null;
        ultimo = null;
    }
    
    public void insertar(String nombre, int edad){
        NodoLCD nuevo = new NodoLCD();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
            primero.siguiente = primero;
            primero.atras = ultimo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.atras = ultimo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
            primero.atras = ultimo;
        }
        System.out.println("Nodo ingresado");
    }
    
    public void mostrar(){
        NodoLCD actual = new NodoLCD();
        actual = primero;
        if(primero != null){
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
        NodoLCD actual = new NodoLCD();
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
        NodoLCD actual = new NodoLCD();
        actual = primero;
        NodoLCD anterior = new NodoLCD();
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
                        primero.atras = ultimo;
                        ultimo.siguiente = primero;
                    }else if(actual == ultimo){
                        ultimo = anterior;
                        ultimo.siguiente = primero;
                        primero.atras = ultimo;
                    }else{
                        anterior.siguiente = actual.siguiente;
                        actual.siguiente.atras = anterior;
                    }
                    System.out.println("Nodo eliminado");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;                        
            }while(actual != primero && encontrado != true);
        }else{
            System.out.println("Lista vacia");
        }
    }
    
}
