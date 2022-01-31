
package listacirculardoble;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircularDoble lcd = new ListaCircularDoble();
        String nombrelcd = null;
        int edadlcd;
        int opcion;
        do{
            System.out.println("ESCOJA UNA OPCION PARA INTERACTUAR CON LA LISTA CIRCULAR DOBLE");
            System.out.println("1. Insertar datos a la Lista Circular Doble");
            System.out.println("2. Mostrar datos a la Lista Circular Doble");
            System.out.println("3. Modificar datos a la Lista Circular Doble");
            System.out.println("4. Eliminar datos a la Lista Circular Doble");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Insertara datos a la Lista Circular Doble");
                    System.out.println("Ingrese el nombre: ");
                    nombrelcd = sc.next();
                    System.out.println("Ingrese la edad");
                    edadlcd = sc.nextInt();
                    lcd.insertar(nombrelcd, edadlcd);
                    break;
                case 2:
                    System.out.println("Mostrara datos a la Lista Circular Doble");
                    lcd.mostrar();
                    break;
                case 3:
                    System.out.println("Modificara datos a la Lista Circular Doble");
                    lcd.modificar(nombrelcd);
                    break;
                case 4:
                    System.out.println("Eliminara datos a la Lista Circular Doble");
                    lcd.eliminar();
                    break;
                case 5:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Opcion ingresada no valida");
                    break;
            }
        }while(opcion != 5);
    }
    
}
